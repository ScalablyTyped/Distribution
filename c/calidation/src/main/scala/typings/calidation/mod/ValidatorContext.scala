package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorContext[T /* <: js.Object */] extends StObject {
  
  var errors: Errors[T]
  
  var fields: Fields[T]
  
  var isDirty: Boolean
}
object ValidatorContext {
  
  inline def apply[T /* <: js.Object */](errors: Errors[T], fields: Fields[T], isDirty: Boolean): ValidatorContext[T] = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorContext[T]]
  }
  
  extension [Self <: ValidatorContext[?], T /* <: js.Object */](x: Self & ValidatorContext[T]) {
    
    inline def setErrors(value: Errors[T]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields[T]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
  }
}
