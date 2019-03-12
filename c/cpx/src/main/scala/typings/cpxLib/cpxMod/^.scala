package typings
package cpxLib.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cpx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def copy(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def copy(source: java.lang.String, dest: java.lang.String, options: AsyncOptions): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    dest: java.lang.String,
    options: AsyncOptions,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def copySync(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def copySync(source: java.lang.String, dest: java.lang.String, options: SyncOptions): scala.Unit = js.native
  def watch(source: java.lang.String, dest: java.lang.String): Watcher = js.native
  def watch(source: java.lang.String, dest: java.lang.String, options: WatchOptions): Watcher = js.native
}

