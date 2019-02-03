package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DistanceDisplayCondition")
@js.native
class DistanceDisplayCondition protected ()
  extends cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition {
  def this(near: scala.Double, far: scala.Double) = this()
  /* CompleteClass */
  override var far: scala.Double = js.native
  /* CompleteClass */
  override var near: scala.Double = js.native
  /* CompleteClass */
  override def clone(result: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition): cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition = js.native
  /* CompleteClass */
  override def equals(other: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "DistanceDisplayCondition")
@js.native
object DistanceDisplayCondition extends js.Object {
  def clone(value: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition): cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition = js.native
  def clone(
    value: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition,
    result: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition
  ): cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition,
    right: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition
  ): scala.Boolean = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition
  ): cesiumLib.cesiumMod.CesiumNs.DistanceDisplayCondition = js.native
}

