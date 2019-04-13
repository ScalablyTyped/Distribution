package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidExtrudedHeightGranularity) = this()
}

/* static members */
@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
object PolygonOutlineGeometry extends js.Object {
  def createGeometry(polygonGeometry: cesiumLib.cesiumMod.PolygonOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromPositions(): cesiumLib.cesiumMod.PolygonOutlineGeometry = js.native
  def fromPositions(options: cesiumLib.Anon_EllipsoidExtrudedHeightGranularityHeight): cesiumLib.cesiumMod.PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.PolygonOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.PolygonOutlineGeometry
  ): cesiumLib.cesiumMod.PolygonOutlineGeometry = js.native
}

