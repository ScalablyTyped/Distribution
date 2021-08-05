package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainSuggestionsResponse extends StObject {
  
  /**
    * A list of possible domain names. If you specified true for OnlyAvailable in the request, the list contains only domains that are available for registration.
    */
  var SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.undefined
}
object GetDomainSuggestionsResponse {
  
  inline def apply(): GetDomainSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainSuggestionsResponse]
  }
  
  extension [Self <: GetDomainSuggestionsResponse](x: Self) {
    
    inline def setSuggestionsList(value: DomainSuggestionsList): Self = StObject.set(x, "SuggestionsList", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsListUndefined: Self = StObject.set(x, "SuggestionsList", js.undefined)
    
    inline def setSuggestionsListVarargs(value: DomainSuggestion*): Self = StObject.set(x, "SuggestionsList", js.Array(value :_*))
  }
}
