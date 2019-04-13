package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallOutlineGeometry")
@js.native
class WallOutlineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidGranularityMaximumHeights) = this()
}

/* static members */
@JSImport("cesium", "WallOutlineGeometry")
@js.native
object WallOutlineGeometry extends js.Object {
  def createGeometry(wallGeometry: cesiumLib.cesiumMod.WallOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.Cartesian3], maximumHeight: scala.Double): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double
  ): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.WallOutlineGeometry
  ): cesiumLib.cesiumMod.WallOutlineGeometry = js.native
}

