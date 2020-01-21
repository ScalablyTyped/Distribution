package typings.awsSdkTypes.loggerMod

import typings.awsSdkTypes.awsSdkTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkTypes.awsSdkTypesStrings.all
  - typings.awsSdkTypes.awsSdkTypesStrings.log
  - typings.awsSdkTypes.awsSdkTypesStrings.info
  - typings.awsSdkTypes.awsSdkTypesStrings.warn
  - typings.awsSdkTypes.awsSdkTypesStrings.error_
  - typings.awsSdkTypes.awsSdkTypesStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typings.awsSdkTypes.awsSdkTypesStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: error_ = this.cast("error")
  @scala.inline
  def info: typings.awsSdkTypes.awsSdkTypesStrings.info = this.cast("info")
  @scala.inline
  def log: typings.awsSdkTypes.awsSdkTypesStrings.log = this.cast("log")
  @scala.inline
  def off: typings.awsSdkTypes.awsSdkTypesStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.awsSdkTypes.awsSdkTypesStrings.warn = this.cast("warn")
}

