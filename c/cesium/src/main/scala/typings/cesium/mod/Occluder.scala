package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cesium", "Occluder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def computeOccludeePoint(
    occluderBoundingSphere: BoundingSphere,
    occludeePosition: Cartesian3,
    positions: js.Array[Cartesian3]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePoint")(occluderBoundingSphere.asInstanceOf[js.Any], occludeePosition.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def computeOccludeePointFromRectangle(rectangle: Rectangle): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def computeOccludeePointFromRectangle(rectangle: Rectangle, ellipsoid: Ellipsoid): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3): Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any])).asInstanceOf[Occluder]
  inline def fromBoundingSphere(occluderBoundingSphere: BoundingSphere, cameraPosition: Cartesian3, result: Occluder): Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Occluder]
}
