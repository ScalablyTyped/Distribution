package typings.bugsnagJs

import typings.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorClass extends _NotifiableError {
  var errorClass: String
  var errorMessage: String
}

object AnonErrorClass {
  @scala.inline
  def apply(errorClass: String, errorMessage: String): AnonErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorClass]
  }
}

