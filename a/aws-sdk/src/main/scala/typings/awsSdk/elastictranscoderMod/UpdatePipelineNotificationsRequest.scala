package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineNotificationsRequest extends js.Object {
  /**
    * The identifier of the pipeline for which you want to change notification settings.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
  /**
    * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that Amazon SNS returned when you created the topic.    Complete: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.    Warning: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.    Error: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.  
    */
  var Notifications: typings.awsSdk.elastictranscoderMod.Notifications = js.native
}

object UpdatePipelineNotificationsRequest {
  @scala.inline
  def apply(Id: Id, Notifications: Notifications): UpdatePipelineNotificationsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Notifications = Notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineNotificationsRequest]
  }
  @scala.inline
  implicit class UpdatePipelineNotificationsRequestOps[Self <: UpdatePipelineNotificationsRequest] (val x: Self) extends AnyVal {
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
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifications(value: Notifications): Self = this.set("Notifications", value.asInstanceOf[js.Any])
  }
  
}

