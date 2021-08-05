package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.uploadMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofupload extends StObject {
  
  def wrapUpload(http: AxiosInstance, data: UploadProps): deletePromisevoidtoPlainO
}
object Typeofupload {
  
  inline def apply(wrapUpload: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Typeofupload = {
    val __obj = js.Dynamic.literal(wrapUpload = js.Any.fromFunction2(wrapUpload))
    __obj.asInstanceOf[Typeofupload]
  }
  
  extension [Self <: Typeofupload](x: Self) {
    
    inline def setWrapUpload(value: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Self = StObject.set(x, "wrapUpload", js.Any.fromFunction2(value))
  }
}
