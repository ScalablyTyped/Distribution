package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUpdateActionsMessage extends StObject {
  
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
  implicit class DescribeUpdateActionsMessageMutableBuilder[Self <: DescribeUpdateActionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterIds(value: CacheClusterIdList): Self = StObject.set(x, "CacheClusterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdsUndefined: Self = StObject.set(x, "CacheClusterIds", js.undefined)
    
    @scala.inline
    def setCacheClusterIdsVarargs(value: String*): Self = StObject.set(x, "CacheClusterIds", js.Array(value :_*))
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setReplicationGroupIds(value: ReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdsUndefined: Self = StObject.set(x, "ReplicationGroupIds", js.undefined)
    
    @scala.inline
    def setReplicationGroupIdsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatusList): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatusVarargs(value: ServiceUpdateStatus*): Self = StObject.set(x, "ServiceUpdateStatus", js.Array(value :_*))
    
    @scala.inline
    def setServiceUpdateTimeRange(value: TimeRangeFilter): Self = StObject.set(x, "ServiceUpdateTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateTimeRangeUndefined: Self = StObject.set(x, "ServiceUpdateTimeRange", js.undefined)
    
    @scala.inline
    def setShowNodeLevelUpdateStatus(value: BooleanOptional): Self = StObject.set(x, "ShowNodeLevelUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNodeLevelUpdateStatusUndefined: Self = StObject.set(x, "ShowNodeLevelUpdateStatus", js.undefined)
    
    @scala.inline
    def setUpdateActionStatus(value: UpdateActionStatusList): Self = StObject.set(x, "UpdateActionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActionStatusUndefined: Self = StObject.set(x, "UpdateActionStatus", js.undefined)
    
    @scala.inline
    def setUpdateActionStatusVarargs(value: UpdateActionStatus*): Self = StObject.set(x, "UpdateActionStatus", js.Array(value :_*))
  }
}
