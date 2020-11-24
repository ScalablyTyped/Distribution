package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(ClusterName: String): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterRequestOps[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: String): Self = this.set("NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicArn: Self = this.set("NotificationTopicArn", js.undefined)
    
    @scala.inline
    def setNotificationTopicStatus(value: String): Self = this.set("NotificationTopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTopicStatus: Self = this.set("NotificationTopicStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdentifierList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
  }
}
