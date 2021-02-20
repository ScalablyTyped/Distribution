package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainSuggestionsResponse extends StObject {
  
  /**
    * A list of possible domain names. If you specified true for OnlyAvailable in the request, the list contains only domains that are available for registration.
    */
  var SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.native
}
object GetDomainSuggestionsResponse {
  
  @scala.inline
  def apply(): GetDomainSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainSuggestionsResponse]
  }
  
  @scala.inline
  implicit class GetDomainSuggestionsResponseMutableBuilder[Self <: GetDomainSuggestionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestionsList(value: DomainSuggestionsList): Self = StObject.set(x, "SuggestionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsListUndefined: Self = StObject.set(x, "SuggestionsList", js.undefined)
    
    @scala.inline
    def setSuggestionsListVarargs(value: DomainSuggestion*): Self = StObject.set(x, "SuggestionsList", js.Array(value :_*))
  }
}
