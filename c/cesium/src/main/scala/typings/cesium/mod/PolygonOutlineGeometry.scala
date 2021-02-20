package typings.cesium.mod

import typings.cesium.anon.Positions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.PolygonHierarchy) = this()
}
object PolygonOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "PolygonOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(polygonGeometry: PolygonOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolygonOutlineGeometry.fromPositions")
  @js.native
  def fromPositions(): PolygonOutlineGeometry = js.native
  @JSImport("cesium", "PolygonOutlineGeometry.fromPositions")
  @js.native
  def fromPositions(options: Positions): PolygonOutlineGeometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolygonOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): PolygonOutlineGeometry = js.native
  @JSImport("cesium", "PolygonOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolygonOutlineGeometry): PolygonOutlineGeometry = js.native
  @JSImport("cesium", "PolygonOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonOutlineGeometry = js.native
  @JSImport("cesium", "PolygonOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonOutlineGeometry): PolygonOutlineGeometry = js.native
}
