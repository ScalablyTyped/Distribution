package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError extends StObject {
  
  var context: js.Any = js.native
  
  var errorMessage: String = js.native
  
  def getKey(validator: Validator, property: String): String = js.native
  
  var key: String = js.native
  
  var property: IProperty = js.native
  
  var propertyName: String = js.native
  
  var validator: Validator = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(
    context: js.Any,
    errorMessage: String,
    getKey: (Validator, String) => String,
    key: String,
    property: IProperty,
    propertyName: String,
    validator: Validator
  ): ValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], getKey = js.Any.fromFunction2(getKey), key = key.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKey(value: (Validator, String) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: IProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidator(value: Validator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
