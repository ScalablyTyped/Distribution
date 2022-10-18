package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Plane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneClippingPlaneMod {
  
  @JSImport("cesium/Source/Scene/ClippingPlane", JSImport.Default)
  @js.native
  open class default protected () extends ClippingPlane {
    def this(normal: Cartesian3, distance: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/ClippingPlane", JSImport.Default)
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
}
