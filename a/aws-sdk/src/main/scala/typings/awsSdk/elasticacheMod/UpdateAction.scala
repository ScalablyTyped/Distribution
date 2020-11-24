package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAction extends js.Object {
  
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The status of the service update on the cache node
    */
  var CacheNodeUpdateStatus: js.UndefOr[CacheNodeUpdateStatusList] = js.native
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The estimated length of time for the update to complete
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.native
  
  /**
    * The status of the service update on the node group
    */
  var NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList] = js.native
  
  /**
    * The progress of the service update on the replication group
    */
  var NodesUpdated: js.UndefOr[String] = js.native
  
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  
  /**
    * The recommended date to apply the service update to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The date the update is first available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.native
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.native
  
  /**
    * Reflects the nature of the service update 
    */
  var ServiceUpdateType: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateType] = js.native
  
  /**
    * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication group was created after the recommended apply-by date.
    */
  var SlaMet: js.UndefOr[typings.awsSdk.elasticacheMod.SlaMet] = js.native
  
  /**
    * The date that the service update is available to a replication group
    */
  var UpdateActionAvailableDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The status of the update action
    */
  var UpdateActionStatus: js.UndefOr[typings.awsSdk.elasticacheMod.UpdateActionStatus] = js.native
  
  /**
    * The date when the UpdateActionStatus was last modified
    */
  var UpdateActionStatusModifiedDate: js.UndefOr[TStamp] = js.native
}
object UpdateAction {
  
  @scala.inline
  def apply(): UpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAction]
  }
  
  @scala.inline
  implicit class UpdateActionOps[Self <: UpdateAction] (val x: Self) extends AnyVal {
    
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
    def setCacheNodeUpdateStatusVarargs(value: CacheNodeUpdateStatus*): Self = this.set("CacheNodeUpdateStatus", js.Array(value :_*))
    
    @scala.inline
    def setCacheNodeUpdateStatus(value: CacheNodeUpdateStatusList): Self = this.set("CacheNodeUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeUpdateStatus: Self = this.set("CacheNodeUpdateStatus", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEstimatedUpdateTime(value: String): Self = this.set("EstimatedUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedUpdateTime: Self = this.set("EstimatedUpdateTime", js.undefined)
    
    @scala.inline
    def setNodeGroupUpdateStatusVarargs(value: NodeGroupUpdateStatus*): Self = this.set("NodeGroupUpdateStatus", js.Array(value :_*))
    
    @scala.inline
    def setNodeGroupUpdateStatus(value: NodeGroupUpdateStatusList): Self = this.set("NodeGroupUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroupUpdateStatus: Self = this.set("NodeGroupUpdateStatus", js.undefined)
    
    @scala.inline
    def setNodesUpdated(value: String): Self = this.set("NodesUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodesUpdated: Self = this.set("NodesUpdated", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateName: Self = this.set("ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setServiceUpdateRecommendedApplyByDate(value: TStamp): Self = this.set("ServiceUpdateRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateRecommendedApplyByDate: Self = this.set("ServiceUpdateRecommendedApplyByDate", js.undefined)
    
    @scala.inline
    def setServiceUpdateReleaseDate(value: TStamp): Self = this.set("ServiceUpdateReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateReleaseDate: Self = this.set("ServiceUpdateReleaseDate", js.undefined)
    
    @scala.inline
    def setServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = this.set("ServiceUpdateSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateSeverity: Self = this.set("ServiceUpdateSeverity", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatus): Self = this.set("ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateStatus: Self = this.set("ServiceUpdateStatus", js.undefined)
    
    @scala.inline
    def setServiceUpdateType(value: ServiceUpdateType): Self = this.set("ServiceUpdateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUpdateType: Self = this.set("ServiceUpdateType", js.undefined)
    
    @scala.inline
    def setSlaMet(value: SlaMet): Self = this.set("SlaMet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlaMet: Self = this.set("SlaMet", js.undefined)
    
    @scala.inline
    def setUpdateActionAvailableDate(value: TStamp): Self = this.set("UpdateActionAvailableDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateActionAvailableDate: Self = this.set("UpdateActionAvailableDate", js.undefined)
    
    @scala.inline
    def setUpdateActionStatus(value: UpdateActionStatus): Self = this.set("UpdateActionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateActionStatus: Self = this.set("UpdateActionStatus", js.undefined)
    
    @scala.inline
    def setUpdateActionStatusModifiedDate(value: TStamp): Self = this.set("UpdateActionStatusModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateActionStatusModifiedDate: Self = this.set("UpdateActionStatusModifiedDate", js.undefined)
  }
}
