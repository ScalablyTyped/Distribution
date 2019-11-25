package typings.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserDashSync.browserDashSyncStrings.info
  - typings.browserDashSync.browserDashSyncStrings.debug
  - typings.browserDashSync.browserDashSyncStrings.warn
  - typings.browserDashSync.browserDashSyncStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.browserDashSync.browserDashSyncStrings.debug = this.cast("debug")
  @scala.inline
  def info: typings.browserDashSync.browserDashSyncStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.browserDashSync.browserDashSyncStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typings.browserDashSync.browserDashSyncStrings.warn = this.cast("warn")
}

