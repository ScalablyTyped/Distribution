package typings.cathoQuantum.anon

import typings.cathoQuantum.inputMod.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var error: String = js.native
  var validate: Validate = js.native
}

object Error {
  @scala.inline
  def apply(error: String, validate: Validate): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): Self = this.set("validate", js.Any.fromFunction2(value))
    @scala.inline
    def setValidateFunction1(value: (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) => String): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(value: Validate): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
  
}

