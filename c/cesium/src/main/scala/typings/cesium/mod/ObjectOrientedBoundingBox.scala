package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
class ObjectOrientedBoundingBox () extends js.Object {
  def this(rotation: Matrix3) = this()
  def this(rotation: Matrix3, translation: Cartesian3) = this()
  def this(rotation: Matrix3, translation: Cartesian3, scale: Cartesian3) = this()
  var rotation: Matrix3 = js.native
  var scale: Cartesian3 = js.native
  var translation: Cartesian3 = js.native
  def clone(result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  def equals(): Boolean = js.native
  def equals(right: ObjectOrientedBoundingBox): Boolean = js.native
}

/* static members */
@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
object ObjectOrientedBoundingBox extends js.Object {
  def clone(box: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  def clone(box: ObjectOrientedBoundingBox, result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  def equals(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = js.native
  def fromBoundingRectangle(boundingRectangle: BoundingRectangle): ObjectOrientedBoundingBox = js.native
  def fromBoundingRectangle(boundingRectangle: BoundingRectangle, rotation: Double): ObjectOrientedBoundingBox = js.native
  def fromPoints(positions: js.Array[Cartesian3]): ObjectOrientedBoundingBox = js.native
  def fromPoints(positions: js.Array[Cartesian3], result: ObjectOrientedBoundingBox): ObjectOrientedBoundingBox = js.native
  def intersect(left: ObjectOrientedBoundingBox, right: ObjectOrientedBoundingBox): Boolean = js.native
}

