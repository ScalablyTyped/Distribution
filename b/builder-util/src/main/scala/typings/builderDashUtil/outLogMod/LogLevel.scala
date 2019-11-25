package typings.builderDashUtil.outLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.builderDashUtil.builderDashUtilStrings.info
  - typings.builderDashUtil.builderDashUtilStrings.warn
  - typings.builderDashUtil.builderDashUtilStrings.debug
  - typings.builderDashUtil.builderDashUtilStrings.notice
  - typings.builderDashUtil.builderDashUtilStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.builderDashUtil.builderDashUtilStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.builderDashUtil.builderDashUtilStrings.error = this.cast("error")
  @scala.inline
  def info: typings.builderDashUtil.builderDashUtilStrings.info = this.cast("info")
  @scala.inline
  def notice: typings.builderDashUtil.builderDashUtilStrings.notice = this.cast("notice")
  @scala.inline
  def warn: typings.builderDashUtil.builderDashUtilStrings.warn = this.cast("warn")
}

