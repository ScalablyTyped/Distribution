package typings.cesium.mod

import typings.cesium.AnonFirstInnerQuadrangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "QuaternionSpline")
@js.native
class QuaternionSpline protected () extends js.Object {
  def this(options: AnonFirstInnerQuadrangle) = this()
  var innerQuadrangles: js.Array[Quaternion] = js.native
  var points: js.Array[Quaternion] = js.native
  var times: js.Array[Double] = js.native
  def evaluate(time: Double): Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Quaternion = js.native
  def findTimeInterval(time: Double): Double = js.native
}

