package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallGeometry")
@js.native
class WallGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidGranularity) = this()
}

/* static members */
@JSImport("cesium", "WallGeometry")
@js.native
object WallGeometry extends js.Object {
  def createGeometry(wallGeometry: cesiumLib.cesiumMod.WallGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.WallGeometry = js.native
  def fromConstantHeights(positions: js.Array[cesiumLib.cesiumMod.Cartesian3], maximumHeight: scala.Double): cesiumLib.cesiumMod.WallGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double
  ): cesiumLib.cesiumMod.WallGeometry = js.native
  def fromConstantHeights(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    maximumHeight: scala.Double,
    minimumHeight: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid
  ): cesiumLib.cesiumMod.WallGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.WallGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.WallGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.WallGeometry
  ): cesiumLib.cesiumMod.WallGeometry = js.native
}

