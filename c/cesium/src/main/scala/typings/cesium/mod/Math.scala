package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Math extends js.Object
@JSImport("cesium", "Math")
@js.native
object Math extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Math with Double] = js.native
  
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
  def incrementWrap(n: js.UndefOr[scala.Nothing], maximumValue: js.UndefOr[scala.Nothing], minimumValue: Double): Double = js.native
  def incrementWrap(n: js.UndefOr[scala.Nothing], maximumValue: Double): Double = js.native
  def incrementWrap(n: js.UndefOr[scala.Nothing], maximumValue: Double, minimumValue: Double): Double = js.native
  def incrementWrap(n: Double): Double = js.native
  def incrementWrap(n: Double, maximumValue: js.UndefOr[scala.Nothing], minimumValue: Double): Double = js.native
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
  
  @js.native
  sealed trait DEGREES_PER_RADIAN extends Math
  /* 34 */ @js.native
  object DEGREES_PER_RADIAN extends TopLevel[DEGREES_PER_RADIAN with Double]
  
  @js.native
  sealed trait EPSILON1 extends Math
  /* 0 */ @js.native
  object EPSILON1 extends TopLevel[EPSILON1 with Double]
  
  @js.native
  sealed trait EPSILON10 extends Math
  /* 9 */ @js.native
  object EPSILON10 extends TopLevel[EPSILON10 with Double]
  
  @js.native
  sealed trait EPSILON11 extends Math
  /* 10 */ @js.native
  object EPSILON11 extends TopLevel[EPSILON11 with Double]
  
  @js.native
  sealed trait EPSILON12 extends Math
  /* 11 */ @js.native
  object EPSILON12 extends TopLevel[EPSILON12 with Double]
  
  @js.native
  sealed trait EPSILON13 extends Math
  /* 12 */ @js.native
  object EPSILON13 extends TopLevel[EPSILON13 with Double]
  
  @js.native
  sealed trait EPSILON14 extends Math
  /* 13 */ @js.native
  object EPSILON14 extends TopLevel[EPSILON14 with Double]
  
  @js.native
  sealed trait EPSILON15 extends Math
  /* 14 */ @js.native
  object EPSILON15 extends TopLevel[EPSILON15 with Double]
  
  @js.native
  sealed trait EPSILON16 extends Math
  /* 15 */ @js.native
  object EPSILON16 extends TopLevel[EPSILON16 with Double]
  
  @js.native
  sealed trait EPSILON17 extends Math
  /* 16 */ @js.native
  object EPSILON17 extends TopLevel[EPSILON17 with Double]
  
  @js.native
  sealed trait EPSILON18 extends Math
  /* 17 */ @js.native
  object EPSILON18 extends TopLevel[EPSILON18 with Double]
  
  @js.native
  sealed trait EPSILON19 extends Math
  /* 18 */ @js.native
  object EPSILON19 extends TopLevel[EPSILON19 with Double]
  
  @js.native
  sealed trait EPSILON2 extends Math
  /* 1 */ @js.native
  object EPSILON2 extends TopLevel[EPSILON2 with Double]
  
  @js.native
  sealed trait EPSILON20 extends Math
  /* 19 */ @js.native
  object EPSILON20 extends TopLevel[EPSILON20 with Double]
  
  @js.native
  sealed trait EPSILON3 extends Math
  /* 2 */ @js.native
  object EPSILON3 extends TopLevel[EPSILON3 with Double]
  
  @js.native
  sealed trait EPSILON4 extends Math
  /* 3 */ @js.native
  object EPSILON4 extends TopLevel[EPSILON4 with Double]
  
  @js.native
  sealed trait EPSILON5 extends Math
  /* 4 */ @js.native
  object EPSILON5 extends TopLevel[EPSILON5 with Double]
  
  @js.native
  sealed trait EPSILON6 extends Math
  /* 5 */ @js.native
  object EPSILON6 extends TopLevel[EPSILON6 with Double]
  
  @js.native
  sealed trait EPSILON7 extends Math
  /* 6 */ @js.native
  object EPSILON7 extends TopLevel[EPSILON7 with Double]
  
  @js.native
  sealed trait EPSILON8 extends Math
  /* 7 */ @js.native
  object EPSILON8 extends TopLevel[EPSILON8 with Double]
  
  @js.native
  sealed trait EPSILON9 extends Math
  /* 8 */ @js.native
  object EPSILON9 extends TopLevel[EPSILON9 with Double]
  
  @js.native
  sealed trait GRAVITATIONALPARAMETER extends Math
  /* 20 */ @js.native
  object GRAVITATIONALPARAMETER extends TopLevel[GRAVITATIONALPARAMETER with Double]
  
  @js.native
  sealed trait LUNAR_RADIUS extends Math
  /* 22 */ @js.native
  object LUNAR_RADIUS extends TopLevel[LUNAR_RADIUS with Double]
  
  @js.native
  sealed trait ONE_OVER_PI extends Math
  /* 25 */ @js.native
  object ONE_OVER_PI extends TopLevel[ONE_OVER_PI with Double]
  
  @js.native
  sealed trait ONE_OVER_TWO_PI extends Math
  /* 32 */ @js.native
  object ONE_OVER_TWO_PI extends TopLevel[ONE_OVER_TWO_PI with Double]
  
  @js.native
  sealed trait PI extends Math
  /* 24 */ @js.native
  object PI extends TopLevel[PI with Double]
  
  @js.native
  sealed trait PI_OVER_FOUR extends Math
  /* 28 */ @js.native
  object PI_OVER_FOUR extends TopLevel[PI_OVER_FOUR with Double]
  
  @js.native
  sealed trait PI_OVER_SIX extends Math
  /* 29 */ @js.native
  object PI_OVER_SIX extends TopLevel[PI_OVER_SIX with Double]
  
  @js.native
  sealed trait PI_OVER_THREE extends Math
  /* 27 */ @js.native
  object PI_OVER_THREE extends TopLevel[PI_OVER_THREE with Double]
  
  @js.native
  sealed trait PI_OVER_TWO extends Math
  /* 26 */ @js.native
  object PI_OVER_TWO extends TopLevel[PI_OVER_TWO with Double]
  
  @js.native
  sealed trait RADIANS_PER_ARCSECOND extends Math
  /* 35 */ @js.native
  object RADIANS_PER_ARCSECOND extends TopLevel[RADIANS_PER_ARCSECOND with Double]
  
  @js.native
  sealed trait RADIANS_PER_DEGREE extends Math
  /* 33 */ @js.native
  object RADIANS_PER_DEGREE extends TopLevel[RADIANS_PER_DEGREE with Double]
  
  @js.native
  sealed trait SIXTY_FOUR_KILOBYTES extends Math
  /* 23 */ @js.native
  object SIXTY_FOUR_KILOBYTES extends TopLevel[SIXTY_FOUR_KILOBYTES with Double]
  
  @js.native
  sealed trait SOLAR_RADIUS extends Math
  /* 21 */ @js.native
  object SOLAR_RADIUS extends TopLevel[SOLAR_RADIUS with Double]
  
  @js.native
  sealed trait THREE_PI_OVER_TWO extends Math
  /* 30 */ @js.native
  object THREE_PI_OVER_TWO extends TopLevel[THREE_PI_OVER_TWO with Double]
  
  @js.native
  sealed trait TWO_PI extends Math
  /* 31 */ @js.native
  object TWO_PI extends TopLevel[TWO_PI with Double]
}
