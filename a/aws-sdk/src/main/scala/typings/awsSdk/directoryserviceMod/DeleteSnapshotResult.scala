package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotResult extends js.Object {
  /**
    * The identifier of the directory snapshot that was deleted.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotId] = js.native
}

object DeleteSnapshotResult {
  @scala.inline
  def apply(): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
  @scala.inline
  implicit class DeleteSnapshotResultOps[Self <: DeleteSnapshotResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
  }
  
}

