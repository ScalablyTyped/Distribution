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
  def apply(PropertyNameSuggestions: PropertyNameSuggestionList = null): GetSearchSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    if (PropertyNameSuggestions != null) __obj.updateDynamic("PropertyNameSuggestions")(PropertyNameSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchSuggestionsResponse]
  }
}

