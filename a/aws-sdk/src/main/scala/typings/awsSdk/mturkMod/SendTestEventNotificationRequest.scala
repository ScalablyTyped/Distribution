package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendTestEventNotificationRequest extends js.Object {
  
  /**
    *  The notification specification to test. This value is identical to the value you would provide to the UpdateNotificationSettings operation when you establish the notification specification for a HIT type. 
    */
  var Notification: NotificationSpecification = js.native
  
  /**
    *  The event to simulate to test the notification specification. This event is included in the test message even if the notification specification does not include the event type. The notification specification does not filter out the test event. 
    */
  var TestEventType: EventType = js.native
}
object SendTestEventNotificationRequest {
  
  @scala.inline
  def apply(Notification: NotificationSpecification, TestEventType: EventType): SendTestEventNotificationRequest = {
    val __obj = js.Dynamic.literal(Notification = Notification.asInstanceOf[js.Any], TestEventType = TestEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTestEventNotificationRequest]
  }
  
  @scala.inline
  implicit class SendTestEventNotificationRequestOps[Self <: SendTestEventNotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setNotification(value: NotificationSpecification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEventType(value: EventType): Self = this.set("TestEventType", value.asInstanceOf[js.Any])
  }
}
