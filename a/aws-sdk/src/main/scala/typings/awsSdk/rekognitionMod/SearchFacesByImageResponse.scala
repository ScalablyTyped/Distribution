package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFacesByImageResponse extends StObject {
  
  /**
    * An array of faces that match the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The bounding box around the face in the input image that Amazon Rekognition used for the search.
    */
  var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.undefined
  
  /**
    * The level of confidence that the searchedFaceBoundingBox, contains a face.
    */
  var SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
}
object SearchFacesByImageResponse {
  
  @scala.inline
  def apply(): SearchFacesByImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFacesByImageResponse]
  }
  
  @scala.inline
  implicit class SearchFacesByImageResponseMutableBuilder[Self <: SearchFacesByImageResponse] (val x: Self) extends AnyVal {
    
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
    def setSearchedFaceBoundingBox(value: BoundingBox): Self = StObject.set(x, "SearchedFaceBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchedFaceBoundingBoxUndefined: Self = StObject.set(x, "SearchedFaceBoundingBox", js.undefined)
    
    @scala.inline
    def setSearchedFaceConfidence(value: Percent): Self = StObject.set(x, "SearchedFaceConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchedFaceConfidenceUndefined: Self = StObject.set(x, "SearchedFaceConfidence", js.undefined)
  }
}
