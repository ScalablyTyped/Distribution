package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserSync.browserSyncStrings.local
  - typings.browserSync.browserSyncStrings.external
  - typings.browserSync.browserSyncStrings.ui
  - typings.browserSync.browserSyncStrings.`ui-external`
  - typings.browserSync.browserSyncStrings.tunnel
*/
trait OpenOptions extends js.Object

object OpenOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typings.browserSync.browserSyncStrings.external = this.cast("external")
  @scala.inline
  def local: typings.browserSync.browserSyncStrings.local = this.cast("local")
  @scala.inline
  def tunnel: typings.browserSync.browserSyncStrings.tunnel = this.cast("tunnel")
  @scala.inline
  def ui: typings.browserSync.browserSyncStrings.ui = this.cast("ui")
  @scala.inline
  def `ui-external`: typings.browserSync.browserSyncStrings.`ui-external` = this.cast("ui-external")
}

