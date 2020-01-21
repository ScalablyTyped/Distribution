package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreErrorItem extends js.Object {
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[EnableFastSnapshotRestoreStateErrorSet] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object EnableFastSnapshotRestoreErrorItem {
  @scala.inline
  def apply(
    FastSnapshotRestoreStateErrors: EnableFastSnapshotRestoreStateErrorSet = null,
    SnapshotId: String = null
  ): EnableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    if (FastSnapshotRestoreStateErrors != null) __obj.updateDynamic("FastSnapshotRestoreStateErrors")(FastSnapshotRestoreStateErrors.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoreErrorItem]
  }
}

