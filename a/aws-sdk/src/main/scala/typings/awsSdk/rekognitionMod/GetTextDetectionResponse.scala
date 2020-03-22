package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTextDetectionResponse extends js.Object {
  /**
    * Current status of the text detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  var TextDetections: js.UndefOr[TextDetectionResults] = js.native
  /**
    * Version number of the text detection model that was used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.native
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetTextDetectionResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    TextDetections: TextDetectionResults = null,
    TextModelVersion: String = null,
    VideoMetadata: VideoMetadata = null
  ): GetTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (TextDetections != null) __obj.updateDynamic("TextDetections")(TextDetections.asInstanceOf[js.Any])
    if (TextModelVersion != null) __obj.updateDynamic("TextModelVersion")(TextModelVersion.asInstanceOf[js.Any])
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextDetectionResponse]
  }
}

