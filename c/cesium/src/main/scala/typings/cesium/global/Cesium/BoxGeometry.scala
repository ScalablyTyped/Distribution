package typings.cesium.global.Cesium

import typings.cesium.anon.MaximumCorner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.BoxGeometry")
@js.native
class BoxGeometry protected ()
  extends typings.cesium.mod.BoxGeometry {
  def this(options: MaximumCorner) = this()
}
object BoxGeometry {
  
  @JSGlobal("Cesium.BoxGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(boxGeometry: typings.cesium.mod.BoxGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(boxGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromDimensions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDimensions")().asInstanceOf[Unit]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.BoxGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.BoxGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.BoxGeometry): typings.cesium.mod.BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.BoxGeometry): typings.cesium.mod.BoxGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.BoxGeometry]
}
