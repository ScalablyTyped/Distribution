package typings.cathoQuantum.anon

import typings.cathoQuantum.inputMod.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: String
  
  var validate: Validate
}
object Error {
  
  @scala.inline
  def apply(error: String, validate: Validate): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Validate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateFunction1(value: (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) => String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
