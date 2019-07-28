package typings.cesium.cesiumMod

import typings.cesium.Anon_CenterEllipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CircleOutlineGeometry")
@js.native
class CircleOutlineGeometry protected () extends Packable {
  def this(options: Anon_CenterEllipsoid) = this()
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

