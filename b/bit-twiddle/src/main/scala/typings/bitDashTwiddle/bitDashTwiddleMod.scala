package typings.bitDashTwiddle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bit-twiddle", JSImport.Namespace)
@js.native
object bitDashTwiddleMod extends js.Object {
  val INT_BITS: Double = js.native
  val INT_MAX: Double = js.native
  val INT_MIN: Double = js.native
  def abs(value: Double): Double = js.native
  def countTrailingZeros(value: Double): Double = js.native
  def deinterleave2(x: Double, y: Double): Double = js.native
  def deinterleave3(x: Double, y: Double): Double = js.native
  def interleave2(x: Double, y: Double): Double = js.native
  def interleave3(x: Double, y: Double, z: Double): Double = js.native
  def isPow2(value: Double): Boolean = js.native
  def log10(value: Double): Double = js.native
  def log2(value: Double): Double = js.native
  def max(x: Double, y: Double): Double = js.native
  def min(x: Double, y: Double): Double = js.native
  def nextCombination(x: Double): Double = js.native
  def nextPow2(value: Double): Double = js.native
  def parity(value: Double): Double = js.native
  def popCount(value: Double): Double = js.native
  def prevPow2(value: Double): Double = js.native
  def reverse(value: Double): Double = js.native
  def sign(value: Double): Double = js.native
}

