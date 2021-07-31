package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Ray")
@js.native
class Ray () extends StObject {
  def this(origin: Cartesian3) = this()
  def this(origin: Unit, direction: Cartesian3) = this()
  def this(origin: Cartesian3, direction: Cartesian3) = this()
  
  var direction: Cartesian3 = js.native
  
  var origin: Cartesian3 = js.native
}
object Ray {
  
  @JSImport("cesium", "Ray")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getPoint(ray: Ray, t: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  @scala.inline
  def getPoint(ray: Ray, t: Double, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
}
