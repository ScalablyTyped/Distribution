package typings.awsSdkTypes.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(content: String): Unit
  def info(content: String): Unit
  def log(content: String): Unit
  def warn(content: String): Unit
}

object Logger {
  @scala.inline
  def apply(error: String => Unit, info: String => Unit, log: String => Unit, warn: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
}

