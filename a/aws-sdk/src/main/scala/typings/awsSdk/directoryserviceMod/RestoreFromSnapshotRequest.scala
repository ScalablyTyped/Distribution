package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreFromSnapshotRequest extends js.Object {
  /**
    * The identifier of the snapshot to restore from.
    */
  var SnapshotId: typings.awsSdk.directoryserviceMod.SnapshotId = js.native
}

object RestoreFromSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
  @scala.inline
  implicit class RestoreFromSnapshotRequestOps[Self <: RestoreFromSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
  }
  
}

