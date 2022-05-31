package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ClippingPlane")
@js.native
class ClippingPlane protected ()
  extends typings.cesium.mod.ClippingPlane {
  def this(normal: typings.cesium.mod.Cartesian3, distance: Double) = this()
}
object ClippingPlane {
  
  @JSGlobal("Cesium.ClippingPlane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(clippingPlane: typings.cesium.mod.ClippingPlane): typings.cesium.mod.ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ClippingPlane]
  inline def clone_(clippingPlane: typings.cesium.mod.ClippingPlane, result: typings.cesium.mod.ClippingPlane): typings.cesium.mod.ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ClippingPlane]
  
  /* static member */
  inline def fromPlane(plane: typings.cesium.mod.Plane): typings.cesium.mod.ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.ClippingPlane]
  inline def fromPlane(plane: typings.cesium.mod.Plane, result: typings.cesium.mod.ClippingPlane): typings.cesium.mod.ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.ClippingPlane]
}
