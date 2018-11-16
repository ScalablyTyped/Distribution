package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "NearFarScalar")
@js.native
class NearFarScalar ()
  extends cesiumLib.cesiumMod.CesiumNs.NearFarScalar {
  def this(near: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double, far: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double, far: scala.Double, farValue: scala.Double) = this()
}

@JSImport("cesium", "NearFarScalar")
@js.native
object NearFarScalar extends js.Object {
  def clone(nearFarScalar: cesiumLib.cesiumMod.CesiumNs.NearFarScalar): cesiumLib.cesiumMod.CesiumNs.NearFarScalar = js.native
  def clone(
    nearFarScalar: cesiumLib.cesiumMod.CesiumNs.NearFarScalar,
    result: cesiumLib.cesiumMod.CesiumNs.NearFarScalar
  ): cesiumLib.cesiumMod.CesiumNs.NearFarScalar = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.NearFarScalar): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.NearFarScalar,
    right: cesiumLib.cesiumMod.CesiumNs.NearFarScalar
  ): scala.Boolean = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.NearFarScalar, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.NearFarScalar,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.NearFarScalar = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.NearFarScalar = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.NearFarScalar
  ): cesiumLib.cesiumMod.CesiumNs.NearFarScalar = js.native
}

