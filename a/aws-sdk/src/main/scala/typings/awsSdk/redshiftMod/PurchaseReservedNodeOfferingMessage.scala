package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedNodeOfferingMessage extends js.Object {
  /**
    * The number of reserved nodes that you want to purchase. Default: 1 
    */
  var NodeCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * The unique identifier of the reserved node offering you want to purchase.
    */
  var ReservedNodeOfferingId: String = js.native
}

object PurchaseReservedNodeOfferingMessage {
  @scala.inline
  def apply(ReservedNodeOfferingId: String): PurchaseReservedNodeOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeOfferingId = ReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedNodeOfferingMessage]
  }
  @scala.inline
  implicit class PurchaseReservedNodeOfferingMessageOps[Self <: PurchaseReservedNodeOfferingMessage] (val x: Self) extends AnyVal {
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
    def setReservedNodeOfferingId(value: String): Self = this.set("ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeCount(value: IntegerOptional): Self = this.set("NodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeCount: Self = this.set("NodeCount", js.undefined)
  }
  
}

