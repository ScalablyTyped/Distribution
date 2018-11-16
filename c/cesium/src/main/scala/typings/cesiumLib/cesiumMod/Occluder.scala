package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Occluder")
@js.native
class Occluder protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Occluder {
  def this(occluderBoundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, cameraPosition: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  /* CompleteClass */
  override var cameraPosition: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var position: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var radius: scala.Double = js.native
  /* CompleteClass */
  override def computeVisibility(occludeeBS: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): scala.Double = js.native
  /* CompleteClass */
  override def isBoundingSphereVisible(occludee: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): scala.Boolean = js.native
  /* CompleteClass */
  override def isPointVisible(occludee: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Boolean = js.native
}

@JSImport("cesium", "Occluder")
@js.native
object Occluder extends js.Object {
  def computeOccludeePoint(
    occluderBoundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    occludeePosition: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    positions: js.Array[cesiumLib.cesiumMod.CesiumNs.Cartesian3]
  ): js.Any = js.native
  def computeOccludeePointFromRectangle(rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle): js.Any = js.native
  def computeOccludeePointFromRectangle(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid
  ): js.Any = js.native
  def fromBoundingSphere(
    occluderBoundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    cameraPosition: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Occluder = js.native
  def fromBoundingSphere(
    occluderBoundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    cameraPosition: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    result: cesiumLib.cesiumMod.CesiumNs.Occluder
  ): cesiumLib.cesiumMod.CesiumNs.Occluder = js.native
}

