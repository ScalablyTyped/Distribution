package typings.bugsnagJs.anon

import typings.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorClass extends _NotifiableError {
  var errorClass: String = js.native
  var errorMessage: String = js.native
}

object ErrorClass {
  @scala.inline
  def apply(errorClass: String, errorMessage: String): ErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorClass]
  }
  @scala.inline
  implicit class ErrorClassOps[Self <: ErrorClass] (val x: Self) extends AnyVal {
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
    def setErrorClass(value: String): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
  }
  
}

