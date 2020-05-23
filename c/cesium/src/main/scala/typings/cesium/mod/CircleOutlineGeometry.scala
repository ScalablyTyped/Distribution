package typings.cesium.mod

import typings.cesium.anon.ExtrudedHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CircleOutlineGeometry")
@js.native
class CircleOutlineGeometry protected () extends Packable {
  def this(options: ExtrudedHeight) = this()
}

/* static members */
@JSImport("cesium", "CircleOutlineGeometry")
@js.native
object CircleOutlineGeometry extends js.Object {
  def createGeometry(circleGeometry: CircleOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CircleOutlineGeometry): js.Array[Double] = js.native
}

