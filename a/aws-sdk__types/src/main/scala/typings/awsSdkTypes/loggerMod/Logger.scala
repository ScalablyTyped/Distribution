package typings.awsSdkTypes.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  def error(content: String): Unit = js.native
  def info(content: String): Unit = js.native
  def log(content: String): Unit = js.native
  def warn(content: String): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(error: String => Unit, info: String => Unit, log: String => Unit, warn: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setError(value: String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

