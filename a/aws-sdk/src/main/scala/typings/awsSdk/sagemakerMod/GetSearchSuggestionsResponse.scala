package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchSuggestionsResponse extends StObject {
  
  /**
    * A list of property names for a Resource that match a SuggestionQuery.
    */
  var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.undefined
}
object GetSearchSuggestionsResponse {
  
  inline def apply(): GetSearchSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchSuggestionsResponse]
  }
  
  extension [Self <: GetSearchSuggestionsResponse](x: Self) {
    
    inline def setPropertyNameSuggestions(value: PropertyNameSuggestionList): Self = StObject.set(x, "PropertyNameSuggestions", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameSuggestionsUndefined: Self = StObject.set(x, "PropertyNameSuggestions", js.undefined)
    
    inline def setPropertyNameSuggestionsVarargs(value: PropertyNameSuggestion*): Self = StObject.set(x, "PropertyNameSuggestions", js.Array(value :_*))
  }
}
