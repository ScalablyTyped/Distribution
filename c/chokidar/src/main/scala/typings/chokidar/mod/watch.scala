package typings.chokidar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chokidar", "watch")
@js.native
object watch extends js.Object {
  def apply(paths: String): FSWatcher = js.native
  def apply(paths: String, options: WatchOptions): FSWatcher = js.native
  def apply(paths: js.Array[String]): FSWatcher = js.native
  def apply(paths: js.Array[String], options: WatchOptions): FSWatcher = js.native
}

