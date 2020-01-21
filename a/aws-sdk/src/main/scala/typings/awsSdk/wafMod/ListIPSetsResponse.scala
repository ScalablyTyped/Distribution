package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
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

