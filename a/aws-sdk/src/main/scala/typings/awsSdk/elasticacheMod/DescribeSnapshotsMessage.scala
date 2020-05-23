package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsMessage extends js.Object {
  /**
    * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific cluster are described.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 50 Constraints: minimum 20; maximum 50.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that specific replication group are described.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
    */
  var ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.native
  /**
    * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
    */
  var SnapshotName: js.UndefOr[String] = js.native
  /**
    * If set to system, the output shows snapshots that were automatically created by ElastiCache. If set to user the output shows snapshots that were manually created. If omitted, the output shows both automatically and manually created snapshots.
    */
  var SnapshotSource: js.UndefOr[String] = js.native
}

object DescribeSnapshotsMessage {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicationGroupId: String = null,
    ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined,
    SnapshotName: String = null,
    SnapshotSource: String = null
  ): DescribeSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowNodeGroupConfig)) __obj.updateDynamic("ShowNodeGroupConfig")(ShowNodeGroupConfig.get.asInstanceOf[js.Any])
    if (SnapshotName != null) __obj.updateDynamic("SnapshotName")(SnapshotName.asInstanceOf[js.Any])
    if (SnapshotSource != null) __obj.updateDynamic("SnapshotSource")(SnapshotSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSnapshotsMessage]
  }
}

