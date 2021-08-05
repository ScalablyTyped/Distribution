package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ClippingPlane")
@js.native
class ClippingPlane protected () extends StObject {
  def this(normal: Cartesian3, distance: Double) = this()
  
  var distance: Double = js.native
  
  var normal: Cartesian3 = js.native
}
object ClippingPlane {
  
  @JSImport("cesium", "ClippingPlane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(clippingPlane: ClippingPlane): ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any]).asInstanceOf[ClippingPlane]
  inline def clone_(clippingPlane: ClippingPlane, result: ClippingPlane): ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ClippingPlane]
  
  /* static member */
  inline def fromPlane(plane: Plane): ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any]).asInstanceOf[ClippingPlane]
  inline def fromPlane(plane: Plane, result: ClippingPlane): ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ClippingPlane]
}
