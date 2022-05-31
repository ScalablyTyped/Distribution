package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Plane")
@js.native
class Plane protected ()
  extends typings.cesium.mod.Plane {
  def this(normal: typings.cesium.mod.Cartesian3, distance: Double) = this()
}
object Plane {
  
  @JSGlobal("Cesium.Plane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromPointNormal(point: typings.cesium.mod.Cartesian3, normal: typings.cesium.mod.Cartesian3): typings.cesium.mod.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Plane]
  inline def fromPointNormal(
    point: typings.cesium.mod.Cartesian3,
    normal: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Plane
  ): typings.cesium.mod.Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Plane]
  
  /* static member */
  inline def getPointDistance(plane: typings.cesium.mod.Plane, point: typings.cesium.mod.Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointDistance")(plane.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
}
