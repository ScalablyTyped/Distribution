package typings.debug.debugMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var formatters: Formatters = js.native
  var names: js.Array[RegExp] = js.native
  var skips: js.Array[RegExp] = js.native
  def apply(namespace: String): Debugger = js.native
  def coerce(`val`: js.Any): js.Any = js.native
  def disable(): String = js.native
  def enable(namespaces: String): Unit = js.native
  def enabled(namespaces: String): Boolean = js.native
  def log(args: js.Any*): js.Any = js.native
}

