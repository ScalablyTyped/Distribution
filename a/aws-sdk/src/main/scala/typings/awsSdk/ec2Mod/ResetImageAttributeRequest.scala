package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetImageAttributeRequest extends js.Object {
  /**
    * The attribute to reset (currently you can only reset the launch permission attribute).
    */
  var Attribute: ResetImageAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
}

object ResetImageAttributeRequest {
  @scala.inline
  def apply(Attribute: ResetImageAttributeName, ImageId: ImageId): ResetImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetImageAttributeRequest]
  }
  @scala.inline
  implicit class ResetImageAttributeRequestOps[Self <: ResetImageAttributeRequest] (val x: Self) extends AnyVal {
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
    def setAttribute(value: ResetImageAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

