package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleGeometry")
@js.native
class RectangleGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.RectangleGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeightStRotation) = this()
}

@JSImport("cesium", "RectangleGeometry")
@js.native
object RectangleGeometry extends js.Object {
  def createGeometry(rectangleGeometry: cesiumLib.cesiumMod.CesiumNs.RectangleGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.RectangleGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.RectangleGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.RectangleGeometry
  ): cesiumLib.cesiumMod.CesiumNs.RectangleGeometry = js.native
}

