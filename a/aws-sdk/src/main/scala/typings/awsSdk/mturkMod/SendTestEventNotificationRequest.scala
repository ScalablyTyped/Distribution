package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

