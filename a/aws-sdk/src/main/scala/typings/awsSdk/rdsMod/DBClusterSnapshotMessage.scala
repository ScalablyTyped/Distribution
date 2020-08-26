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
  def apply(): DBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotMessage]
  }
  @scala.inline
  implicit class DBClusterSnapshotMessageOps[Self <: DBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBClusterSnapshotsVarargs(value: DBClusterSnapshot*): Self = this.set("DBClusterSnapshots", js.Array(value :_*))
    @scala.inline
    def setDBClusterSnapshots(value: DBClusterSnapshotList): Self = this.set("DBClusterSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshots: Self = this.set("DBClusterSnapshots", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

