package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceEventNotificationAttributesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Information about the tag keys to register.
    */
  var InstanceTagAttribute: js.UndefOr[RegisterInstanceTagAttributeRequest] = js.native
}

object RegisterInstanceEventNotificationAttributesRequest {
  @scala.inline
  def apply(): RegisterInstanceEventNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceEventNotificationAttributesRequest]
  }
  @scala.inline
  implicit class RegisterInstanceEventNotificationAttributesRequestOps[Self <: RegisterInstanceEventNotificationAttributesRequest] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setInstanceTagAttribute(value: RegisterInstanceTagAttributeRequest): Self = this.set("InstanceTagAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTagAttribute: Self = this.set("InstanceTagAttribute", js.undefined)
  }
  
}

