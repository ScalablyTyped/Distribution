package typings
package debugLib.debugMod.debugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var formatters: Formatters = js.native
  var names: js.Array[stdLib.RegExp] = js.native
  var skips: js.Array[stdLib.RegExp] = js.native
  def apply(namespace: java.lang.String): Debugger = js.native
  def coerce(`val`: js.Any): js.Any = js.native
  def disable(): java.lang.String = js.native
  def enable(namespaces: java.lang.String): scala.Unit = js.native
  def enabled(namespaces: java.lang.String): scala.Boolean = js.native
}

