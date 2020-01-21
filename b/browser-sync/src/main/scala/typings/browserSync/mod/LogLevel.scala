package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserSync.browserSyncStrings.info
  - typings.browserSync.browserSyncStrings.debug
  - typings.browserSync.browserSyncStrings.warn
  - typings.browserSync.browserSyncStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.browserSync.browserSyncStrings.debug = this.cast("debug")
  @scala.inline
  def info: typings.browserSync.browserSyncStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.browserSync.browserSyncStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typings.browserSync.browserSyncStrings.warn = this.cast("warn")
}

