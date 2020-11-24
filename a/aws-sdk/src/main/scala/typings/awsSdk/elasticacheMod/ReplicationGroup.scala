package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationGroup extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) of the replication group.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable encryption at-rest on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var AtRestEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A flag that enables using an AuthToken (password) when issuing Redis commands. Default: false 
    */
  var AuthTokenEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The date the auth token was last modified
    */
  var AuthTokenLastModifiedDate: js.UndefOr[TStamp] = js.native
  
  /**
    * Indicates the status of automatic failover for this Redis replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  
  /**
    * The name of the compute and memory capacity node type for each node in the replication group.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * A flag indicating whether or not this replication group is cluster enabled; i.e., whether its data can be partitioned across multiple shards (API/CLI: node groups). Valid values: true | false 
    */
  var ClusterEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The configuration endpoint for this replication group. Use the configuration endpoint to connect to this replication group.
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * The user supplied description of the replication group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the Global Datastore and role of this replication group in the Global Datastore.
    */
  var GlobalReplicationGroupInfo: js.UndefOr[typings.awsSdk.elasticacheMod.GlobalReplicationGroupInfo] = js.native
  
  /**
    * The ID of the KMS key used to encrypt the disk in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The names of all the cache clusters that are part of this replication group.
    */
  var MemberClusters: js.UndefOr[ClusterIdList] = js.native
  
  /**
    * The outpost ARNs of the replication group's member clusters.
    */
  var MemberClustersOutpostArns: js.UndefOr[ReplicationGroupOutpostArnList] = js.native
  
  /**
    * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance. For more information, see Minimizing Downtime: Multi-AZ 
    */
  var MultiAZ: js.UndefOr[MultiAZStatus] = js.native
  
  /**
    * A list of node groups in this replication group. For Redis (cluster mode disabled) replication groups, this is a single-element list. For Redis (cluster mode enabled) replication groups, the list contains an entry for each node group (shard).
    */
  var NodeGroups: js.UndefOr[NodeGroupList] = js.native
  
  /**
    * A group of settings to be applied to the replication group, either immediately or during the next maintenance window.
    */
  var PendingModifiedValues: js.UndefOr[ReplicationGroupPendingModifiedValues] = js.native
  
  /**
    * The identifier for the replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard). Example: 05:00-09:00  If you do not specify this parameter, ElastiCache automatically chooses an appropriate time range.  This parameter is only valid if the Engine parameter is redis. 
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * The cluster ID that is used as the daily snapshot source for the replication group.
    */
  var SnapshottingClusterId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this replication group - creating, available, modifying, deleting, create-failed, snapshotting.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The list of user group IDs that have access to the replication group.
    */
  var UserGroupIds: js.UndefOr[UserGroupIdList] = js.native
}
object ReplicationGroup {
  
  @scala.inline
  def apply(): ReplicationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroup]
  }
  
  @scala.inline
  implicit class ReplicationGroupOps[Self <: ReplicationGroup] (val x: Self) extends AnyVal {
    
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: BooleanOptional): Self = this.set("AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtRestEncryptionEnabled: Self = this.set("AtRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenEnabled(value: BooleanOptional): Self = this.set("AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenEnabled: Self = this.set("AuthTokenEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenLastModifiedDate(value: TStamp): Self = this.set("AuthTokenLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenLastModifiedDate: Self = this.set("AuthTokenLastModifiedDate", js.undefined)
    
    @scala.inline
    def setAutomaticFailover(value: AutomaticFailoverStatus): Self = this.set("AutomaticFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFailover: Self = this.set("AutomaticFailover", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setClusterEnabled(value: BooleanOptional): Self = this.set("ClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterEnabled: Self = this.set("ClusterEnabled", js.undefined)
    
    @scala.inline
    def setConfigurationEndpoint(value: Endpoint): Self = this.set("ConfigurationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationEndpoint: Self = this.set("ConfigurationEndpoint", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupInfo(value: GlobalReplicationGroupInfo): Self = this.set("GlobalReplicationGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalReplicationGroupInfo: Self = this.set("GlobalReplicationGroupInfo", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setMemberClustersVarargs(value: String*): Self = this.set("MemberClusters", js.Array(value :_*))
    
    @scala.inline
    def setMemberClusters(value: ClusterIdList): Self = this.set("MemberClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberClusters: Self = this.set("MemberClusters", js.undefined)
    
    @scala.inline
    def setMemberClustersOutpostArnsVarargs(value: String*): Self = this.set("MemberClustersOutpostArns", js.Array(value :_*))
    
    @scala.inline
    def setMemberClustersOutpostArns(value: ReplicationGroupOutpostArnList): Self = this.set("MemberClustersOutpostArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberClustersOutpostArns: Self = this.set("MemberClustersOutpostArns", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: MultiAZStatus): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setNodeGroupsVarargs(value: NodeGroup*): Self = this.set("NodeGroups", js.Array(value :_*))
    
    @scala.inline
    def setNodeGroups(value: NodeGroupList): Self = this.set("NodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroups: Self = this.set("NodeGroups", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: ReplicationGroupPendingModifiedValues): Self = this.set("PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: BooleanOptional): Self = this.set("TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitEncryptionEnabled: Self = this.set("TransitEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setUserGroupIdsVarargs(value: UserGroupId*): Self = this.set("UserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIds(value: UserGroupIdList): Self = this.set("UserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIds: Self = this.set("UserGroupIds", js.undefined)
  }
}
