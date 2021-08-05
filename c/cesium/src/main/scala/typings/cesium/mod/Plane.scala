package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Plane")
@js.native
class Plane protected () extends StObject {
  def this(normal: Cartesian3, distance: Double) = this()
  
  var distance: Double = js.native
  
  var normal: Cartesian3 = js.native
}
object Plane {
  
  @JSImport("cesium", "Plane")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromPointNormal(point: Cartesian3, normal: Cartesian3): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Plane]
  inline def fromPointNormal(point: Cartesian3, normal: Cartesian3, result: Plane): Plane = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPointNormal")(point.asInstanceOf[js.Any], normal.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Plane]
  
  /* static member */
  inline def getPointDistance(plane: Plane, point: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointDistance")(plane.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
}
