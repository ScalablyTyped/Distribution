package typings.axeCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var id: String
  def callback(args: js.Any*): Unit
}

object AnonArgs {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Unit, id: String): AnonArgs = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

