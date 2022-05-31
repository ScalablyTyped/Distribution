package typings.cesium.global.Cesium

import typings.cesium.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Geometry")
@js.native
class Geometry protected ()
  extends typings.cesium.mod.Geometry {
  def this(options: Attributes) = this()
}
object Geometry {
  
  @JSGlobal("Cesium.Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def computeNumberOfVertices(geometry: typings.cesium.mod.Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNumberOfVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
}
