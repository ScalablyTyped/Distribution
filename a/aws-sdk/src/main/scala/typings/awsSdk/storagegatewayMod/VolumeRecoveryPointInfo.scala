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
  def apply(): VolumeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeRecoveryPointInfo]
  }
  @scala.inline
  implicit class VolumeRecoveryPointInfoOps[Self <: VolumeRecoveryPointInfo] (val x: Self) extends AnyVal {
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
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
    @scala.inline
    def setVolumeRecoveryPointTime(value: String): Self = this.set("VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeRecoveryPointTime: Self = this.set("VolumeRecoveryPointTime", js.undefined)
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = this.set("VolumeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("VolumeSizeInBytes", js.undefined)
    @scala.inline
    def setVolumeUsageInBytes(value: long): Self = this.set("VolumeUsageInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeUsageInBytes: Self = this.set("VolumeUsageInBytes", js.undefined)
  }
  
}

