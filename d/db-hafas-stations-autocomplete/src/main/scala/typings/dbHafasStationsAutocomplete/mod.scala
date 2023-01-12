package typings.dbHafasStationsAutocomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Search & autocompletion for [Deutsche Bahn](https://en.wikipedia.org/wiki/Deutsche_Bahn) stations.
    * Pulls its data from [`db-hafas-stations`](https://github.com/derhuerst/db-hafas-stations).
    *
    * @example
    * import autocomplete = require('db-hafas-stations-autocomplete')
    *
    * autocomplete('Münch', 3)
    * // =>
    * // [
    * //   {
    * //     id: '624637',
    * //     relevance: 0.878345935,
    * //     score: 4.601702707916342,
    * //     weight: 143.8
    * //   },
    * //   {
    * //     id: '620368',
    * //     relevance: 0.878345935,
    * //     score: 4.601702707916342,
    * //     weight: 143.8
    * //   },
    * //   {
    * //     id: '8000261',
    * //     relevance: 0.878345935,
    * //     score: 4.601702707916342,
    * //     weight: 143.8
    * //   }
    * // ]
    */
  inline def apply(query: String): js.Array[Result] = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Result]]
  inline def apply(query: String, /** @default 6 */
  limit: Double): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Double,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Double,
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
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Double,
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
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Unit,
    /**
    * If you set `fuzzy` to `true`, words with a
    * [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) `<= 3` will be taken into account.
    * This is a lot slower though.
    *
    * @default false
    */
  fuzzy: Boolean
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Unit,
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
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  inline def apply(
    query: String,
    /** @default 6 */
  limit: Unit,
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
  ): js.Array[Result] = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[js.Array[Result]]
  
  @JSImport("db-hafas-stations-autocomplete", JSImport.Namespace)
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
