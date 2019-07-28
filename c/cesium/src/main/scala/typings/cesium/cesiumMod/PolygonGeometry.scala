package typings.cesium.cesiumMod

import typings.cesium.Anon_CloseBottom
import typings.cesium.Anon_EllipsoidExtrudedHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolygonGeometry")
@js.native
class PolygonGeometry protected () extends Packable {
  def this(options: Anon_EllipsoidExtrudedHeight) = this()
}

/* static members */
@JSImport("cesium", "PolygonGeometry")
@js.native
object PolygonGeometry extends js.Object {
  def createGeometry(polygonGeometry: PolygonGeometry): Geometry = js.native
  def fromPositions(): PolygonGeometry = js.native
  def fromPositions(options: Anon_CloseBottom): PolygonGeometry = js.native
  def unpack(array: js.Array[Double]): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolygonGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolygonGeometry): PolygonGeometry = js.native
}

