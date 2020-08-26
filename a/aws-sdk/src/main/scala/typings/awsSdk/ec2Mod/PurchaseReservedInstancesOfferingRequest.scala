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
  def apply(InstanceCount: Integer, ReservedInstancesOfferingId: ReservedInstancesOfferingId): PurchaseReservedInstancesOfferingRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], ReservedInstancesOfferingId = ReservedInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingRequest]
  }
  @scala.inline
  implicit class PurchaseReservedInstancesOfferingRequestOps[Self <: PurchaseReservedInstancesOfferingRequest] (val x: Self) extends AnyVal {
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
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setReservedInstancesOfferingId(value: ReservedInstancesOfferingId): Self = this.set("ReservedInstancesOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setLimitPrice(value: ReservedInstanceLimitPrice): Self = this.set("LimitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitPrice: Self = this.set("LimitPrice", js.undefined)
    @scala.inline
    def setPurchaseTime(value: DateTime): Self = this.set("PurchaseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurchaseTime: Self = this.set("PurchaseTime", js.undefined)
  }
  
}

