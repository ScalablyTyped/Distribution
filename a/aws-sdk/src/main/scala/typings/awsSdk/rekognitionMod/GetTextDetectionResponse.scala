package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTextDetectionResponse extends StObject {
  
  /**
    * Current status of the text detection job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of text.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.undefined
  
  /**
    * An array of text detected in the video. Each element contains the detected text, the time in milliseconds from the start of the video that the text was detected, and where it was detected on the screen.
    */
  var TextDetections: js.UndefOr[TextDetectionResults] = js.undefined
  
  /**
    * Version number of the text detection model that was used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.undefined
  
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.undefined
}
object GetTextDetectionResponse {
  
  inline def apply(): GetTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTextDetectionResponse]
  }
  
  extension [Self <: GetTextDetectionResponse](x: Self) {
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setTextDetections(value: TextDetectionResults): Self = StObject.set(x, "TextDetections", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionsUndefined: Self = StObject.set(x, "TextDetections", js.undefined)
    
    inline def setTextDetectionsVarargs(value: TextDetectionResult*): Self = StObject.set(x, "TextDetections", js.Array(value*))
    
    inline def setTextModelVersion(value: String): Self = StObject.set(x, "TextModelVersion", value.asInstanceOf[js.Any])
    
    inline def setTextModelVersionUndefined: Self = StObject.set(x, "TextModelVersion", js.undefined)
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
