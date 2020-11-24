package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
  
  /**
    * One or more events for the endpoint. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ARN for the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: typings.awsSdk.ec2Mod.ConnectionNotificationId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object ModifyVpcEndpointConnectionNotificationRequest {
  
  @scala.inline
  def apply(ConnectionNotificationId: ConnectionNotificationId): ModifyVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationId = ConnectionNotificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
  }
  
  @scala.inline
  implicit class ModifyVpcEndpointConnectionNotificationRequestOps[Self <: ModifyVpcEndpointConnectionNotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectionNotificationId(value: ConnectionNotificationId): Self = this.set("ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionEventsVarargs(value: String*): Self = this.set("ConnectionEvents", js.Array(value :_*))
    
    @scala.inline
    def setConnectionEvents(value: ValueStringList): Self = this.set("ConnectionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionEvents: Self = this.set("ConnectionEvents", js.undefined)
    
    @scala.inline
    def setConnectionNotificationArn(value: String): Self = this.set("ConnectionNotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationArn: Self = this.set("ConnectionNotificationArn", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
