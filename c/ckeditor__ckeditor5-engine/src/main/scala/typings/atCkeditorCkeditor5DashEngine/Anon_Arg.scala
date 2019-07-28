package typings.atCkeditorCkeditor5DashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg extends js.Object {
  def error(arg: js.Any*): String
  def log(arg: js.Any*): String
}

object Anon_Arg {
  @scala.inline
  def apply(error: /* repeated */ js.Any => String, log: /* repeated */ js.Any => String): Anon_Arg = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Anon_Arg]
  }
}

