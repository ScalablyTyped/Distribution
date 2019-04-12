package typings
package debugLib.debugMod.debugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debugger extends js.Object {
  var enabled: scala.Boolean = js.native
  var namespace: java.lang.String = js.native
  def apply(formatter: js.Any, args: js.Any*): scala.Unit = js.native
  def destroy(): scala.Boolean = js.native
  def extend(namespace: java.lang.String): Debugger = js.native
  def extend(namespace: java.lang.String, delimiter: java.lang.String): Debugger = js.native
  def log(args: js.Any*): js.Any = js.native
}

