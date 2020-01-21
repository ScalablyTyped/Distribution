package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Spline")
@js.native
class Spline () extends js.Object {
  var points: js.Array[Cartesian3 | Quaternion] = js.native
  var times: js.Array[Double] = js.native
  def evaluate(time: Double): Cartesian3 | Quaternion = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 | Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Cartesian3 | Quaternion = js.native
  def findTimeInterval(time: Double, startIndex: Double): Double = js.native
}

