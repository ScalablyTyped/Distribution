package typings.cesium.global.Cesium

import typings.cesium.anon.BottomRadius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CylinderGeometry")
@js.native
class CylinderGeometry protected ()
  extends typings.cesium.mod.CylinderGeometry {
  def this(options: BottomRadius) = this()
}
object CylinderGeometry {
  
  @JSGlobal("Cesium.CylinderGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(cylinderGeometry: typings.cesium.mod.CylinderGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(cylinderGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.CylinderGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.CylinderGeometry): typings.cesium.mod.CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.CylinderGeometry): typings.cesium.mod.CylinderGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderGeometry]
}
