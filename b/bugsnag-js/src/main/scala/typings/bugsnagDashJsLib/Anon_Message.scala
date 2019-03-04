package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message
  extends bugsnagDashJsLib.typesClientMod._NotifiableError {
  var message: java.lang.String
  var name: java.lang.String
}

object Anon_Message {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message, name = name)
  
    __obj.asInstanceOf[Anon_Message]
  }
}

