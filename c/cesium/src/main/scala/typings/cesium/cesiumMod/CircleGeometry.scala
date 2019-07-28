package typings.cesium.cesiumMod

import typings.cesium.Anon_Center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CircleGeometry")
@js.native
class CircleGeometry protected () extends Packable {
  def this(options: Anon_Center) = this()
}

/* static members */
@JSImport("cesium", "CircleGeometry")
@js.native
object CircleGeometry extends js.Object {
  def createGeometry(circleGeometry: CircleGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CircleGeometry): js.Array[Double] = js.native
}

