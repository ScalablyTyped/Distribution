package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidatorFce extends StObject {
  
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.native
  
  var Name: String = js.native
  
  var ValidationFce: js.UndefOr[IValidate] = js.native
}
object IValidatorFce {
  
  @scala.inline
  def apply(Name: String): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorFce]
  }
  
  @scala.inline
  implicit class IValidatorFceMutableBuilder[Self <: IValidatorFce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncValidationFce(value: /* args */ IError => Promise[js.Any]): Self = StObject.set(x, "AsyncValidationFce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsyncValidationFceUndefined: Self = StObject.set(x, "AsyncValidationFce", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationFce(value: /* args */ IError => Unit): Self = StObject.set(x, "ValidationFce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidationFceUndefined: Self = StObject.set(x, "ValidationFce", js.undefined)
  }
}
