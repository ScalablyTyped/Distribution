package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the replication group.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable encryption at-rest on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The date the auth token was last modified
    */
  var AuthTokenLastModifiedDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Indicates the status of automatic failover for this Redis replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.undefined
  
  /**
    * The name of the compute and memory capacity node type for each node in the replication group.
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be partitioned across multiple shards (API/CLI: node groups). Valid values: true | false 
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this replication group.
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The user supplied description of the replication group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Global Datastore and role of this replication group in the Global Datastore.
    */
  var GlobalReplicationGroupInfo: js.UndefOr[typings.awsSdk.elasticacheMod.GlobalReplicationGroupInfo] = js.undefined
  
  /**
    * The ID of the KMS key used to encrypt the disk in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The names of all the cache clusters that are part of this replication group.
    */
  var MemberClusters: js.UndefOr[ClusterIdList] = js.undefined
  
  /**
    * The outpost ARNs of the replication group's member clusters.
    */
  var MemberClustersOutpostArns: js.UndefOr[ReplicationGroupOutpostArnList] = js.undefined
  
  /**
    * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see Minimizing Downtime: Multi-AZ 
    */
  var MultiAZ: js.UndefOr[MultiAZStatus] = js.undefined
  
  /**
    * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each node group (shard).
    */
  var NodeGroups: js.UndefOr[NodeGroupList] = js.undefined
  
  /**
    * A group of settings to be applied to the replication group, either immediately or during the next maintenance window.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.undefined
  
  /**
    * The identifier for the replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this replication group - creating, available, modifying, deleting, create-failed, snapshotting.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The list of user group IDs that have access to the replication group.
    */
  var UserGroupIds: js.UndefOr[UserGroupIdList] = js.undefined
}
object ReplicationGroup {
  
  inline def apply(): ReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroup]
  }
  
  extension [Self <: ReplicationGroup](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAtRestEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "AtRestEncryptionEnabled", js.undefined)
    
    inline def setAuthTokenEnabled(value: BooleanOptional): Self = StObject.set(x, "AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenEnabledUndefined: Self = StObject.set(x, "AuthTokenEnabled", js.undefined)
    
    inline def setAuthTokenLastModifiedDate(value: TStamp): Self = StObject.set(x, "AuthTokenLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenLastModifiedDateUndefined: Self = StObject.set(x, "AuthTokenLastModifiedDate", js.undefined)
    
    inline def setAutomaticFailover(value: AutomaticFailoverStatus): Self = StObject.set(x, "AutomaticFailover", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverUndefined: Self = StObject.set(x, "AutomaticFailover", js.undefined)
    
    inline def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    inline def setClusterEnabled(value: BooleanOptional): Self = StObject.set(x, "ClusterEnabled", value.asInstanceOf[js.Any])
    
    inline def setClusterEnabledUndefined: Self = StObject.set(x, "ClusterEnabled", js.undefined)
    
    inline def setConfigurationEndpoint(value: Endpoint): Self = StObject.set(x, "ConfigurationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setConfigurationEndpointUndefined: Self = StObject.set(x, "ConfigurationEndpoint", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalReplicationGroupInfo(value: GlobalReplicationGroupInfo): Self = StObject.set(x, "GlobalReplicationGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupInfoUndefined: Self = StObject.set(x, "GlobalReplicationGroupInfo", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMemberClusters(value: ClusterIdList): Self = StObject.set(x, "MemberClusters", value.asInstanceOf[js.Any])
    
    inline def setMemberClustersOutpostArns(value: ReplicationGroupOutpostArnList): Self = StObject.set(x, "MemberClustersOutpostArns", value.asInstanceOf[js.Any])
    
    inline def setMemberClustersOutpostArnsUndefined: Self = StObject.set(x, "MemberClustersOutpostArns", js.undefined)
    
    inline def setMemberClustersOutpostArnsVarargs(value: String*): Self = StObject.set(x, "MemberClustersOutpostArns", js.Array(value :_*))
    
    inline def setMemberClustersUndefined: Self = StObject.set(x, "MemberClusters", js.undefined)
    
    inline def setMemberClustersVarargs(value: String*): Self = StObject.set(x, "MemberClusters", js.Array(value :_*))
    
    inline def setMultiAZ(value: MultiAZStatus): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setNodeGroups(value: NodeGroupList): Self = StObject.set(x, "NodeGroups", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupsUndefined: Self = StObject.set(x, "NodeGroups", js.undefined)
    
    inline def setNodeGroupsVarargs(value: NodeGroup*): Self = StObject.set(x, "NodeGroups", js.Array(value :_*))
    
    inline def setPendingModifiedValues(value: ReplicationGroupPendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    inline def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    inline def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    inline def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    inline def setSnapshottingClusterId(value: String): Self = StObject.set(x, "SnapshottingClusterId", value.asInstanceOf[js.Any])
    
    inline def setSnapshottingClusterIdUndefined: Self = StObject.set(x, "SnapshottingClusterId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTransitEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "TransitEncryptionEnabled", js.undefined)
    
    inline def setUserGroupIds(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIds", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsUndefined: Self = StObject.set(x, "UserGroupIds", js.undefined)
    
    inline def setUserGroupIdsVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIds", js.Array(value :_*))
  }
}
