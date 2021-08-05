package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfig extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var NotificationArn: js.UndefOr[typings.awsSdk.ssmMod.NotificationArn] = js.undefined
  
  /**
    * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Monitoring Systems Manager status changes using Amazon SNS notifications in the AWS Systems Manager User Guide.
    */
  var NotificationEvents: js.UndefOr[NotificationEventList] = js.undefined
  
  /**
    * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
    */
  var NotificationType: js.UndefOr[typings.awsSdk.ssmMod.NotificationType] = js.undefined
}
object NotificationConfig {
  
  inline def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  extension [Self <: NotificationConfig](x: Self) {
    
    inline def setNotificationArn(value: NotificationArn): Self = StObject.set(x, "NotificationArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationArnUndefined: Self = StObject.set(x, "NotificationArn", js.undefined)
    
    inline def setNotificationEvents(value: NotificationEventList): Self = StObject.set(x, "NotificationEvents", value.asInstanceOf[js.Any])
    
    inline def setNotificationEventsUndefined: Self = StObject.set(x, "NotificationEvents", js.undefined)
    
    inline def setNotificationEventsVarargs(value: NotificationEvent*): Self = StObject.set(x, "NotificationEvents", js.Array(value :_*))
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "NotificationType", js.undefined)
  }
}
