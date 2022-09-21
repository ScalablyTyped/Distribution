package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestModel extends StObject {
  
  /**
    * The number of documents that were found to match the query string.
    */
  var found: js.UndefOr[Long] = js.undefined
  
  /**
    * The query string specified in the suggest request.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The documents that match the query string.
    */
  var suggestions: js.UndefOr[Suggestions] = js.undefined
}
object SuggestModel {
  
  inline def apply(): SuggestModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestModel]
  }
  
  extension [Self <: SuggestModel](x: Self) {
    
    inline def setFound(value: Long): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSuggestions(value: Suggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: SuggestionMatch*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
