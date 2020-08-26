package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingToBillingGroupRequest extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The ARN of the thing to be added to the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The name of the thing to be added to the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object AddThingToBillingGroupRequest {
  @scala.inline
  def apply(): AddThingToBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToBillingGroupRequest]
  }
  @scala.inline
  implicit class AddThingToBillingGroupRequestOps[Self <: AddThingToBillingGroupRequest] (val x: Self) extends AnyVal {
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
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroupName: Self = this.set("billingGroupName", js.undefined)
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
  
}

