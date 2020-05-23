package typings.cesium.mod

import typings.cesium.anon.MaximumCorner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoxGeometry")
@js.native
class BoxGeometry protected () extends Packable {
  def this(options: MaximumCorner) = this()
}

/* static members */
@JSImport("cesium", "BoxGeometry")
@js.native
object BoxGeometry extends js.Object {
  def createGeometry(boxGeometry: BoxGeometry): Geometry = js.native
  def fromDimensions(): Unit = js.native
  def unpack(array: js.Array[Double]): BoxGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): BoxGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoxGeometry): BoxGeometry = js.native
}

