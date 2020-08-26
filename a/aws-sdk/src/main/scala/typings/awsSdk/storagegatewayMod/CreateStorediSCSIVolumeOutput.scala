package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorediSCSIVolumeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.native
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
}

object CreateStorediSCSIVolumeOutput {
  @scala.inline
  def apply(): CreateStorediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
  }
  @scala.inline
  implicit class CreateStorediSCSIVolumeOutputOps[Self <: CreateStorediSCSIVolumeOutput] (val x: Self) extends AnyVal {
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
    def setTargetARN(value: TargetARN): Self = this.set("TargetARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetARN: Self = this.set("TargetARN", js.undefined)
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = this.set("VolumeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("VolumeSizeInBytes", js.undefined)
  }
  
}

