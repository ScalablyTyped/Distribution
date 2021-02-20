package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Plane")
@js.native
class Plane protected () extends StObject {
  def this(normal: Cartesian3, distance: Double) = this()
  
  var distance: Double = js.native
  
  var normal: Cartesian3 = js.native
}
object Plane {
  
  /* static member */
  @JSImport("cesium", "Plane.fromPointNormal")
  @js.native
  def fromPointNormal(point: Cartesian3, normal: Cartesian3): Plane = js.native
  @JSImport("cesium", "Plane.fromPointNormal")
  @js.native
  def fromPointNormal(point: Cartesian3, normal: Cartesian3, result: Plane): Plane = js.native
  
  /* static member */
  @JSImport("cesium", "Plane.getPointDistance")
  @js.native
  def getPointDistance(plane: Plane, point: Cartesian3): Double = js.native
}
