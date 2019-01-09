package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.PolygonGeometry {
  def this(options: cesiumLib.Anon_EllipsoidExtrudedHeight) = this()
}

@JSImport("cesium", "PolygonGeometry")
@js.native
object PolygonGeometry extends js.Object {
  def createGeometry(polygonGeometry: cesiumLib.cesiumMod.CesiumNs.PolygonGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def fromPositions(): cesiumLib.cesiumMod.CesiumNs.PolygonGeometry = js.native
  def fromPositions(options: cesiumLib.Anon_CloseBottom): cesiumLib.cesiumMod.CesiumNs.PolygonGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.PolygonGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.PolygonGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.PolygonGeometry
  ): cesiumLib.cesiumMod.CesiumNs.PolygonGeometry = js.native
}

