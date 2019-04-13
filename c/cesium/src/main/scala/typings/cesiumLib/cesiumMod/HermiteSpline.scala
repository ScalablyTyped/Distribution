package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HermiteSpline")
@js.native
class HermiteSpline protected () extends js.Object {
  def this(options: cesiumLib.Anon_InTangents) = this()
  var inTangents: js.Array[Cartesian3] = js.native
  var outTangents: js.Array[Cartesian3] = js.native
  var points: js.Array[Cartesian3] = js.native
  var times: js.Array[scala.Double] = js.native
  def evaluate(time: scala.Double): Cartesian3 = js.native
  def evaluate(time: scala.Double, result: Cartesian3): Cartesian3 = js.native
  def findTimeInterval(time: scala.Double): scala.Double = js.native
}

/* static members */
@JSImport("cesium", "HermiteSpline")
@js.native
object HermiteSpline extends js.Object {
  def createC1(): cesiumLib.cesiumMod.HermiteSpline = js.native
  def createClampedCubic(): cesiumLib.cesiumMod.HermiteSpline | cesiumLib.cesiumMod.LinearSpline = js.native
  def createNaturalCubic(): cesiumLib.cesiumMod.HermiteSpline | cesiumLib.cesiumMod.LinearSpline = js.native
}

