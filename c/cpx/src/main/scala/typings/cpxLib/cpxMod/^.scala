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
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def copy(source: java.lang.String, dest: java.lang.String, options: cpxLib.cpxMod.AsyncOptions): scala.Unit = js.native
  def copy(
    source: java.lang.String,
    dest: java.lang.String,
    options: cpxLib.cpxMod.AsyncOptions,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def copySync(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def copySync(source: java.lang.String, dest: java.lang.String, options: cpxLib.cpxMod.SyncOptions): scala.Unit = js.native
  def watch(source: java.lang.String, dest: java.lang.String): cpxLib.cpxMod.Watcher = js.native
  def watch(source: java.lang.String, dest: java.lang.String, options: cpxLib.cpxMod.WatchOptions): cpxLib.cpxMod.Watcher = js.native
}

