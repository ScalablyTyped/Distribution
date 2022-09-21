package typings.awsSdk.memorydbMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryDB extends Service {
  
  /**
    * Apply the service update to a list of clusters supplied. For more information on service updates and applying them, see Applying the service updates.
    */
  def batchUpdateCluster(): Request[BatchUpdateClusterResponse, AWSError] = js.native
  def batchUpdateCluster(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateClusterResponse, Unit]): Request[BatchUpdateClusterResponse, AWSError] = js.native
  /**
    * Apply the service update to a list of clusters supplied. For more information on service updates and applying them, see Applying the service updates.
    */
  def batchUpdateCluster(params: BatchUpdateClusterRequest): Request[BatchUpdateClusterResponse, AWSError] = js.native
  def batchUpdateCluster(
    params: BatchUpdateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateClusterResponse, Unit]
  ): Request[BatchUpdateClusterResponse, AWSError] = js.native
  
  @JSName("config")
  var config_MemoryDB: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Makes a copy of an existing snapshot.
    */
  def copySnapshot(): Request[CopySnapshotResponse, AWSError] = js.native
  def copySnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResponse, Unit]): Request[CopySnapshotResponse, AWSError] = js.native
  /**
    * Makes a copy of an existing snapshot.
    */
  def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResponse, AWSError] = js.native
  def copySnapshot(
    params: CopySnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopySnapshotResponse, Unit]
  ): Request[CopySnapshotResponse, AWSError] = js.native
  
  /**
    * Creates an Access Control List. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def createACL(): Request[CreateACLResponse, AWSError] = js.native
  def createACL(callback: js.Function2[/* err */ AWSError, /* data */ CreateACLResponse, Unit]): Request[CreateACLResponse, AWSError] = js.native
  /**
    * Creates an Access Control List. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def createACL(params: CreateACLRequest): Request[CreateACLResponse, AWSError] = js.native
  def createACL(
    params: CreateACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateACLResponse, Unit]
  ): Request[CreateACLResponse, AWSError] = js.native
  
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  
  /**
    * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster. For more information, see Configuring engine parameters using parameter groups. 
    */
  def createParameterGroup(): Request[CreateParameterGroupResponse, AWSError] = js.native
  def createParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateParameterGroupResponse, Unit]): Request[CreateParameterGroupResponse, AWSError] = js.native
  /**
    * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are applied to all of the nodes in any cluster. For more information, see Configuring engine parameters using parameter groups. 
    */
  def createParameterGroup(params: CreateParameterGroupRequest): Request[CreateParameterGroupResponse, AWSError] = js.native
  def createParameterGroup(
    params: CreateParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParameterGroupResponse, Unit]
  ): Request[CreateParameterGroupResponse, AWSError] = js.native
  
  /**
    * Creates a copy of an entire cluster at a specific moment in time.
    */
  def createSnapshot(): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]): Request[CreateSnapshotResponse, AWSError] = js.native
  /**
    * Creates a copy of an entire cluster at a specific moment in time.
    */
  def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse, AWSError] = js.native
  def createSnapshot(
    params: CreateSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSnapshotResponse, Unit]
  ): Request[CreateSnapshotResponse, AWSError] = js.native
  
  /**
    * Creates a subnet group. A subnet group is a collection of subnets (typically private) that you can designate for your clusters running in an Amazon Virtual Private Cloud (VPC) environment. When you create a cluster in an Amazon VPC, you must specify a subnet group. MemoryDB uses that subnet group to choose a subnet and IP addresses within that subnet to associate with your nodes. For more information, see Subnets and subnet groups.
    */
  def createSubnetGroup(): Request[CreateSubnetGroupResponse, AWSError] = js.native
  def createSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetGroupResponse, Unit]): Request[CreateSubnetGroupResponse, AWSError] = js.native
  /**
    * Creates a subnet group. A subnet group is a collection of subnets (typically private) that you can designate for your clusters running in an Amazon Virtual Private Cloud (VPC) environment. When you create a cluster in an Amazon VPC, you must specify a subnet group. MemoryDB uses that subnet group to choose a subnet and IP addresses within that subnet to associate with your nodes. For more information, see Subnets and subnet groups.
    */
  def createSubnetGroup(params: CreateSubnetGroupRequest): Request[CreateSubnetGroupResponse, AWSError] = js.native
  def createSubnetGroup(
    params: CreateSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubnetGroupResponse, Unit]
  ): Request[CreateSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Creates a MemoryDB user. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a MemoryDB user. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def deleteACL(): Request[DeleteACLResponse, AWSError] = js.native
  def deleteACL(callback: js.Function2[/* err */ AWSError, /* data */ DeleteACLResponse, Unit]): Request[DeleteACLResponse, AWSError] = js.native
  /**
    * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted. For more information, see Authenticating users with Access Contol Lists (ACLs).
    */
  def deleteACL(params: DeleteACLRequest): Request[DeleteACLResponse, AWSError] = js.native
  def deleteACL(
    params: DeleteACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteACLResponse, Unit]
  ): Request[DeleteACLResponse, AWSError] = js.native
  
  /**
    * Deletes a cluster. It also deletes all associated nodes and node endpoints
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes a cluster. It also deletes all associated nodes and node endpoints
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters. You cannot delete the default parameter groups in your account.
    */
  def deleteParameterGroup(): Request[DeleteParameterGroupResponse, AWSError] = js.native
  def deleteParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterGroupResponse, Unit]): Request[DeleteParameterGroupResponse, AWSError] = js.native
  /**
    * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters. You cannot delete the default parameter groups in your account.
    */
  def deleteParameterGroup(params: DeleteParameterGroupRequest): Request[DeleteParameterGroupResponse, AWSError] = js.native
  def deleteParameterGroup(
    params: DeleteParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteParameterGroupResponse, Unit]
  ): Request[DeleteParameterGroupResponse, AWSError] = js.native
  
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately begins deleting the snapshot; you cannot cancel or revert this operation.
    */
  def deleteSnapshot(): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]): Request[DeleteSnapshotResponse, AWSError] = js.native
  /**
    * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately begins deleting the snapshot; you cannot cancel or revert this operation.
    */
  def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse, AWSError] = js.native
  def deleteSnapshot(
    params: DeleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSnapshotResponse, Unit]
  ): Request[DeleteSnapshotResponse, AWSError] = js.native
  
  /**
    * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
    */
  def deleteSubnetGroup(): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  def deleteSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubnetGroupResponse, Unit]): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  /**
    * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
    */
  def deleteSubnetGroup(params: DeleteSubnetGroupRequest): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  def deleteSubnetGroup(
    params: DeleteSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubnetGroupResponse, Unit]
  ): Request[DeleteSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Returns a list of ACLs
    */
  def describeACLs(): Request[DescribeACLsResponse, AWSError] = js.native
  def describeACLs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeACLsResponse, Unit]): Request[DescribeACLsResponse, AWSError] = js.native
  /**
    * Returns a list of ACLs
    */
  def describeACLs(params: DescribeACLsRequest): Request[DescribeACLsResponse, AWSError] = js.native
  def describeACLs(
    params: DescribeACLsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeACLsResponse, Unit]
  ): Request[DescribeACLsResponse, AWSError] = js.native
  
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cluster if a cluster name is supplied.
    */
  def describeClusters(): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]): Request[DescribeClustersResponse, AWSError] = js.native
  /**
    * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific cluster if a cluster name is supplied.
    */
  def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]
  ): Request[DescribeClustersResponse, AWSError] = js.native
  
  /**
    * Returns a list of the available Redis engine versions.
    */
  def describeEngineVersions(): Request[DescribeEngineVersionsResponse, AWSError] = js.native
  def describeEngineVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineVersionsResponse, Unit]): Request[DescribeEngineVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of the available Redis engine versions.
    */
  def describeEngineVersions(params: DescribeEngineVersionsRequest): Request[DescribeEngineVersionsResponse, AWSError] = js.native
  def describeEngineVersions(
    params: DescribeEngineVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEngineVersionsResponse, Unit]
  ): Request[DescribeEngineVersionsResponse, AWSError] = js.native
  
  /**
    * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]): Request[DescribeEventsResponse, AWSError] = js.native
  /**
    * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if necessary.
    */
  def describeEvents(params: DescribeEventsRequest): Request[DescribeEventsResponse, AWSError] = js.native
  def describeEvents(
    params: DescribeEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventsResponse, Unit]
  ): Request[DescribeEventsResponse, AWSError] = js.native
  
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeParameterGroups(): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  def describeParameterGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeParameterGroupsResponse, Unit]): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only the descriptions for that group.
    */
  def describeParameterGroups(params: DescribeParameterGroupsRequest): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  def describeParameterGroups(
    params: DescribeParameterGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeParameterGroupsResponse, Unit]
  ): Request[DescribeParameterGroupsResponse, AWSError] = js.native
  
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(): Request[DescribeParametersResponse, AWSError] = js.native
  def describeParameters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResponse, Unit]): Request[DescribeParametersResponse, AWSError] = js.native
  /**
    * Returns the detailed parameter list for a particular parameter group.
    */
  def describeParameters(params: DescribeParametersRequest): Request[DescribeParametersResponse, AWSError] = js.native
  def describeParameters(
    params: DescribeParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeParametersResponse, Unit]
  ): Request[DescribeParametersResponse, AWSError] = js.native
  
  /**
    * Returns details of the service updates
    */
  def describeServiceUpdates(): Request[DescribeServiceUpdatesResponse, AWSError] = js.native
  def describeServiceUpdates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceUpdatesResponse, Unit]): Request[DescribeServiceUpdatesResponse, AWSError] = js.native
  /**
    * Returns details of the service updates
    */
  def describeServiceUpdates(params: DescribeServiceUpdatesRequest): Request[DescribeServiceUpdatesResponse, AWSError] = js.native
  def describeServiceUpdates(
    params: DescribeServiceUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceUpdatesResponse, Unit]
  ): Request[DescribeServiceUpdatesResponse, AWSError] = js.native
  
  /**
    * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
    */
  def describeSnapshots(): Request[DescribeSnapshotsResponse, AWSError] = js.native
  def describeSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResponse, Unit]): Request[DescribeSnapshotsResponse, AWSError] = js.native
  /**
    * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
    */
  def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResponse, AWSError] = js.native
  def describeSnapshots(
    params: DescribeSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSnapshotsResponse, Unit]
  ): Request[DescribeSnapshotsResponse, AWSError] = js.native
  
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
    */
  def describeSubnetGroups(): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  def describeSubnetGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetGroupsResponse, Unit]): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the description of that group.
    */
  def describeSubnetGroups(params: DescribeSubnetGroupsRequest): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  def describeSubnetGroups(
    params: DescribeSubnetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubnetGroupsResponse, Unit]
  ): Request[DescribeSubnetGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of users.
    */
  def describeUsers(): Request[DescribeUsersResponse, AWSError] = js.native
  def describeUsers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResponse, Unit]): Request[DescribeUsersResponse, AWSError] = js.native
  /**
    * Returns a list of users.
    */
  def describeUsers(params: DescribeUsersRequest): Request[DescribeUsersResponse, AWSError] = js.native
  def describeUsers(
    params: DescribeUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUsersResponse, Unit]
  ): Request[DescribeUsersResponse, AWSError] = js.native
  
  /**
    * Used to failover a shard
    */
  def failoverShard(): Request[FailoverShardResponse, AWSError] = js.native
  def failoverShard(callback: js.Function2[/* err */ AWSError, /* data */ FailoverShardResponse, Unit]): Request[FailoverShardResponse, AWSError] = js.native
  /**
    * Used to failover a shard
    */
  def failoverShard(params: FailoverShardRequest): Request[FailoverShardResponse, AWSError] = js.native
  def failoverShard(
    params: FailoverShardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FailoverShardResponse, Unit]
  ): Request[FailoverShardResponse, AWSError] = js.native
  
  /**
    * Lists all available node types that you can scale to from your cluster's current node type. When you use the UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeUpdates(): Request[ListAllowedNodeTypeUpdatesResponse, AWSError] = js.native
  def listAllowedNodeTypeUpdates(callback: js.Function2[/* err */ AWSError, /* data */ ListAllowedNodeTypeUpdatesResponse, Unit]): Request[ListAllowedNodeTypeUpdatesResponse, AWSError] = js.native
  /**
    * Lists all available node types that you can scale to from your cluster's current node type. When you use the UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types returned by this operation.
    */
  def listAllowedNodeTypeUpdates(params: ListAllowedNodeTypeUpdatesRequest): Request[ListAllowedNodeTypeUpdatesResponse, AWSError] = js.native
  def listAllowedNodeTypeUpdates(
    params: ListAllowedNodeTypeUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAllowedNodeTypeUpdatesResponse, Unit]
  ): Request[ListAllowedNodeTypeUpdatesResponse, AWSError] = js.native
  
  /**
    * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see Tagging your MemoryDB resources 
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see Tagging your MemoryDB resources 
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire parameter group, specify the AllParameters and ParameterGroupName parameters.
    */
  def resetParameterGroup(): Request[ResetParameterGroupResponse, AWSError] = js.native
  def resetParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ ResetParameterGroupResponse, Unit]): Request[ResetParameterGroupResponse, AWSError] = js.native
  /**
    * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific parameters by submitting a list of parameter names. To reset the entire parameter group, specify the AllParameters and ParameterGroupName parameters.
    */
  def resetParameterGroup(params: ResetParameterGroupRequest): Request[ResetParameterGroupResponse, AWSError] = js.native
  def resetParameterGroup(
    params: ResetParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetParameterGroupResponse, Unit]
  ): Request[ResetParameterGroupResponse, AWSError] = js.native
  
  /**
    * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all nodes in the cluster. For more information, see Resource-level permissions. For example, you can use cost-allocation tags to your MemoryDB resources, Amazon generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all nodes in the cluster. For more information, see Resource-level permissions. For example, you can use cost-allocation tags to your MemoryDB resources, Amazon generates a cost allocation report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply tags that represent business categories (such as cost centers, application names, or owners) to organize your costs across multiple services. For more information, see Using Cost Allocation Tags.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Use this operation to remove tags on a resource
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Use this operation to remove tags on a resource
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Changes the list of users that belong to the Access Control List.
    */
  def updateACL(): Request[UpdateACLResponse, AWSError] = js.native
  def updateACL(callback: js.Function2[/* err */ AWSError, /* data */ UpdateACLResponse, Unit]): Request[UpdateACLResponse, AWSError] = js.native
  /**
    * Changes the list of users that belong to the Access Control List.
    */
  def updateACL(params: UpdateACLRequest): Request[UpdateACLResponse, AWSError] = js.native
  def updateACL(
    params: UpdateACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateACLResponse, Unit]
  ): Request[UpdateACLResponse, AWSError] = js.native
  
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration settings by specifying the settings and the new values.
    */
  def updateCluster(): Request[UpdateClusterResponse, AWSError] = js.native
  def updateCluster(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResponse, Unit]): Request[UpdateClusterResponse, AWSError] = js.native
  /**
    * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration settings by specifying the settings and the new values.
    */
  def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResponse, AWSError] = js.native
  def updateCluster(
    params: UpdateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterResponse, Unit]
  ): Request[UpdateClusterResponse, AWSError] = js.native
  
  /**
    * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(): Request[UpdateParameterGroupResponse, AWSError] = js.native
  def updateParameterGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateParameterGroupResponse, Unit]): Request[UpdateParameterGroupResponse, AWSError] = js.native
  /**
    * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting a list parameter name and value pairs.
    */
  def updateParameterGroup(params: UpdateParameterGroupRequest): Request[UpdateParameterGroupResponse, AWSError] = js.native
  def updateParameterGroup(
    params: UpdateParameterGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateParameterGroupResponse, Unit]
  ): Request[UpdateParameterGroupResponse, AWSError] = js.native
  
  /**
    * Updates a subnet group. For more information, see Updating a subnet group 
    */
  def updateSubnetGroup(): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  def updateSubnetGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetGroupResponse, Unit]): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  /**
    * Updates a subnet group. For more information, see Updating a subnet group 
    */
  def updateSubnetGroup(params: UpdateSubnetGroupRequest): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  def updateSubnetGroup(
    params: UpdateSubnetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubnetGroupResponse, Unit]
  ): Request[UpdateSubnetGroupResponse, AWSError] = js.native
  
  /**
    * Changes user password(s) and/or access string.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Changes user password(s) and/or access string.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}
