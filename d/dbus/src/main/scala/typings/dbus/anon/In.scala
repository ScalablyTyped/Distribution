package typings.dbus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  var in: String
  var out: String
}

object In {
  @scala.inline
  def apply(in: String, out: String): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
}

