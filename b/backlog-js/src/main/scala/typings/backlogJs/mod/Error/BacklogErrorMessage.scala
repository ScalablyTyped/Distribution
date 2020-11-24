package typings.backlogJs.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogErrorMessage extends js.Object {
  
  var code: Double = js.native
  
  var errorInfo: String = js.native
  
  var message: String = js.native
  
  var moreInfo: String = js.native
}
object BacklogErrorMessage {
  
  @scala.inline
  def apply(code: Double, errorInfo: String, message: String, moreInfo: String): BacklogErrorMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorInfo = errorInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogErrorMessage]
  }
  
  @scala.inline
  implicit class BacklogErrorMessageOps[Self <: BacklogErrorMessage] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfo(value: String): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreInfo(value: String): Self = this.set("moreInfo", value.asInstanceOf[js.Any])
  }
}
