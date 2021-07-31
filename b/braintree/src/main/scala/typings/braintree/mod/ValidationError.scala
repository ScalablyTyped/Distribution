package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  var attribute: String
  
  var code: String
  
  var message: String
}
object ValidationError {
  
  @scala.inline
  def apply(attribute: String, code: String, message: String): ValidationError = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
