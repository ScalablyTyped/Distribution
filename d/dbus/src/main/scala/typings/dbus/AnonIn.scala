package typings.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  var in: String
  var out: String
}

object AnonIn {
  @scala.inline
  def apply(in: String, out: String): AnonIn = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIn]
  }
}

