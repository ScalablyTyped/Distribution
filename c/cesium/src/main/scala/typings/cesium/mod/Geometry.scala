package typings.cesium.mod

import typings.cesium.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Geometry")
@js.native
class Geometry protected () extends StObject {
  def this(options: Attributes) = this()
  
  var attributes: GeometryAttributes = js.native
  
  var boundingSphere: BoundingSphere = js.native
  
  var indices: js.Array[js.Any] = js.native
  
  var primitiveType: PrimitiveType = js.native
}
object Geometry {
  
  @JSImport("cesium", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def computeNumberOfVertices(geometry: Cartesian3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNumberOfVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
}
