package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle ()
  extends cesiumLib.cesiumMod.CesiumNs.BoundingRectangle {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
}

@JSImport("cesium", "BoundingRectangle")
@js.native
object BoundingRectangle extends js.Object {
  def clone(rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def clone(
    rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): scala.Boolean = js.native
  def expand(
    rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian2
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def expand(
    rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    point: cesiumLib.cesiumMod.CesiumNs.Cartesian2,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian2]): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian2],
    result: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def fromRectangle(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def fromRectangle(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle, projection: js.Any): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def fromRectangle(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    projection: js.Any,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def intersect(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.Intersect = js.native
  def union(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  def union(
    left: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    right: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle,
    result: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle
  ): cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
}

