package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The number of nodes in the cluster that are active (i.e., capable of serving requests).
    */
  var ActiveNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
    */
  var ClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration endpoint for this DAX cluster, consisting of a DNS name and a port number. Client applications can specify this endpoint, rather than an individual node endpoint, and allow the DAX client software to intelligently route requests and responses to nodes in the DAX cluster.
    */
  var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The name of the DAX cluster.
    */
  var ClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
  
  /**
    * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of nodes that are currently in the cluster.
    */
  var Nodes: js.UndefOr[NodeList] = js.undefined
  
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.daxMod.NotificationConfiguration] = js.undefined
  
  /**
    * The parameter group being used by nodes in the cluster.
    */
  var ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.undefined
  
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  var SSEDescription: js.UndefOr[typings.awsSdk.daxMod.SSEDescription] = js.undefined
  
  /**
    * A list of security groups, and the status of each, for the nodes in the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
  
  /**
    * The current status of the cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet group where the DAX cluster is running.
    */
  var SubnetGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of nodes in the cluster.
    */
  var TotalNodes: js.UndefOr[IntegerOptional] = js.undefined
}
object Cluster {
  
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveNodes(value: IntegerOptional): Self = StObject.set(x, "ActiveNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveNodesUndefined: Self = StObject.set(x, "ActiveNodes", js.undefined)
    
    @scala.inline
    def setClusterArn(value: String): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterDiscoveryEndpoint(value: Endpoint): Self = StObject.set(x, "ClusterDiscoveryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterDiscoveryEndpointUndefined: Self = StObject.set(x, "ClusterDiscoveryEndpoint", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setNodeIdsToRemove(value: NodeIdentifierList): Self = StObject.set(x, "NodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdsToRemoveUndefined: Self = StObject.set(x, "NodeIdsToRemove", js.undefined)
    
    @scala.inline
    def setNodeIdsToRemoveVarargs(value: String*): Self = StObject.set(x, "NodeIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setNodes(value: NodeList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    @scala.inline
    def setParameterGroup(value: ParameterGroupStatus): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupMembershipList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetGroup(value: String): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
    
    @scala.inline
    def setTotalNodes(value: IntegerOptional): Self = StObject.set(x, "TotalNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNodesUndefined: Self = StObject.set(x, "TotalNodes", js.undefined)
  }
}
