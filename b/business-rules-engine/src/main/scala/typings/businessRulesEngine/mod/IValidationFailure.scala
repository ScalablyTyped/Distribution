package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidationFailure
  extends StObject
     with IError {
  
  var Error: IError
  
  var IsAsync: Boolean
}
object IValidationFailure {
  
  inline def apply(Error: IError, ErrorMessage: String, HasError: Boolean, IsAsync: Boolean): IValidationFailure = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any], IsAsync = IsAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IValidationFailure] (val x: Self) extends AnyVal {
    
    inline def setError(value: IError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "IsAsync", value.asInstanceOf[js.Any])
  }
}
