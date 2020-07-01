package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentDetectionResponse extends js.Object {
  /**
    * An array of objects. There can be multiple audio streams. Each AudioMetadata object contains metadata for a single audio stream. Audio information in an AudioMetadata objects includes the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var AudioMetadata: js.UndefOr[AudioMetadataList] = js.native
  /**
    * Current status of the segment detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  /**
    * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of segments detected in a video.
    */
  var Segments: js.UndefOr[SegmentDetections] = js.native
  /**
    * An array containing the segment types requested in the call to StartSegmentDetection. 
    */
  var SelectedSegmentTypes: js.UndefOr[SegmentTypesInfo] = js.native
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  /**
    * Currently, Amazon Rekognition Video returns a single object in the VideoMetadata array. The object contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The VideoMetadata object includes the video codec, video format and other information. Video metadata is returned in each page of information returned by GetSegmentDetection.
    */
  var VideoMetadata: js.UndefOr[VideoMetadataList] = js.native
}

object GetSegmentDetectionResponse {
  @scala.inline
  def apply(
    AudioMetadata: AudioMetadataList = null,
    JobStatus: VideoJobStatus = null,
    NextToken: PaginationToken = null,
    Segments: SegmentDetections = null,
    SelectedSegmentTypes: SegmentTypesInfo = null,
    StatusMessage: StatusMessage = null,
    VideoMetadata: VideoMetadataList = null
  ): GetSegmentDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (AudioMetadata != null) __obj.updateDynamic("AudioMetadata")(AudioMetadata.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    if (SelectedSegmentTypes != null) __obj.updateDynamic("SelectedSegmentTypes")(SelectedSegmentTypes.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (VideoMetadata != null) __obj.updateDynamic("VideoMetadata")(VideoMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentDetectionResponse]
  }
}

