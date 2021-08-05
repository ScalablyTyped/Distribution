package typings.cesium.mod

import typings.cesium.anon.BottomRadius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderGeometry")
@js.native
class CylinderGeometry protected () extends Packable {
  def this(options: BottomRadius) = this()
}
object CylinderGeometry {
  
  @JSImport("cesium", "CylinderGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(cylinderGeometry: CylinderGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(cylinderGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderGeometry): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: CylinderGeometry): CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[CylinderGeometry]
}
