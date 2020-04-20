package typings.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  def error(arg: js.Any*): String
  def log(arg: js.Any*): String
}

object AnonError {
  @scala.inline
  def apply(error: /* repeated */ js.Any => String, log: /* repeated */ js.Any => String): AnonError = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[AnonError]
  }
}

