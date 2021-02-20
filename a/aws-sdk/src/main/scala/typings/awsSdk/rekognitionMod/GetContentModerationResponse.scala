package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContentModerationResponse extends StObject {
  
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
  def apply(): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationResponse]
  }
  
  @scala.inline
  implicit class GetContentModerationResponseMutableBuilder[Self <: GetContentModerationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setModerationLabels(value: ContentModerationDetections): Self = StObject.set(x, "ModerationLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationLabelsUndefined: Self = StObject.set(x, "ModerationLabels", js.undefined)
    
    @scala.inline
    def setModerationLabelsVarargs(value: ContentModerationDetection*): Self = StObject.set(x, "ModerationLabels", js.Array(value :_*))
    
    @scala.inline
    def setModerationModelVersion(value: String): Self = StObject.set(x, "ModerationModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationModelVersionUndefined: Self = StObject.set(x, "ModerationModelVersion", js.undefined)
    
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
