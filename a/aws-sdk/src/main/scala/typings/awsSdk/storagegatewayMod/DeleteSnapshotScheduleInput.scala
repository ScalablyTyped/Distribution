package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotScheduleInput extends js.Object {
  /**
    * The volume which snapshot schedule to delete.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object DeleteSnapshotScheduleInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleInput]
  }
  @scala.inline
  implicit class DeleteSnapshotScheduleInputOps[Self <: DeleteSnapshotScheduleInput] (val x: Self) extends AnyVal {
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
  }
  
}

