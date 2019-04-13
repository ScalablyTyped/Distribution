package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
class AxisAlignedBoundingBox () extends js.Object {
  def this(minimum: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3) = this()
  def this(minimum: Cartesian3, maximum: Cartesian3, center: Cartesian3) = this()
  var center: Cartesian3 = js.native
  var maximum: Cartesian3 = js.native
  var minimum: Cartesian3 = js.native
  def clone(result: AxisAlignedBoundingBox): AxisAlignedBoundingBox = js.native
  def equals(): scala.Boolean = js.native
  def equals(right: AxisAlignedBoundingBox): scala.Boolean = js.native
  def intersect(plane: Cartesian4): Intersect = js.native
}

/* static members */
@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
object AxisAlignedBoundingBox extends js.Object {
  def clone(box: cesiumLib.cesiumMod.AxisAlignedBoundingBox): cesiumLib.cesiumMod.AxisAlignedBoundingBox = js.native
  def clone(
    box: cesiumLib.cesiumMod.AxisAlignedBoundingBox,
    result: cesiumLib.cesiumMod.AxisAlignedBoundingBox
  ): cesiumLib.cesiumMod.AxisAlignedBoundingBox = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.AxisAlignedBoundingBox): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.AxisAlignedBoundingBox,
    right: cesiumLib.cesiumMod.AxisAlignedBoundingBox
  ): scala.Boolean = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.Cartesian3]): cesiumLib.cesiumMod.AxisAlignedBoundingBox = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    result: cesiumLib.cesiumMod.AxisAlignedBoundingBox
  ): cesiumLib.cesiumMod.AxisAlignedBoundingBox = js.native
  def intersect(box: cesiumLib.cesiumMod.AxisAlignedBoundingBox, plane: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Intersect = js.native
}

