package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotScheduleOutput extends js.Object {
  /**
    * The volume which snapshot schedule was deleted.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object DeleteSnapshotScheduleOutput {
  @scala.inline
  def apply(VolumeARN: VolumeARN = null): DeleteSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleOutput]
  }
}

