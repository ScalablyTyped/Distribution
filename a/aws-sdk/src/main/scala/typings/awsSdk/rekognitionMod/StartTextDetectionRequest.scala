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
  def apply(
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    Filters: StartTextDetectionFilters = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartTextDetectionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextDetectionRequest]
  }
}

