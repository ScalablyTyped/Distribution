package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  /**
    * A description of the validation error.
    */
  var errors: js.UndefOr[validationMessages] = js.undefined
  
  /**
    * The identifier of the object that contains the validation error.
    */
  var id: js.UndefOr[typings.awsSdk.datapipelineMod.id] = js.undefined
}
object ValidationError {
  
  inline def apply(): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationError]
  }
  
  extension [Self <: ValidationError](x: Self) {
    
    inline def setErrors(value: validationMessages): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: validationMessage*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
