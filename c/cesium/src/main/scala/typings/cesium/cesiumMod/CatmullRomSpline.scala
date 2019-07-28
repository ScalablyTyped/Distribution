package typings.cesium.cesiumMod

import typings.cesium.Anon_FirstTangent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CatmullRomSpline")
@js.native
class CatmullRomSpline protected () extends js.Object {
  def this(options: Anon_FirstTangent) = this()
  var firstTangent: Cartesian3 = js.native
  var lastTangent: Cartesian3 = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[Double] = js.native
  def evaluate(time: Double): Cartesian3 = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 = js.native
  def findTimeInterval(time: Double): Double = js.native
}

