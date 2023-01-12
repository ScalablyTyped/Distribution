package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidatorFce extends StObject {
  
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.undefined
  
  var Name: String
  
  var ValidationFce: js.UndefOr[IValidate] = js.undefined
}
object IValidatorFce {
  
  inline def apply(Name: String): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorFce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IValidatorFce] (val x: Self) extends AnyVal {
    
    inline def setAsyncValidationFce(value: /* args */ IError => Promise[Any]): Self = StObject.set(x, "AsyncValidationFce", js.Any.fromFunction1(value))
    
    inline def setAsyncValidationFceUndefined: Self = StObject.set(x, "AsyncValidationFce", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValidationFce(value: /* args */ IError => Unit): Self = StObject.set(x, "ValidationFce", js.Any.fromFunction1(value))
    
    inline def setValidationFceUndefined: Self = StObject.set(x, "ValidationFce", js.undefined)
  }
}
