package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidationFailure extends IError {
  
  var Error: IError = js.native
  
  var IsAsync: Boolean = js.native
}
object IValidationFailure {
  
  @scala.inline
  def apply(Error: IError, ErrorMessage: String, HasError: Boolean, IsAsync: Boolean): IValidationFailure = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any], IsAsync = IsAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationFailure]
  }
  
  @scala.inline
  implicit class IValidationFailureMutableBuilder[Self <: IValidationFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: IError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAsync(value: Boolean): Self = StObject.set(x, "IsAsync", value.asInstanceOf[js.Any])
  }
}
