package typings.builderUtil.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.builderUtil.builderUtilStrings.info
  - typings.builderUtil.builderUtilStrings.warn
  - typings.builderUtil.builderUtilStrings.debug
  - typings.builderUtil.builderUtilStrings.notice
  - typings.builderUtil.builderUtilStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.builderUtil.builderUtilStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.builderUtil.builderUtilStrings.error = this.cast("error")
  @scala.inline
  def info: typings.builderUtil.builderUtilStrings.info = this.cast("info")
  @scala.inline
  def notice: typings.builderUtil.builderUtilStrings.notice = this.cast("notice")
  @scala.inline
  def warn: typings.builderUtil.builderUtilStrings.warn = this.cast("warn")
}

