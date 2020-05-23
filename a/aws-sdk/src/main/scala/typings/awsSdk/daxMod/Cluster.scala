package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The number of nodes in the cluster that are active (i.e., capable of serving requests).
    */
  var ActiveNodes: js.UndefOr[IntegerOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
    */
  var ClusterArn: js.UndefOr[String] = js.native
  /**
    * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.native
  /**
    * The name of the DAX cluster.
    */
  var ClusterName: js.UndefOr[String] = js.native
  /**
    * The description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  /**
    * A list of nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.native
  /**
    * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * A list of nodes that are currently in the cluster.
    */
  var Nodes: js.UndefOr[NodeList] = js.native
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.daxMod.NotificationConfiguration] = js.native
  /**
    * The parameter group being used by nodes in the cluster.
    */
  var ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.native
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  var SSEDescription: js.UndefOr[typings.awsSdk.daxMod.SSEDescription] = js.native
  /**
    * A list of security groups, and the status of each, for the nodes in the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.native
  /**
    * The current status of the cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The subnet group where the DAX cluster is running.
    */
  var SubnetGroup: js.UndefOr[String] = js.native
  /**
    * The total number of nodes in the cluster.
    */
  var TotalNodes: js.UndefOr[IntegerOptional] = js.native
}

object Cluster {
  @scala.inline
  def apply(
    ActiveNodes: js.UndefOr[IntegerOptional] = js.undefined,
    ClusterArn: String = null,
    ClusterDiscoveryEndpoint: Endpoint = null,
    ClusterName: String = null,
    Description: String = null,
    IamRoleArn: String = null,
    NodeIdsToRemove: NodeIdentifierList = null,
    NodeType: String = null,
    Nodes: NodeList = null,
    NotificationConfiguration: NotificationConfiguration = null,
    ParameterGroup: ParameterGroupStatus = null,
    PreferredMaintenanceWindow: String = null,
    SSEDescription: SSEDescription = null,
    SecurityGroups: SecurityGroupMembershipList = null,
    Status: String = null,
    SubnetGroup: String = null,
    TotalNodes: js.UndefOr[IntegerOptional] = js.undefined
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActiveNodes)) __obj.updateDynamic("ActiveNodes")(ActiveNodes.get.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterDiscoveryEndpoint != null) __obj.updateDynamic("ClusterDiscoveryEndpoint")(ClusterDiscoveryEndpoint.asInstanceOf[js.Any])
    if (ClusterName != null) __obj.updateDynamic("ClusterName")(ClusterName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (NodeIdsToRemove != null) __obj.updateDynamic("NodeIdsToRemove")(NodeIdsToRemove.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (Nodes != null) __obj.updateDynamic("Nodes")(Nodes.asInstanceOf[js.Any])
    if (NotificationConfiguration != null) __obj.updateDynamic("NotificationConfiguration")(NotificationConfiguration.asInstanceOf[js.Any])
    if (ParameterGroup != null) __obj.updateDynamic("ParameterGroup")(ParameterGroup.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (SSEDescription != null) __obj.updateDynamic("SSEDescription")(SSEDescription.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetGroup != null) __obj.updateDynamic("SubnetGroup")(SubnetGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalNodes)) __obj.updateDynamic("TotalNodes")(TotalNodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

