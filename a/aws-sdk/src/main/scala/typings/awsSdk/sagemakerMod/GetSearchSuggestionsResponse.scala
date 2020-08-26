package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSearchSuggestionsResponse extends js.Object {
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
  implicit class GetSearchSuggestionsResponseOps[Self <: GetSearchSuggestionsResponse] (val x: Self) extends AnyVal {
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
    def setPropertyNameSuggestionsVarargs(value: PropertyNameSuggestion*): Self = this.set("PropertyNameSuggestions", js.Array(value :_*))
    @scala.inline
    def setPropertyNameSuggestions(value: PropertyNameSuggestionList): Self = this.set("PropertyNameSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyNameSuggestions: Self = this.set("PropertyNameSuggestions", js.undefined)
  }
  
}

