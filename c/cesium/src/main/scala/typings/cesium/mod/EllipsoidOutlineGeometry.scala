package typings.cesium.mod

import typings.cesium.AnonMaximumClock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry () extends Packable {
  def this(options: AnonMaximumClock) = this()
}

/* static members */
@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
object EllipsoidOutlineGeometry extends js.Object {
  def createGeometry(ellipsoidGeometry: EllipsoidOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidOutlineGeometry): EllipsoidOutlineGeometry = js.native
}

