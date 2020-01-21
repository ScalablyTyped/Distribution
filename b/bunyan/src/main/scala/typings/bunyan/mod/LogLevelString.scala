package typings.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bunyan.bunyanStrings.trace
  - typings.bunyan.bunyanStrings.debug
  - typings.bunyan.bunyanStrings.info
  - typings.bunyan.bunyanStrings.warn
  - typings.bunyan.bunyanStrings.error
  - typings.bunyan.bunyanStrings.fatal
*/
trait LogLevelString extends js.Object

object LogLevelString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.bunyan.bunyanStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.bunyan.bunyanStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.bunyan.bunyanStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.bunyan.bunyanStrings.info = this.cast("info")
  @scala.inline
  def trace: typings.bunyan.bunyanStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.bunyan.bunyanStrings.warn = this.cast("warn")
}

