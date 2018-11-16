package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var numberOfListeners: scala.Double = js.native
  def addEventListener(listener: js.Function0[scala.Unit]): cesiumLib.cesiumMod.CesiumNs.EventNs.RemoveCallback = js.native
  def addEventListener(listener: js.Function0[scala.Unit], scope: js.Any): cesiumLib.cesiumMod.CesiumNs.EventNs.RemoveCallback = js.native
  def raiseEvent(args: js.Any*): scala.Unit = js.native
  def removeEventListener(listener: js.Function0[scala.Unit]): scala.Boolean = js.native
  def removeEventListener(listener: js.Function0[scala.Unit], scope: js.Any): scala.Boolean = js.native
}

