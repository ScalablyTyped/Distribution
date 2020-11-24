package typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidRequestContentExceptionDetails extends js.Object {
  
  /**
    * <p>The exception type.</p>
    */
  var Type: js.UndefOr[String] = js.native
  
  /**
    * <p>The exception message.</p>
    */
  var message: js.UndefOr[String] = js.native
}
object InvalidRequestContentExceptionDetails {
  
  @scala.inline
  def apply(): InvalidRequestContentExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRequestContentExceptionDetails]
  }
  
  @scala.inline
  implicit class InvalidRequestContentExceptionDetailsOps[Self <: InvalidRequestContentExceptionDetails] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
