package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBillingGroupResponse extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.native
  /**
    * The name you gave to the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
}

object CreateBillingGroupResponse {
  @scala.inline
  def apply(): CreateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBillingGroupResponse]
  }
  @scala.inline
  implicit class CreateBillingGroupResponseOps[Self <: CreateBillingGroupResponse] (val x: Self) extends AnyVal {
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
    def setBillingGroupArn(value: BillingGroupArn): Self = this.set("billingGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroupArn: Self = this.set("billingGroupArn", js.undefined)
    @scala.inline
    def setBillingGroupId(value: BillingGroupId): Self = this.set("billingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroupId: Self = this.set("billingGroupId", js.undefined)
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroupName: Self = this.set("billingGroupName", js.undefined)
  }
  
}

