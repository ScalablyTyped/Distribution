package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexPatternSetsResponse extends js.Object {
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
  /**
    * 
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.native
}

object ListRegexPatternSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RegexPatternSets: RegexPatternSetSummaries = null): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (RegexPatternSets != null) __obj.updateDynamic("RegexPatternSets")(RegexPatternSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
}

