package typings
package debugLib.debugMod.debugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDebugger extends js.Object {
  var enabled: scala.Boolean = js.native
  var log: js.Function = js.native
  var namespace: java.lang.String = js.native
  def apply(formatter: js.Any, args: js.Any*): scala.Unit = js.native
  def extend(namespace: java.lang.String): IDebugger = js.native
  def extend(namespace: java.lang.String, delimiter: java.lang.String): IDebugger = js.native
}

