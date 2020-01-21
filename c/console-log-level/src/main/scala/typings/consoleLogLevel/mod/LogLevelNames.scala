package typings.consoleLogLevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.consoleLogLevel.consoleLogLevelStrings.trace
  - typings.consoleLogLevel.consoleLogLevelStrings.debug
  - typings.consoleLogLevel.consoleLogLevelStrings.info
  - typings.consoleLogLevel.consoleLogLevelStrings.warn
  - typings.consoleLogLevel.consoleLogLevelStrings.error
  - typings.consoleLogLevel.consoleLogLevelStrings.fatal
*/
trait LogLevelNames extends js.Object

object LogLevelNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.consoleLogLevel.consoleLogLevelStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.consoleLogLevel.consoleLogLevelStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.consoleLogLevel.consoleLogLevelStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.consoleLogLevel.consoleLogLevelStrings.info = this.cast("info")
  @scala.inline
  def trace: typings.consoleLogLevel.consoleLogLevelStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.consoleLogLevel.consoleLogLevelStrings.warn = this.cast("warn")
}

