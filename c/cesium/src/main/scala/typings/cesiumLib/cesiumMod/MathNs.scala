package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Math")
@js.native
object MathNs extends js.Object {
  def acosClamped(value: scala.Double): scala.Double = js.native
  def asinClamped(value: scala.Double): scala.Double = js.native
  def chordLength(angle: scala.Double, radius: scala.Double): scala.Double = js.native
  def clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def convertLongitudeRange(angle: scala.Double): scala.Double = js.native
  def cosh(value: scala.Double): scala.Double = js.native
  def equalsEpsilon(left: scala.Double, right: scala.Double, relativeEpsilon: scala.Double): scala.Boolean = js.native
  def equalsEpsilon(
    left: scala.Double,
    right: scala.Double,
    relativeEpsilon: scala.Double,
    absoluteEpsilon: scala.Double
  ): scala.Boolean = js.native
  def factorial(n: scala.Double): scala.Double = js.native
  def fromSNorm(value: scala.Double): scala.Double = js.native
  def incrementWrap(): scala.Double = js.native
  def incrementWrap(n: scala.Double): scala.Double = js.native
  def incrementWrap(n: scala.Double, maximumValue: scala.Double): scala.Double = js.native
  def incrementWrap(n: scala.Double, maximumValue: scala.Double, minimumValue: scala.Double): scala.Double = js.native
  def isPowerOfTwo(n: scala.Double): scala.Boolean = js.native
  def lerp(p: scala.Double, q: scala.Double, time: scala.Double): scala.Double = js.native
  def mod(m: scala.Double, n: scala.Double): scala.Double = js.native
  def negativePiToPi(angle: scala.Double): scala.Double = js.native
  def nextPowerOfTwo(n: scala.Double): scala.Double = js.native
  def nextRandomNumber(): scala.Double = js.native
  def setRandomNumberSeed(seed: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def sign(value: scala.Double): scala.Double = js.native
  def signNotZero(value: scala.Double): scala.Double = js.native
  def sinh(value: scala.Double): scala.Double = js.native
  def toDegrees(radians: scala.Double): scala.Double = js.native
  def toRadians(degrees: scala.Double): scala.Double = js.native
  def toSNorm(value: scala.Double): scala.Double = js.native
  def zeroToTwoPi(angle: scala.Double): scala.Double = js.native
}

