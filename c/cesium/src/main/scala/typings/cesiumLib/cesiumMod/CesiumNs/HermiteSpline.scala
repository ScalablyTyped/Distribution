package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HermiteSpline extends js.Object {
  var inTangents: js.Array[Cartesian3] = js.native
  var outTangents: js.Array[Cartesian3] = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[scala.Double] = js.native
  def evaluate(time: scala.Double): Cartesian3 = js.native
  def evaluate(time: scala.Double, result: Cartesian3): Cartesian3 = js.native
  def findTimeInterval(time: scala.Double): scala.Double = js.native
}

