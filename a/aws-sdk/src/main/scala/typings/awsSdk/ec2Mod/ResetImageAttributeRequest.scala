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
  def apply(
    Attribute: ResetImageAttributeName,
    ImageId: ImageId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetImageAttributeRequest]
  }
}

