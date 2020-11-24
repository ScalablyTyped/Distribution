package typings.customFunctionsRuntime.CustomFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use this class to handle errors and write custom error messages.
  * [Api set: CustomFunctionsRuntime 1.2]
  */
@js.native
trait Error extends js.Object {
  
  /**
    * The error code returned by your custom function.
    * [Api set: CustomFunctionsRuntime 1.2]
    */
  var code: ErrorCode = js.native
  
  /**
    * Your custom error message, such as "This stock price is unavailable". Custom messages are only available with certain error codes.
    * [Api set: CustomFunctionsRuntime 1.2]
    */
  var message: js.UndefOr[String] = js.native
}
object Error {
  
  @scala.inline
  def apply(code: ErrorCode): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    
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
    def setCode(value: ErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
