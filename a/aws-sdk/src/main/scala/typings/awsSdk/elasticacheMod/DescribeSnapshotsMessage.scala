package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsMessage]
  }
  
  @scala.inline
  implicit class DescribeSnapshotsMessageOps[Self <: DescribeSnapshotsMessage] (val x: Self) extends AnyVal {
    
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
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setShowNodeGroupConfig(value: BooleanOptional): Self = this.set("ShowNodeGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNodeGroupConfig: Self = this.set("ShowNodeGroupConfig", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotName: Self = this.set("SnapshotName", js.undefined)
    
    @scala.inline
    def setSnapshotSource(value: String): Self = this.set("SnapshotSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSource: Self = this.set("SnapshotSource", js.undefined)
  }
}
