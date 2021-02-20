package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestModel extends StObject {
  
  /**
    * The number of documents that were found to match the query string.
    */
  var found: js.UndefOr[Long] = js.native
  
  /**
    * The query string specified in the suggest request.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The documents that match the query string.
    */
  var suggestions: js.UndefOr[Suggestions] = js.native
}
object SuggestModel {
  
  @scala.inline
  def apply(): SuggestModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestModel]
  }
  
  @scala.inline
  implicit class SuggestModelMutableBuilder[Self <: SuggestModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFound(value: Long): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSuggestions(value: Suggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: SuggestionMatch*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
