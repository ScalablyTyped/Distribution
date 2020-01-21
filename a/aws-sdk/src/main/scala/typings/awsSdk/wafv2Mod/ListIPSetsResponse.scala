package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * Array of IPSets. This may not be the full list of IPSets that you have defined. See the Limit specification for this request.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IPSets: IPSetSummaries = null, NextMarker: NextMarker = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (IPSets != null) __obj.updateDynamic("IPSets")(IPSets.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

