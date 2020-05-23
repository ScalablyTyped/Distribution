package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleGeometry")
@js.native
class RectangleGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.Rectangle) = this()
}

/* static members */
@JSImport("cesium", "RectangleGeometry")
@js.native
object RectangleGeometry extends js.Object {
  def createGeometry(rectangleGeometry: RectangleGeometry): Geometry = js.native
  def pack(value: BoundingSphere, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: BoundingSphere, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double]): RectangleGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): RectangleGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: RectangleGeometry): RectangleGeometry = js.native
}

