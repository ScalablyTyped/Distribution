package typings.cesium.mod

import typings.cesium.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SphereGeometry")
@js.native
class SphereGeometry () extends Packable {
  def this(options: Radius) = this()
}
object SphereGeometry {
  
  @JSImport("cesium", "SphereGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(sphereGeometry: SphereGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(sphereGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): SphereGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[SphereGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): SphereGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[SphereGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: SphereGeometry): SphereGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: SphereGeometry): SphereGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[SphereGeometry]
}
