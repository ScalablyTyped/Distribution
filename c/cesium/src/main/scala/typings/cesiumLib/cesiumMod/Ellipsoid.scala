package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Ellipsoid")
@js.native
class Ellipsoid ()
  extends cesiumLib.cesiumMod.CesiumNs.Ellipsoid {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
}

@JSImport("cesium", "Ellipsoid")
@js.native
object Ellipsoid extends js.Object {
  var MOON: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  var UNIT_SPHERE: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  var WGS84: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def clone(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def clone(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid, result: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def fromCartesian3(): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def fromCartesian3(radii: cesiumLib.cesiumMod.CesiumNs.Cartesian3): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
}

