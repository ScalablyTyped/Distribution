package typings.awsSdkClientS3Node.typesDeletedObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletedObject extends js.Object {
  
  /**
    * _DeleteMarker shape
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.native
  
  /**
    * _DeleteMarkerVersionId shape
    */
  var DeleteMarkerVersionId: js.UndefOr[String] = js.native
  
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.native
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
    def setDeleteMarker(value: Boolean): Self = this.set("DeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarker: Self = this.set("DeleteMarker", js.undefined)
    
    @scala.inline
    def setDeleteMarkerVersionId(value: String): Self = this.set("DeleteMarkerVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteMarkerVersionId: Self = this.set("DeleteMarkerVersionId", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
}
