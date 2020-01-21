package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromClusterSnapshotResult extends js.Object {
  var TableRestoreStatus: js.UndefOr[typings.awsSdk.redshiftMod.TableRestoreStatus] = js.native
}

object RestoreTableFromClusterSnapshotResult {
  @scala.inline
  def apply(TableRestoreStatus: TableRestoreStatus = null): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (TableRestoreStatus != null) __obj.updateDynamic("TableRestoreStatus")(TableRestoreStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
}

