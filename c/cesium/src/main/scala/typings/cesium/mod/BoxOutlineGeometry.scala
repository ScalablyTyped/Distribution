package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BoxOutlineGeometry")
@js.native
class BoxOutlineGeometry () extends Packable

/* static members */
@JSImport("cesium", "BoxOutlineGeometry")
@js.native
object BoxOutlineGeometry extends js.Object {
  def createGeometry(boxGeometry: BoxOutlineGeometry): Geometry = js.native
  def fromDimensions(): Unit = js.native
  def unpack(array: js.Array[Double]): BoxOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): BoxOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: BoxOutlineGeometry): BoxOutlineGeometry = js.native
}

