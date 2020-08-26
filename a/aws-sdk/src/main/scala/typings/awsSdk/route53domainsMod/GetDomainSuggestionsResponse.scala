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
  def apply(): GetDomainSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainSuggestionsResponse]
  }
  @scala.inline
  implicit class GetDomainSuggestionsResponseOps[Self <: GetDomainSuggestionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuggestionsListVarargs(value: DomainSuggestion*): Self = this.set("SuggestionsList", js.Array(value :_*))
    @scala.inline
    def setSuggestionsList(value: DomainSuggestionsList): Self = this.set("SuggestionsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestionsList: Self = this.set("SuggestionsList", js.undefined)
  }
  
}

