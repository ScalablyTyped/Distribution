package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils/jsUtils", JSImport.Namespace)
@js.native
object jsUtilsMod extends js.Object {
  def approxEqual(a: Double, b: Double): Boolean = js.native
  def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = js.native
  def arrayLengthCompare(): Double = js.native
  def arrayLengthCompare(a: js.Array[_]): Double = js.native
  def arrayLengthCompare(a: js.Array[_], b: js.Array[_]): Double = js.native
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  def countDecimalPlaces(num: Double): Double = js.native
  def isNodeEnv(env: String): Boolean = js.native
}

