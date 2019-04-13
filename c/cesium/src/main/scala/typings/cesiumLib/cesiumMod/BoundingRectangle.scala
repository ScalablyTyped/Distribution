package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def clone(result: BoundingRectangle): BoundingRectangle = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: BoundingRectangle): scala.Boolean = js.native
  def intersect(right: BoundingRectangle): Intersect = js.native
}

/* static members */
@JSImport("cesium", "BoundingRectangle")
@js.native
object BoundingRectangle extends js.Object {
  def clone(rectangle: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def clone(rectangle: cesiumLib.cesiumMod.BoundingRectangle, result: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.BoundingRectangle): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.BoundingRectangle, right: cesiumLib.cesiumMod.BoundingRectangle): scala.Boolean = js.native
  def expand(rectangle: cesiumLib.cesiumMod.BoundingRectangle, point: cesiumLib.cesiumMod.Cartesian2): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def expand(
    rectangle: cesiumLib.cesiumMod.BoundingRectangle,
    point: cesiumLib.cesiumMod.Cartesian2,
    result: cesiumLib.cesiumMod.BoundingRectangle
  ): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian2]): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian2], result: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def fromRectangle(rectangle: cesiumLib.cesiumMod.Rectangle): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def fromRectangle(rectangle: cesiumLib.cesiumMod.Rectangle, projection: js.Any): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def fromRectangle(
    rectangle: cesiumLib.cesiumMod.Rectangle,
    projection: js.Any,
    result: cesiumLib.cesiumMod.BoundingRectangle
  ): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def intersect(left: cesiumLib.cesiumMod.BoundingRectangle, right: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.Intersect = js.native
  def union(left: cesiumLib.cesiumMod.BoundingRectangle, right: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.BoundingRectangle = js.native
  def union(
    left: cesiumLib.cesiumMod.BoundingRectangle,
    right: cesiumLib.cesiumMod.BoundingRectangle,
    result: cesiumLib.cesiumMod.BoundingRectangle
  ): cesiumLib.cesiumMod.BoundingRectangle = js.native
}

