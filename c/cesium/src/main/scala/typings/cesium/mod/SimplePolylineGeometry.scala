package typings.cesium.mod

import typings.cesium.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SimplePolylineGeometry")
@js.native
class SimplePolylineGeometry protected () extends Packable {
  def this(options: Colors) = this()
}

/* static members */
@JSImport("cesium", "SimplePolylineGeometry")
@js.native
object SimplePolylineGeometry extends js.Object {
  def createGeometry(simplePolylineGeometry: SimplePolylineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): SimplePolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: SimplePolylineGeometry): SimplePolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SimplePolylineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SimplePolylineGeometry): SimplePolylineGeometry = js.native
}

