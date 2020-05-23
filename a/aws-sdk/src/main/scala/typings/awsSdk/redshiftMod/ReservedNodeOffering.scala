package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedNodeOffering extends js.Object {
  /**
    * The currency code for the compute nodes offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The duration, in seconds, for which the offering will reserve the node.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved node offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The node type offered by the reserved node offering.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The anticipated utilization of the reserved node, as defined in the reserved node offering.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The charge to your account regardless of whether you are creating any clusters using the node offering. Recurring charges are only in effect for heavy-utilization reserved nodes.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The offering identifier.
    */
  var ReservedNodeOfferingId: js.UndefOr[String] = js.native
  /**
    * 
    */
  var ReservedNodeOfferingType: js.UndefOr[typings.awsSdk.redshiftMod.ReservedNodeOfferingType] = js.native
  /**
    * The rate you are charged for each hour the cluster that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedNodeOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    NodeType: String = null,
    OfferingType: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedNodeOfferingId: String = null,
    ReservedNodeOfferingType: ReservedNodeOfferingType = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedNodeOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice.get.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservedNodeOfferingId != null) __obj.updateDynamic("ReservedNodeOfferingId")(ReservedNodeOfferingId.asInstanceOf[js.Any])
    if (ReservedNodeOfferingType != null) __obj.updateDynamic("ReservedNodeOfferingType")(ReservedNodeOfferingType.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedNodeOffering]
  }
}

