package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: BillingGroupProperties = js.native
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the UpdateBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
}

object UpdateBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName, billingGroupProperties: BillingGroupProperties): UpdateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any], billingGroupProperties = billingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBillingGroupRequest]
  }
  @scala.inline
  implicit class UpdateBillingGroupRequestOps[Self <: UpdateBillingGroupRequest] (val x: Self) extends AnyVal {
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
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBillingGroupProperties(value: BillingGroupProperties): Self = this.set("billingGroupProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
  }
  
}

