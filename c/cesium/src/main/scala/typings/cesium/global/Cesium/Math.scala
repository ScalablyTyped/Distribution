package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Math")
@js.native
object Math extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.cesium.mod.Math & Double] = js.native
  
  /* 34 */ val DEGREES_PER_RADIAN: typings.cesium.mod.Math.DEGREES_PER_RADIAN & Double = js.native
  
  /* 0 */ val EPSILON1: typings.cesium.mod.Math.EPSILON1 & Double = js.native
  
  /* 9 */ val EPSILON10: typings.cesium.mod.Math.EPSILON10 & Double = js.native
  
  /* 10 */ val EPSILON11: typings.cesium.mod.Math.EPSILON11 & Double = js.native
  
  /* 11 */ val EPSILON12: typings.cesium.mod.Math.EPSILON12 & Double = js.native
  
  /* 12 */ val EPSILON13: typings.cesium.mod.Math.EPSILON13 & Double = js.native
  
  /* 13 */ val EPSILON14: typings.cesium.mod.Math.EPSILON14 & Double = js.native
  
  /* 14 */ val EPSILON15: typings.cesium.mod.Math.EPSILON15 & Double = js.native
  
  /* 15 */ val EPSILON16: typings.cesium.mod.Math.EPSILON16 & Double = js.native
  
  /* 16 */ val EPSILON17: typings.cesium.mod.Math.EPSILON17 & Double = js.native
  
  /* 17 */ val EPSILON18: typings.cesium.mod.Math.EPSILON18 & Double = js.native
  
  /* 18 */ val EPSILON19: typings.cesium.mod.Math.EPSILON19 & Double = js.native
  
  /* 1 */ val EPSILON2: typings.cesium.mod.Math.EPSILON2 & Double = js.native
  
  /* 19 */ val EPSILON20: typings.cesium.mod.Math.EPSILON20 & Double = js.native
  
  /* 2 */ val EPSILON3: typings.cesium.mod.Math.EPSILON3 & Double = js.native
  
  /* 3 */ val EPSILON4: typings.cesium.mod.Math.EPSILON4 & Double = js.native
  
  /* 4 */ val EPSILON5: typings.cesium.mod.Math.EPSILON5 & Double = js.native
  
  /* 5 */ val EPSILON6: typings.cesium.mod.Math.EPSILON6 & Double = js.native
  
  /* 6 */ val EPSILON7: typings.cesium.mod.Math.EPSILON7 & Double = js.native
  
  /* 7 */ val EPSILON8: typings.cesium.mod.Math.EPSILON8 & Double = js.native
  
  /* 8 */ val EPSILON9: typings.cesium.mod.Math.EPSILON9 & Double = js.native
  
  /* 20 */ val GRAVITATIONALPARAMETER: typings.cesium.mod.Math.GRAVITATIONALPARAMETER & Double = js.native
  
  /* 22 */ val LUNAR_RADIUS: typings.cesium.mod.Math.LUNAR_RADIUS & Double = js.native
  
  /* 25 */ val ONE_OVER_PI: typings.cesium.mod.Math.ONE_OVER_PI & Double = js.native
  
  /* 32 */ val ONE_OVER_TWO_PI: typings.cesium.mod.Math.ONE_OVER_TWO_PI & Double = js.native
  
  /* 24 */ val PI: typings.cesium.mod.Math.PI & Double = js.native
  
  /* 28 */ val PI_OVER_FOUR: typings.cesium.mod.Math.PI_OVER_FOUR & Double = js.native
  
  /* 29 */ val PI_OVER_SIX: typings.cesium.mod.Math.PI_OVER_SIX & Double = js.native
  
  /* 27 */ val PI_OVER_THREE: typings.cesium.mod.Math.PI_OVER_THREE & Double = js.native
  
  /* 26 */ val PI_OVER_TWO: typings.cesium.mod.Math.PI_OVER_TWO & Double = js.native
  
  /* 35 */ val RADIANS_PER_ARCSECOND: typings.cesium.mod.Math.RADIANS_PER_ARCSECOND & Double = js.native
  
  /* 33 */ val RADIANS_PER_DEGREE: typings.cesium.mod.Math.RADIANS_PER_DEGREE & Double = js.native
  
  /* 23 */ val SIXTY_FOUR_KILOBYTES: typings.cesium.mod.Math.SIXTY_FOUR_KILOBYTES & Double = js.native
  
  /* 21 */ val SOLAR_RADIUS: typings.cesium.mod.Math.SOLAR_RADIUS & Double = js.native
  
  /* 30 */ val THREE_PI_OVER_TWO: typings.cesium.mod.Math.THREE_PI_OVER_TWO & Double = js.native
  
  /* 31 */ val TWO_PI: typings.cesium.mod.Math.TWO_PI & Double = js.native
  
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
  def incrementWrap(n: Double, maximumValue: Unit, minimumValue: Double): Double = js.native
  def incrementWrap(n: Unit, maximumValue: Double): Double = js.native
  def incrementWrap(n: Unit, maximumValue: Double, minimumValue: Double): Double = js.native
  def incrementWrap(n: Unit, maximumValue: Unit, minimumValue: Double): Double = js.native
  
  def isPowerOfTwo(n: Double): Boolean = js.native
  
  def lerp(p: Double, q: Double, time: Double): Double = js.native
  
  def mod(m: Double, n: Double): Double = js.native
  
  def negativePiToPi(angle: Double): Double = js.native
  
  def nextPowerOfTwo(n: Double): Double = js.native
  
  def nextRandomNumber(): Double = js.native
  
  def setRandomNumberSeed(seed: Double): Unit = js.native
  
  def sign(value: Double): Double = js.native
  
  def signNotZero(value: Double): Double = js.native
  
  def sinh(value: Double): Double = js.native
  
  def toDegrees(radians: Double): Double = js.native
  
  def toRadians(degrees: Double): Double = js.native
  
  def toSNorm(value: Double): Double = js.native
  
  def zeroToTwoPi(angle: Double): Double = js.native
}
