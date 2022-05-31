package typings.cesium.global.Cesium

import typings.cesium.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GroundPolylineGeometry")
@js.native
class GroundPolylineGeometry protected ()
  extends typings.cesium.mod.GroundPolylineGeometry {
  def this(options: Loop) = this()
}
object GroundPolylineGeometry {
  
  @JSGlobal("Cesium.GroundPolylineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.GroundPolylineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.GroundPolylineGeometry): typings.cesium.mod.GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.GroundPolylineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.GroundPolylineGeometry): typings.cesium.mod.GroundPolylineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.GroundPolylineGeometry]
}
