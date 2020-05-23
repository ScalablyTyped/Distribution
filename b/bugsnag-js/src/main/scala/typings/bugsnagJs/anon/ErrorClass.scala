package typings.bugsnagJs.anon

import typings.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorClass extends _NotifiableError {
  var errorClass: String
  var errorMessage: String
}

object ErrorClass {
  @scala.inline
  def apply(errorClass: String, errorMessage: String): ErrorClass = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorClass]
  }
}

