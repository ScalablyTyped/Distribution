package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "QuaternionSpline")
@js.native
class QuaternionSpline protected () extends js.Object {
  def this(options: cesiumLib.Anon_FirstInnerQuadrangle) = this()
  var innerQuadrangles: js.Array[Quaternion] = js.native
  var points: js.Array[Quaternion] = js.native
  var times: js.Array[scala.Double] = js.native
  def evaluate(time: scala.Double): Quaternion = js.native
  def evaluate(time: scala.Double, result: Quaternion): Quaternion = js.native
  def findTimeInterval(time: scala.Double): scala.Double = js.native
}

