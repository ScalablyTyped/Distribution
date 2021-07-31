package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestRequest extends StObject {
  
  /**
    * Specifies the string for which you want to get suggestions.
    */
  var query: Query
  
  /**
    * Specifies the maximum number of suggestions to return. 
    */
  var size: js.UndefOr[SuggestionsSize] = js.undefined
  
  /**
    * Specifies the name of the suggester to use to find suggested matches.
    */
  var suggester: Suggester
}
object SuggestRequest {
  
  @scala.inline
  def apply(query: Query, suggester: Suggester): SuggestRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], suggester = suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestRequest]
  }
  
  @scala.inline
  implicit class SuggestRequestMutableBuilder[Self <: SuggestRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: SuggestionsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSuggester(value: Suggester): Self = StObject.set(x, "suggester", value.asInstanceOf[js.Any])
  }
}
