package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Occluder")
@js.native
class Occluder protected () extends StObject {
  def this(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3) = this()
  
  var cameraPosition: Cartesian3 = js.native
  
  def computeVisibility(occludeeBS: BoundingSphere): Double = js.native
  
  def isBoundingSphereVisible(occludee: BoundingSphere): Boolean = js.native
  
  def isPointVisible(occludee: Cartesian3): Boolean = js.native
  
  var position: Cartesian3 = js.native
  
  var radius: Double = js.native
}
object Occluder {
  
  /* static member */
  @JSImport("cesium", "Occluder.computeOccludeePoint")
  @js.native
  def computeOccludeePoint(
    occluderBoundingSphere: BoundingSphere,
    occludeePosition: Cartesian3,
    positions: js.Array[Cartesian3]
  ): js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Occluder.computeOccludeePointFromRectangle")
  @js.native
  def computeOccludeePointFromRectangle(rectangle: Rectangle): js.Any = js.native
  @JSImport("cesium", "Occluder.computeOccludeePointFromRectangle")
  @js.native
  def computeOccludeePointFromRectangle(rectangle: Rectangle, ellipsoid: Ellipsoid): js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Occluder.fromBoundingSphere")
  @js.native
  def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3): Occluder = js.native
  @JSImport("cesium", "Occluder.fromBoundingSphere")
  @js.native
  def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3, result: Occluder): Occluder = js.native
}
