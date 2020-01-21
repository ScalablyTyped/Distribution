package typings.bugsnagJs

import typings.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends _NotifiableError {
  var message: String
  var name: String
}

object AnonMessage {
  @scala.inline
  def apply(message: String, name: String): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

