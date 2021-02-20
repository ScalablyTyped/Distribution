package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterRequest extends StObject {
  
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
  implicit class UpdateClusterRequestMutableBuilder[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setNotificationTopicArn(value: String): Self = StObject.set(x, "NotificationTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTopicArnUndefined: Self = StObject.set(x, "NotificationTopicArn", js.undefined)
    
    @scala.inline
    def setNotificationTopicStatus(value: String): Self = StObject.set(x, "NotificationTopicStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTopicStatusUndefined: Self = StObject.set(x, "NotificationTopicStatus", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdentifierList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
  }
}
