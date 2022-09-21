package typings.classificator

import org.scalablytyped.runtime.StringDictionary
import typings.classificator.anon.Category
import typings.classificator.anon.ReadonlyArraystring
import typings.classificator.classificatorStrings.categories
import typings.classificator.classificatorStrings.docCount
import typings.classificator.classificatorStrings.options
import typings.classificator.classificatorStrings.totalDocuments
import typings.classificator.classificatorStrings.vocabulary
import typings.classificator.classificatorStrings.vocabularySize
import typings.classificator.classificatorStrings.wordCount
import typings.classificator.classificatorStrings.wordFrequencyCount
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): NaiveBayes = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NaiveBayes]
  inline def apply(options: Options): NaiveBayes = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NaiveBayes]
  
  @JSImport("classificator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Used to serialize a classifier's state.
  	 */
  @JSImport("classificator", "STATE_KEYS")
  @js.native
  val STATE_KEYS: js.Tuple8[
    categories, 
    docCount, 
    totalDocuments, 
    vocabulary, 
    vocabularySize, 
    wordCount, 
    wordFrequencyCount, 
    options
  ] = js.native
  
  /**
    * Initializes a NaiveBayes instance from a JSON state representation.
    *
    * Use this with NaiveBayes::toJson().
    */
  inline def fromJson(jsonStrOrObject: String): NaiveBayes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonStrOrObject.asInstanceOf[js.Any]).asInstanceOf[NaiveBayes]
  inline def fromJson(jsonStrOrObject: StringDictionary[Any]): NaiveBayes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonStrOrObject.asInstanceOf[js.Any]).asInstanceOf[NaiveBayes]
  
  trait ClassificationResults extends StObject {
    
    var likelihoods: js.Array[Category]
    
    var predictedCategory: String
  }
  object ClassificationResults {
    
    inline def apply(likelihoods: js.Array[Category], predictedCategory: String): ClassificationResults = {
      val __obj = js.Dynamic.literal(likelihoods = likelihoods.asInstanceOf[js.Any], predictedCategory = predictedCategory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassificationResults]
    }
    
    extension [Self <: ClassificationResults](x: Self) {
      
      inline def setLikelihoods(value: js.Array[Category]): Self = StObject.set(x, "likelihoods", value.asInstanceOf[js.Any])
      
      inline def setLikelihoodsVarargs(value: Category*): Self = StObject.set(x, "likelihoods", js.Array(value*))
      
      inline def setPredictedCategory(value: String): Self = StObject.set(x, "predictedCategory", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Naive-Bayes Classifier
    *
    * This is a naive-bayes classifier that uses Laplace Smoothing.
    *
    * Takes an (optional) options object containing:
    * - `tokenizer` => custom tokenization function
    */
  trait NaiveBayes extends StObject {
    
    /**
      * Determine what category `text` belongs to.
      * @return predicted category and likelihoods stats.
      */
    def categorize(text: String): ClassificationResults
    
    /**
      * Build a frequency hashmap where:
      * - the keys are the entries in `tokens`
      * - the values are the frequency of each entry in `tokens`
      */
    def frequencyTable(tokens: ReadonlyArraystring): Record[String, Double]
    
    /**
      * Train the naive Bayes classifier by telling it what `category` the `text` to add corresponds to.
      */
    def learn(text: String, category: String): NaiveBayes
    
    /**
      * Properly remove a category, unlearning all strings that were associated with it.
      */
    def removeCategory(category: String): NaiveBayes
    
    /**
      * Dump the classifier's state as a JSON string.
      * @return Representation of the classifier.
      */
    def toJson(): String
    
    /**
      * Calculate the probability that the `token` belongs to a `category`
      * @return probability (0..1)
      */
    def tokenProbability(token: String, category: String): Double
    
    /**
      * Untrain the naive Bayes classifier by telling it what `category` the `text` to remove corresponds to.
      */
    def unlearn(text: String, category: String): NaiveBayes
  }
  object NaiveBayes {
    
    inline def apply(
      categorize: String => ClassificationResults,
      frequencyTable: ReadonlyArraystring => Record[String, Double],
      learn: (String, String) => NaiveBayes,
      removeCategory: String => NaiveBayes,
      toJson: () => String,
      tokenProbability: (String, String) => Double,
      unlearn: (String, String) => NaiveBayes
    ): NaiveBayes = {
      val __obj = js.Dynamic.literal(categorize = js.Any.fromFunction1(categorize), frequencyTable = js.Any.fromFunction1(frequencyTable), learn = js.Any.fromFunction2(learn), removeCategory = js.Any.fromFunction1(removeCategory), toJson = js.Any.fromFunction0(toJson), tokenProbability = js.Any.fromFunction2(tokenProbability), unlearn = js.Any.fromFunction2(unlearn))
      __obj.asInstanceOf[NaiveBayes]
    }
    
    extension [Self <: NaiveBayes](x: Self) {
      
      inline def setCategorize(value: String => ClassificationResults): Self = StObject.set(x, "categorize", js.Any.fromFunction1(value))
      
      inline def setFrequencyTable(value: ReadonlyArraystring => Record[String, Double]): Self = StObject.set(x, "frequencyTable", js.Any.fromFunction1(value))
      
      inline def setLearn(value: (String, String) => NaiveBayes): Self = StObject.set(x, "learn", js.Any.fromFunction2(value))
      
      inline def setRemoveCategory(value: String => NaiveBayes): Self = StObject.set(x, "removeCategory", js.Any.fromFunction1(value))
      
      inline def setToJson(value: () => String): Self = StObject.set(x, "toJson", js.Any.fromFunction0(value))
      
      inline def setTokenProbability(value: (String, String) => Double): Self = StObject.set(x, "tokenProbability", js.Any.fromFunction2(value))
      
      inline def setUnlearn(value: (String, String) => NaiveBayes): Self = StObject.set(x, "unlearn", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Alpha parameter of the additive smoothing operation.
      *
      * Defaults to `1`.
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * Defines how the prior probablity is calculated.
      *
      * If set to false, the classifier will use an uniform prior rather than a learnt one.
      *
      * Defaults to `true`.
      */
    var fitPrior: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Given an input string, tokenize it into an array of word tokens.
      *
      * By default, removes punctuation and splits on spaces.
      */
    var tokenizer: js.UndefOr[js.Function1[/* text */ String, js.Array[String]]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFitPrior(value: Boolean): Self = StObject.set(x, "fitPrior", value.asInstanceOf[js.Any])
      
      inline def setFitPriorUndefined: Self = StObject.set(x, "fitPrior", js.undefined)
      
      inline def setTokenizer(value: /* text */ String => js.Array[String]): Self = StObject.set(x, "tokenizer", js.Any.fromFunction1(value))
      
      inline def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    }
  }
}
