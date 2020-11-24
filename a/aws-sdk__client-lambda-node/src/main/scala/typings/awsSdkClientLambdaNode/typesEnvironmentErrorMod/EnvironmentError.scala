package typings.awsSdkClientLambdaNode.typesEnvironmentErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentError extends js.Object {
  
  /**
    * <p>The error code.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.native
}
object EnvironmentError {
  
  @scala.inline
  def apply(): EnvironmentError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentError]
  }
  
  @scala.inline
  implicit class EnvironmentErrorOps[Self <: EnvironmentError] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
