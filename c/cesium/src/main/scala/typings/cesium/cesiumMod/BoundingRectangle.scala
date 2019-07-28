package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoundingRectangle")
@js.native
class BoundingRectangle () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def clone(result: BoundingRectangle): BoundingRectangle = js.native
  def equals(): Boolean = js.native
  def equals(right: BoundingRectangle): Boolean = js.native
  def intersect(right: BoundingRectangle): Intersect = js.native
}

/* static members */
@JSImport("cesium", "BoundingRectangle")
@js.native
object BoundingRectangle extends js.Object {
  def clone(rectangle: BoundingRectangle): BoundingRectangle = js.native
  def clone(rectangle: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
  def equals(): Boolean = js.native
  def equals(left: BoundingRectangle): Boolean = js.native
  def equals(left: BoundingRectangle, right: BoundingRectangle): Boolean = js.native
  def expand(rectangle: BoundingRectangle, point: Cartesian2): BoundingRectangle = js.native
  def expand(rectangle: BoundingRectangle, point: Cartesian2, result: BoundingRectangle): BoundingRectangle = js.native
  def fromPoints(positions: js.Array[Cartesian2]): BoundingRectangle = js.native
  def fromPoints(positions: js.Array[Cartesian2], result: BoundingRectangle): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any): BoundingRectangle = js.native
  def fromRectangle(rectangle: Rectangle, projection: js.Any, result: BoundingRectangle): BoundingRectangle = js.native
  def intersect(left: BoundingRectangle, right: BoundingRectangle): Intersect = js.native
  def union(left: BoundingRectangle, right: BoundingRectangle): BoundingRectangle = js.native
  def union(left: BoundingRectangle, right: BoundingRectangle, result: BoundingRectangle): BoundingRectangle = js.native
}

