package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFacesResponse extends js.Object {
  
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
  implicit class DeleteFacesResponseOps[Self <: DeleteFacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeletedFacesVarargs(value: FaceId*): Self = this.set("DeletedFaces", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFaces(value: FaceIdList): Self = this.set("DeletedFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedFaces: Self = this.set("DeletedFaces", js.undefined)
  }
}
