package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSnapshotScheduleOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object UpdateSnapshotScheduleOutput {
  @scala.inline
  def apply(): UpdateSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSnapshotScheduleOutput]
  }
  @scala.inline
  implicit class UpdateSnapshotScheduleOutputOps[Self <: UpdateSnapshotScheduleOutput] (val x: Self) extends AnyVal {
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
  }
  
}

