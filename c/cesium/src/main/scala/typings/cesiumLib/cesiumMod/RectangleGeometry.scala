package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleGeometry")
@js.native
class RectangleGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidExtrudedHeightGranularityHeightRectangle) = this()
}

/* static members */
@JSImport("cesium", "RectangleGeometry")
@js.native
object RectangleGeometry extends js.Object {
  def createGeometry(rectangleGeometry: cesiumLib.cesiumMod.RectangleGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def pack(value: cesiumLib.cesiumMod.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.RectangleGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.RectangleGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.RectangleGeometry
  ): cesiumLib.cesiumMod.RectangleGeometry = js.native
}

