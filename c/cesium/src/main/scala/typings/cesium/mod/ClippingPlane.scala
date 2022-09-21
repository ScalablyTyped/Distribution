package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ClippingPlane")
@js.native
open class ClippingPlane protected () extends StObject {
  def this(normal: Cartesian3, distance: Double) = this()
  
  /**
    * The shortest distance from the origin to the plane.  The sign of
    * <code>distance</code> determines which side of the plane the origin
    * is on.  If <code>distance</code> is positive, the origin is in the half-space
    * in the direction of the normal; if negative, the origin is in the half-space
    * opposite to the normal; if zero, the plane passes through the origin.
    */
  var distance: Double = js.native
  
  /**
    * The plane's normal.
    */
  var normal: Cartesian3 = js.native
}
/* static members */
object ClippingPlane {
  
  @JSImport("cesium", "ClippingPlane")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clones the ClippingPlane without setting its ownership.
    * @param clippingPlane - The ClippingPlane to be cloned
    * @param [result] - The object on which to store the cloned parameters.
    * @returns a clone of the input ClippingPlane
    */
  inline def clone(clippingPlane: ClippingPlane): ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any]).asInstanceOf[ClippingPlane]
  inline def clone(clippingPlane: ClippingPlane, result: ClippingPlane): ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(clippingPlane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ClippingPlane]
  
  /**
    * Create a ClippingPlane from a Plane object.
    * @param plane - The plane containing parameters to copy
    * @param [result] - The object on which to store the result
    * @returns The ClippingPlane generated from the plane's parameters.
    */
  inline def fromPlane(plane: Plane): ClippingPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any]).asInstanceOf[ClippingPlane]
  inline def fromPlane(plane: Plane, result: ClippingPlane): ClippingPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPlane")(plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[ClippingPlane]
}
