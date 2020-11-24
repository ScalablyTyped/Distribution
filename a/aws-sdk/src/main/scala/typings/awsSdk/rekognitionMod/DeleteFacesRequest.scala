package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFacesRequest extends js.Object {
  
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
  implicit class DeleteFacesRequestOps[Self <: DeleteFacesRequest] (val x: Self) extends AnyVal {
    
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
    def setCollectionId(value: CollectionId): Self = this.set("CollectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceIdsVarargs(value: FaceId*): Self = this.set("FaceIds", js.Array(value :_*))
    
    @scala.inline
    def setFaceIds(value: FaceIdList): Self = this.set("FaceIds", value.asInstanceOf[js.Any])
  }
}
