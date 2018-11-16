package typings
package debugLib.debugMod.debugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDebug extends js.Object {
  var formatters: IFormatters = js.native
  var names: js.Array[stdLib.RegExp] = js.native
  var skips: js.Array[stdLib.RegExp] = js.native
  def apply(namespace: java.lang.String): IDebugger = js.native
  def coerce(`val`: js.Any): js.Any = js.native
  def disable(): scala.Unit = js.native
  def enable(namespaces: java.lang.String): scala.Unit = js.native
  def enabled(namespaces: java.lang.String): scala.Boolean = js.native
}

