package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  def error(arg: js.Any*): String = js.native
  def log(arg: js.Any*): String = js.native
}

object Error {
  @scala.inline
  def apply(error: /* repeated */ js.Any => String, log: /* repeated */ js.Any => String): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: /* repeated */ js.Any => String): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => String): Self = this.set("log", js.Any.fromFunction1(value))
  }
  
}

