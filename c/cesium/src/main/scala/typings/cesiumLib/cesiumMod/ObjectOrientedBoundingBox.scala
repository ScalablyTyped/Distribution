package typings
package cesiumLib.cesiumMod

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
  def equals(): scala.Boolean = js.native
  def equals(right: ObjectOrientedBoundingBox): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
object ObjectOrientedBoundingBox extends js.Object {
  def clone(box: cesiumLib.cesiumMod.ObjectOrientedBoundingBox): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def clone(
    box: cesiumLib.cesiumMod.ObjectOrientedBoundingBox,
    result: cesiumLib.cesiumMod.ObjectOrientedBoundingBox
  ): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def equals(
    left: cesiumLib.cesiumMod.ObjectOrientedBoundingBox,
    right: cesiumLib.cesiumMod.ObjectOrientedBoundingBox
  ): scala.Boolean = js.native
  def fromBoundingRectangle(boundingRectangle: cesiumLib.cesiumMod.BoundingRectangle): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def fromBoundingRectangle(boundingRectangle: cesiumLib.cesiumMod.BoundingRectangle, rotation: scala.Double): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    result: cesiumLib.cesiumMod.ObjectOrientedBoundingBox
  ): cesiumLib.cesiumMod.ObjectOrientedBoundingBox = js.native
  def intersect(
    left: cesiumLib.cesiumMod.ObjectOrientedBoundingBox,
    right: cesiumLib.cesiumMod.ObjectOrientedBoundingBox
  ): scala.Boolean = js.native
}

