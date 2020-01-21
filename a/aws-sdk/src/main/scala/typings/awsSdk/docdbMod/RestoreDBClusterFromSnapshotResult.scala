package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDBClusterFromSnapshotResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsSdk.docdbMod.DBCluster] = js.native
}

object RestoreDBClusterFromSnapshotResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): RestoreDBClusterFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
  }
}

