package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
  var ReservedCacheNode: js.UndefOr[typings.awsSdk.elasticacheMod.ReservedCacheNode] = js.native
}

object PurchaseReservedCacheNodesOfferingResult {
  @scala.inline
  def apply(ReservedCacheNode: ReservedCacheNode = null): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedCacheNode != null) __obj.updateDynamic("ReservedCacheNode")(ReservedCacheNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
}

