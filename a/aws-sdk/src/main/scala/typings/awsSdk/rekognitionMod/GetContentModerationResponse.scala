package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContentModerationResponse extends js.Object {
  /**
    * The current status of the unsafe content analysis job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * The detected unsafe content labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.native
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of unsafe content labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}

object GetContentModerationResponse {
  @scala.inline
  def apply(
    JobStatus: VideoJobStatus = null,
    ModerationLabels: ContentModerationDetections = null,
    ModerationModelVersion: String = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadata = null
  ): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (ModerationLabels != null) __obj.updateDynamic("ModerationLabels")(ModerationLabels.asInstanceOf[js.Any])
    if (ModerationModelVersion != null) __obj.updateDynamic("ModerationModelVersion")(ModerationModelVersion.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentModerationResponse]
  }
}

