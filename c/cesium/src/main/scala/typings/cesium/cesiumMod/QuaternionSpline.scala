package typings.cesium.cesiumMod

import typings.cesium.Anon_FirstInnerQuadrangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "QuaternionSpline")
@js.native
class QuaternionSpline protected () extends js.Object {
  def this(options: Anon_FirstInnerQuadrangle) = this()
  var innerQuadrangles: js.Array[Quaternion] = js.native
  var points: js.Array[Quaternion] = js.native
  var times: js.Array[Double] = js.native
  def evaluate(time: Double): Quaternion = js.native
  def evaluate(time: Double, result: Quaternion): Quaternion = js.native
  def findTimeInterval(time: Double): Double = js.native
}

