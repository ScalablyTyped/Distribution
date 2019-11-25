package typings.axeDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var id: String
  def callback(args: js.Any*): Unit
}

object Anon_Args {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Unit, id: String): Anon_Args = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}

