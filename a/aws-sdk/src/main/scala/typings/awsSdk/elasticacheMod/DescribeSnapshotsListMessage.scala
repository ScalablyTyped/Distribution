package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsListMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of snapshots. Each item in the list contains detailed information about one snapshot.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.native
}

object DescribeSnapshotsListMessage {
  @scala.inline
  def apply(Marker: String = null, Snapshots: SnapshotList = null): DescribeSnapshotsListMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotsListMessage]
  }
}

