package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.uploadMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofupload extends js.Object {
  
  def wrapUpload(http: AxiosInstance, data: UploadProps): deletePromisevoidtoPlainO = js.native
}
object Typeofupload {
  
  @scala.inline
  def apply(wrapUpload: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Typeofupload = {
    val __obj = js.Dynamic.literal(wrapUpload = js.Any.fromFunction2(wrapUpload))
    __obj.asInstanceOf[Typeofupload]
  }
  
  @scala.inline
  implicit class TypeofuploadOps[Self <: Typeofupload] (val x: Self) extends AnyVal {
    
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
    def setWrapUpload(value: (AxiosInstance, UploadProps) => deletePromisevoidtoPlainO): Self = this.set("wrapUpload", js.Any.fromFunction2(value))
  }
}
