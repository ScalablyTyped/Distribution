package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CacheClusterId: String = null,
    CacheNodeUpdateStatus: CacheNodeUpdateStatusList = null,
    Engine: String = null,
    EstimatedUpdateTime: String = null,
    NodeGroupUpdateStatus: NodeGroupUpdateStatusList = null,
    NodesUpdated: String = null,
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null,
    ServiceUpdateRecommendedApplyByDate: TStamp = null,
    ServiceUpdateReleaseDate: TStamp = null,
    ServiceUpdateSeverity: ServiceUpdateSeverity = null,
    ServiceUpdateStatus: ServiceUpdateStatus = null,
    ServiceUpdateType: ServiceUpdateType = null,
    SlaMet: SlaMet = null,
    UpdateActionAvailableDate: TStamp = null,
    UpdateActionStatus: UpdateActionStatus = null,
    UpdateActionStatusModifiedDate: TStamp = null
  ): UpdateAction = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (CacheNodeUpdateStatus != null) __obj.updateDynamic("CacheNodeUpdateStatus")(CacheNodeUpdateStatus.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EstimatedUpdateTime != null) __obj.updateDynamic("EstimatedUpdateTime")(EstimatedUpdateTime.asInstanceOf[js.Any])
    if (NodeGroupUpdateStatus != null) __obj.updateDynamic("NodeGroupUpdateStatus")(NodeGroupUpdateStatus.asInstanceOf[js.Any])
    if (NodesUpdated != null) __obj.updateDynamic("NodesUpdated")(NodesUpdated.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName.asInstanceOf[js.Any])
    if (ServiceUpdateRecommendedApplyByDate != null) __obj.updateDynamic("ServiceUpdateRecommendedApplyByDate")(ServiceUpdateRecommendedApplyByDate.asInstanceOf[js.Any])
    if (ServiceUpdateReleaseDate != null) __obj.updateDynamic("ServiceUpdateReleaseDate")(ServiceUpdateReleaseDate.asInstanceOf[js.Any])
    if (ServiceUpdateSeverity != null) __obj.updateDynamic("ServiceUpdateSeverity")(ServiceUpdateSeverity.asInstanceOf[js.Any])
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus.asInstanceOf[js.Any])
    if (ServiceUpdateType != null) __obj.updateDynamic("ServiceUpdateType")(ServiceUpdateType.asInstanceOf[js.Any])
    if (SlaMet != null) __obj.updateDynamic("SlaMet")(SlaMet.asInstanceOf[js.Any])
    if (UpdateActionAvailableDate != null) __obj.updateDynamic("UpdateActionAvailableDate")(UpdateActionAvailableDate.asInstanceOf[js.Any])
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus.asInstanceOf[js.Any])
    if (UpdateActionStatusModifiedDate != null) __obj.updateDynamic("UpdateActionStatusModifiedDate")(UpdateActionStatusModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAction]
  }
}

