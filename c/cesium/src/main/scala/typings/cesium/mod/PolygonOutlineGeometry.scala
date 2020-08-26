package typings.cesium.mod

import typings.cesium.anon.Positions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
class PolygonOutlineGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.PolygonHierarchy) = this()
}

/* static members */
@JSImport("cesium", "PolygonOutlineGeometry")
@js.native
object PolygonOutlineGeometry extends js.Object {
  def createGeometry(polygonGeometry: PolygonOutlineGeometry): Geometry = js.native
  def fromPositions(): PolygonOutlineGeometry = js.native
  def fromPositions(options: Positions): PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[Double]): PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolygonOutlineGeometry): PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonOutlineGeometry): PolygonOutlineGeometry = js.native
}

