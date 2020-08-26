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
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setActiveNodes(value: IntegerOptional): Self = this.set("ActiveNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveNodes: Self = this.set("ActiveNodes", js.undefined)
    @scala.inline
    def setClusterArn(value: String): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    @scala.inline
    def setClusterDiscoveryEndpoint(value: Endpoint): Self = this.set("ClusterDiscoveryEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterDiscoveryEndpoint: Self = this.set("ClusterDiscoveryEndpoint", js.undefined)
    @scala.inline
    def setClusterName(value: String): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("ClusterName", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setNodeIdsToRemoveVarargs(value: String*): Self = this.set("NodeIdsToRemove", js.Array(value :_*))
    @scala.inline
    def setNodeIdsToRemove(value: NodeIdentifierList): Self = this.set("NodeIdsToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIdsToRemove: Self = this.set("NodeIdsToRemove", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("Nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: NodeList): Self = this.set("Nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("Nodes", js.undefined)
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
    @scala.inline
    def setParameterGroup(value: ParameterGroupStatus): Self = this.set("ParameterGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroup: Self = this.set("ParameterGroup", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = this.set("SSEDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEDescription: Self = this.set("SSEDescription", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: SecurityGroupMembershipList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubnetGroup(value: String): Self = this.set("SubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetGroup: Self = this.set("SubnetGroup", js.undefined)
    @scala.inline
    def setTotalNodes(value: IntegerOptional): Self = this.set("TotalNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalNodes: Self = this.set("TotalNodes", js.undefined)
  }
  
}

