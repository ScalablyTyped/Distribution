package typings.braintreeWeb.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BraintreeError extends js.Object {
  
  /**
    * @description A code that corresponds to specific errors.
    */
  var code: String = js.native
  
  /**
    * @description Additional information about the error, such as an underlying network error response.
    */
  var details: js.Any = js.native
  
  /**
    * @description A short description of the error.
    */
  var message: String = js.native
  
  /**
    * @description The type of error.
    */
  var `type`: BraintreeErrorTypes = js.native
}
object BraintreeError {
  
  @scala.inline
  def apply(code: String, details: js.Any, message: String, `type`: BraintreeErrorTypes): BraintreeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeError]
  }
  
  @scala.inline
  implicit class BraintreeErrorOps[Self <: BraintreeError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: js.Any): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BraintreeErrorTypes): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
