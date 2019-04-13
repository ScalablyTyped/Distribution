package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidExtrudedHeight) = this()
}

/* static members */
@JSImport("cesium", "PolygonGeometry")
@js.native
object PolygonGeometry extends js.Object {
  def createGeometry(polygonGeometry: cesiumLib.cesiumMod.PolygonGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def fromPositions(): cesiumLib.cesiumMod.PolygonGeometry = js.native
  def fromPositions(options: cesiumLib.Anon_CloseBottom): cesiumLib.cesiumMod.PolygonGeometry = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.PolygonGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.PolygonGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.PolygonGeometry
  ): cesiumLib.cesiumMod.PolygonGeometry = js.native
}

