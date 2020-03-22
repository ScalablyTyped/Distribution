package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedInstancesOfferingRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The number of Reserved Instances to purchase.
    */
  var InstanceCount: Integer = js.native
  /**
    * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved Instances are not purchased at unexpected prices.
    */
  var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.native
  /**
    * The time at which to purchase the Reserved Instance, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var PurchaseTime: js.UndefOr[DateTime] = js.native
  /**
    * The ID of the Reserved Instance offering to purchase.
    */
  var ReservedInstancesOfferingId: typings.awsSdk.ec2Mod.ReservedInstancesOfferingId = js.native
}

object PurchaseReservedInstancesOfferingRequest {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    ReservedInstancesOfferingId: ReservedInstancesOfferingId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LimitPrice: ReservedInstanceLimitPrice = null,
    PurchaseTime: DateTime = null
  ): PurchaseReservedInstancesOfferingRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], ReservedInstancesOfferingId = ReservedInstancesOfferingId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LimitPrice != null) __obj.updateDynamic("LimitPrice")(LimitPrice.asInstanceOf[js.Any])
    if (PurchaseTime != null) __obj.updateDynamic("PurchaseTime")(PurchaseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingRequest]
  }
}

