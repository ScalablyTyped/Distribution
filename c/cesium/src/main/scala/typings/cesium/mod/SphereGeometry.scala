package typings.cesium.mod

import typings.cesium.anon.Radius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SphereGeometry")
@js.native
class SphereGeometry () extends Packable {
  def this(options: Radius) = this()
}

/* static members */
@JSImport("cesium", "SphereGeometry")
@js.native
object SphereGeometry extends js.Object {
  def createGeometry(sphereGeometry: SphereGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): SphereGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SphereGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SphereGeometry): SphereGeometry = js.native
}

