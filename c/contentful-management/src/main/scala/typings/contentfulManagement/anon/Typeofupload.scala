package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.uploadMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofupload extends StObject {
  
  def wrapUpload(http: AxiosInstance, data: UploadProps): deletePromisevoidtoPlainO = js.native
}
object Typeofupload {
  
  @scala.inline
  def apply(wrapUpload: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Typeofupload = {
    val __obj = js.Dynamic.literal(wrapUpload = js.Any.fromFunction2(wrapUpload))
    __obj.asInstanceOf[Typeofupload]
  }
  
  @scala.inline
  implicit class TypeofuploadMutableBuilder[Self <: Typeofupload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapUpload(value: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Self = StObject.set(x, "wrapUpload", js.Any.fromFunction2(value))
  }
}
