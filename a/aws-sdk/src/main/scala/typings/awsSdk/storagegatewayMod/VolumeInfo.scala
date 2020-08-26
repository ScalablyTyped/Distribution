package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeInfo extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeAttachmentStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  /**
    * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeId: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeId] = js.native
  /**
    * The size of the volume in bytes. Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeType] = js.native
}

object VolumeInfo {
  @scala.inline
  def apply(): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeInfo]
  }
  @scala.inline
  implicit class VolumeInfoOps[Self <: VolumeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    @scala.inline
    def setGatewayId(value: GatewayId): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
    @scala.inline
    def setVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = this.set("VolumeAttachmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAttachmentStatus: Self = this.set("VolumeAttachmentStatus", js.undefined)
    @scala.inline
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = this.set("VolumeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("VolumeSizeInBytes", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

