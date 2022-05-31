package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Occluder")
@js.native
class Occluder protected ()
  extends typings.cesium.mod.Occluder {
  def this(
    occluderBoundingSphere: typings.cesium.mod.BoundingSphere,
    cameraPosition: typings.cesium.mod.Cartesian3
  ) = this()
}
object Occluder {
  
  @JSGlobal("Cesium.Occluder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def computeOccludeePoint(
    occluderBoundingSphere: typings.cesium.mod.BoundingSphere,
    occludeePosition: typings.cesium.mod.Cartesian3,
    positions: js.Array[typings.cesium.mod.Cartesian3]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePoint")(occluderBoundingSphere.asInstanceOf[js.Any], occludeePosition.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def computeOccludeePointFromRectangle(rectangle: typings.cesium.mod.Rectangle): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def computeOccludeePointFromRectangle(rectangle: typings.cesium.mod.Rectangle, ellipsoid: typings.cesium.mod.Ellipsoid): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeOccludeePointFromRectangle")(rectangle.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def fromBoundingSphere(
    occluderBoundingSphere: typings.cesium.mod.BoundingSphere,
    cameraPosition: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Occluder]
  inline def fromBoundingSphere(
    occluderBoundingSphere: typings.cesium.mod.BoundingSphere,
    cameraPosition: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Occluder
  ): typings.cesium.mod.Occluder = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBoundingSphere")(occluderBoundingSphere.asInstanceOf[js.Any], cameraPosition.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Occluder]
}
