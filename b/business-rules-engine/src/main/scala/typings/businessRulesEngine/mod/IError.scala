package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IError extends StObject {
  
  var ErrorMessage: String = js.native
  
  var HasError: Boolean = js.native
  
  var TranslateArgs: js.UndefOr[IErrorTranslateArgs] = js.native
}
object IError {
  
  @scala.inline
  def apply(ErrorMessage: String, HasError: Boolean): IError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasError(value: Boolean): Self = StObject.set(x, "HasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateArgs(value: IErrorTranslateArgs): Self = StObject.set(x, "TranslateArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateArgsUndefined: Self = StObject.set(x, "TranslateArgs", js.undefined)
  }
}
