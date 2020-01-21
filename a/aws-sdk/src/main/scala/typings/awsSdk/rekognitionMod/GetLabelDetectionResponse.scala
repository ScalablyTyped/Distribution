package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLabelDetectionResponse extends js.Object {
  /**
    * The current status of the label detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * Version number of the label detection model that was used to detect labels.
    */
  var LabelModelVersion: js.UndefOr[String] = js.native
  /**
    * An array of labels detected in the video. Each element contains the detected label and the time, in milliseconds from the start of the video, that the label was detected. 
    */
  var Labels: js.UndefOr[LabelDetections] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of labels.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetLabelDetectionResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    LabelModelVersion: String = null,
    Labels: LabelDetections = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (LabelModelVersion != null) __obj.updateDynamic("LabelModelVersion")(LabelModelVersion.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabelDetectionResponse]
  }
}

