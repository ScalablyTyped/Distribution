package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletedObject extends js.Object {
  
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker. In a simple DELETE, this header indicates whether (true) or not (false) a delete marker was created.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  
  /**
    * The version ID of the delete marker created as a result of the DELETE operation. If you delete a specific object version, the value returned by this header is the version ID of the object version deleted.
    */
  var DeleteMarkerVersionId: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarkerVersionId] = js.native
  
  /**
    * The name of the deleted object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  
  /**
    * The version ID of the deleted object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object DeletedObject {
  
  @scala.inline
  def apply(): DeletedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletedObject]
  }
  
  @scala.inline
  implicit class DeletedObjectOps[Self <: DeletedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeleteMarker(value: DeleteMarker): Self = this.set("DeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarker: Self = this.set("DeleteMarker", js.undefined)
    
    @scala.inline
    def setDeleteMarkerVersionId(value: DeleteMarkerVersionId): Self = this.set("DeleteMarkerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkerVersionId: Self = this.set("DeleteMarkerVersionId", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
