package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAction extends StObject {
  
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update on the cache node
    */
  var CacheNodeUpdateStatus: js.UndefOr[CacheNodeUpdateStatusList] = js.undefined
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The estimated length of time for the update to complete
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update on the node group
    */
  var NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList] = js.undefined
  
  /**
    * The progress of the service update on the replication group
    */
  var NodesUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The recommended date to apply the service update to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the update is first available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.undefined
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.undefined
  
  /**
    * Reflects the nature of the service update 
    */
  var ServiceUpdateType: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateType] = js.undefined
  
  /**
    * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication group was created after the recommended apply-by date.
    */
  var SlaMet: js.UndefOr[typings.awsSdk.elasticacheMod.SlaMet] = js.undefined
  
  /**
    * The date that the service update is available to a replication group
    */
  var UpdateActionAvailableDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the update action
    */
  var UpdateActionStatus: js.UndefOr[typings.awsSdk.elasticacheMod.UpdateActionStatus] = js.undefined
  
  /**
    * The date when the UpdateActionStatus was last modified
    */
  var UpdateActionStatusModifiedDate: js.UndefOr[js.Date] = js.undefined
}
object UpdateAction {
  
  inline def apply(): UpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAction]
  }
  
  extension [Self <: UpdateAction](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setCacheNodeUpdateStatus(value: CacheNodeUpdateStatusList): Self = StObject.set(x, "CacheNodeUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeUpdateStatusUndefined: Self = StObject.set(x, "CacheNodeUpdateStatus", js.undefined)
    
    inline def setCacheNodeUpdateStatusVarargs(value: CacheNodeUpdateStatus*): Self = StObject.set(x, "CacheNodeUpdateStatus", js.Array(value*))
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEstimatedUpdateTime(value: String): Self = StObject.set(x, "EstimatedUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedUpdateTimeUndefined: Self = StObject.set(x, "EstimatedUpdateTime", js.undefined)
    
    inline def setNodeGroupUpdateStatus(value: NodeGroupUpdateStatusList): Self = StObject.set(x, "NodeGroupUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUpdateStatusUndefined: Self = StObject.set(x, "NodeGroupUpdateStatus", js.undefined)
    
    inline def setNodeGroupUpdateStatusVarargs(value: NodeGroupUpdateStatus*): Self = StObject.set(x, "NodeGroupUpdateStatus", js.Array(value*))
    
    inline def setNodesUpdated(value: String): Self = StObject.set(x, "NodesUpdated", value.asInstanceOf[js.Any])
    
    inline def setNodesUpdatedUndefined: Self = StObject.set(x, "NodesUpdated", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setServiceUpdateRecommendedApplyByDate(value: js.Date): Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateRecommendedApplyByDateUndefined: Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", js.undefined)
    
    inline def setServiceUpdateReleaseDate(value: js.Date): Self = StObject.set(x, "ServiceUpdateReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateReleaseDateUndefined: Self = StObject.set(x, "ServiceUpdateReleaseDate", js.undefined)
    
    inline def setServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = StObject.set(x, "ServiceUpdateSeverity", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateSeverityUndefined: Self = StObject.set(x, "ServiceUpdateSeverity", js.undefined)
    
    inline def setServiceUpdateStatus(value: ServiceUpdateStatus): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    inline def setServiceUpdateType(value: ServiceUpdateType): Self = StObject.set(x, "ServiceUpdateType", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateTypeUndefined: Self = StObject.set(x, "ServiceUpdateType", js.undefined)
    
    inline def setSlaMet(value: SlaMet): Self = StObject.set(x, "SlaMet", value.asInstanceOf[js.Any])
    
    inline def setSlaMetUndefined: Self = StObject.set(x, "SlaMet", js.undefined)
    
    inline def setUpdateActionAvailableDate(value: js.Date): Self = StObject.set(x, "UpdateActionAvailableDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionAvailableDateUndefined: Self = StObject.set(x, "UpdateActionAvailableDate", js.undefined)
    
    inline def setUpdateActionStatus(value: UpdateActionStatus): Self = StObject.set(x, "UpdateActionStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionStatusModifiedDate(value: js.Date): Self = StObject.set(x, "UpdateActionStatusModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionStatusModifiedDateUndefined: Self = StObject.set(x, "UpdateActionStatusModifiedDate", js.undefined)
    
    inline def setUpdateActionStatusUndefined: Self = StObject.set(x, "UpdateActionStatus", js.undefined)
  }
}
