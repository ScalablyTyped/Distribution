package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Ray")
@js.native
class Ray ()
  extends typings.cesium.mod.Ray {
  def this(origin: typings.cesium.mod.Cartesian3) = this()
  def this(origin: Unit, direction: typings.cesium.mod.Cartesian3) = this()
  def this(origin: typings.cesium.mod.Cartesian3, direction: typings.cesium.mod.Cartesian3) = this()
}
object Ray {
  
  @JSGlobal("Cesium.Ray")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getPoint(ray: typings.cesium.mod.Ray, t: Double): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def getPoint(ray: typings.cesium.mod.Ray, t: Double, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoint")(ray.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
}
