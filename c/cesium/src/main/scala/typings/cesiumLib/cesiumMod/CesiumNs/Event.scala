package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[T /* <: js.Array[_] */] extends js.Object {
  var numberOfListeners: scala.Double = js.native
  def addEventListener(listener: js.Function1[/* args */ T, scala.Unit]): cesiumLib.cesiumMod.CesiumNs.EventNs.RemoveCallback = js.native
  def addEventListener(listener: js.Function1[/* args */ T, scala.Unit], scope: js.Any): cesiumLib.cesiumMod.CesiumNs.EventNs.RemoveCallback = js.native
  def raiseEvent(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): scala.Unit = js.native
  def removeEventListener(listener: js.Function1[/* args */ T, scala.Unit]): scala.Boolean = js.native
  def removeEventListener(listener: js.Function1[/* args */ T, scala.Unit], scope: js.Any): scala.Boolean = js.native
}

