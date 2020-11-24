package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileUploadURLResponse extends js.Object {
  
  /**
    *  A temporary URL for the file that the Worker uploaded for the answer. 
    */
  var FileUploadURL: js.UndefOr[String] = js.native
}
object GetFileUploadURLResponse {
  
  @scala.inline
  def apply(): GetFileUploadURLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileUploadURLResponse]
  }
  
  @scala.inline
  implicit class GetFileUploadURLResponseOps[Self <: GetFileUploadURLResponse] (val x: Self) extends AnyVal {
    
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
    def setFileUploadURL(value: String): Self = this.set("FileUploadURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUploadURL: Self = this.set("FileUploadURL", js.undefined)
  }
}
