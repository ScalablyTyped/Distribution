package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * The Availability Zones (AZs) in which the cluster nodes will reside after the cluster has been created or updated. If provided, the length of this list must equal the ReplicationFactor parameter. If you omit this parameter, DAX will spread the nodes across Availability Zones for the highest availability.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The cluster identifier. This parameter is stored as a lowercase string.  Constraints:    A name must contain from 1 to 20 alphanumeric characters or hyphens.   The first character must be a letter.   A name cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterName: String = js.native
  /**
    * A description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: String = js.native
  /**
    * The compute and memory capacity of the nodes in the cluster.
    */
  var NodeType: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent.  The Amazon SNS topic owner must be same as the DAX cluster owner. 
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  /**
    * The parameter group to be associated with the DAX cluster.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are:    sun     mon     tue     wed     thu     fri     sat    Example: sun:05:00-sun:09:00   If you don't specify a preferred maintenance window when you create or modify a cache cluster, DAX assigns a 60-minute maintenance window on a randomly selected day of the week. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read replicas. To do this, set ReplicationFactor to a number between 3 (one primary and two read replicas) and 10 (one primary and nine read replicas). If the AvailabilityZones parameter is provided, its length must equal the ReplicationFactor.  AWS recommends that you have at least two read replicas per cluster. 
    */
  var ReplicationFactor: Integer = js.native
  /**
    * Represents the settings used to enable server-side encryption on the cluster.
    */
  var SSESpecification: js.UndefOr[typings.awsSdk.daxMod.SSESpecification] = js.native
  /**
    * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is system-generated.) If this parameter is not specified, DAX assigns the default VPC security group to each node.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.native
  /**
    * The name of the subnet group to be used for the replication group.  DAX clusters can only run in an Amazon VPC environment. All of the subnets that you specify in a subnet group must exist in the same VPC. 
    */
  var SubnetGroupName: js.UndefOr[String] = js.native
  /**
    * A set of tags to associate with the DAX cluster. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(ClusterName: String, IamRoleArn: String, NodeType: String, ReplicationFactor: Integer): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], NodeType = NodeType.asInstanceOf[js.Any], ReplicationFactor = ReplicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamRoleArn(value: String): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationFactor(value: Integer): Self = this.set("ReplicationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setNotificationTopicArn(value: String): Self = this.set("NotificationTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("NotificationTopicArn", js.undefined)
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setSSESpecification(value: SSESpecification): Self = this.set("SSESpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSESpecification: Self = this.set("SSESpecification", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdentifierList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSubnetGroupName(value: String): Self = this.set("SubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetGroupName: Self = this.set("SubnetGroupName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

