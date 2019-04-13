package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DistanceDisplayCondition")
@js.native
class DistanceDisplayCondition protected () extends Packable {
  def this(near: scala.Double, far: scala.Double) = this()
  var far: scala.Double = js.native
  var near: scala.Double = js.native
  def clone(result: DistanceDisplayCondition): DistanceDisplayCondition = js.native
  def equals(other: DistanceDisplayCondition): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "DistanceDisplayCondition")
@js.native
object DistanceDisplayCondition extends js.Object {
  def clone(value: cesiumLib.cesiumMod.DistanceDisplayCondition): cesiumLib.cesiumMod.DistanceDisplayCondition = js.native
  def clone(
    value: cesiumLib.cesiumMod.DistanceDisplayCondition,
    result: cesiumLib.cesiumMod.DistanceDisplayCondition
  ): cesiumLib.cesiumMod.DistanceDisplayCondition = js.native
  def equals(
    left: cesiumLib.cesiumMod.DistanceDisplayCondition,
    right: cesiumLib.cesiumMod.DistanceDisplayCondition
  ): scala.Boolean = js.native
  def pack(
    value: cesiumLib.cesiumMod.DistanceDisplayCondition,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.DistanceDisplayCondition
  ): cesiumLib.cesiumMod.DistanceDisplayCondition = js.native
}

