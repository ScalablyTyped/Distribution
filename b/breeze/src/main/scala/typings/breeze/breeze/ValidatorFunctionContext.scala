package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorFunctionContext extends StObject {
  
  var displayName: String
  
  var message: js.UndefOr[String] = js.undefined
  
  var messageTemplate: String
  
  var validatorName: String
  
  var value: js.Any
}
object ValidatorFunctionContext {
  
  @scala.inline
  def apply(displayName: String, messageTemplate: String, validatorName: String, value: js.Any): ValidatorFunctionContext = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], messageTemplate = messageTemplate.asInstanceOf[js.Any], validatorName = validatorName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorFunctionContext]
  }
  
  @scala.inline
  implicit class ValidatorFunctionContextMutableBuilder[Self <: ValidatorFunctionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setValidatorName(value: String): Self = StObject.set(x, "validatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
