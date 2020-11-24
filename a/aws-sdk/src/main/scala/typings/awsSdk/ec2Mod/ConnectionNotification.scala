package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionNotification extends js.Object {
  
  /**
    * The events for the notification. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ARN of the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[String] = js.native
  
  /**
    * The state of the notification.
    */
  var ConnectionNotificationState: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationState] = js.native
  
  /**
    * The type of notification.
    */
  var ConnectionNotificationType: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationType] = js.native
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
}
object ConnectionNotification {
  
  @scala.inline
  def apply(): ConnectionNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionNotification]
  }
  
  @scala.inline
  implicit class ConnectionNotificationOps[Self <: ConnectionNotification] (val x: Self) extends AnyVal {
    
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
    def setConnectionNotificationId(value: String): Self = this.set("ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationId: Self = this.set("ConnectionNotificationId", js.undefined)
    
    @scala.inline
    def setConnectionNotificationState(value: ConnectionNotificationState): Self = this.set("ConnectionNotificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationState: Self = this.set("ConnectionNotificationState", js.undefined)
    
    @scala.inline
    def setConnectionNotificationType(value: ConnectionNotificationType): Self = this.set("ConnectionNotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionNotificationType: Self = this.set("ConnectionNotificationType", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("ServiceId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
  }
}
