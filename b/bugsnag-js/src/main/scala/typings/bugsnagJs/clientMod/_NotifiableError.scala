package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotifiableError extends js.Object

object _NotifiableError {
  @scala.inline
  def AnonErrorClass(errorClass: String, errorMessage: String): _NotifiableError = {
    val __obj = js.Dynamic.literal(errorClass = errorClass.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NotifiableError]
  }
  @scala.inline
  def AnonMessage(message: String, name: String): _NotifiableError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NotifiableError]
  }
}

