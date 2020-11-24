package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.uploadMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {delete (): std.Promise<void>, toPlainObject (): contentful-management.contentful-management/dist/typings/entities/upload.UploadProps} & contentful-management.contentful-management/dist/typings/entities/upload.UploadProps */
@js.native
trait deletePromisevoidtoPlainO extends js.Object {
  
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
  
  def toPlainObject(): UploadProps = js.native
}
object deletePromisevoidtoPlainO {
  
  @scala.inline
  def apply(delete: () => js.Promise[Unit], sys: MetaSysProps, toPlainObject: () => UploadProps): deletePromisevoidtoPlainO = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[deletePromisevoidtoPlainO]
  }
  
  @scala.inline
  implicit class deletePromisevoidtoPlainOOps[Self <: deletePromisevoidtoPlainO] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPlainObject(value: () => UploadProps): Self = this.set("toPlainObject", js.Any.fromFunction0(value))
  }
}
