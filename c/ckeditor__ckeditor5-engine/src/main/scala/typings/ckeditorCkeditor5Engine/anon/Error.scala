package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  def error(arg: js.Any*): String
  def log(arg: js.Any*): String
}

object Error {
  @scala.inline
  def apply(error: /* repeated */ js.Any => String, log: /* repeated */ js.Any => String): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Error]
  }
}

