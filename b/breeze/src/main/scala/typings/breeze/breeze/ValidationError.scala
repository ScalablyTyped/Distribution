package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  var context: Any
  
  var errorMessage: String
  
  def getKey(validator: Validator, property: String): String
  
  var key: String
  
  var property: IProperty
  
  var propertyName: String
  
  var validator: Validator
}
object ValidationError {
  
  inline def apply(
    context: Any,
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
  implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setGetKey(value: (Validator, String) => String): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: IProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: Validator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
  }
}
