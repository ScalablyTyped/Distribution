package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFacesRequest extends StObject {
  
  /**
    * Collection from which to remove the specific faces.
    */
  var CollectionId: typings.awsSdk.rekognitionMod.CollectionId = js.native
  
  /**
    * An array of face IDs to delete.
    */
  var FaceIds: FaceIdList = js.native
}
object DeleteFacesRequest {
  
  @scala.inline
  def apply(CollectionId: CollectionId, FaceIds: FaceIdList): DeleteFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceIds = FaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFacesRequest]
  }
  
  @scala.inline
  implicit class DeleteFacesRequestMutableBuilder[Self <: DeleteFacesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceIds(value: FaceIdList): Self = StObject.set(x, "FaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceIdsVarargs(value: FaceId*): Self = StObject.set(x, "FaceIds", js.Array(value :_*))
  }
}
