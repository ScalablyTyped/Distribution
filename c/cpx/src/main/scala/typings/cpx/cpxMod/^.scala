package typings.cpx.cpxMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def copy(source: String, dest: String): Unit = js.native
  def copy(source: String, dest: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def copy(source: String, dest: String, options: AsyncOptions): Unit = js.native
  def copy(
    source: String,
    dest: String,
    options: AsyncOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
  def copySync(source: String, dest: String): Unit = js.native
  def copySync(source: String, dest: String, options: SyncOptions): Unit = js.native
  def watch(source: String, dest: String): Watcher = js.native
  def watch(source: String, dest: String, options: WatchOptions): Watcher = js.native
}

