package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "NearFarScalar")
@js.native
class NearFarScalar () extends Packable {
  def this(near: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double, far: scala.Double) = this()
  def this(near: scala.Double, nearValue: scala.Double, far: scala.Double, farValue: scala.Double) = this()
  var far: scala.Double = js.native
  var farValue: scala.Double = js.native
  var near: scala.Double = js.native
  var nearValue: scala.Double = js.native
  def clone(result: NearFarScalar): NearFarScalar = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: NearFarScalar): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "NearFarScalar")
@js.native
object NearFarScalar extends js.Object {
  def clone(nearFarScalar: cesiumLib.cesiumMod.NearFarScalar): cesiumLib.cesiumMod.NearFarScalar = js.native
  def clone(nearFarScalar: cesiumLib.cesiumMod.NearFarScalar, result: cesiumLib.cesiumMod.NearFarScalar): cesiumLib.cesiumMod.NearFarScalar = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.NearFarScalar): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.NearFarScalar, right: cesiumLib.cesiumMod.NearFarScalar): scala.Boolean = js.native
  def pack(value: cesiumLib.cesiumMod.NearFarScalar, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.NearFarScalar,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.NearFarScalar = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.NearFarScalar = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.NearFarScalar
  ): cesiumLib.cesiumMod.NearFarScalar = js.native
}

