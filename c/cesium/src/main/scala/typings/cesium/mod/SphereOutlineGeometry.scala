package typings.cesium.mod

import typings.cesium.anon.SlicePartitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry () extends Packable {
  def this(options: SlicePartitions) = this()
}

/* static members */
@JSImport("cesium", "SphereOutlineGeometry")
@js.native
object SphereOutlineGeometry extends js.Object {
  def createGeometry(sphereGeometry: SphereOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): SphereOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: SphereOutlineGeometry): SphereOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SphereOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SphereOutlineGeometry): SphereOutlineGeometry = js.native
}

