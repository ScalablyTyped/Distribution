package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFacesResponse extends StObject {
  
  /**
    * An array of faces that matched the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the face that was searched for matches in a collection.
    */
  var SearchedFaceId: js.UndefOr[FaceId] = js.undefined
}
object SearchFacesResponse {
  
  @scala.inline
  def apply(): SearchFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesResponse]
  }
  
  @scala.inline
  implicit class SearchFacesResponseMutableBuilder[Self <: SearchFacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceMatches(value: FaceMatchList): Self = StObject.set(x, "FaceMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchesUndefined: Self = StObject.set(x, "FaceMatches", js.undefined)
    
    @scala.inline
    def setFaceMatchesVarargs(value: FaceMatch*): Self = StObject.set(x, "FaceMatches", js.Array(value :_*))
    
    @scala.inline
    def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
    
    @scala.inline
    def setSearchedFaceId(value: FaceId): Self = StObject.set(x, "SearchedFaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchedFaceIdUndefined: Self = StObject.set(x, "SearchedFaceId", js.undefined)
  }
}
