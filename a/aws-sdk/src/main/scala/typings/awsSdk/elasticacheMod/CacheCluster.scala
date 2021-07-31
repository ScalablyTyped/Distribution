package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheCluster extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the cache cluster.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables encryption at-rest when set to true. You cannot modify the value of AtRestEncryptionEnabled after the cluster is created. To enable at-rest encryption on a cluster you must set AtRestEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
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
    * This parameter is currently disabled.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the cluster was created.
    */
  var CacheClusterCreateTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The user-supplied identifier of the cluster. This identifier is a unique key that identifies a cluster.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this cluster, one of the following values: available, creating, deleted, deleting, incompatible-network, modifying, rebooting cluster nodes, restore-failed, or snapshotting.
    */
  var CacheClusterStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the compute and memory capacity node type for the cluster. The following node types are supported by ElastiCache. Generally speaking, the current generation types provide more memory and computational power at lower cost when compared to their equivalent previous generation counterparts.   General purpose:   Current generation:   M6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.m6g.large, cache.m6g.xlarge, cache.m6g.2xlarge, cache.m6g.4xlarge, cache.m6g.8xlarge, cache.m6g.12xlarge, cache.m6g.16xlarge   At this time, M6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   M5 node types: cache.m5.large, cache.m5.xlarge, cache.m5.2xlarge, cache.m5.4xlarge, cache.m5.12xlarge, cache.m5.24xlarge   M4 node types: cache.m4.large, cache.m4.xlarge, cache.m4.2xlarge, cache.m4.4xlarge, cache.m4.10xlarge   T3 node types: cache.t3.micro, cache.t3.small, cache.t3.medium   T2 node types: cache.t2.micro, cache.t2.small, cache.t2.medium    Previous generation: (not recommended)  T1 node types: cache.t1.micro   M1 node types: cache.m1.small, cache.m1.medium, cache.m1.large, cache.m1.xlarge   M3 node types: cache.m3.medium, cache.m3.large, cache.m3.xlarge, cache.m3.2xlarge      Compute optimized:   Previous generation: (not recommended)  C1 node types: cache.c1.xlarge      Memory optimized:   Current generation:   R6g node types (available only for Redis engine version 5.0.6 onward and for Memcached engine version 1.5.16 onward).  cache.r6g.large, cache.r6g.xlarge, cache.r6g.2xlarge, cache.r6g.4xlarge, cache.r6g.8xlarge, cache.r6g.12xlarge, cache.r6g.16xlarge   At this time, R6g node types are available in the following regions: us-east-1, us-west-2, us-east-2, eu-central-1, eu-west-1 and ap-northeast-1.   R5 node types: cache.r5.large, cache.r5.xlarge, cache.r5.2xlarge, cache.r5.4xlarge, cache.r5.12xlarge, cache.r5.24xlarge   R4 node types: cache.r4.large, cache.r4.xlarge, cache.r4.2xlarge, cache.r4.4xlarge, cache.r4.8xlarge, cache.r4.16xlarge    Previous generation: (not recommended)  M2 node types: cache.m2.xlarge, cache.m2.2xlarge, cache.m2.4xlarge   R3 node types: cache.r3.large, cache.r3.xlarge, cache.r3.2xlarge, cache.r3.4xlarge, cache.r3.8xlarge       Additional node type info    All current generation instance types are created in Amazon VPC by default.   Redis append-only files (AOF) are not supported for T1 or T2 instances.   Redis Multi-AZ with automatic failover is not supported on T1 instances.   Redis configuration variables appendonly and appendfsync are not supported on Redis version 2.8.22 and later.  
    */
  var CacheNodeType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of cache nodes that are members of the cluster.
    */
  var CacheNodes: js.UndefOr[CacheNodeList] = js.undefined
  
  /**
    * Status of the cache parameter group.
    */
  var CacheParameterGroup: js.UndefOr[CacheParameterGroupStatus] = js.undefined
  
  /**
    * A list of cache security group elements, composed of name and status sub-elements.
    */
  var CacheSecurityGroups: js.UndefOr[CacheSecurityGroupMembershipList] = js.undefined
  
  /**
    * The name of the cache subnet group associated with the cluster.
    */
  var CacheSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the web page where you can download the latest ElastiCache client library.
    */
  var ClientDownloadLandingPage: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a Memcached cluster endpoint which, if Automatic Discovery is enabled on the cluster, can be used by an application to connect to any node in the cluster. The configuration endpoint will always have .cfg in it. Example: mem-3.9dvc4r.cfg.usw2.cache.amazonaws.com:11211 
    */
  var ConfigurationEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The name of the cache engine (memcached or redis) to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the cache engine that is used in this cluster.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing ElastiCache events to subscribers using Amazon Simple Notification Service (SNS). 
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.elasticacheMod.NotificationConfiguration] = js.undefined
  
  /**
    * The number of cache nodes in the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  var PendingModifiedValues: js.UndefOr[typings.awsSdk.elasticacheMod.PendingModifiedValues] = js.undefined
  
  /**
    * The name of the Availability Zone in which the cluster is located or "Multiple" if the cache nodes are located in different Availability Zones.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:23:00-mon:01:30 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The outpost ARN in which the cache cluster is created.
    */
  var PreferredOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The replication group to which this cluster belongs. If this field is empty, the cluster is not associated with any replication group.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * A list of VPC Security Groups associated with the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
  
  /**
    * The number of days for which ElastiCache retains automatic cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, a snapshot that was taken today is retained for 5 days before being deleted.   If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. 
    */
  var SnapshotRetentionLimit: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your cluster. Example: 05:00-09:00 
    */
  var SnapshotWindow: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that enables in-transit encryption when set to true. You cannot modify the value of TransitEncryptionEnabled after the cluster is created. To enable in-transit encryption on a cluster you must set TransitEncryptionEnabled to true when you create a cluster.  Required: Only available when creating a replication group in an Amazon VPC using redis version 3.2.6, 4.x or later. Default: false 
    */
  var TransitEncryptionEnabled: js.UndefOr[BooleanOptional] = js.undefined
}
object CacheCluster {
  
