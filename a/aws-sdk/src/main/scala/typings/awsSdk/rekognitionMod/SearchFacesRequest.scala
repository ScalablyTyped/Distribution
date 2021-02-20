package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFacesRequest extends StObject {
  
  /**
    * ID of the collection the face belongs to.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
  
  /**
    * ID of a face to find matches for in the collection.
    */
  var FaceId: typings.awsSdk.rekognitionMod.FaceId = js.native
  
  /**
    * Optional value specifying the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%. 
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.native
  
  /**
    * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
    */
  var MaxFaces: js.UndefOr[typings.awsSdk.rekognitionMod.MaxFaces] = js.native
}
object SearchFacesRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId, FaceId: FaceId): SearchFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceId = FaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesRequest]
  }
  
  @scala.inline
  implicit class SearchFacesRequestMutableBuilder[Self <: SearchFacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceId(value: FaceId): Self = StObject.set(x, "FaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchThreshold(value: Percent): Self = StObject.set(x, "FaceMatchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceMatchThresholdUndefined: Self = StObject.set(x, "FaceMatchThreshold", js.undefined)
    
    @scala.inline
    def setMaxFaces(value: MaxFaces): Self = StObject.set(x, "MaxFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFacesUndefined: Self = StObject.set(x, "MaxFaces", js.undefined)
  }
}
