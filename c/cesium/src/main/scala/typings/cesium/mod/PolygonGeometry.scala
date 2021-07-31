package typings.cesium.mod

import typings.cesium.anon.CloseBottom
import typings.cesium.anon.PerPositionHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: PerPositionHeight) = this()
}
object PolygonGeometry {
  
  @JSImport("cesium", "PolygonGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createGeometry(polygonGeometry: PolygonGeometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createGeometry")(polygonGeometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  /* static member */
  @scala.inline
  def fromPositions(): PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")().asInstanceOf[PolygonGeometry]
  @scala.inline
  def fromPositions(options: CloseBottom): PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(options.asInstanceOf[js.Any]).asInstanceOf[PolygonGeometry]
  
  /* static member */
  @scala.inline
  def unpack(array: js.Array[Double]): PolygonGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[PolygonGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[PolygonGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonGeometry]
  @scala.inline
  def unpack(array: js.Array[Double], startingIndex: Unit, result: PolygonGeometry): PolygonGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[PolygonGeometry]
}
