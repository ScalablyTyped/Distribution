package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeRecoveryPointInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * The time the recovery point was taken.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.native
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  /**
    * The size of the data stored on the volume in bytes.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsageInBytes: js.UndefOr[long] = js.native
}

object VolumeRecoveryPointInfo {
  @scala.inline
  def apply(
    VolumeARN: VolumeARN = null,
    VolumeRecoveryPointTime: String = null,
    VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
    VolumeUsageInBytes: js.UndefOr[long] = js.undefined
  ): VolumeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    if (VolumeRecoveryPointTime != null) __obj.updateDynamic("VolumeRecoveryPointTime")(VolumeRecoveryPointTime.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSizeInBytes)) __obj.updateDynamic("VolumeSizeInBytes")(VolumeSizeInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeUsageInBytes)) __obj.updateDynamic("VolumeUsageInBytes")(VolumeUsageInBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeRecoveryPointInfo]
  }
}

