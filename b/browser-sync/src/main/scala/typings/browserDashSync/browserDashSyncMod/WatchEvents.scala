package typings.browserDashSync.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.browserDashSync.browserDashSyncStrings.add
  - typings.browserDashSync.browserDashSyncStrings.change
  - typings.browserDashSync.browserDashSyncStrings.unlink
  - typings.browserDashSync.browserDashSyncStrings.addDir
  - typings.browserDashSync.browserDashSyncStrings.unlinkDir
*/
trait WatchEvents extends js.Object

object WatchEvents {
  @scala.inline
  def add: typings.browserDashSync.browserDashSyncStrings.add = this.cast("add")
  @scala.inline
  def addDir: typings.browserDashSync.browserDashSyncStrings.addDir = this.cast("addDir")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.browserDashSync.browserDashSyncStrings.change = this.cast("change")
  @scala.inline
  def unlink: typings.browserDashSync.browserDashSyncStrings.unlink = this.cast("unlink")
  @scala.inline
  def unlinkDir: typings.browserDashSync.browserDashSyncStrings.unlinkDir = this.cast("unlinkDir")
}

