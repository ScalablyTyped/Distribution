package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumeAttributeRequest extends js.Object {
  /**
    * The attribute of the volume. This parameter is required.
    */
  var Attribute: VolumeAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
}

object DescribeVolumeAttributeRequest {
  @scala.inline
  def apply(Attribute: VolumeAttributeName, VolumeId: VolumeId, DryRun: js.UndefOr[Boolean] = js.undefined): DescribeVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumeAttributeRequest]
  }
}

