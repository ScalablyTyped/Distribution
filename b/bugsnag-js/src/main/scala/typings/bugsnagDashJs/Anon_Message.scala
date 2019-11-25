package typings.bugsnagDashJs

import typings.bugsnagDashJs.typesClientMod._NotifiableError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends _NotifiableError {
  var message: String
  var name: String
}

object Anon_Message {
  @scala.inline
  def apply(message: String, name: String): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}

