package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeInfo extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  /**
    * The Amazon Resource Name (ARN) for the storage volume. For example, the following is a valid ARN:  arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB   Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume. 
    */
  var VolumeAttachmentStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  /**
    * The unique identifier assigned to the volume. This ID becomes part of the volume Amazon Resource Name (ARN), which you use as input for other operations.  Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
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
  def apply(
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    VolumeARN: VolumeARN = null,
    VolumeAttachmentStatus: VolumeAttachmentStatus = null,
    VolumeId: VolumeId = null,
    VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
    VolumeType: VolumeType = null
  ): VolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    if (VolumeAttachmentStatus != null) __obj.updateDynamic("VolumeAttachmentStatus")(VolumeAttachmentStatus.asInstanceOf[js.Any])
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSizeInBytes)) __obj.updateDynamic("VolumeSizeInBytes")(VolumeSizeInBytes.get.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInfo]
  }
}

