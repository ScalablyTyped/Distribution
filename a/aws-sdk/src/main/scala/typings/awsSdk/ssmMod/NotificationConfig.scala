package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends js.Object {
  
  /**
    * An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var NotificationArn: js.UndefOr[typings.awsSdk.ssmMod.NotificationArn] = js.native
  
  /**
    * The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see Monitoring Systems Manager status changes using Amazon SNS notifications in the AWS Systems Manager User Guide.
    */
  var NotificationEvents: js.UndefOr[NotificationEventList] = js.native
  
  /**
    * Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. 
    */
  var NotificationType: js.UndefOr[typings.awsSdk.ssmMod.NotificationType] = js.native
}
object NotificationConfig {
  
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  @scala.inline
  implicit class NotificationConfigOps[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setNotificationArn(value: NotificationArn): Self = this.set("NotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationArn: Self = this.set("NotificationArn", js.undefined)
    
    @scala.inline
    def setNotificationEventsVarargs(value: NotificationEvent*): Self = this.set("NotificationEvents", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEvents(value: NotificationEventList): Self = this.set("NotificationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEvents: Self = this.set("NotificationEvents", js.undefined)
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("NotificationType", js.undefined)
  }
}
