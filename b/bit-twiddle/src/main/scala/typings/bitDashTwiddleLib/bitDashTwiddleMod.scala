package typings
package bitDashTwiddleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bit-twiddle", JSImport.Namespace)
@js.native
object bitDashTwiddleMod extends js.Object {
  val INT_BITS: scala.Double = js.native
  val INT_MAX: scala.Double = js.native
  val INT_MIN: scala.Double = js.native
  def abs(value: scala.Double): scala.Double = js.native
  def countTrailingZeros(value: scala.Double): scala.Double = js.native
  def deinterleave2(x: scala.Double, y: scala.Double): scala.Double = js.native
  def deinterleave3(x: scala.Double, y: scala.Double): scala.Double = js.native
  def interleave2(x: scala.Double, y: scala.Double): scala.Double = js.native
  def interleave3(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  def isPow2(value: scala.Double): scala.Boolean = js.native
  def log10(value: scala.Double): scala.Double = js.native
  def log2(value: scala.Double): scala.Double = js.native
  def max(x: scala.Double, y: scala.Double): scala.Double = js.native
  def min(x: scala.Double, y: scala.Double): scala.Double = js.native
  def nextCombination(x: scala.Double): scala.Double = js.native
  def nextPow2(value: scala.Double): scala.Double = js.native
  def parity(value: scala.Double): scala.Double = js.native
  def popCount(value: scala.Double): scala.Double = js.native
  def prevPow2(value: scala.Double): scala.Double = js.native
  def reverse(value: scala.Double): scala.Double = js.native
  def sign(value: scala.Double): scala.Double = js.native
}

