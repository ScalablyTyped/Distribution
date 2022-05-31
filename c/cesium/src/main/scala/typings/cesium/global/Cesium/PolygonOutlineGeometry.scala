package typings.cesium.global.Cesium

import typings.cesium.anon.Positions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected ()
  extends typings.cesium.mod.PolygonOutlineGeometry {
  def this(options: typings.cesium.anon.PolygonHierarchy) = this()
}
object PolygonOutlineGeometry {
  
  @JSGlobal("Cesium.PolygonOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polygonGeometry: typings.cesium.mod.PolygonOutlineGeometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  /* static member */
  inline def fromPositions(): typings.cesium.mod.PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")().asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
  inline def fromPositions(options: Positions): typings.cesium.mod.PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): typings.cesium.mod.PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): typings.cesium.mod.PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: typings.cesium.mod.PolygonOutlineGeometry): typings.cesium.mod.PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: typings.cesium.mod.PolygonOutlineGeometry): typings.cesium.mod.PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.PolygonOutlineGeometry]
}
