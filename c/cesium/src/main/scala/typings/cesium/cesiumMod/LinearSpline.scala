package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LinearSpline")
@js.native
class LinearSpline () extends js.Object {
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[Double] = js.native
  def evaluate(time: Double): Cartesian3 = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 = js.native
  def findTimeInterval(time: Double): Double = js.native
}

