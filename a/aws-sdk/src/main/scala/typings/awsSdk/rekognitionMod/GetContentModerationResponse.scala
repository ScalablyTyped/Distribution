package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentModerationResponse extends StObject {
  
  /**
    * The current status of the unsafe content analysis job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * The detected unsafe content labels and the time(s) they were detected.
    */
  var ModerationLabels: js.UndefOr[ContentModerationDetections] = js.undefined
  
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of unsafe content labels. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from GetContentModeration. 
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.undefined
}
object GetContentModerationResponse {
  
  inline def apply(): GetContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationResponse]
  }
  
  extension [Self <: GetContentModerationResponse](x: Self) {
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setModerationLabels(value: ContentModerationDetections): Self = StObject.set(x, "ModerationLabels", value.asInstanceOf[js.Any])
    
    inline def setModerationLabelsUndefined: Self = StObject.set(x, "ModerationLabels", js.undefined)
    
    inline def setModerationLabelsVarargs(value: ContentModerationDetection*): Self = StObject.set(x, "ModerationLabels", js.Array(value :_*))
    
    inline def setModerationModelVersion(value: String): Self = StObject.set(x, "ModerationModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModerationModelVersionUndefined: Self = StObject.set(x, "ModerationModelVersion", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
