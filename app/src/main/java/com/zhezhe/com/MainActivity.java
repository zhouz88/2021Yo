package com.zhezhe.com;


public class MainActivity extends android.support.v7.app.AppCompatActivity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        final android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.animation);
        final android.widget.Button button1 = findViewById(R.id.btn1);
        android.widget.EditText editText = findViewById(R.id.edit);
        button1.setOnClickListener((v) -> {
            String txt = editText.getText().toString();
            button1.startAnimation(animation);
            android.widget.Toast.makeText(this,
                    button1.getText() + " " + txt, android.widget.Toast.LENGTH_LONG).show();
        });

        final android.widget.Button button2= findViewById(R.id.btn2);
        button2.setOnClickListener((v) -> {
            String txt = editText.getText().toString();
            button2.startAnimation(animation);
            android.widget.Toast.makeText(this,
                    button2.getText() + " " + txt, android.widget.Toast.LENGTH_LONG).show();
        });

        final android.widget.Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener((v) -> {
            String txt = editText.getText().toString();
            button3.startAnimation(animation);
            android.widget.Toast.makeText(this,
                    button3.getText() + " " + txt, android.widget.Toast.LENGTH_LONG).show();
        });

        final android.widget.Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener((v) -> {
            String txt = editText.getText().toString();
            button4.startAnimation(animation);
            android.widget.Toast.makeText(this,
                    button4.getText() + " " + txt, android.widget.Toast.LENGTH_LONG).show();
        });
        //
        //1sp = 1dp
       // 1sp = 1.2dp with accessibility Large Text
    }
}
