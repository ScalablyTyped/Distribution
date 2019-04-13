package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Spline")
@js.native
class Spline () extends js.Object {
  var points: js.Array[Cartesian3] | js.Array[Quaternion] = js.native
  var times: js.Array[scala.Double] = js.native
  def evaluate(time: scala.Double): Cartesian3 | Quaternion = js.native
  def evaluate(time: scala.Double, result: Cartesian3): Cartesian3 | Quaternion = js.native
  def evaluate(time: scala.Double, result: Quaternion): Cartesian3 | Quaternion = js.native
  def findTimeInterval(time: scala.Double, startIndex: scala.Double): scala.Double = js.native
}

