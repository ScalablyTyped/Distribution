package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFacesResponse extends StObject {
  
  /**
    * An array of strings (face IDs) of the faces that were deleted.
    */
  var DeletedFaces: js.UndefOr[FaceIdList] = js.undefined
}
object DeleteFacesResponse {
  
  inline def apply(): DeleteFacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFacesResponse]
  }
  
  extension [Self <: DeleteFacesResponse](x: Self) {
    
    inline def setDeletedFaces(value: FaceIdList): Self = StObject.set(x, "DeletedFaces", value.asInstanceOf[js.Any])
    
    inline def setDeletedFacesUndefined: Self = StObject.set(x, "DeletedFaces", js.undefined)
    
    inline def setDeletedFacesVarargs(value: FaceId*): Self = StObject.set(x, "DeletedFaces", js.Array(value :_*))
  }
}