  @scala.inline
  def apply(): CacheCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheCluster]
  }
  
  @scala.inline
  implicit class CacheClusterMutableBuilder[Self <: CacheCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setAtRestEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "AtRestEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtRestEncryptionEnabledUndefined: Self = StObject.set(x, "AtRestEncryptionEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenEnabled(value: BooleanOptional): Self = StObject.set(x, "AuthTokenEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenEnabledUndefined: Self = StObject.set(x, "AuthTokenEnabled", js.undefined)
    
    @scala.inline
    def setAuthTokenLastModifiedDate(value: TStamp): Self = StObject.set(x, "AuthTokenLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenLastModifiedDateUndefined: Self = StObject.set(x, "AuthTokenLastModifiedDate", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setCacheClusterCreateTime(value: TStamp): Self = StObject.set(x, "CacheClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterCreateTimeUndefined: Self = StObject.set(x, "CacheClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setCacheClusterStatus(value: String): Self = StObject.set(x, "CacheClusterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterStatusUndefined: Self = StObject.set(x, "CacheClusterStatus", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setCacheNodes(value: CacheNodeList): Self = StObject.set(x, "CacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodesUndefined: Self = StObject.set(x, "CacheNodes", js.undefined)
    
    @scala.inline
    def setCacheNodesVarargs(value: CacheNode*): Self = StObject.set(x, "CacheNodes", js.Array(value :_*))
    
    @scala.inline
    def setCacheParameterGroup(value: CacheParameterGroupStatus): Self = StObject.set(x, "CacheParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupUndefined: Self = StObject.set(x, "CacheParameterGroup", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroups(value: CacheSecurityGroupMembershipList): Self = StObject.set(x, "CacheSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupsUndefined: Self = StObject.set(x, "CacheSecurityGroups", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupsVarargs(value: CacheSecurityGroupMembership*): Self = StObject.set(x, "CacheSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSubnetGroupNameUndefined: Self = StObject.set(x, "CacheSubnetGroupName", js.undefined)
    
    @scala.inline
    def setClientDownloadLandingPage(value: String): Self = StObject.set(x, "ClientDownloadLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDownloadLandingPageUndefined: Self = StObject.set(x, "ClientDownloadLandingPage", js.undefined)
    
    @scala.inline
    def setConfigurationEndpoint(value: Endpoint): Self = StObject.set(x, "ConfigurationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationEndpointUndefined: Self = StObject.set(x, "ConfigurationEndpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = StObject.set(x, "NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCacheNodesUndefined: Self = StObject.set(x, "NumCacheNodes", js.undefined)
    
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedValues): Self = StObject.set(x, "PendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingModifiedValuesUndefined: Self = StObject.set(x, "PendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZone(value: String): Self = StObject.set(x, "PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZoneUndefined: Self = StObject.set(x, "PreferredAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArn(value: String): Self = StObject.set(x, "PreferredOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredOutpostArnUndefined: Self = StObject.set(x, "PreferredOutpostArn", js.undefined)
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupMembershipList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotRetentionLimit(value: IntegerOptional): Self = StObject.set(x, "SnapshotRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotRetentionLimitUndefined: Self = StObject.set(x, "SnapshotRetentionLimit", js.undefined)
    
    @scala.inline
    def setSnapshotWindow(value: String): Self = StObject.set(x, "SnapshotWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotWindowUndefined: Self = StObject.set(x, "SnapshotWindow", js.undefined)
    
    @scala.inline
    def setTransitEncryptionEnabled(value: BooleanOptional): Self = StObject.set(x, "TransitEncryptionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionEnabledUndefined: Self = StObject.set(x, "TransitEncryptionEnabled", js.undefined)
  }
}
