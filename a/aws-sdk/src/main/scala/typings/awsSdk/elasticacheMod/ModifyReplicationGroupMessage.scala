package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Determines whether a read replica is automatically promoted to read/write primary if the existing primary encounters a failure. Valid values: true | false  Amazon ElastiCache for Redis does not support Multi-AZ with automatic failover on:   Redis versions earlier than 2.8.6.   Redis (cluster mode disabled): T1 node types.   Redis (cluster mode enabled): T1 node types.  
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
}

object ModifyReplicationGroupMessage {
  @scala.inline
  def apply(
    ReplicationGroupId: String,
    ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
    AuthToken: String = null,
    AuthTokenUpdateStrategy: AuthTokenUpdateStrategyType = null,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AutomaticFailoverEnabled: js.UndefOr[BooleanOptional] = js.undefined,
    CacheNodeType: String = null,
    CacheParameterGroupName: String = null,
    CacheSecurityGroupNames: CacheSecurityGroupNameList = null,
    EngineVersion: String = null,
    NodeGroupId: String = null,
    NotificationTopicArn: String = null,
    NotificationTopicStatus: String = null,
    PreferredMaintenanceWindow: String = null,
    PrimaryClusterId: String = null,
    ReplicationGroupDescription: String = null,
    SecurityGroupIds: SecurityGroupIdsList = null,
    SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined,
    SnapshotWindow: String = null,
    SnapshottingClusterId: String = null
  ): ModifyReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.get.asInstanceOf[js.Any])
    if (AuthToken != null) __obj.updateDynamic("AuthToken")(AuthToken.asInstanceOf[js.Any])
    if (AuthTokenUpdateStrategy != null) __obj.updateDynamic("AuthTokenUpdateStrategy")(AuthTokenUpdateStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AutomaticFailoverEnabled)) __obj.updateDynamic("AutomaticFailoverEnabled")(AutomaticFailoverEnabled.get.asInstanceOf[js.Any])
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (CacheParameterGroupName != null) __obj.updateDynamic("CacheParameterGroupName")(CacheParameterGroupName.asInstanceOf[js.Any])
    if (CacheSecurityGroupNames != null) __obj.updateDynamic("CacheSecurityGroupNames")(CacheSecurityGroupNames.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (NodeGroupId != null) __obj.updateDynamic("NodeGroupId")(NodeGroupId.asInstanceOf[js.Any])
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn.asInstanceOf[js.Any])
    if (NotificationTopicStatus != null) __obj.updateDynamic("NotificationTopicStatus")(NotificationTopicStatus.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (PrimaryClusterId != null) __obj.updateDynamic("PrimaryClusterId")(PrimaryClusterId.asInstanceOf[js.Any])
    if (ReplicationGroupDescription != null) __obj.updateDynamic("ReplicationGroupDescription")(ReplicationGroupDescription.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (!js.isUndefined(SnapshotRetentionLimit)) __obj.updateDynamic("SnapshotRetentionLimit")(SnapshotRetentionLimit.get.asInstanceOf[js.Any])
    if (SnapshotWindow != null) __obj.updateDynamic("SnapshotWindow")(SnapshotWindow.asInstanceOf[js.Any])
    if (SnapshottingClusterId != null) __obj.updateDynamic("SnapshottingClusterId")(SnapshottingClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupMessage]
  }
}

