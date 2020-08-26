package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedNode extends js.Object {
  /**
    * The currency code for the reserved cluster.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration of the node reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed cost Amazon Redshift charges you for this reserved node.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The number of reserved compute nodes.
    */
  var NodeCount: js.UndefOr[Integer] = js.native
  /**
    * The node type of the reserved node.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The recurring charges for the reserved node.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedNodeId: js.UndefOr[String] = js.native
  /**
    * The identifier for the reserved node offering.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNodeOfferingType] = js.native
  /**
    * The time the reservation started. You purchase a reserved node offering for a duration. This is the start time of that duration.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * The state of the reserved compute node. Possible Values:   pending-payment-This reserved node has recently been purchased, and the sale has been approved, but payment has not yet been confirmed.   active-This reserved node is owned by the caller and is available for use.   payment-failed-Payment failed for the purchase attempt.   retired-The reserved node is no longer available.    exchanging-The owner is exchanging the reserved node for another reserved node.  
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The hourly rate Amazon Redshift charges you for this reserved node.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedNode {
  @scala.inline
  def apply(): ReservedNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNode]
  }
  @scala.inline
  implicit class ReservedNodeOps[Self <: ReservedNode] (val x: Self) extends AnyVal {
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
    def setCurrencyCode(value: String): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    @scala.inline
    def setNodeCount(value: Integer): Self = this.set("NodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeCount: Self = this.set("NodeCount", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    @scala.inline
    def setOfferingType(value: String): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    @scala.inline
    def setReservedNodeId(value: String): Self = this.set("ReservedNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedNodeId: Self = this.set("ReservedNodeId", js.undefined)
    @scala.inline
    def setReservedNodeOfferingId(value: String): Self = this.set("ReservedNodeOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedNodeOfferingId: Self = this.set("ReservedNodeOfferingId", js.undefined)
    @scala.inline
    def setReservedNodeOfferingType(value: ReservedNodeOfferingType): Self = this.set("ReservedNodeOfferingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedNodeOfferingType: Self = this.set("ReservedNodeOfferingType", js.undefined)
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
  
}

