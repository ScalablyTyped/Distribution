package typings.cesium.cesiumMod

import typings.cesium.Anon_InnerRadii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGeometry")
@js.native
class EllipsoidGeometry () extends Packable {
  def this(options: Anon_InnerRadii) = this()
}

/* static members */
@JSImport("cesium", "EllipsoidGeometry")
@js.native
object EllipsoidGeometry extends js.Object {
  def createGeometry(ellipsoidGeometry: EllipsoidGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): EllipsoidGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidGeometry): EllipsoidGeometry = js.native
}

