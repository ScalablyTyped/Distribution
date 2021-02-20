package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPersonTrackingResponse extends StObject {
  
  /**
    * The current status of the person tracking job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.native
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of persons. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of the persons detected in the video and the time(s) their path was tracked throughout the video. An array element will exist for each time a person's path is tracked. 
    */
  var Persons: js.UndefOr[PersonDetections] = js.native
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.native
  
  /**
    * Information about a video that Amazon Rekognition Video analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation.
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.native
}
object GetPersonTrackingResponse {
  
  @scala.inline
  def apply(): GetPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPersonTrackingResponse]
  }
  
  @scala.inline
  implicit class GetPersonTrackingResponseMutableBuilder[Self <: GetPersonTrackingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPersons(value: PersonDetections): Self = StObject.set(x, "Persons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonsUndefined: Self = StObject.set(x, "Persons", js.undefined)
    
    @scala.inline
    def setPersonsVarargs(value: PersonDetection*): Self = StObject.set(x, "Persons", js.Array(value :_*))
    
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
