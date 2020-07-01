package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSegmentDetectionRequest extends js.Object {
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartSegmentDetection requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.rekognitionMod.ClientRequestToken] = js.native
  /**
    * Filters for technical cue or shot detection.
    */
  var Filters: js.UndefOr[StartSegmentDetectionFilters] = js.native
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typings.awsSdk.rekognitionMod.JobTag] = js.native
  /**
    * The ARN of the Amazon SNS topic to which you want Amazon Rekognition Video to publish the completion status of the segment detection operation.
    */
  var NotificationChannel: js.UndefOr[typings.awsSdk.rekognitionMod.NotificationChannel] = js.native
  /**
    * An array of segment types to detect in the video. Valid values are TECHNICAL_CUE and SHOT.
    */
  var SegmentTypes: typings.awsSdk.rekognitionMod.SegmentTypes = js.native
  var Video: typings.awsSdk.rekognitionMod.Video = js.native
}

object StartSegmentDetectionRequest {
  @scala.inline
  def apply(
    SegmentTypes: SegmentTypes,
    Video: Video,
    ClientRequestToken: ClientRequestToken = null,
    Filters: StartSegmentDetectionFilters = null,
    JobTag: JobTag = null,
    NotificationChannel: NotificationChannel = null
  ): StartSegmentDetectionRequest = {
    val __obj = js.Dynamic.literal(SegmentTypes = SegmentTypes.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (JobTag != null) __obj.updateDynamic("JobTag")(JobTag.asInstanceOf[js.Any])
    if (NotificationChannel != null) __obj.updateDynamic("NotificationChannel")(NotificationChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSegmentDetectionRequest]
  }
}

