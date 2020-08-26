package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleValidatorConfig[T /* <: js.Object */] extends js.Object {
  var message: String = js.native
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean] = js.native
}

object SimpleValidatorConfig {
  @scala.inline
  def apply[/* <: js.Object */ T](message: String): SimpleValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig[T]]
  }
  @scala.inline
  implicit class SimpleValidatorConfigOps[Self <: SimpleValidatorConfig[_], /* <: js.Object */ T] (val x: Self with SimpleValidatorConfig[T]) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateIfFunction1(value: /* context */ ValidatorContext[T] => Boolean): Self = this.set("validateIf", js.Any.fromFunction1(value))
    @scala.inline
    def setValidateIf(value: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean): Self = this.set("validateIf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateIf: Self = this.set("validateIf", js.undefined)
  }
  
}

