package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.EllipsoidTangentPlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsoidTangentPlaneMod {
  
  @JSImport("cesium/Source/Core/EllipsoidTangentPlane", JSImport.Default)
  @js.native
  open class default protected () extends EllipsoidTangentPlane {
    def this(origin: Cartesian3) = this()
    def this(origin: Cartesian3, ellipsoid: Ellipsoid) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/EllipsoidTangentPlane", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance from the provided ellipsoid and the center
      * point of the provided Cartesians.
      * @param cartesians - The list of positions surrounding the center point.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid to use.
      * @returns The new instance of EllipsoidTangentPlane.
      */
    inline def fromPoints(cartesians: js.Array[Cartesian3]): EllipsoidTangentPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any]).asInstanceOf[EllipsoidTangentPlane]
    inline def fromPoints(cartesians: js.Array[Cartesian3], ellipsoid: Ellipsoid): EllipsoidTangentPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[EllipsoidTangentPlane]
  }
}
