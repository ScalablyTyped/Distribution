package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) of the snapshot.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the status of automatic failover for the source Redis replication group.
    */
  var AutomaticFailover: js.UndefOr[AutomaticFailoverStatus] = js.native
  
  /**
    * The date and time when the source cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The user-supplied identifier of the source cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  
  /**
    * The name of the compute and memory capacity node type for the source cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.m6g.large, cache.m6g.xlarge, cache.m6g.2xlarge, cache.m6g.4xlarge, cache.m6g.8xlarge, cache.m6g.12xlarge, cache.m6g.16xlarge   At this time, M6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.r6g.large, cache.r6g.xlarge, cache.r6g.2xlarge, cache.r6g.4xlarge, cache.r6g.8xlarge, cache.r6g.12xlarge, cache.r6g.16xlarge   At this time, R6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The cache parameter group that is associated with the source cluster.
    */
  var CacheParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache subnet group associated with the source cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache engine (memcached or redis) used by the source cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version of the cache engine version that is used by the source cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The ID of the KMS key used to encrypt the snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * A list of the cache nodes in the source cluster.
    */
  var NodeSnapshots: js.UndefOr[NodeSnapshotList] = js.native
  
  /**
    * The number of cache nodes in the source cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of node groups (shards) in this snapshot. When restoring from a snapshot, the number of node groups (shards) in the snapshot and in the restored replication group must be the same.
    */
  var NumNodeGroups: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The port number used by each cache nodes in the source cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the Availability Zone in which the source cluster is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * The ARN (Amazon Resource Name) of the preferred outpost.
    */
  var PreferredOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * A description of the source replication group.
    */
  var ReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the source replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  
  /**
    * The name of a snapshot. For an automatic snapshot, the name is system-generated. For a manual snapshot, this is the user-provided name.
    */
  var SnapshotName: js.UndefOr[String] = js.native
  
  /**
    * For an automatic snapshot, the number of days for which ElastiCache retains the snapshot before deleting it. For manual snapshots, this field reflects the SnapshotRetentionLimit for the source cluster when the snapshot was created. This field is otherwise ignored: Manual snapshots do not expire, and can only be deleted using the DeleteSnapshot operation.   Important If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
    */
  var SnapshotSource: js.UndefOr[String] = js.native
  
  /**
    * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
    */
  var SnapshotStatus: js.UndefOr[String] = js.native
  
  /**
    * The daily time range during which ElastiCache takes daily snapshots of the source cluster.
    */
  var SnapshotWindow: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the topic used by the source cluster for publishing notifications.
    */
  var TopicArn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet group for the source cluster.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object Snapshot {
  
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    
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
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAutomaticFailover(value: AutomaticFailoverStatus): Self = this.set("AutomaticFailover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticFailover: Self = this.set("AutomaticFailover", js.undefined)
    
    @scala.inline
    def setCacheClusterCreateTime(value: TStamp): Self = this.set("CacheClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterCreateTime: Self = this.set("CacheClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = this.set("CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterId: Self = this.set("CacheClusterId", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = this.set("CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroupName: Self = this.set("CacheParameterGroupName", js.undefined)
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = this.set("CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSubnetGroupName: Self = this.set("CacheSubnetGroupName", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setNodeSnapshotsVarargs(value: NodeSnapshot*): Self = this.set("NodeSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setNodeSnapshots(value: NodeSnapshotList): Self = this.set("NodeSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeSnapshots: Self = this.set("NodeSnapshots", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = this.set("NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCacheNodes: Self = this.set("NumCacheNodes", js.undefined)
    
    @scala.inline
    def setNumNodeGroups(value: IntegerOptional): Self = this.set("NumNodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumNodeGroups: Self = this.set("NumNodeGroups", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = this.set("PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAvailabilityZone: Self = this.set("PreferredAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArn(value: String): Self = this.set("PreferredOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredOutpostArn: Self = this.set("PreferredOutpostArn", js.undefined)
    
    @scala.inline
    def setReplicationGroupDescription(value: String): Self = this.set("ReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupDescription: Self = this.set("ReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroupId: Self = this.set("ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: String): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotName: Self = this.set("SnapshotName", js.undefined)
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = this.set("SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotRetentionLimit: Self = this.set("SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotSource(value: String): Self = this.set("SnapshotSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSource: Self = this.set("SnapshotSource", js.undefined)
    
    @scala.inline
    def setSnapshotStatus(value: String): Self = this.set("SnapshotStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotStatus: Self = this.set("SnapshotStatus", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = this.set("SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotWindow: Self = this.set("SnapshotWindow", js.undefined)
    
    @scala.inline
    def setTopicArn(value: String): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
