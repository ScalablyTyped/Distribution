package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Math")
@js.native
object MathNs extends js.Object {
  def acosClamped(value: Double): Double = js.native
  def asinClamped(value: Double): Double = js.native
  def chordLength(angle: Double, radius: Double): Double = js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  def convertLongitudeRange(angle: Double): Double = js.native
  def cosh(value: Double): Double = js.native
  def equalsEpsilon(left: Double, right: Double, relativeEpsilon: Double): Boolean = js.native
  def equalsEpsilon(left: Double, right: Double, relativeEpsilon: Double, absoluteEpsilon: Double): Boolean = js.native
  def factorial(n: Double): Double = js.native
  def fromSNorm(value: Double): Double = js.native
  def incrementWrap(): Double = js.native
  def incrementWrap(n: Double): Double = js.native
  def incrementWrap(n: Double, maximumValue: Double): Double = js.native
  def incrementWrap(n: Double, maximumValue: Double, minimumValue: Double): Double = js.native
  def isPowerOfTwo(n: Double): Boolean = js.native
  def lerp(p: Double, q: Double, time: Double): Double = js.native
  def mod(m: Double, n: Double): Double = js.native
  def negativePiToPi(angle: Double): Double = js.native
  def nextPowerOfTwo(n: Double): Double = js.native
  def nextRandomNumber(): Double = js.native
  def setRandomNumberSeed(seed: Double): js.UndefOr[scala.Nothing] = js.native
  def sign(value: Double): Double = js.native
  def signNotZero(value: Double): Double = js.native
  def sinh(value: Double): Double = js.native
  def toDegrees(radians: Double): Double = js.native
  def toRadians(degrees: Double): Double = js.native
  def toSNorm(value: Double): Double = js.native
  def zeroToTwoPi(angle: Double): Double = js.native
}

