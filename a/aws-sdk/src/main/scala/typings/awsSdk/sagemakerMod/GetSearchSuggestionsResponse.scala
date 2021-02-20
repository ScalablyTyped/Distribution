package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchSuggestionsResponse extends StObject {
  
  /**
    * A list of property names for a Resource that match a SuggestionQuery.
    */
  var PropertyNameSuggestions: js.UndefOr[PropertyNameSuggestionList] = js.native
}
object GetSearchSuggestionsResponse {
  
  @scala.inline
  def apply(): GetSearchSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSearchSuggestionsResponse]
  }
  
  @scala.inline
  implicit class GetSearchSuggestionsResponseMutableBuilder[Self <: GetSearchSuggestionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyNameSuggestions(value: PropertyNameSuggestionList): Self = StObject.set(x, "PropertyNameSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameSuggestionsUndefined: Self = StObject.set(x, "PropertyNameSuggestions", js.undefined)
    
    @scala.inline
    def setPropertyNameSuggestionsVarargs(value: PropertyNameSuggestion*): Self = StObject.set(x, "PropertyNameSuggestions", js.Array(value :_*))
  }
}
