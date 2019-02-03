package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
class AxisAlignedBoundingBox ()
  extends cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox {
  def this(minimum: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(minimum: cesiumLib.cesiumMod.CesiumNs.Cartesian3, maximum: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(minimum: cesiumLib.cesiumMod.CesiumNs.Cartesian3, maximum: cesiumLib.cesiumMod.CesiumNs.Cartesian3, center: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
}

/* static members */
@JSImport("cesium", "AxisAlignedBoundingBox")
@js.native
object AxisAlignedBoundingBox extends js.Object {
  def clone(box: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox): cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox = js.native
  def clone(
    box: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox,
    result: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox
  ): cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox = js.native
  def equals(): scala.Boolean = js.native
  def equals(left: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox): scala.Boolean = js.native
  def equals(
    left: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox,
    right: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox
  ): scala.Boolean = js.native
  def fromPoints(positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]): cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox = js.native
  def fromPoints(
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3],
    result: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox
  ): cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox = js.native
  def intersect(
    box: cesiumLib.cesiumMod.CesiumNs.AxisAlignedBoundingBox,
    plane: cesiumLib.cesiumMod.CesiumNs.Cartesian4
  ): cesiumLib.cesiumMod.CesiumNs.Intersect = js.native
}

