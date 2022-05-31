package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EllipsoidTangentPlane")
@js.native
class EllipsoidTangentPlane protected ()
  extends typings.cesium.mod.EllipsoidTangentPlane {
  def this(ellipsoid: typings.cesium.mod.Ellipsoid, origin: typings.cesium.mod.Cartesian3) = this()
}
object EllipsoidTangentPlane {
  
  @JSGlobal("Cesium.EllipsoidTangentPlane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromPoints(cartesians: js.Array[typings.cesium.mod.Cartesian3]): typings.cesium.mod.EllipsoidTangentPlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.EllipsoidTangentPlane]
  inline def fromPoints(cartesians: js.Array[typings.cesium.mod.Cartesian3], ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.EllipsoidTangentPlane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(cartesians.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.EllipsoidTangentPlane]
}
