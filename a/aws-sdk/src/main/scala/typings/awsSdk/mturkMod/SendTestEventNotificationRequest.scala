package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendTestEventNotificationRequest extends StObject {
  
  /**
    *  The notification specification to test. This value is identical to the value you would provide to the UpdateNotificationSettings operation when you establish the notification specification for a HIT type. 
    */
  var Notification: NotificationSpecification
  
  /**
    *  The event to simulate to test the notification specification. This event is included in the test message even if the notification specification does not include the event type. The notification specification does not filter out the test event. 
    */
  var TestEventType: EventType
}
object SendTestEventNotificationRequest {
  
  @scala.inline
  def apply(Notification: NotificationSpecification, TestEventType: EventType): SendTestEventNotificationRequest = {
    val __obj = js.Dynamic.literal(Notification = Notification.asInstanceOf[js.Any], TestEventType = TestEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTestEventNotificationRequest]
  }
  
  @scala.inline
  implicit class SendTestEventNotificationRequestMutableBuilder[Self <: SendTestEventNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: NotificationSpecification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEventType(value: EventType): Self = StObject.set(x, "TestEventType", value.asInstanceOf[js.Any])
  }
}
