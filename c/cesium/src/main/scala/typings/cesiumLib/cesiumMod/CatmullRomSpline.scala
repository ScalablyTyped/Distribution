package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CatmullRomSpline")
@js.native
class CatmullRomSpline protected () extends js.Object {
  def this(options: cesiumLib.Anon_FirstTangent) = this()
  var firstTangent: Cartesian3 = js.native
  var lastTangent: Cartesian3 = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[scala.Double] = js.native
  def evaluate(time: scala.Double): Cartesian3 = js.native
  def evaluate(time: scala.Double, result: Cartesian3): Cartesian3 = js.native
  def findTimeInterval(time: scala.Double): scala.Double = js.native
}

