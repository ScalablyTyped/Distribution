package typings.cesium.global.Cesium

import typings.cesium.anon.CloseBottom
import typings.cesium.anon.PerPositionHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolygonGeometry")
@js.native
class PolygonGeometry protected ()
  extends typings.cesium.mod.PolygonGeometry {
  def this(options: PerPositionHeight) = this()
}
object PolygonGeometry {
  
  @JSGlobal("Cesium.PolygonGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polygonGeometry: typings.cesium.mod.PolygonGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromPositions(): typings.cesium.mod.PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")().asInstanceOf[typings.cesium.mod.PolygonGeometry]
  inline def fromPositions(options: CloseBottom): typings.cesium.mod.PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolygonGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolygonGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.PolygonGeometry): typings.cesium.mod.PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.PolygonGeometry): typings.cesium.mod.PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonGeometry]
}
