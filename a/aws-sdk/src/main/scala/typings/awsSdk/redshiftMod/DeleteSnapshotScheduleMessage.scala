package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotScheduleMessage extends js.Object {
  /**
    * A unique identifier of the snapshot schedule to delete.
    */
  var ScheduleIdentifier: String = js.native
}

object DeleteSnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleIdentifier: String): DeleteSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSnapshotScheduleMessage]
  }
}

