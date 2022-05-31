package typings.cesium.global.Cesium

import typings.cesium.anon.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected ()
  extends typings.cesium.mod.CorridorOutlineGeometry {
  def this(options: Granularity) = this()
}
object CorridorOutlineGeometry {
  
  @JSGlobal("Cesium.CorridorOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(corridorOutlineGeometry: typings.cesium.mod.CorridorOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(corridorOutlineGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.CorridorOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.CorridorOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CorridorOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.CorridorOutlineGeometry): typings.cesium.mod.CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CorridorOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.CorridorOutlineGeometry): typings.cesium.mod.CorridorOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.CorridorOutlineGeometry]
}
