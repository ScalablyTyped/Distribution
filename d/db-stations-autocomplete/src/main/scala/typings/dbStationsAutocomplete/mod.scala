package typings.dbStationsAutocomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides a stations search for [Deutsche Bahn](https://en.wikipedia.org/wiki/Deutsche_Bahn).
    * Pulls its data from [`db-stations`](https://github.com/derhuerst/db-stations).
    *
    * @example
    * import autocomplete = require('db-stations-autocomplete')
    *
    * autocomplete('Münch', 3)
    * // =>
    * // [ {
    * //     id: '8000261', // München Hbf
    * //     relevance: 0.8794466403162056,
    * //     score: 11.763480191996974,
    * //     weight: 2393.2
    * // }, {
    * //     id: '8004128', // München Donnersbergerbrücke
    * //     relevance: 0.8794466403162056,
    * //     score: 9.235186720706798,
    * //     weight: 1158
    * // }, {
    * //     id: '8004132', // München Karlsplatz
    * //     relevance: 0.8794466403162056,
    * //     score: 9.144716179768407,
    * //     weight: 1124.3
    * // } ]
    */
  inline def apply(query: String): js.Array[Result] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Result]]
  inline def apply(query: String, /** @default 3 */
  results: Double): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Double,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Double,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean,
    /**
    * Setting `completion` to `false` speeds things up.
    *
    * @default true
    */
  completion: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Double,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Unit,
    /**
    * Setting `completion` to `false` speeds things up.
    *
    * @default true
    */
  completion: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Unit,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Unit,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean,
    /**
    * Setting `completion` to `false` speeds things up.
    *
    * @default true
    */
  completion: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 3 */
  results: Unit,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Unit,
    /**
    * Setting `completion` to `false` speeds things up.
    *
    * @default true
    */
  completion: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], results.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  
  @JSImport("db-stations-autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Result extends StObject {
    
    var id: String
    
    var relevance: Double
    
    var score: Double
    
    var weight: Double
  }
  object Result {
    
    inline def apply(id: String, relevance: Double, score: Double, weight: Double): Result = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
