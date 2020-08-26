package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The descriptive name of the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.native
  /**
    * The snapshot identifier.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotId] = js.native
  /**
    * The date and time that the snapshot was taken.
    */
  var StartTime: js.UndefOr[typings.awsSdk.directoryserviceMod.StartTime] = js.native
  /**
    * The snapshot status.
    */
  var Status: js.UndefOr[SnapshotStatus] = js.native
  /**
    * The snapshot type.
    */
  var Type: js.UndefOr[SnapshotType] = js.native
}

object Snapshot {
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setName(value: SnapshotName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setStartTime(value: StartTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: SnapshotStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setType(value: SnapshotType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

