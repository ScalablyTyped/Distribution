package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImageAttributeRequest extends js.Object {
  /**
    * The AMI attribute.  Note: Depending on your account privileges, the blockDeviceMapping attribute may return a Client.AuthFailure error. If this happens, use DescribeImages to get information about the block device mapping for the AMI.
    */
  var Attribute: ImageAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
}

object DescribeImageAttributeRequest {
  @scala.inline
  def apply(Attribute: ImageAttributeName, ImageId: ImageId, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageAttributeRequest]
  }
}

