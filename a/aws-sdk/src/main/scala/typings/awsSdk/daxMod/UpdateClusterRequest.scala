package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterRequest extends js.Object {
  /**
    * The name of the DAX cluster to be modified.
    */
  var ClusterName: String = js.native
  /**
    * A description of the changes being made to the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the topic.
    */
  var NotificationTopicArn: js.UndefOr[String] = js.native
  /**
    * The current state of the topic.
    */
  var NotificationTopicStatus: js.UndefOr[String] = js.native
  /**
    * The name of a parameter group for this cluster.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is not specified, DAX assigns the default VPC security group to each node.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdentifierList] = js.native
}

object UpdateClusterRequest {
  @scala.inline
  def apply(
    ClusterName: String,
    Description: String = null,
    NotificationTopicArn: String = null,
    NotificationTopicStatus: String = null,
    ParameterGroupName: String = null,
    PreferredMaintenanceWindow: String = null,
    SecurityGroupIds: SecurityGroupIdentifierList = null
  ): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (NotificationTopicArn != null) __obj.updateDynamic("NotificationTopicArn")(NotificationTopicArn.asInstanceOf[js.Any])
    if (NotificationTopicStatus != null) __obj.updateDynamic("NotificationTopicStatus")(NotificationTopicStatus.asInstanceOf[js.Any])
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
}

