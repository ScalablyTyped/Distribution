package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssessmentRunNotification extends js.Object {
  
  /**
    * The date of the notification.
    */
  var date: Timestamp = js.native
  
  /**
    * The Boolean value that specifies whether the notification represents an error.
    */
  var error: Bool = js.native
  
  /**
    * The event for which a notification is sent.
    */
  var event: InspectorEvent = js.native
  
  /**
    * The message included in the notification.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The status code of the SNS notification.
    */
  var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.native
  
  /**
    * The SNS topic to which the SNS notification is sent.
    */
  var snsTopicArn: js.UndefOr[Arn] = js.native
}
object AssessmentRunNotification {
  
  @scala.inline
  def apply(date: Timestamp, error: Bool, event: InspectorEvent): AssessmentRunNotification = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunNotification]
  }
  
  @scala.inline
  implicit class AssessmentRunNotificationOps[Self <: AssessmentRunNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: Timestamp): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Bool): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: InspectorEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setSnsPublishStatusCode(value: AssessmentRunNotificationSnsStatusCode): Self = this.set("snsPublishStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsPublishStatusCode: Self = this.set("snsPublishStatusCode", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: Arn): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("snsTopicArn", js.undefined)
  }
}
