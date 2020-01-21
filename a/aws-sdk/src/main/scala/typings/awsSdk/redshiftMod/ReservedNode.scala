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
  def apply(
    CurrencyCode: String = null,
    Duration: Int | scala.Double = null,
    FixedPrice: Int | scala.Double = null,
    NodeCount: Int | scala.Double = null,
    NodeType: String = null,
    OfferingType: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedNodeId: String = null,
    ReservedNodeOfferingId: String = null,
    ReservedNodeOfferingType: ReservedNodeOfferingType = null,
    StartTime: TStamp = null,
    State: String = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedNode = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (NodeCount != null) __obj.updateDynamic("NodeCount")(NodeCount.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservedNodeId != null) __obj.updateDynamic("ReservedNodeId")(ReservedNodeId.asInstanceOf[js.Any])
    if (ReservedNodeOfferingId != null) __obj.updateDynamic("ReservedNodeOfferingId")(ReservedNodeOfferingId.asInstanceOf[js.Any])
    if (ReservedNodeOfferingType != null) __obj.updateDynamic("ReservedNodeOfferingType")(ReservedNodeOfferingType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedNode]
  }
}

