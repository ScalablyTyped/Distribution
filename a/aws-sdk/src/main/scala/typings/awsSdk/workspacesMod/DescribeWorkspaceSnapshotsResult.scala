package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceSnapshotsResult extends js.Object {
  /**
    * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
    */
  var RebuildSnapshots: js.UndefOr[SnapshotList] = js.native
  /**
    * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root volume and the user volume.
    */
  var RestoreSnapshots: js.UndefOr[SnapshotList] = js.native
}

object DescribeWorkspaceSnapshotsResult {
  @scala.inline
  def apply(): DescribeWorkspaceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceSnapshotsResultOps[Self <: DescribeWorkspaceSnapshotsResult] (val x: Self) extends AnyVal {
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
    def setRebuildSnapshotsVarargs(value: Snapshot*): Self = this.set("RebuildSnapshots", js.Array(value :_*))
    @scala.inline
    def setRebuildSnapshots(value: SnapshotList): Self = this.set("RebuildSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRebuildSnapshots: Self = this.set("RebuildSnapshots", js.undefined)
    @scala.inline
    def setRestoreSnapshotsVarargs(value: Snapshot*): Self = this.set("RestoreSnapshots", js.Array(value :_*))
    @scala.inline
    def setRestoreSnapshots(value: SnapshotList): Self = this.set("RestoreSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreSnapshots: Self = this.set("RestoreSnapshots", js.undefined)
  }
  
}

