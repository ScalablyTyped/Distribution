package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFacesResponse extends StObject {
  
  /**
    * An array of strings (face IDs) of the faces that were deleted.
    */
  var DeletedFaces: js.UndefOr[FaceIdList] = js.native
}
object DeleteFacesResponse {
  
  @scala.inline
  def apply(): DeleteFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFacesResponse]
  }
  
  @scala.inline
  implicit class DeleteFacesResponseMutableBuilder[Self <: DeleteFacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedFaces(value: FaceIdList): Self = StObject.set(x, "DeletedFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedFacesUndefined: Self = StObject.set(x, "DeletedFaces", js.undefined)
    
    @scala.inline
    def setDeletedFacesVarargs(value: FaceId*): Self = StObject.set(x, "DeletedFaces", js.Array(value :_*))
  }
}
