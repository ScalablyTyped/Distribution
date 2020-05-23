package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionMatch extends js.Object {
  /**
    * The document ID of the suggested document.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The relevance score of a suggested match.
    */
  var score: js.UndefOr[Long] = js.native
  /**
    * The string that matches the query string specified in the SuggestRequest. 
    */
  var suggestion: js.UndefOr[String] = js.native
}

object SuggestionMatch {
  @scala.inline
  def apply(id: String = null, score: js.UndefOr[Long] = js.undefined, suggestion: String = null): SuggestionMatch = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (suggestion != null) __obj.updateDynamic("suggestion")(suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionMatch]
  }
}

