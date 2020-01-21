package typings.cesium.mod

import typings.cesium.AnonCornerTypeEllipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
class CorridorOutlineGeometry protected () extends Packable {
  def this(options: AnonCornerTypeEllipsoid) = this()
}

/* static members */
@JSImport("cesium", "CorridorOutlineGeometry")
@js.native
object CorridorOutlineGeometry extends js.Object {
  def createGeometry(corridorOutlineGeometry: CorridorOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorOutlineGeometry): CorridorOutlineGeometry = js.native
}

