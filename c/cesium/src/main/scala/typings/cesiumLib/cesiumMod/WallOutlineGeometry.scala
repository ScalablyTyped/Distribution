package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry {
  def this(options: cesiumLib.Anon_MaximumHeightsEllipsoid) = this()
}

@JSImport("cesium", "WallOutlineGeometry")
@js.native
object WallOutlineGeometry extends js.Object {
  def createGeometry(wallGeometry: cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3], maximumHeight: scala.Double): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.WallOutlineGeometry = js.native
}

