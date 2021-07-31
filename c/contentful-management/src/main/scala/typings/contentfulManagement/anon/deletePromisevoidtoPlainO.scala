package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.uploadMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {delete (): std.Promise<void>, toPlainObject (): contentful-management.contentful-management/dist/typings/entities/upload.UploadProps} & contentful-management.contentful-management/dist/typings/entities/upload.UploadProps */
trait deletePromisevoidtoPlainO extends StObject {
  
  def delete(): js.Promise[Unit]
  
  /**
    * System metadata
    */
  var sys: MetaSysProps
  
  def toPlainObject(): UploadProps
}
object deletePromisevoidtoPlainO {
  
  @scala.inline
  def apply(delete: () => js.Promise[Unit], sys: MetaSysProps, toPlainObject: () => UploadProps): deletePromisevoidtoPlainO = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[deletePromisevoidtoPlainO]
  }
  
  @scala.inline
  implicit class deletePromisevoidtoPlainOMutableBuilder[Self <: deletePromisevoidtoPlainO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPlainObject(value: () => UploadProps): Self = StObject.set(x, "toPlainObject", js.Any.fromFunction0(value))
  }
}
