package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
class RectangleOutlineGeometry protected () extends Packable {
  def this(options: cesiumLib.Anon_EllipsoidExtrudedHeightGranularityHeightRectangleRotation) = this()
}

/* static members */
@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
object RectangleOutlineGeometry extends js.Object {
  def createGeometry(rectangleGeometry: cesiumLib.cesiumMod.RectangleOutlineGeometry): cesiumLib.cesiumMod.Geometry = js.native
  def pack(value: cesiumLib.cesiumMod.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.RectangleOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.RectangleOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.RectangleGeometry
  ): cesiumLib.cesiumMod.RectangleOutlineGeometry = js.native
}

