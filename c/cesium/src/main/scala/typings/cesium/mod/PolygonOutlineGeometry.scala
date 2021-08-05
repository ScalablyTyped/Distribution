package typings.cesium.mod

import typings.cesium.anon.Positions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.PolygonHierarchy) = this()
}
object PolygonOutlineGeometry {
  
  @JSImport("cesium", "PolygonOutlineGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createGeometry(polygonGeometry: PolygonOutlineGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  inline def fromPositions(): PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")().asInstanceOf[PolygonOutlineGeometry]
  inline def fromPositions(options: Positions): PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[PolygonOutlineGeometry]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): PolygonOutlineGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonOutlineGeometry): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: PolygonOutlineGeometry): PolygonOutlineGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonOutlineGeometry]
}
