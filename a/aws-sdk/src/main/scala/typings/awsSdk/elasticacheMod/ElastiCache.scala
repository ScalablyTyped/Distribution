package typings.awsSdk.elasticacheMod

import typings.awsSdk.anon.DescribeCacheClustersMess
import typings.awsSdk.anon.DescribeReplicationGroups
import typings.awsSdk.awsSdkStrings.cacheClusterAvailable
import typings.awsSdk.awsSdkStrings.cacheClusterDeleted
import typings.awsSdk.awsSdkStrings.replicationGroupAvailable
import typings.awsSdk.awsSdkStrings.replicationGroupDeleted
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElastiCache extends Service {
  
  /**
    * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
    */
  def addTagsToResource(): Request[TagListMessage, AWSError] = js.native
  def addTagsToResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Adds up to 50 cost allocation tags to the named resource. A cost allocation tag is a key-value pair where the key and value are case-sensitive. You can use cost allocation tags to categorize and track your AWS costs.  When you apply tags to your ElastiCache resources, AWS generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags in Amazon ElastiCache in the ElastiCache User Guide.
    */
  def addTagsToResource(params: AddTagsToResourceMessage): Request[TagListMessage, AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  
  /**
    * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
    */
  def authorizeCacheSecurityGroupIngress(): Request[AuthorizeCacheSecurityGroupIngressResult, AWSError] = js.native
  def authorizeCacheSecurityGroupIngress(
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeCacheSecurityGroupIngressResult, Unit]
  ): Request[AuthorizeCacheSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Allows network ingress to a cache security group. Applications using ElastiCache must be running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.  You cannot authorize ingress from an Amazon EC2 security group in one region to an ElastiCache cluster in another region. 
    */
  def authorizeCacheSecurityGroupIngress(params: AuthorizeCacheSecurityGroupIngressMessage): Request[AuthorizeCacheSecurityGroupIngressResult, AWSError] = js.native
  def authorizeCacheSecurityGroupIngress(
    params: AuthorizeCacheSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeCacheSecurityGroupIngressResult, Unit]
  ): Request[AuthorizeCacheSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Apply the service update. For more information on service updates and applying them, see Applying Service Updates.
    */
  def batchApplyUpdateAction(): Request[UpdateActionResultsMessage, AWSError] = js.native
  def batchApplyUpdateAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResultsMessage, Unit]): Request[UpdateActionResultsMessage, AWSError] = js.native
  /**
    * Apply the service update. For more information on service updates and applying them, see Applying Service Updates.
    */
  def batchApplyUpdateAction(params: BatchApplyUpdateActionMessage): Request[UpdateActionResultsMessage, AWSError] = js.native
  def batchApplyUpdateAction(
    params: BatchApplyUpdateActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResultsMessage, Unit]
  ): Request[UpdateActionResultsMessage, AWSError] = js.native
  
  /**
    * Stop the service update. For more information on service updates and stopping them, see Stopping Service Updates.
    */
  def batchStopUpdateAction(): Request[UpdateActionResultsMessage, AWSError] = js.native
  def batchStopUpdateAction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResultsMessage, Unit]): Request[UpdateActionResultsMessage, AWSError] = js.native
  /**
    * Stop the service update. For more information on service updates and stopping them, see Stopping Service Updates.
    */
  def batchStopUpdateAction(params: BatchStopUpdateActionMessage): Request[UpdateActionResultsMessage, AWSError] = js.native
  def batchStopUpdateAction(
    params: BatchStopUpdateActionMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionResultsMessage, Unit]
  ): Request[UpdateActionResultsMessage, AWSError] = js.native
  
  /**
    * Complete the migration of data.
    */
  def completeMigration(): Request[CompleteMigrationResponse, AWSError] = js.native
  def completeMigration(callback: js.Function2[/* err */ AWSError, /* data */ CompleteMigrationResponse, Unit]): Request[CompleteMigrationResponse, AWSError] = js.native
  /**
    * Complete the migration of data.
    */
  def completeMigration(params: CompleteMigrationMessage): Request[CompleteMigrationResponse, AWSError] = js.native
  def completeMigration(
    params: CompleteMigrationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteMigrationResponse, Unit]
  ): Request[CompleteMigrationResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ElastiCache: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
    */
  def copySnapshot(): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]): Request[CopySnapshotResult, AWSError] = js.native
  /**
    * Makes a copy of an existing snapshot.  This operation is valid for Redis only.   Users or groups that have permissions to use the CopySnapshot operation can create their own Amazon S3 buckets and copy snapshots to it. To control access to your snapshots, use an IAM policy to control who has the ability to use the CopySnapshot operation. For more information about using IAM to control the use of ElastiCache operations, see Exporting Snapshots and Authentication &amp; Access Control.  You could receive the following error messages.  Error Messages     Error Message: The S3 bucket %s is outside of the region.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s does not exist.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The S3 bucket %s is not owned by the authenticated user.  Solution: Create an Amazon S3 bucket in the same region as your snapshot. For more information, see Step 1: Create an Amazon S3 Bucket in the ElastiCache User Guide.    Error Message: The authenticated user does not have sufficient permissions to perform the desired activity.  Solution: Contact your system administrator to get the needed permissions.    Error Message: The S3 bucket %s already contains an object with key %s.  Solution: Give the TargetSnapshotName a new and unique value. If exporting a snapshot, you could alternatively create a new Amazon S3 bucket and use this same value for TargetSnapshotName.    Error Message:  ElastiCache has not been granted READ permissions %s on the S3 Bucket.  Solution: Add List and Read permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted WRITE permissions %s on the S3 Bucket.  Solution: Add Upload/Delete permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.    Error Message:  ElastiCache has not been granted READ_ACP permissions %s on the S3 Bucket.  Solution: Add View Permissions on the bucket. For more information, see Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket in the ElastiCache User Guide.  
    */
  def copySnapshot(params: CopySnapshotMessage): Request[CopySnapshotResult, AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResult, Unit]
  ): Request[CopySnapshotResult, AWSError] = js.native
  
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
    */
  def createCacheCluster(): Request[CreateCacheClusterResult, AWSError] = js.native
  def createCacheCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheClusterResult, Unit]): Request[CreateCacheClusterResult, AWSError] = js.native
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant cache engine software, either Memcached or Redis. This operation is not supported for Redis (cluster mode enabled) clusters.
    */
  def createCacheCluster(params: CreateCacheClusterMessage): Request[CreateCacheClusterResult, AWSError] = js.native
  def createCacheCluster(
    params: CreateCacheClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheClusterResult, Unit]
  ): Request[CreateCacheClusterResult, AWSError] = js.native
  
  /**
    * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
    */
  def createCacheParameterGroup(): Request[CreateCacheParameterGroupResult, AWSError] = js.native
  def createCacheParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheParameterGroupResult, Unit]): Request[CreateCacheParameterGroupResult, AWSError] = js.native
  /**
    * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster or replication group using the CacheParameterGroup. A newly created CacheParameterGroup is an exact duplicate of the default parameter group for the CacheParameterGroupFamily. To customize the newly created CacheParameterGroup you can change the values of specific parameters. For more information, see:    ModifyCacheParameterGroup in the ElastiCache API Reference.    Parameters and Parameter Groups in the ElastiCache User Guide.  
    */
  def createCacheParameterGroup(params: CreateCacheParameterGroupMessage): Request[CreateCacheParameterGroupResult, AWSError] = js.native
  def createCacheParameterGroup(
    params: CreateCacheParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheParameterGroupResult, Unit]
  ): Request[CreateCacheParameterGroupResult, AWSError] = js.native
  
  /**
    * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
    */
  def createCacheSecurityGroup(): Request[CreateCacheSecurityGroupResult, AWSError] = js.native
  def createCacheSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheSecurityGroupResult, Unit]): Request[CreateCacheSecurityGroupResult, AWSError] = js.native
  /**
    * Creates a new cache security group. Use a cache security group to control access to one or more clusters. Cache security groups are only used when you are creating a cluster outside of an Amazon Virtual Private Cloud (Amazon VPC). If you are creating a cluster inside of a VPC, use a cache subnet group instead. For more information, see CreateCacheSubnetGroup.
    */
  def createCacheSecurityGroup(params: CreateCacheSecurityGroupMessage): Request[CreateCacheSecurityGroupResult, AWSError] = js.native
  def createCacheSecurityGroup(
    params: CreateCacheSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheSecurityGroupResult, Unit]
  ): Request[CreateCacheSecurityGroupResult, AWSError] = js.native
  
  /**
    * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createCacheSubnetGroup(): Request[CreateCacheSubnetGroupResult, AWSError] = js.native
  def createCacheSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheSubnetGroupResult, Unit]): Request[CreateCacheSubnetGroupResult, AWSError] = js.native
  /**
    * Creates a new cache subnet group. Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud (Amazon VPC).
    */
  def createCacheSubnetGroup(params: CreateCacheSubnetGroupMessage): Request[CreateCacheSubnetGroupResult, AWSError] = js.native
  def createCacheSubnetGroup(
    params: CreateCacheSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCacheSubnetGroupResult, Unit]
  ): Request[CreateCacheSubnetGroupResult, AWSError] = js.native
  
  /**
    * Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable low-latency reads and disaster recovery across regions. For more information, see Replication Across Regions Using Global Datastore.    The GlobalReplicationGroupIdSuffix is the name of the Global Datastore.   The PrimaryReplicationGroupId represents the name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.  
    */
  def createGlobalReplicationGroup(): Request[CreateGlobalReplicationGroupResult, AWSError] = js.native
  def createGlobalReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalReplicationGroupResult, Unit]): Request[CreateGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Global Datastore for Redis offers fully managed, fast, reliable and secure cross-region replication. Using Global Datastore for Redis, you can create cross-region read replica clusters for ElastiCache for Redis to enable low-latency reads and disaster recovery across regions. For more information, see Replication Across Regions Using Global Datastore.    The GlobalReplicationGroupIdSuffix is the name of the Global Datastore.   The PrimaryReplicationGroupId represents the name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.  
    */
  def createGlobalReplicationGroup(params: CreateGlobalReplicationGroupMessage): Request[CreateGlobalReplicationGroupResult, AWSError] = js.native
  def createGlobalReplicationGroup(
    params: CreateGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGlobalReplicationGroupResult, Unit]
  ): Request[CreateGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. This API can be used to create a standalone regional replication group or a secondary replication group associated with a Global Datastore. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 90 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. If you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' scaling. For more information, see Scaling ElastiCache for Redis Clusters in the ElastiCache User Guide.  This operation is valid for Redis only. 
    */
  def createReplicationGroup(): Request[CreateReplicationGroupResult, AWSError] = js.native
  def createReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationGroupResult, Unit]): Request[CreateReplicationGroupResult, AWSError] = js.native
  /**
    * Creates a Redis (cluster mode disabled) or a Redis (cluster mode enabled) replication group. This API can be used to create a standalone regional replication group or a secondary replication group associated with a Global Datastore. A Redis (cluster mode disabled) replication group is a collection of clusters, where one of the clusters is a read/write primary and the others are read-only replicas. Writes to the primary are asynchronously propagated to the replicas. A Redis (cluster mode enabled) replication group is a collection of 1 to 90 node groups (shards). Each node group (shard) has one read/write primary node and up to 5 read-only replica nodes. Writes to the primary are asynchronously propagated to the replicas. Redis (cluster mode enabled) replication groups partition the data across node groups (shards). When a Redis (cluster mode disabled) replication group has been successfully created, you can add one or more read replicas to it, up to a total of 5 read replicas. If you need to increase or decrease the number of node groups (console: shards), you can avail yourself of ElastiCache for Redis' scaling. For more information, see Scaling ElastiCache for Redis Clusters in the ElastiCache User Guide.  This operation is valid for Redis only. 
    */
  def createReplicationGroup(params: CreateReplicationGroupMessage): Request[CreateReplicationGroupResult, AWSError] = js.native
  def createReplicationGroup(
    params: CreateReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationGroupResult, Unit]
  ): Request[CreateReplicationGroupResult, AWSError] = js.native
  
  /**
    * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
    */
  def createSnapshot(): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]): Request[CreateSnapshotResult, AWSError] = js.native
  /**
    * Creates a copy of an entire cluster or replication group at a specific moment in time.  This operation is valid for Redis only. 
    */
  def createSnapshot(params: CreateSnapshotMessage): Request[CreateSnapshotResult, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResult, Unit]
  ): Request[CreateSnapshotResult, AWSError] = js.native
  
  /**
    * For Redis engine version 6.x onwards: Creates a Redis user. For more information, see Using Role Based Access Control (RBAC).
    */
  def createUser(): Request[User, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  /**
    * For Redis engine version 6.x onwards: Creates a Redis user. For more information, see Using Role Based Access Control (RBAC).
    */
  def createUser(params: CreateUserMessage): Request[User, AWSError] = js.native
  def createUser(params: CreateUserMessage, callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  
  /**
    * For Redis engine version 6.x onwards: Creates a Redis user group. For more information, see Using Role Based Access Control (RBAC) 
    */
  def createUserGroup(): Request[UserGroup, AWSError] = js.native
  def createUserGroup(callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]): Request[UserGroup, AWSError] = js.native
  /**
    * For Redis engine version 6.x onwards: Creates a Redis user group. For more information, see Using Role Based Access Control (RBAC) 
    */
  def createUserGroup(params: CreateUserGroupMessage): Request[UserGroup, AWSError] = js.native
  def createUserGroup(
    params: CreateUserGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]
  ): Request[UserGroup, AWSError] = js.native
  
  /**
    * Decreases the number of node groups in a Global Datastore
    */
  def decreaseNodeGroupsInGlobalReplicationGroup(): Request[DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  def decreaseNodeGroupsInGlobalReplicationGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DecreaseNodeGroupsInGlobalReplicationGroupResult, 
      Unit
    ]
  ): Request[DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Decreases the number of node groups in a Global Datastore
    */
  def decreaseNodeGroupsInGlobalReplicationGroup(params: DecreaseNodeGroupsInGlobalReplicationGroupMessage): Request[DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  def decreaseNodeGroupsInGlobalReplicationGroup(
    params: DecreaseNodeGroupsInGlobalReplicationGroupMessage,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DecreaseNodeGroupsInGlobalReplicationGroupResult, 
      Unit
    ]
  ): Request[DecreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Dynamically decreases the number of replicas in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def decreaseReplicaCount(): Request[DecreaseReplicaCountResult, AWSError] = js.native
  def decreaseReplicaCount(callback: js.Function2[/* err */ AWSError, /* data */ DecreaseReplicaCountResult, Unit]): Request[DecreaseReplicaCountResult, AWSError] = js.native
  /**
    * Dynamically decreases the number of replicas in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def decreaseReplicaCount(params: DecreaseReplicaCountMessage): Request[DecreaseReplicaCountResult, AWSError] = js.native
  def decreaseReplicaCount(
    params: DecreaseReplicaCountMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DecreaseReplicaCountResult, Unit]
  ): Request[DecreaseReplicaCountResult, AWSError] = js.native
  
  /**
    * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation is not valid for:   Redis (cluster mode enabled) clusters   A cluster that is the last read replica of a replication group   A node group (shard) that has Multi-AZ mode enabled   A cluster from a Redis (cluster mode enabled) replication group   A cluster that is not in the available state  
    */
  def deleteCacheCluster(): Request[DeleteCacheClusterResult, AWSError] = js.native
  def deleteCacheCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCacheClusterResult, Unit]): Request[DeleteCacheClusterResult, AWSError] = js.native
  /**
    * Deletes a previously provisioned cluster. DeleteCacheCluster deletes all associated cache nodes, node endpoints and the cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the cluster; you cannot cancel or revert this operation. This operation is not valid for:   Redis (cluster mode enabled) clusters   A cluster that is the last read replica of a replication group   A node group (shard) that has Multi-AZ mode enabled   A cluster from a Redis (cluster mode enabled) replication group   A cluster that is not in the available state  
    */
  def deleteCacheCluster(params: DeleteCacheClusterMessage): Request[DeleteCacheClusterResult, AWSError] = js.native
  def deleteCacheCluster(
    params: DeleteCacheClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCacheClusterResult, Unit]
  ): Request[DeleteCacheClusterResult, AWSError] = js.native
  
  /**
    * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with any cache clusters.
    */
  def deleteCacheParameterGroup(): Request[js.Object, AWSError] = js.native
  def deleteCacheParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified cache parameter group. You cannot delete a cache parameter group if it is associated with any cache clusters.
    */
  def deleteCacheParameterGroup(params: DeleteCacheParameterGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteCacheParameterGroup(
    params: DeleteCacheParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a cache security group.  You cannot delete a cache security group if it is associated with any clusters. 
    */
  def deleteCacheSecurityGroup(): Request[js.Object, AWSError] = js.native
  def deleteCacheSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a cache security group.  You cannot delete a cache security group if it is associated with any clusters. 
    */
  def deleteCacheSecurityGroup(params: DeleteCacheSecurityGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteCacheSecurityGroup(
    params: DeleteCacheSecurityGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a cache subnet group.  You cannot delete a cache subnet group if it is associated with any clusters. 
    */
  def deleteCacheSubnetGroup(): Request[js.Object, AWSError] = js.native
  def deleteCacheSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a cache subnet group.  You cannot delete a cache subnet group if it is associated with any clusters. 
    */
  def deleteCacheSubnetGroup(params: DeleteCacheSubnetGroupMessage): Request[js.Object, AWSError] = js.native
  def deleteCacheSubnetGroup(
    params: DeleteCacheSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deleting a Global Datastore is a two-step process:    First, you must DisassociateGlobalReplicationGroup to remove the secondary clusters in the Global Datastore.   Once the Global Datastore contains only the primary cluster, you can use DeleteGlobalReplicationGroup API to delete the Global Datastore while retainining the primary cluster using Retain…= true.   Since the Global Datastore has only a primary cluster, you can delete the Global Datastore while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.
    */
  def deleteGlobalReplicationGroup(): Request[DeleteGlobalReplicationGroupResult, AWSError] = js.native
  def deleteGlobalReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalReplicationGroupResult, Unit]): Request[DeleteGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Deleting a Global Datastore is a two-step process:    First, you must DisassociateGlobalReplicationGroup to remove the secondary clusters in the Global Datastore.   Once the Global Datastore contains only the primary cluster, you can use DeleteGlobalReplicationGroup API to delete the Global Datastore while retainining the primary cluster using Retain…= true.   Since the Global Datastore has only a primary cluster, you can delete the Global Datastore while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.
    */
  def deleteGlobalReplicationGroup(params: DeleteGlobalReplicationGroupMessage): Request[DeleteGlobalReplicationGroupResult, AWSError] = js.native
  def deleteGlobalReplicationGroup(
    params: DeleteGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGlobalReplicationGroupResult, Unit]
  ): Request[DeleteGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteReplicationGroup(): Request[DeleteReplicationGroupResult, AWSError] = js.native
  def deleteReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationGroupResult, Unit]): Request[DeleteReplicationGroupResult, AWSError] = js.native
  /**
    * Deletes an existing replication group. By default, this operation deletes the entire replication group, including the primary/primaries and all of the read replicas. If the replication group has only one primary, you can optionally delete only the read replicas, while retaining the primary by setting RetainPrimaryCluster=true. When you receive a successful response from this operation, Amazon ElastiCache immediately begins deleting the selected resources; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteReplicationGroup(params: DeleteReplicationGroupMessage): Request[DeleteReplicationGroupResult, AWSError] = js.native
  def deleteReplicationGroup(
    params: DeleteReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationGroupResult, Unit]
  ): Request[DeleteReplicationGroupResult, AWSError] = js.native
  
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteSnapshot(): Request[DeleteSnapshotResult, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResult, Unit]): Request[DeleteSnapshotResult, AWSError] = js.native
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, ElastiCache immediately begins deleting the snapshot; you cannot cancel or revert this operation.  This operation is valid for Redis only. 
    */
  def deleteSnapshot(params: DeleteSnapshotMessage): Request[DeleteSnapshotResult, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResult, Unit]
  ): Request[DeleteSnapshotResult, AWSError] = js.native
  
  /**
    * For Redis engine version 6.x onwards: Deletes a user. The user will be removed from all user groups and in turn removed from all replication groups. For more information, see Using Role Based Access Control (RBAC). 
    */
  def deleteUser(): Request[User, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  /**
    * For Redis engine version 6.x onwards: Deletes a user. The user will be removed from all user groups and in turn removed from all replication groups. For more information, see Using Role Based Access Control (RBAC). 
    */
  def deleteUser(params: DeleteUserMessage): Request[User, AWSError] = js.native
  def deleteUser(params: DeleteUserMessage, callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  
  /**
    * For Redis engine version 6.x onwards: Deletes a ser group. The user group must first be disassociated from the replcation group before it can be deleted. For more information, see Using Role Based Access Control (RBAC). 
    */
  def deleteUserGroup(): Request[UserGroup, AWSError] = js.native
  def deleteUserGroup(callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]): Request[UserGroup, AWSError] = js.native
  /**
    * For Redis engine version 6.x onwards: Deletes a ser group. The user group must first be disassociated from the replcation group before it can be deleted. For more information, see Using Role Based Access Control (RBAC). 
    */
  def deleteUserGroup(params: DeleteUserGroupMessage): Request[UserGroup, AWSError] = js.native
  def deleteUserGroup(
    params: DeleteUserGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]
  ): Request[UserGroup, AWSError] = js.native
  
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeCacheClusters(): Request[CacheClusterMessage, AWSError] = js.native
  def describeCacheClusters(callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]): Request[CacheClusterMessage, AWSError] = js.native
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cache cluster if a cluster identifier is supplied. By default, abbreviated information about the clusters is returned. You can use the optional ShowCacheNodeInfo flag to retrieve detailed information about the cache nodes associated with the clusters. These details include the DNS address and port for the cache node endpoint. If the cluster is in the creating state, only cluster-level information is displayed until all of the nodes are successfully provisioned. If the cluster is in the deleting state, only cluster-level information is displayed. If cache nodes are currently being added to the cluster, node endpoint information and creation time for the additional nodes are not displayed until they are completely provisioned. When the cluster state is available, the cluster is ready for use. If cache nodes are currently being removed from the cluster, no endpoint information for the removed nodes is displayed.
    */
  def describeCacheClusters(params: DescribeCacheClustersMessage): Request[CacheClusterMessage, AWSError] = js.native
  def describeCacheClusters(
    params: DescribeCacheClustersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]
  ): Request[CacheClusterMessage, AWSError] = js.native
  
  /**
    * Returns a list of the available cache engines and their versions.
    */
  def describeCacheEngineVersions(): Request[CacheEngineVersionMessage, AWSError] = js.native
  def describeCacheEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ CacheEngineVersionMessage, Unit]): Request[CacheEngineVersionMessage, AWSError] = js.native
  /**
    * Returns a list of the available cache engines and their versions.
    */
  def describeCacheEngineVersions(params: DescribeCacheEngineVersionsMessage): Request[CacheEngineVersionMessage, AWSError] = js.native
  def describeCacheEngineVersions(
    params: DescribeCacheEngineVersionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheEngineVersionMessage, Unit]
  ): Request[CacheEngineVersionMessage, AWSError] = js.native
  
  /**
    * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeCacheParameterGroups(): Request[CacheParameterGroupsMessage, AWSError] = js.native
  def describeCacheParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupsMessage, Unit]): Request[CacheParameterGroupsMessage, AWSError] = js.native
  /**
    * Returns a list of cache parameter group descriptions. If a cache parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeCacheParameterGroups(params: DescribeCacheParameterGroupsMessage): Request[CacheParameterGroupsMessage, AWSError] = js.native
  def describeCacheParameterGroups(
    params: DescribeCacheParameterGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupsMessage, Unit]
  ): Request[CacheParameterGroupsMessage, AWSError] = js.native
  
  /**
    * Returns the detailed parameter list for a particular cache parameter group.
    */
  def describeCacheParameters(): Request[CacheParameterGroupDetails, AWSError] = js.native
  def describeCacheParameters(callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupDetails, Unit]): Request[CacheParameterGroupDetails, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular cache parameter group.
    */
  def describeCacheParameters(params: DescribeCacheParametersMessage): Request[CacheParameterGroupDetails, AWSError] = js.native
  def describeCacheParameters(
    params: DescribeCacheParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupDetails, Unit]
  ): Request[CacheParameterGroupDetails, AWSError] = js.native
  
  /**
    * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group. This applicable only when you have ElastiCache in Classic setup 
    */
  def describeCacheSecurityGroups(): Request[CacheSecurityGroupMessage, AWSError] = js.native
  def describeCacheSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ CacheSecurityGroupMessage, Unit]): Request[CacheSecurityGroupMessage, AWSError] = js.native
  /**
    * Returns a list of cache security group descriptions. If a cache security group name is specified, the list contains only the description of that group. This applicable only when you have ElastiCache in Classic setup 
    */
  def describeCacheSecurityGroups(params: DescribeCacheSecurityGroupsMessage): Request[CacheSecurityGroupMessage, AWSError] = js.native
  def describeCacheSecurityGroups(
    params: DescribeCacheSecurityGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheSecurityGroupMessage, Unit]
  ): Request[CacheSecurityGroupMessage, AWSError] = js.native
  
  /**
    * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache clusters now launch in VPC by default. 
    */
  def describeCacheSubnetGroups(): Request[CacheSubnetGroupMessage, AWSError] = js.native
  def describeCacheSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ CacheSubnetGroupMessage, Unit]): Request[CacheSubnetGroupMessage, AWSError] = js.native
  /**
    * Returns a list of cache subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group. This is applicable only when you have ElastiCache in VPC setup. All ElastiCache clusters now launch in VPC by default. 
    */
  def describeCacheSubnetGroups(params: DescribeCacheSubnetGroupsMessage): Request[CacheSubnetGroupMessage, AWSError] = js.native
  def describeCacheSubnetGroups(
    params: DescribeCacheSubnetGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheSubnetGroupMessage, Unit]
  ): Request[CacheSubnetGroupMessage, AWSError] = js.native
  
  /**
    * Returns the default engine and system parameter information for the specified cache engine.
    */
  def describeEngineDefaultParameters(): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  def describeEngineDefaultParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultParametersResult, Unit]): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  /**
    * Returns the default engine and system parameter information for the specified cache engine.
    */
  def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  def describeEngineDefaultParameters(
    params: DescribeEngineDefaultParametersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineDefaultParametersResult, Unit]
  ): Request[DescribeEngineDefaultParametersResult, AWSError] = js.native
  
  /**
    * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): Request[EventsMessage, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]): Request[EventsMessage, AWSError] = js.native
  /**
    * Returns events related to clusters, cache security groups, and cache parameter groups. You can obtain events specific to a particular cluster, cache security group, or cache parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: DescribeEventsMessage): Request[EventsMessage, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ EventsMessage, Unit]
  ): Request[EventsMessage, AWSError] = js.native
  
  /**
    * Returns information about a particular global replication group. If no identifier is specified, returns information about all Global Datastores. 
    */
  def describeGlobalReplicationGroups(): Request[DescribeGlobalReplicationGroupsResult, AWSError] = js.native
  def describeGlobalReplicationGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalReplicationGroupsResult, Unit]): Request[DescribeGlobalReplicationGroupsResult, AWSError] = js.native
  /**
    * Returns information about a particular global replication group. If no identifier is specified, returns information about all Global Datastores. 
    */
  def describeGlobalReplicationGroups(params: DescribeGlobalReplicationGroupsMessage): Request[DescribeGlobalReplicationGroupsResult, AWSError] = js.native
  def describeGlobalReplicationGroups(
    params: DescribeGlobalReplicationGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGlobalReplicationGroupsResult, Unit]
  ): Request[DescribeGlobalReplicationGroupsResult, AWSError] = js.native
  
  /**
    * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
    */
  def describeReplicationGroups(): Request[ReplicationGroupMessage, AWSError] = js.native
  def describeReplicationGroups(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]): Request[ReplicationGroupMessage, AWSError] = js.native
  /**
    * Returns information about a particular replication group. If no identifier is specified, DescribeReplicationGroups returns information about all replication groups.  This operation is valid for Redis only. 
    */
  def describeReplicationGroups(params: DescribeReplicationGroupsMessage): Request[ReplicationGroupMessage, AWSError] = js.native
  def describeReplicationGroups(
    params: DescribeReplicationGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]
  ): Request[ReplicationGroupMessage, AWSError] = js.native
  
  /**
    * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
    */
  def describeReservedCacheNodes(): Request[ReservedCacheNodeMessage, AWSError] = js.native
  def describeReservedCacheNodes(callback: js.Function2[/* err */ AWSError, /* data */ ReservedCacheNodeMessage, Unit]): Request[ReservedCacheNodeMessage, AWSError] = js.native
  /**
    * Returns information about reserved cache nodes for this account, or about a specified reserved cache node.
    */
  def describeReservedCacheNodes(params: DescribeReservedCacheNodesMessage): Request[ReservedCacheNodeMessage, AWSError] = js.native
  def describeReservedCacheNodes(
    params: DescribeReservedCacheNodesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedCacheNodeMessage, Unit]
  ): Request[ReservedCacheNodeMessage, AWSError] = js.native
  
  /**
    * Lists available reserved cache node offerings.
    */
  def describeReservedCacheNodesOfferings(): Request[ReservedCacheNodesOfferingMessage, AWSError] = js.native
  def describeReservedCacheNodesOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ReservedCacheNodesOfferingMessage, Unit]): Request[ReservedCacheNodesOfferingMessage, AWSError] = js.native
  /**
    * Lists available reserved cache node offerings.
    */
  def describeReservedCacheNodesOfferings(params: DescribeReservedCacheNodesOfferingsMessage): Request[ReservedCacheNodesOfferingMessage, AWSError] = js.native
  def describeReservedCacheNodesOfferings(
    params: DescribeReservedCacheNodesOfferingsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ReservedCacheNodesOfferingMessage, Unit]
  ): Request[ReservedCacheNodesOfferingMessage, AWSError] = js.native
  
  /**
    * Returns details of the service updates
    */
  def describeServiceUpdates(): Request[ServiceUpdatesMessage, AWSError] = js.native
  def describeServiceUpdates(callback: js.Function2[/* err */ AWSError, /* data */ ServiceUpdatesMessage, Unit]): Request[ServiceUpdatesMessage, AWSError] = js.native
  /**
    * Returns details of the service updates
    */
  def describeServiceUpdates(params: DescribeServiceUpdatesMessage): Request[ServiceUpdatesMessage, AWSError] = js.native
  def describeServiceUpdates(
    params: DescribeServiceUpdatesMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ServiceUpdatesMessage, Unit]
  ): Request[ServiceUpdatesMessage, AWSError] = js.native
  
  /**
    * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
    */
  def describeSnapshots(): Request[DescribeSnapshotsListMessage, AWSError] = js.native
  def describeSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsListMessage, Unit]): Request[DescribeSnapshotsListMessage, AWSError] = js.native
  /**
    * Returns information about cluster or replication group snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cache cluster.  This operation is valid for Redis only. 
    */
  def describeSnapshots(params: DescribeSnapshotsMessage): Request[DescribeSnapshotsListMessage, AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsListMessage, Unit]
  ): Request[DescribeSnapshotsListMessage, AWSError] = js.native
  
  /**
    * Returns details of the update actions 
    */
  def describeUpdateActions(): Request[UpdateActionsMessage, AWSError] = js.native
  def describeUpdateActions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionsMessage, Unit]): Request[UpdateActionsMessage, AWSError] = js.native
  /**
    * Returns details of the update actions 
    */
  def describeUpdateActions(params: DescribeUpdateActionsMessage): Request[UpdateActionsMessage, AWSError] = js.native
  def describeUpdateActions(
    params: DescribeUpdateActionsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionsMessage, Unit]
  ): Request[UpdateActionsMessage, AWSError] = js.native
  
  /**
    * Returns a list of user groups.
    */
  def describeUserGroups(): Request[DescribeUserGroupsResult, AWSError] = js.native
  def describeUserGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserGroupsResult, Unit]): Request[DescribeUserGroupsResult, AWSError] = js.native
  /**
    * Returns a list of user groups.
    */
  def describeUserGroups(params: DescribeUserGroupsMessage): Request[DescribeUserGroupsResult, AWSError] = js.native
  def describeUserGroups(
    params: DescribeUserGroupsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserGroupsResult, Unit]
  ): Request[DescribeUserGroupsResult, AWSError] = js.native
  
  /**
    * Returns a list of users.
    */
  def describeUsers(): Request[DescribeUsersResult, AWSError] = js.native
  def describeUsers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResult, Unit]): Request[DescribeUsersResult, AWSError] = js.native
  /**
    * Returns a list of users.
    */
  def describeUsers(params: DescribeUsersMessage): Request[DescribeUsersResult, AWSError] = js.native
  def describeUsers(
    params: DescribeUsersMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResult, Unit]
  ): Request[DescribeUsersResult, AWSError] = js.native
  
  /**
    * Remove a secondary cluster from the Global Datastore using the Global Datastore name. The secondary cluster will no longer receive updates from the primary cluster, but will remain as a standalone cluster in that AWS region.
    */
  def disassociateGlobalReplicationGroup(): Request[DisassociateGlobalReplicationGroupResult, AWSError] = js.native
  def disassociateGlobalReplicationGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateGlobalReplicationGroupResult, Unit]
  ): Request[DisassociateGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Remove a secondary cluster from the Global Datastore using the Global Datastore name. The secondary cluster will no longer receive updates from the primary cluster, but will remain as a standalone cluster in that AWS region.
    */
  def disassociateGlobalReplicationGroup(params: DisassociateGlobalReplicationGroupMessage): Request[DisassociateGlobalReplicationGroupResult, AWSError] = js.native
  def disassociateGlobalReplicationGroup(
    params: DisassociateGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateGlobalReplicationGroupResult, Unit]
  ): Request[DisassociateGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Used to failover the primary region to a selected secondary region. The selected secondary region will become primary, and all other clusters will become secondary.
    */
  def failoverGlobalReplicationGroup(): Request[FailoverGlobalReplicationGroupResult, AWSError] = js.native
  def failoverGlobalReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ FailoverGlobalReplicationGroupResult, Unit]): Request[FailoverGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Used to failover the primary region to a selected secondary region. The selected secondary region will become primary, and all other clusters will become secondary.
    */
  def failoverGlobalReplicationGroup(params: FailoverGlobalReplicationGroupMessage): Request[FailoverGlobalReplicationGroupResult, AWSError] = js.native
  def failoverGlobalReplicationGroup(
    params: FailoverGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ FailoverGlobalReplicationGroupResult, Unit]
  ): Request[FailoverGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Increase the number of node groups in the Global Datastore
    */
  def increaseNodeGroupsInGlobalReplicationGroup(): Request[IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  def increaseNodeGroupsInGlobalReplicationGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ IncreaseNodeGroupsInGlobalReplicationGroupResult, 
      Unit
    ]
  ): Request[IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Increase the number of node groups in the Global Datastore
    */
  def increaseNodeGroupsInGlobalReplicationGroup(params: IncreaseNodeGroupsInGlobalReplicationGroupMessage): Request[IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  def increaseNodeGroupsInGlobalReplicationGroup(
    params: IncreaseNodeGroupsInGlobalReplicationGroupMessage,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ IncreaseNodeGroupsInGlobalReplicationGroupResult, 
      Unit
    ]
  ): Request[IncreaseNodeGroupsInGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def increaseReplicaCount(): Request[IncreaseReplicaCountResult, AWSError] = js.native
  def increaseReplicaCount(callback: js.Function2[/* err */ AWSError, /* data */ IncreaseReplicaCountResult, Unit]): Request[IncreaseReplicaCountResult, AWSError] = js.native
  /**
    * Dynamically increases the number of replics in a Redis (cluster mode disabled) replication group or the number of replica nodes in one or more node groups (shards) of a Redis (cluster mode enabled) replication group. This operation is performed with no cluster down time.
    */
  def increaseReplicaCount(params: IncreaseReplicaCountMessage): Request[IncreaseReplicaCountResult, AWSError] = js.native
  def increaseReplicaCount(
    params: IncreaseReplicaCountMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ IncreaseReplicaCountResult, Unit]
  ): Request[IncreaseReplicaCountResult, AWSError] = js.native
  
  /**
    * Lists all available node types that you can scale your Redis cluster's or replication group's current node type. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeModifications(): Request[AllowedNodeTypeModificationsMessage, AWSError] = js.native
  def listAllowedNodeTypeModifications(callback: js.Function2[/* err */ AWSError, /* data */ AllowedNodeTypeModificationsMessage, Unit]): Request[AllowedNodeTypeModificationsMessage, AWSError] = js.native
  /**
    * Lists all available node types that you can scale your Redis cluster's or replication group's current node type. When you use the ModifyCacheCluster or ModifyReplicationGroup operations to scale your cluster or replication group, the value of the CacheNodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeModifications(params: ListAllowedNodeTypeModificationsMessage): Request[AllowedNodeTypeModificationsMessage, AWSError] = js.native
  def listAllowedNodeTypeModifications(
    params: ListAllowedNodeTypeModificationsMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ AllowedNodeTypeModificationsMessage, Unit]
  ): Request[AllowedNodeTypeModificationsMessage, AWSError] = js.native
  
  /**
    * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
    */
  def listTagsForResource(): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Lists all cost allocation tags currently on the named resource. A cost allocation tag is a key-value pair where the key is case-sensitive and the value is optional. You can use cost allocation tags to categorize and track your AWS costs. If the cluster is not in the available state, ListTagsForResource returns an error. You can have a maximum of 50 cost allocation tags on an ElastiCache resource. For more information, see Monitoring Costs with Tags.
    */
  def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def modifyCacheCluster(): Request[ModifyCacheClusterResult, AWSError] = js.native
  def modifyCacheCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyCacheClusterResult, Unit]): Request[ModifyCacheClusterResult, AWSError] = js.native
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration parameters by specifying the parameters and the new values.
    */
  def modifyCacheCluster(params: ModifyCacheClusterMessage): Request[ModifyCacheClusterResult, AWSError] = js.native
  def modifyCacheCluster(
    params: ModifyCacheClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyCacheClusterResult, Unit]
  ): Request[ModifyCacheClusterResult, AWSError] = js.native
  
  /**
    * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def modifyCacheParameterGroup(): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  def modifyCacheParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupNameMessage, Unit]): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  /**
    * Modifies the parameters of a cache parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def modifyCacheParameterGroup(params: ModifyCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  def modifyCacheParameterGroup(
    params: ModifyCacheParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupNameMessage, Unit]
  ): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Modifies an existing cache subnet group.
    */
  def modifyCacheSubnetGroup(): Request[ModifyCacheSubnetGroupResult, AWSError] = js.native
  def modifyCacheSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyCacheSubnetGroupResult, Unit]): Request[ModifyCacheSubnetGroupResult, AWSError] = js.native
  /**
    * Modifies an existing cache subnet group.
    */
  def modifyCacheSubnetGroup(params: ModifyCacheSubnetGroupMessage): Request[ModifyCacheSubnetGroupResult, AWSError] = js.native
  def modifyCacheSubnetGroup(
    params: ModifyCacheSubnetGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyCacheSubnetGroupResult, Unit]
  ): Request[ModifyCacheSubnetGroupResult, AWSError] = js.native
  
  /**
    * Modifies the settings for a Global Datastore.
    */
  def modifyGlobalReplicationGroup(): Request[ModifyGlobalReplicationGroupResult, AWSError] = js.native
  def modifyGlobalReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyGlobalReplicationGroupResult, Unit]): Request[ModifyGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Modifies the settings for a Global Datastore.
    */
  def modifyGlobalReplicationGroup(params: ModifyGlobalReplicationGroupMessage): Request[ModifyGlobalReplicationGroupResult, AWSError] = js.native
  def modifyGlobalReplicationGroup(
    params: ModifyGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyGlobalReplicationGroupResult, Unit]
  ): Request[ModifyGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Modifies the settings for a replication group.    Scaling for Amazon ElastiCache for Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
    */
  def modifyReplicationGroup(): Request[ModifyReplicationGroupResult, AWSError] = js.native
  def modifyReplicationGroup(callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationGroupResult, Unit]): Request[ModifyReplicationGroupResult, AWSError] = js.native
  /**
    * Modifies the settings for a replication group.    Scaling for Amazon ElastiCache for Redis (cluster mode enabled) in the ElastiCache User Guide    ModifyReplicationGroupShardConfiguration in the ElastiCache API Reference    This operation is valid for Redis only. 
    */
  def modifyReplicationGroup(params: ModifyReplicationGroupMessage): Request[ModifyReplicationGroupResult, AWSError] = js.native
  def modifyReplicationGroup(
    params: ModifyReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationGroupResult, Unit]
  ): Request[ModifyReplicationGroupResult, AWSError] = js.native
  
  /**
    * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
    */
  def modifyReplicationGroupShardConfiguration(): Request[ModifyReplicationGroupShardConfigurationResult, AWSError] = js.native
  def modifyReplicationGroupShardConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationGroupShardConfigurationResult, Unit]
  ): Request[ModifyReplicationGroupShardConfigurationResult, AWSError] = js.native
  /**
    * Modifies a replication group's shards (node groups) by allowing you to add shards, remove shards, or rebalance the keyspaces among exisiting shards.
    */
  def modifyReplicationGroupShardConfiguration(params: ModifyReplicationGroupShardConfigurationMessage): Request[ModifyReplicationGroupShardConfigurationResult, AWSError] = js.native
  def modifyReplicationGroupShardConfiguration(
    params: ModifyReplicationGroupShardConfigurationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyReplicationGroupShardConfigurationResult, Unit]
  ): Request[ModifyReplicationGroupShardConfigurationResult, AWSError] = js.native
  
  /**
    * Changes user password(s) and/or access string.
    */
  def modifyUser(): Request[User, AWSError] = js.native
  def modifyUser(callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  /**
    * Changes user password(s) and/or access string.
    */
  def modifyUser(params: ModifyUserMessage): Request[User, AWSError] = js.native
  def modifyUser(params: ModifyUserMessage, callback: js.Function2[/* err */ AWSError, /* data */ User, Unit]): Request[User, AWSError] = js.native
  
  /**
    * Changes the list of users that belong to the user group.
    */
  def modifyUserGroup(): Request[UserGroup, AWSError] = js.native
  def modifyUserGroup(callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]): Request[UserGroup, AWSError] = js.native
  /**
    * Changes the list of users that belong to the user group.
    */
  def modifyUserGroup(params: ModifyUserGroupMessage): Request[UserGroup, AWSError] = js.native
  def modifyUserGroup(
    params: ModifyUserGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ UserGroup, Unit]
  ): Request[UserGroup, AWSError] = js.native
  
  /**
    * Allows you to purchase a reserved cache node offering.
    */
  def purchaseReservedCacheNodesOffering(): Request[PurchaseReservedCacheNodesOfferingResult, AWSError] = js.native
  def purchaseReservedCacheNodesOffering(
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedCacheNodesOfferingResult, Unit]
  ): Request[PurchaseReservedCacheNodesOfferingResult, AWSError] = js.native
  /**
    * Allows you to purchase a reserved cache node offering.
    */
  def purchaseReservedCacheNodesOffering(params: PurchaseReservedCacheNodesOfferingMessage): Request[PurchaseReservedCacheNodesOfferingResult, AWSError] = js.native
  def purchaseReservedCacheNodesOffering(
    params: PurchaseReservedCacheNodesOfferingMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseReservedCacheNodesOfferingResult, Unit]
  ): Request[PurchaseReservedCacheNodesOfferingResult, AWSError] = js.native
  
  /**
    * Redistribute slots to ensure uniform distribution across existing shards in the cluster.
    */
  def rebalanceSlotsInGlobalReplicationGroup(): Request[RebalanceSlotsInGlobalReplicationGroupResult, AWSError] = js.native
  def rebalanceSlotsInGlobalReplicationGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ RebalanceSlotsInGlobalReplicationGroupResult, Unit]
  ): Request[RebalanceSlotsInGlobalReplicationGroupResult, AWSError] = js.native
  /**
    * Redistribute slots to ensure uniform distribution across existing shards in the cluster.
    */
  def rebalanceSlotsInGlobalReplicationGroup(params: RebalanceSlotsInGlobalReplicationGroupMessage): Request[RebalanceSlotsInGlobalReplicationGroupResult, AWSError] = js.native
  def rebalanceSlotsInGlobalReplicationGroup(
    params: RebalanceSlotsInGlobalReplicationGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebalanceSlotsInGlobalReplicationGroupResult, Unit]
  ): Request[RebalanceSlotsInGlobalReplicationGroupResult, AWSError] = js.native
  
  /**
    * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
    */
  def rebootCacheCluster(): Request[RebootCacheClusterResult, AWSError] = js.native
  def rebootCacheCluster(callback: js.Function2[/* err */ AWSError, /* data */ RebootCacheClusterResult, Unit]): Request[RebootCacheClusterResult, AWSError] = js.native
  /**
    * Reboots some, or all, of the cache nodes within a provisioned cluster. This operation applies any modified cache parameter groups to the cluster. The reboot operation takes place as soon as possible, and results in a momentary outage to the cluster. During the reboot, the cluster status is set to REBOOTING. The reboot causes the contents of the cache (for each cache node being rebooted) to be lost. When the reboot is complete, a cluster event is created. Rebooting a cluster is currently supported on Memcached and Redis (cluster mode disabled) clusters. Rebooting is not supported on Redis (cluster mode enabled) clusters. If you make changes to parameters that require a Redis (cluster mode enabled) cluster reboot for the changes to be applied, see Rebooting a Cluster for an alternate process.
    */
  def rebootCacheCluster(params: RebootCacheClusterMessage): Request[RebootCacheClusterResult, AWSError] = js.native
  def rebootCacheCluster(
    params: RebootCacheClusterMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootCacheClusterResult, Unit]
  ): Request[RebootCacheClusterResult, AWSError] = js.native
  
  /**
    * Removes the tags identified by the TagKeys list from the named resource.
    */
  def removeTagsFromResource(): Request[TagListMessage, AWSError] = js.native
  def removeTagsFromResource(callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]): Request[TagListMessage, AWSError] = js.native
  /**
    * Removes the tags identified by the TagKeys list from the named resource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[TagListMessage, AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TagListMessage, Unit]
  ): Request[TagListMessage, AWSError] = js.native
  
  /**
    * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
    */
  def resetCacheParameterGroup(): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  def resetCacheParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupNameMessage, Unit]): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  /**
    * Modifies the parameters of a cache parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire cache parameter group, specify the ResetAllParameters and CacheParameterGroupName parameters.
    */
  def resetCacheParameterGroup(params: ResetCacheParameterGroupMessage): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  def resetCacheParameterGroup(
    params: ResetCacheParameterGroupMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheParameterGroupNameMessage, Unit]
  ): Request[CacheParameterGroupNameMessage, AWSError] = js.native
  
  /**
    * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
    */
  def revokeCacheSecurityGroupIngress(): Request[RevokeCacheSecurityGroupIngressResult, AWSError] = js.native
  def revokeCacheSecurityGroupIngress(callback: js.Function2[/* err */ AWSError, /* data */ RevokeCacheSecurityGroupIngressResult, Unit]): Request[RevokeCacheSecurityGroupIngressResult, AWSError] = js.native
  /**
    * Revokes ingress from a cache security group. Use this operation to disallow access from an Amazon EC2 security group that had been previously authorized.
    */
  def revokeCacheSecurityGroupIngress(params: RevokeCacheSecurityGroupIngressMessage): Request[RevokeCacheSecurityGroupIngressResult, AWSError] = js.native
  def revokeCacheSecurityGroupIngress(
    params: RevokeCacheSecurityGroupIngressMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeCacheSecurityGroupIngressResult, Unit]
  ): Request[RevokeCacheSecurityGroupIngressResult, AWSError] = js.native
  
  /**
    * Start the migration of data.
    */
  def startMigration(): Request[StartMigrationResponse, AWSError] = js.native
  def startMigration(callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationResponse, Unit]): Request[StartMigrationResponse, AWSError] = js.native
  /**
    * Start the migration of data.
    */
  def startMigration(params: StartMigrationMessage): Request[StartMigrationResponse, AWSError] = js.native
  def startMigration(
    params: StartMigrationMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationResponse, Unit]
  ): Request[StartMigrationResponse, AWSError] = js.native
  
  /**
    * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ  in the ElastiCache User Guide.
    */
  def testFailover(): Request[TestFailoverResult, AWSError] = js.native
  def testFailover(callback: js.Function2[/* err */ AWSError, /* data */ TestFailoverResult, Unit]): Request[TestFailoverResult, AWSError] = js.native
  /**
    * Represents the input of a TestFailover operation which test automatic failover on a specified node group (called shard in the console) in a replication group (called cluster in the console).  Note the following    A customer can use this operation to test automatic failover on up to 5 shards (called node groups in the ElastiCache API and AWS CLI) in any rolling 24-hour period.   If calling this operation on shards in different clusters (called replication groups in the API and CLI), the calls can be made concurrently.     If calling this operation multiple times on different shards in the same Redis (cluster mode enabled) replication group, the first node replacement must complete before a subsequent call can be made.   To determine whether the node replacement is complete you can check Events using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API. Look for the following automatic failover related events, listed here in order of occurrance:   Replication group message: Test Failover API called for node group &lt;node-group-id&gt;    Cache cluster message: Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Replication group message: Failover from primary node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed    Cache cluster message: Recovering cache nodes &lt;node-id&gt;    Cache cluster message: Finished recovery for cache nodes &lt;node-id&gt;    For more information see:    Viewing ElastiCache Events in the ElastiCache User Guide     DescribeEvents in the ElastiCache API Reference     Also see, Testing Multi-AZ  in the ElastiCache User Guide.
    */
  def testFailover(params: TestFailoverMessage): Request[TestFailoverResult, AWSError] = js.native
  def testFailover(
    params: TestFailoverMessage,
    callback: js.Function2[/* err */ AWSError, /* data */ TestFailoverResult, Unit]
  ): Request[TestFailoverResult, AWSError] = js.native
  
  /**
    * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(state: cacheClusterAvailable): Request[CacheClusterMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(
    state: cacheClusterAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]
  ): Request[CacheClusterMessage, AWSError] = js.native
  /**
    * Waits for the cacheClusterAvailable state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is available.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(state: cacheClusterAvailable, params: DescribeCacheClustersMess): Request[CacheClusterMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterAvailable(
    state: cacheClusterAvailable,
    params: DescribeCacheClustersMess,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]
  ): Request[CacheClusterMessage, AWSError] = js.native
  /**
    * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(state: cacheClusterDeleted): Request[CacheClusterMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(
    state: cacheClusterDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]
  ): Request[CacheClusterMessage, AWSError] = js.native
  /**
    * Waits for the cacheClusterDeleted state by periodically calling the underlying ElastiCache.describeCacheClustersoperation every 15 seconds (at most 40 times). Wait until ElastiCache cluster is deleted.
    */
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(state: cacheClusterDeleted, params: DescribeCacheClustersMess): Request[CacheClusterMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_cacheClusterDeleted(
    state: cacheClusterDeleted,
    params: DescribeCacheClustersMess,
    callback: js.Function2[/* err */ AWSError, /* data */ CacheClusterMessage, Unit]
  ): Request[CacheClusterMessage, AWSError] = js.native
  /**
    * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(state: replicationGroupAvailable): Request[ReplicationGroupMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(
    state: replicationGroupAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]
  ): Request[ReplicationGroupMessage, AWSError] = js.native
  /**
    * Waits for the replicationGroupAvailable state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is available.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(state: replicationGroupAvailable, params: DescribeReplicationGroups): Request[ReplicationGroupMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupAvailable(
    state: replicationGroupAvailable,
    params: DescribeReplicationGroups,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]
  ): Request[ReplicationGroupMessage, AWSError] = js.native
  /**
    * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(state: replicationGroupDeleted): Request[ReplicationGroupMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(
    state: replicationGroupDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]
  ): Request[ReplicationGroupMessage, AWSError] = js.native
  /**
    * Waits for the replicationGroupDeleted state by periodically calling the underlying ElastiCache.describeReplicationGroupsoperation every 15 seconds (at most 40 times). Wait until ElastiCache replication group is deleted.
    */
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(state: replicationGroupDeleted, params: DescribeReplicationGroups): Request[ReplicationGroupMessage, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_replicationGroupDeleted(
    state: replicationGroupDeleted,
    params: DescribeReplicationGroups,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationGroupMessage, Unit]
  ): Request[ReplicationGroupMessage, AWSError] = js.native
}
