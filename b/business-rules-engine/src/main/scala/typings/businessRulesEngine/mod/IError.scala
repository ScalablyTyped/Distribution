package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IError extends StObject {
  
  var ErrorMessage: String
  
  var HasError: Boolean
  
  var TranslateArgs: js.UndefOr[IErrorTranslateArgs] = js.undefined
}
object IError {
  
  inline def apply(ErrorMessage: String, HasError: Boolean): IError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  extension [Self <: IError](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "HasError", value.asInstanceOf[js.Any])
    
    inline def setTranslateArgs(value: IErrorTranslateArgs): Self = StObject.set(x, "TranslateArgs", value.asInstanceOf[js.Any])
    
    inline def setTranslateArgsUndefined: Self = StObject.set(x, "TranslateArgs", js.undefined)
  }
}
