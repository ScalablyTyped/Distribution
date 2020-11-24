package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IError extends js.Object {
  
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
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("HasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateArgs(value: IErrorTranslateArgs): Self = this.set("TranslateArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateArgs: Self = this.set("TranslateArgs", js.undefined)
  }
}
