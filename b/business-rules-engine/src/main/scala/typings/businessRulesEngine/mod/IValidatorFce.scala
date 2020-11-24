package typings.businessRulesEngine.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidatorFce extends js.Object {
  
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
  implicit class IValidatorFceOps[Self <: IValidatorFce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncValidationFce(value: /* args */ IError => Promise[js.Any]): Self = this.set("AsyncValidationFce", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAsyncValidationFce: Self = this.set("AsyncValidationFce", js.undefined)
    
    @scala.inline
    def setValidationFce(value: /* args */ IError => Unit): Self = this.set("ValidationFce", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidationFce: Self = this.set("ValidationFce", js.undefined)
  }
}
