package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationGroupMessage extends js.Object {
  
  /**
    * If true, this parameter causes the modifications in this request and any pending modifications to be applied, asynchronously and as soon as possible, regardless of the PreferredMaintenanceWindow setting for the replication group. If false, changes to the nodes in the replication group are applied on the next maintenance reboot, or the next failure reboot, whichever occurs first. Valid values: true | false  Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  
  /**
    * Reserved parameter. The password used to access a password protected server. This parameter must be specified with the auth-token-update-strategy  parameter. Password constraints:   Must be only printable ASCII characters   Must be at least 16 characters and no more than 128 characters in length   Cannot contain any of the following characters: '/', '"', or '@', '%'    For more information, see AUTH password at AUTH.
    */
  var AuthToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies the strategy to use to update the AUTH token. This parameter must be specified with the auth-token parameter. Possible values:   Rotate   Set    For more information, see Authenticating Users with Redis AUTH 
    */
  var AuthTokenUpdateStrategy: js.UndefOr[AuthTokenUpdateStrategyType] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. Valid values: true | false 
    */
  var AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A valid cache node type that you want to scale this replication group to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache parameter group to apply to all of the clusters in this replication group. This change is asynchronously applied as soon as possible for parameters when the ApplyImmediately parameter is specified as true for this request.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of cache security group names to authorize for the clusters in this replication group. This change is asynchronously applied as soon as possible. This parameter can be used only with replication group containing clusters running outside of an Amazon Virtual Private Cloud (Amazon VPC). Constraints: Must contain no more than 255 alphanumeric characters. Must not be Default.
    */
  var CacheSecurityGroupNames: js.UndefOr[CacheSecurityGroupNameList] = js.native
  
  /**
    * The upgraded version of the cache engine to be run on the clusters in the replication group.  Important: You can upgrade to a newer engine version (see Selecting a Cache Engine and Version), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine version, you must delete the existing replication group and create it anew with the earlier engine version. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see Minimizing Downtime: Multi-AZ.
    */
  var MultiAZEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Deprecated. This parameter is not used.
    */
  var NodeGroupId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications are sent.  The Amazon SNS topic owner must be same as the replication group owner.  
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  
  /**
    * The status of the Amazon SNS notification topic for the replication group. Notifications are sent only if the status is active. Valid values: active | inactive 
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * For replication groups with a single primary, if this parameter is specified, ElastiCache promotes the specified cluster in the specified replication group to the primary role. The nodes of all other clusters in the replication group are read replicas.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.native
  
  /**
    * Removes the user groups that can access this replication group.
    */
  var RemoveUserGroups: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A description for the replication group. Maximum length is 255 characters.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the replication group to modify.
    */
  var ReplicationGroupId: String = js.native
  
  /**
    * Specifies the VPC Security Groups associated with the clusters in the replication group. This parameter can be used only with replication group containing clusters running in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdsList] = js.native
  
  /**
    * The number of days for which ElastiCache retains automatic node group (shard) snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.  Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of the node group (shard) specified by SnapshottingClusterId. Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group. This parameter cannot be set for Redis (cluster mode enabled) replication groups.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.native
  
  /**
    * A list of user group IDs.
    */
  var UserGroupIdsToAdd: js.UndefOr[UserGroupIdList] = js.native
  
  /**
    * A list of users groups to remove, meaning the users in the group no longer can access thereplication group.
    */
  var UserGroupIdsToRemove: js.UndefOr[UserGroupIdList] = js.native
}
object ModifyReplicationGroupMessage {
  
  @scala.inline
  def apply(ReplicationGroupId: String): ModifyReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationGroupMessageOps[Self <: ModifyReplicationGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    
    @scala.inline
    def setAuthToken(value: String): Self = this.set("AuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthToken: Self = this.set("AuthToken", js.undefined)
    
    @scala.inline
    def setAuthTokenUpdateStrategy(value: AuthTokenUpdateStrategyType): Self = this.set("AuthTokenUpdateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenUpdateStrategy: Self = this.set("AuthTokenUpdateStrategy", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomaticFailoverEnabled(value: BooleanOptional): Self = this.set("AutomaticFailoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFailoverEnabled: Self = this.set("AutomaticFailoverEnabled", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupNamesVarargs(value: String*): Self = this.set("CacheSecurityGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setCacheSecurityGroupNames(value: CacheSecurityGroupNameList): Self = this.set("CacheSecurityGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSecurityGroupNames: Self = this.set("CacheSecurityGroupNames", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setMultiAZEnabled(value: BooleanOptional): Self = this.set("MultiAZEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZEnabled: Self = this.set("MultiAZEnabled", js.undefined)
    
    @scala.inline
    def setNodeGroupId(value: String): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: String): Self = this.set("NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("NotificationTopicArn", js.undefined)
    
    @scala.inline
    def setNotificationTopicStatus(value: String): Self = this.set("NotificationTopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicStatus: Self = this.set("NotificationTopicStatus", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPrimaryClusterId(value: String): Self = this.set("PrimaryClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryClusterId: Self = this.set("PrimaryClusterId", js.undefined)
    
    @scala.inline
    def setRemoveUserGroups(value: BooleanOptional): Self = this.set("RemoveUserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUserGroups: Self = this.set("RemoveUserGroups", js.undefined)
    
    @scala.inline
    def setReplicationGroupDescription(value: String): Self = this.set("ReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupDescription: Self = this.set("ReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdsList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = this.set("SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("SnapshotWindow", js.undefined)
    
    @scala.inline
    def setSnapshottingClusterId(value: String): Self = this.set("SnapshottingClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshottingClusterId: Self = this.set("SnapshottingClusterId", js.undefined)
    
    @scala.inline
    def setUserGroupIdsToAddVarargs(value: UserGroupId*): Self = this.set("UserGroupIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIdsToAdd(value: UserGroupIdList): Self = this.set("UserGroupIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIdsToAdd: Self = this.set("UserGroupIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserGroupIdsToRemoveVarargs(value: UserGroupId*): Self = this.set("UserGroupIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIdsToRemove(value: UserGroupIdList): Self = this.set("UserGroupIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIdsToRemove: Self = this.set("UserGroupIdsToRemove", js.undefined)
  }
}
