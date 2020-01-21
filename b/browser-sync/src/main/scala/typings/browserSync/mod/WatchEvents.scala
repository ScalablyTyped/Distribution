package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserSync.browserSyncStrings.add
  - typings.browserSync.browserSyncStrings.change
  - typings.browserSync.browserSyncStrings.unlink
  - typings.browserSync.browserSyncStrings.addDir
  - typings.browserSync.browserSyncStrings.unlinkDir
*/
trait WatchEvents extends js.Object

object WatchEvents {
  @scala.inline
  def add: typings.browserSync.browserSyncStrings.add = this.cast("add")
  @scala.inline
  def addDir: typings.browserSync.browserSyncStrings.addDir = this.cast("addDir")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.browserSync.browserSyncStrings.change = this.cast("change")
  @scala.inline
  def unlink: typings.browserSync.browserSyncStrings.unlink = this.cast("unlink")
  @scala.inline
  def unlinkDir: typings.browserSync.browserSyncStrings.unlinkDir = this.cast("unlinkDir")
}

