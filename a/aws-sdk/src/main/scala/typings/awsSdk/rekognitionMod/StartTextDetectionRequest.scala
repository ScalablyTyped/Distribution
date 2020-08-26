package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartTextDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentaly started more than once.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * Optional parameters that let you set criteria the text must meet to be included in your response.
    */
  var Filters: js.UndefOr[StartTextDetectionFilters] = js.native
  /**
    * An identifier returned in the completion status published by your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.native
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.native
  var Video: typings.awsSdk.rekognitionMod.Video = js.native
}

object StartTextDetectionRequest {
  @scala.inline
  def apply(Video: Video): StartTextDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextDetectionRequest]
  }
  @scala.inline
  implicit class StartTextDetectionRequestOps[Self <: StartTextDetectionRequest] (val x: Self) extends AnyVal {
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
    def setVideo(value: Video): Self = this.set("Video", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setFilters(value: StartTextDetectionFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setJobTag(value: JobTag): Self = this.set("JobTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTag: Self = this.set("JobTag", js.undefined)
    @scala.inline
    def setNotificationChannel(value: NotificationChannel): Self = this.set("NotificationChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationChannel: Self = this.set("NotificationChannel", js.undefined)
  }
  
}

