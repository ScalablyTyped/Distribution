package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
class ObjectOrientedBoundingBox ()
  extends cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox {
  def this(rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3) = this()
  def this(rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3, translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(rotation: cesiumLib.cesiumMod.CesiumNs.Matrix3, translation: cesiumLib.cesiumMod.CesiumNs.Cartesian3, scale: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
}

@JSImport("cesium", "ObjectOrientedBoundingBox")
@js.native
object ObjectOrientedBoundingBox extends js.Object {
  def clone(box: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def clone(
    box: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox,
    result: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox
  ): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox,
    right: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox
  ): scala.Boolean = js.native
  def fromBoundingRectangle(boundingRectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def fromBoundingRectangle(boundingRectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle, rotation: scala.Double): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    result: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox
  ): cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox = js.native
  def intersect(
    left: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox,
    right: cesiumLib.cesiumMod.CesiumNs.ObjectOrientedBoundingBox
  ): scala.Boolean = js.native
}

