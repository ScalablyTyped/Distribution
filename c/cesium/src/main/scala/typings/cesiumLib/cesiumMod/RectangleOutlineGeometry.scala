package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
class RectangleOutlineGeometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.RectangleOutlineGeometry {
  def this(options: cesiumLib.Anon_ExtrudedHeight) = this()
}

@JSImport("cesium", "RectangleOutlineGeometry")
@js.native
object RectangleOutlineGeometry extends js.Object {
  def createGeometry(rectangleGeometry: cesiumLib.cesiumMod.CesiumNs.RectangleOutlineGeometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def pack(value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(
    value: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    array: js.Array[scala.Double],
    startingIndex: scala.Double
  ): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.RectangleOutlineGeometry = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.RectangleOutlineGeometry = js.native
  def unpack(
    array: js.Array[scala.Double],
    startingIndex: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.RectangleGeometry
  ): cesiumLib.cesiumMod.CesiumNs.RectangleOutlineGeometry = js.native
}

