package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorFunctionContext extends js.Object {
  
  var displayName: String = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var messageTemplate: String = js.native
  
  var validatorName: String = js.native
  
  var value: js.Any = js.native
}
object ValidatorFunctionContext {
  
  @scala.inline
  def apply(displayName: String, messageTemplate: String, validatorName: String, value: js.Any): ValidatorFunctionContext = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], messageTemplate = messageTemplate.asInstanceOf[js.Any], validatorName = validatorName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorFunctionContext]
  }
  
  @scala.inline
  implicit class ValidatorFunctionContextOps[Self <: ValidatorFunctionContext] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorName(value: String): Self = this.set("validatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
