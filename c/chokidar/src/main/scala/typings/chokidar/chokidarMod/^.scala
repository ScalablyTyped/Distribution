package typings.chokidar.chokidarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chokidar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def watch(paths: String): FSWatcher = js.native
  def watch(paths: String, options: WatchOptions): FSWatcher = js.native
  def watch(paths: js.Array[String]): FSWatcher = js.native
  def watch(paths: js.Array[String], options: WatchOptions): FSWatcher = js.native
}

