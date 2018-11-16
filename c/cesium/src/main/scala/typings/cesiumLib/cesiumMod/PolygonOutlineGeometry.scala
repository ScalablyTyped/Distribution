package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeightHeightVertexFormat) = this()
}

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
object PolygonOutlineGeometry extends js.Object {
  def createGeometry(polygonGeometry: cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def fromPositions(): cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry = js.native
  def fromPositions(options: cesiumLib.Anon_ExtrudedHeightHeightEllipsoid): cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry
  ): cesiumLib.cesiumMod.CesiumNs.PolygonOutlineGeometry = js.native
}

