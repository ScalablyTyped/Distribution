package typings.atAwsDashSdkTypes.buildLoggerMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.all
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.log
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.info
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.warn
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.error_
  - typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: error_ = this.cast("error")
  @scala.inline
  def info: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.info = this.cast("info")
  @scala.inline
  def log: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.log = this.cast("log")
  @scala.inline
  def off: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.warn = this.cast("warn")
}

