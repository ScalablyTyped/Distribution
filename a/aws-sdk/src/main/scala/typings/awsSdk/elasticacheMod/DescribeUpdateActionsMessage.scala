package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUpdateActionsMessage extends js.Object {
  
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached 
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.native
  
  /**
    * The range of time specified to search for service updates that are in available status
    */
  var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.native
  
  /**
    * Dictates whether to include node level update status in the response 
    */
  var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The status of the update action.
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.native
}
object DescribeUpdateActionsMessage {
  
  @scala.inline
  def apply(): DescribeUpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateActionsMessage]
  }
  
  @scala.inline
  implicit class DescribeUpdateActionsMessageOps[Self <: DescribeUpdateActionsMessage] (val x: Self) extends AnyVal {
    
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
    def setCacheClusterIdsVarargs(value: String*): Self = this.set("CacheClusterIds", js.Array(value :_*))
    
    @scala.inline
    def setCacheClusterIds(value: CacheClusterIdList): Self = this.set("CacheClusterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterIds: Self = this.set("CacheClusterIds", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setReplicationGroupIdsVarargs(value: String*): Self = this.set("ReplicationGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupIds(value: ReplicationGroupIdList): Self = this.set("ReplicationGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupIds: Self = this.set("ReplicationGroupIds", js.undefined)
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateName: Self = this.set("ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatusVarargs(value: ServiceUpdateStatus*): Self = this.set("ServiceUpdateStatus", js.Array(value :_*))
    
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatusList): Self = this.set("ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateStatus: Self = this.set("ServiceUpdateStatus", js.undefined)
    
    @scala.inline
    def setServiceUpdateTimeRange(value: TimeRangeFilter): Self = this.set("ServiceUpdateTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateTimeRange: Self = this.set("ServiceUpdateTimeRange", js.undefined)
    
    @scala.inline
    def setShowNodeLevelUpdateStatus(value: BooleanOptional): Self = this.set("ShowNodeLevelUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNodeLevelUpdateStatus: Self = this.set("ShowNodeLevelUpdateStatus", js.undefined)
    
    @scala.inline
    def setUpdateActionStatusVarargs(value: UpdateActionStatus*): Self = this.set("UpdateActionStatus", js.Array(value :_*))
    
    @scala.inline
    def setUpdateActionStatus(value: UpdateActionStatusList): Self = this.set("UpdateActionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateActionStatus: Self = this.set("UpdateActionStatus", js.undefined)
  }
}
