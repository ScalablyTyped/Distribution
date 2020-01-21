package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotMessage extends js.Object {
  /**
    * Provides a list of DB cluster snapshots for the user.
    */
  var DBClusterSnapshots: js.UndefOr[DBClusterSnapshotList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterSnapshotMessage {
  @scala.inline
  def apply(DBClusterSnapshots: DBClusterSnapshotList = null, Marker: String = null): DBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshots != null) __obj.updateDynamic("DBClusterSnapshots")(DBClusterSnapshots.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterSnapshotMessage]
  }
}

