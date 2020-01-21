package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVolumeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The target IOPS rate of the volume. This is only valid for Provisioned IOPS SSD (io1) volumes. For more information, see Provisioned IOPS SSD (io1) Volumes. Default: If no IOPS value is specified, the existing value is retained.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The target size of the volume, in GiB. The target volume size must be greater than or equal to than the existing size of the volume. For information about available EBS volume sizes, see Amazon EBS Volume Types. Default: If no size is specified, the existing size is retained.
    */
  var Size: js.UndefOr[Integer] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.ec2Mod.VolumeId = js.native
  /**
    * The target EBS volume type of the volume. Default: If no type is specified, the existing type is retained.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object ModifyVolumeRequest {
  @scala.inline
  def apply(
    VolumeId: VolumeId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Iops: Int | scala.Double = null,
    Size: Int | scala.Double = null,
    VolumeType: VolumeType = null
  ): ModifyVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeRequest]
  }
}

