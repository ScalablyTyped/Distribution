package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionNotification extends StObject {
  
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
  implicit class ConnectionNotificationMutableBuilder[Self <: ConnectionNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionEvents(value: ValueStringList): Self = StObject.set(x, "ConnectionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionEventsUndefined: Self = StObject.set(x, "ConnectionEvents", js.undefined)
    
    @scala.inline
    def setConnectionEventsVarargs(value: String*): Self = StObject.set(x, "ConnectionEvents", js.Array(value :_*))
    
    @scala.inline
    def setConnectionNotificationArn(value: String): Self = StObject.set(x, "ConnectionNotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationArnUndefined: Self = StObject.set(x, "ConnectionNotificationArn", js.undefined)
    
    @scala.inline
    def setConnectionNotificationId(value: String): Self = StObject.set(x, "ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationIdUndefined: Self = StObject.set(x, "ConnectionNotificationId", js.undefined)
    
    @scala.inline
    def setConnectionNotificationState(value: ConnectionNotificationState): Self = StObject.set(x, "ConnectionNotificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationStateUndefined: Self = StObject.set(x, "ConnectionNotificationState", js.undefined)
    
    @scala.inline
    def setConnectionNotificationType(value: ConnectionNotificationType): Self = StObject.set(x, "ConnectionNotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationTypeUndefined: Self = StObject.set(x, "ConnectionNotificationType", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
