package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFaceSearchResponse extends StObject {
  
  /**
    * The current status of the face search job.
    */
  var JobStatus: js.UndefOr[VideoJobStatus] = js.undefined
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of search results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of persons, PersonMatch, in the video whose face(s) match the face(s) in an Amazon Rekognition collection. It also includes time information for when persons are matched in the video. You specify the input collection in an initial call to StartFaceSearch. Each Persons element includes a time the person was matched, face match details (FaceMatches) for matching faces in the collection, and person information (Person) for the matched person. 
    */
  var Persons: js.UndefOr[PersonMatches] = js.undefined
  
  /**
    * If the job fails, StatusMessage provides a descriptive error message.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.rekognitionMod.StatusMessage] = js.undefined
  
  /**
    * Information about a video that Amazon Rekognition analyzed. Videometadata is returned in every page of paginated responses from a Amazon Rekognition Video operation. 
    */
  var VideoMetadata: js.UndefOr[typings.awsSdk.rekognitionMod.VideoMetadata] = js.undefined
}
object GetFaceSearchResponse {
  
  inline def apply(): GetFaceSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFaceSearchResponse]
  }
  
  extension [Self <: GetFaceSearchResponse](x: Self) {
    
    inline def setJobStatus(value: VideoJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPersons(value: PersonMatches): Self = StObject.set(x, "Persons", value.asInstanceOf[js.Any])
    
    inline def setPersonsUndefined: Self = StObject.set(x, "Persons", js.undefined)
    
    inline def setPersonsVarargs(value: PersonMatch*): Self = StObject.set(x, "Persons", js.Array(value :_*))
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setVideoMetadata(value: VideoMetadata): Self = StObject.set(x, "VideoMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoMetadataUndefined: Self = StObject.set(x, "VideoMetadata", js.undefined)
  }
}
