package typings.bugsnagJs.anon

import typings.bugsnagJs.clientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends _NotifiableError {
  var message: String
  var name: String
}

object Message {
  @scala.inline
  def apply(message: String, name: String): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

