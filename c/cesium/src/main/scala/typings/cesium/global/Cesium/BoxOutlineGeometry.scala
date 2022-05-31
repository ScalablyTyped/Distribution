package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.BoxOutlineGeometry")
@js.native
class BoxOutlineGeometry ()
  extends typings.cesium.mod.BoxOutlineGeometry
object BoxOutlineGeometry {
  
  @JSGlobal("Cesium.BoxOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(boxGeometry: typings.cesium.mod.BoxOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromDimensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")().asInstanceOf[Unit]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.BoxOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoxOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.BoxOutlineGeometry): typings.cesium.mod.BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.BoxOutlineGeometry): typings.cesium.mod.BoxOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxOutlineGeometry]
}
