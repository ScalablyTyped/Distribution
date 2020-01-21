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
}

