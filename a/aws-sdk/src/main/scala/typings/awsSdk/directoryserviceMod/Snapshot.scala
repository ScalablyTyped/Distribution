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
  def apply(
    DirectoryId: DirectoryId = null,
    Name: SnapshotName = null,
    SnapshotId: SnapshotId = null,
    StartTime: StartTime = null,
    Status: SnapshotStatus = null,
    Type: SnapshotType = null
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

