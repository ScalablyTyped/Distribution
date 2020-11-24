package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Scalar")
@js.native
class Scalar ()
  extends typings.babylonjs.indexMod.Scalar
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Scalar")
@js.native
object Scalar extends js.Object {
  
  /**
    * Returns the value itself if it's between min and max.
    * Returns min if the value is lower than min.
    * Returns max if the value is greater than max.
    * @param value the value to clmap
    * @param min the min value to clamp to (default: 0)
    * @param max the max value to clamp to (default: 1)
    * @returns the clamped value
    */
  def Clamp(value: Double): Double = js.native
  def Clamp(value: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def Clamp(value: Double, min: Double): Double = js.native
  def Clamp(value: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Calculates the shortest difference between two given angles given in degrees.
    * @param current current angle in degrees
    * @param target target angle in degrees
    * @returns the delta
    */
  def DeltaAngle(current: Double, target: Double): Double = js.native
  
  /**
    * Denormalize the value from 0.0 and 1.0 using min and max values
    * @param normalized value to denormalize
    * @param min max to denormalize between
    * @param max min to denormalize between
    * @returns the denormalized value
    */
  def Denormalize(normalized: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Returns a new scalar located for "amount" (float) on the Hermite spline defined by the scalars "value1", "value3", "tangent1", "tangent2".
    * @see http://mathworld.wolfram.com/HermitePolynomial.html
    * @param value1 spline value
    * @param tangent1 spline value
    * @param value2 spline value
    * @param tangent2 spline value
    * @param amount input value
    * @returns hermite result
    */
  def Hermite(value1: Double, tangent1: Double, value2: Double, tangent2: Double, amount: Double): Double = js.native
  
  /**
    * Calculates the linear parameter t that produces the interpolant value within the range [a, b].
    * @param a start value
    * @param b target value
    * @param value value between a and b
    * @returns the inverseLerp value
    */
  def InverseLerp(a: Double, b: Double, value: Double): Double = js.native
  
  /**
    * Creates a new scalar with values linearly interpolated of "amount" between the start scalar and the end scalar.
    * @param start start value
    * @param end target value
    * @param amount amount to lerp between
    * @returns the lerped value
    */
  def Lerp(start: Double, end: Double, amount: Double): Double = js.native
  
  /**
    * Same as Lerp but makes sure the values interpolate correctly when they wrap around 360 degrees.
    * The parameter t is clamped to the range [0, 1]. Variables a and b are assumed to be in degrees.
    * @param start start value
    * @param end target value
    * @param amount amount to lerp between
    * @returns the lerped value
    */
  def LerpAngle(start: Double, end: Double, amount: Double): Double = js.native
  
  /**
    * the log2 of value.
    * @param value the value to compute log2 of
    * @returns the log2 of value.
    */
  def Log2(value: Double): Double = js.native
  
  /**
    * Moves a value current towards target.
    *
    * This is essentially the same as Mathf.Lerp but instead the function will ensure that the speed never exceeds maxDelta.
    * Negative values of maxDelta pushes the value away from target.
    * @param current current value
    * @param target target value
    * @param maxDelta max distance to move
    * @returns resulting value
    */
  def MoveTowards(current: Double, target: Double, maxDelta: Double): Double = js.native
  
  /**
    * Same as MoveTowards but makes sure the values interpolate correctly when they wrap around 360 degrees.
    *
    * Variables current and target are assumed to be in degrees. For optimization reasons, negative values of maxDelta
    *  are not supported and may cause oscillation. To push current away from a target angle, add 180 to that angle instead.
    * @param current current value
    * @param target target value
    * @param maxDelta max distance to move
    * @returns resulting angle
    */
  def MoveTowardsAngle(current: Double, target: Double, maxDelta: Double): Double = js.native
  
  /**
    * Normalize the value between 0.0 and 1.0 using min and max values
    * @param value value to normalize
    * @param min max to normalize between
    * @param max min to normalize between
    * @returns the normalized value
    */
  def Normalize(value: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Returns the angle converted to equivalent value between -Math.PI and Math.PI radians.
    * @param angle The angle to normalize in radian.
    * @return The converted angle.
    */
  def NormalizeRadians(angle: Double): Double = js.native
  
  /**
    * This function returns number that corresponds to the percentage in a given range.
    *
    * PercentToRange(0.34,0,100) will return 34.
    * @param percent to convert to number
    * @param min min range
    * @param max max range
    * @returns the number
    */
  def PercentToRange(percent: Double, min: Double, max: Double): Double = js.native
  
  /**
    * PingPongs the value t, so that it is never larger than length and never smaller than 0.
    * @param tx value
    * @param length length
    * @returns The returned value will move back and forth between 0 and length
    */
  def PingPong(tx: Double, length: Double): Double = js.native
  
  /**
    * Returns a random float number between and min and max values
    * @param min min value of random
    * @param max max value of random
    * @returns random value
    */
  def RandomRange(min: Double, max: Double): Double = js.native
  
  /**
    * This function returns percentage of a number in a given range.
    *
    * RangeToPercent(40,20,60) will return 0.5 (50%)
    * RangeToPercent(34,0,100) will return 0.34 (34%)
    * @param number to convert to percentage
    * @param min min range
    * @param max max range
    * @returns the percentage
    */
  def RangeToPercent(number: Double, min: Double, max: Double): Double = js.native
  
  /**
    * Loops the value, so that it is never larger than length and never smaller than 0.
    *
    * This is similar to the modulo operator but it works with floating point numbers.
    * For example, using 3.0 for t and 2.5 for length, the result would be 0.5.
    * With t = 5 and length = 2.5, the result would be 0.0.
    * Note, however, that the behaviour is not defined for negative numbers as it is for the modulo operator
    * @param value the value
    * @param length the length
    * @returns the looped value
    */
  def Repeat(value: Double, length: Double): Double = js.native
  
  /**
    * Returns -1 if value is negative and +1 is value is positive.
    * @param value the value
    * @returns the value itself if it's equal to zero.
    */
  def Sign(value: Double): Double = js.native
  
  /**
    * Interpolates between min and max with smoothing at the limits.
    *
    * This function interpolates between min and max in a similar way to Lerp. However, the interpolation will gradually speed up
    * from the start and slow down toward the end. This is useful for creating natural-looking animation, fading and other transitions.
    * @param from from
    * @param to to
    * @param tx value
    * @returns the smooth stepped value
    */
  def SmoothStep(from: Double, to: Double, tx: Double): Double = js.native
  
  /**
    * Returns a string : the upper case translation of the number i to hexadecimal.
    * @param i number
    * @returns the upper case translation of the number i to hexadecimal.
    */
  def ToHex(i: Double): String = js.native
  
  /**
    * Two pi constants convenient for computation.
    */
  var TwoPi: Double = js.native
  
  /**
    * Boolean : true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
    * @param a number
    * @param b number
    * @param epsilon (default = 1.401298E-45)
    * @returns true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
    */
  def WithinEpsilon(a: Double, b: Double): Boolean = js.native
  def WithinEpsilon(a: Double, b: Double, epsilon: Double): Boolean = js.native
}
