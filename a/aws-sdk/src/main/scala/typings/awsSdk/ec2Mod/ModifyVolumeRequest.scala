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
  def apply(VolumeId: VolumeId): ModifyVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeRequest]
  }
  @scala.inline
  implicit class ModifyVolumeRequestOps[Self <: ModifyVolumeRequest] (val x: Self) extends AnyVal {
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
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

