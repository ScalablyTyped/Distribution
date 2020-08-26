package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IValidationFailureOps[Self <: IValidationFailure] (val x: Self) extends AnyVal {
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
    def setError(value: IError): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAsync(value: Boolean): Self = this.set("IsAsync", value.asInstanceOf[js.Any])
  }
  
}

