package typings.cesium.mod

import typings.cesium.anon.CloseBottom
import typings.cesium.anon.PerPositionHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: PerPositionHeight) = this()
}
object PolygonGeometry {
  
  /* static member */
  @JSImport("cesium", "PolygonGeometry.createGeometry")
  @js.native
  def createGeometry(polygonGeometry: PolygonGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolygonGeometry.fromPositions")
  @js.native
  def fromPositions(): PolygonGeometry = js.native
  @JSImport("cesium", "PolygonGeometry.fromPositions")
  @js.native
  def fromPositions(options: CloseBottom): PolygonGeometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolygonGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): PolygonGeometry = js.native
  @JSImport("cesium", "PolygonGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolygonGeometry): PolygonGeometry = js.native
  @JSImport("cesium", "PolygonGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonGeometry = js.native
  @JSImport("cesium", "PolygonGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): PolygonGeometry = js.native
}
