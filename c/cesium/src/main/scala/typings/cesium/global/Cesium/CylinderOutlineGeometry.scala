package typings.cesium.global.Cesium

import typings.cesium.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected ()
  extends typings.cesium.mod.CylinderOutlineGeometry {
  def this(options: Length) = this()
}
object CylinderOutlineGeometry {
  
  @JSGlobal("Cesium.CylinderOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(cylinderGeometry: typings.cesium.mod.CylinderOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(cylinderGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.CylinderOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.CylinderOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.CylinderOutlineGeometry): typings.cesium.mod.CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.CylinderOutlineGeometry): typings.cesium.mod.CylinderOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CylinderOutlineGeometry]
}
