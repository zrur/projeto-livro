
public class criarLivro {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memoria
        //tipoObjeto nomeObjeto = operadorInstanciação construtor
            // Livro Favorito = new Livro()

             Livro favorito = new Livro ();
             favorito.titulo = "O Hobbit";
             favorito.autor = "J.  R. R. Talkien";
             favorito.valor = 37.27;
             favorito.editora = "Harper Collins";
             favorito.resumo = "Bilbo era um dos ...";
             favorito.tipoCapa = "COMUM";

             System.out.println("Meu livro favorito é:"+ favorito.autor + "preço:R$ "+ favorito.valor);
             System.out.println("O autor do livro é : " + favorito.autor);
             System.out.println("O preço do livro é : " + favorito.valor);
             System.out.println("O numero de paginas é : " + favorito.paginas);
             System.out.println("A editora do livro é : " + favorito.editora);






            Livro meuLivro = new Livro();

    }


}
