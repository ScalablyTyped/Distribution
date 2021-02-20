package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFacesResponse extends StObject {
  
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.native
  
  /**
    * An array of Face objects. 
    */
  var Faces: js.UndefOr[FaceList] = js.native
  
  /**
    * If the response is truncated, Amazon Rekognition returns this token that you can use in the subsequent request to retrieve the next set of faces.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListFacesResponse {
  
  @scala.inline
  def apply(): ListFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFacesResponse]
  }
  
  @scala.inline
  implicit class ListFacesResponseMutableBuilder[Self <: ListFacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceModelVersion(value: String): Self = StObject.set(x, "FaceModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceModelVersionUndefined: Self = StObject.set(x, "FaceModelVersion", js.undefined)
    
    @scala.inline
    def setFaces(value: FaceList): Self = StObject.set(x, "Faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesUndefined: Self = StObject.set(x, "Faces", js.undefined)
    
    @scala.inline
    def setFacesVarargs(value: Face*): Self = StObject.set(x, "Faces", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
