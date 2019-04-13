package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Occluder")
@js.native
class Occluder protected () extends js.Object {
  def this(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3) = this()
  var cameraPosition: Cartesian3 = js.native
  var position: Cartesian3 = js.native
  var radius: scala.Double = js.native
  def computeVisibility(occludeeBS: BoundingSphere): scala.Double = js.native
  def isBoundingSphereVisible(occludee: BoundingSphere): scala.Boolean = js.native
  def isPointVisible(occludee: Cartesian3): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Occluder")
@js.native
object Occluder extends js.Object {
  def computeOccludeePoint(
    occluderBoundingSphere: cesiumLib.cesiumMod.BoundingSphere,
    occludeePosition: cesiumLib.cesiumMod.Cartesian3,
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  ): js.Any = js.native
  def computeOccludeePointFromRectangle(rectangle: cesiumLib.cesiumMod.Rectangle): js.Any = js.native
  def computeOccludeePointFromRectangle(rectangle: cesiumLib.cesiumMod.Rectangle, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Any = js.native
  def fromBoundingSphere(
    occluderBoundingSphere: cesiumLib.cesiumMod.BoundingSphere,
    cameraPosition: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Occluder = js.native
  def fromBoundingSphere(
    occluderBoundingSphere: cesiumLib.cesiumMod.BoundingSphere,
    cameraPosition: cesiumLib.cesiumMod.Cartesian3,
    result: cesiumLib.cesiumMod.Occluder
  ): cesiumLib.cesiumMod.Occluder = js.native
}

