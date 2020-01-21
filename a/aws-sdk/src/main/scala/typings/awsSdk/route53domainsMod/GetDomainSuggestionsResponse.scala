package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainSuggestionsResponse extends js.Object {
  /**
    * A list of possible domain names. If you specified true for OnlyAvailable in the request, the list contains only domains that are available for registration.
    */
  var SuggestionsList: js.UndefOr[DomainSuggestionsList] = js.native
}

object GetDomainSuggestionsResponse {
  @scala.inline
  def apply(SuggestionsList: DomainSuggestionsList = null): GetDomainSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    if (SuggestionsList != null) __obj.updateDynamic("SuggestionsList")(SuggestionsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainSuggestionsResponse]
  }
}

