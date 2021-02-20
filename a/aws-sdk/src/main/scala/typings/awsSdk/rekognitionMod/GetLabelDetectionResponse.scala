package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLabelDetectionResponse extends StObject {
  
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
  def apply(): GetLabelDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelDetectionResponse]
  }
  
  @scala.inline
  implicit class GetLabelDetectionResponseMutableBuilder[Self <: GetLabelDetectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setLabelModelVersion(value: String): Self = StObject.set(x, "LabelModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelModelVersionUndefined: Self = StObject.set(x, "LabelModelVersion", js.undefined)
    
    @scala.inline
    def setLabels(value: LabelDetections): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: LabelDetection*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
