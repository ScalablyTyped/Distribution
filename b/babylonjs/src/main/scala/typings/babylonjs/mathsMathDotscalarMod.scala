package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMathDotscalarMod {
  
  @JSImport("babylonjs/Maths/math.scalar", "Scalar")
  @js.native
  open class Scalar () extends StObject
  /* static members */
  object Scalar {
    
    @JSImport("babylonjs/Maths/math.scalar", "Scalar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the value itself if it's between min and max.
      * Returns min if the value is lower than min.
      * Returns max if the value is greater than max.
      * @param value the value to clmap
      * @param min the min value to clamp to (default: 0)
      * @param max the max value to clamp to (default: 1)
      * @returns the clamped value
      */
    inline def Clamp(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def Clamp(value: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def Clamp(value: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Calculates the shortest difference between two given angles given in degrees.
      * @param current current angle in degrees
      * @param target target angle in degrees
      * @returns the delta
      */
    inline def DeltaAngle(current: Double, target: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DeltaAngle")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Denormalize the value from 0.0 and 1.0 using min and max values
      * @param normalized value to denormalize
      * @param min max to denormalize between
      * @param max min to denormalize between
      * @returns the denormalized value
      */
    inline def Denormalize(normalized: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Denormalize")(normalized.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the highest common factor of two integers.
      * @param a first parameter
      * @param b second parameter
      * @returns HCF of a and b
      */
    inline def HCF(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HCF")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new scalar located for "amount" (float) on the Hermite spline defined by the scalars "value1", "value3", "tangent1", "tangent2".
      * @see http://mathworld.wolfram.com/HermitePolynomial.html
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param amount defines the amount on the interpolation spline (between 0 and 1)
      * @returns hermite result
      */
    inline def Hermite(value1: Double, tangent1: Double, value2: Double, tangent2: Double, amount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a new scalar which is the 1st derivative of the Hermite spline defined by the scalars "value1", "value2", "tangent1", "tangent2".
      * @param value1 defines the first control point
      * @param tangent1 defines the first tangent
      * @param value2 defines the second control point
      * @param tangent2 defines the second tangent
      * @param time define where the derivative must be done
      * @returns 1st derivative
      */
    inline def Hermite1stDerivative(value1: Double, tangent1: Double, value2: Double, tangent2: Double, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite1stDerivative")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * the floor part of a log2 value.
      * @param value the value to compute log2 of
      * @returns the log2 of value.
      */
    inline def ILog2(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ILog2")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the linear parameter t that produces the interpolant value within the range [a, b].
      * @param a start value
      * @param b target value
      * @param value value between a and b
      * @returns the inverseLerp value
      */
    inline def InverseLerp(a: Double, b: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("InverseLerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Creates a new scalar with values linearly interpolated of "amount" between the start scalar and the end scalar.
      * @param start start value
      * @param end target value
      * @param amount amount to lerp between
      * @returns the lerped value
      */
    inline def Lerp(start: Double, end: Double, amount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Same as Lerp but makes sure the values interpolate correctly when they wrap around 360 degrees.
      * The parameter t is clamped to the range [0, 1]. Variables a and b are assumed to be in degrees.
      * @param start start value
      * @param end target value
      * @param amount amount to lerp between
      * @returns the lerped value
      */
    inline def LerpAngle(start: Double, end: Double, amount: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("LerpAngle")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * the log2 of value.
      * @param value the value to compute log2 of
      * @returns the log2 of value.
      */
    inline def Log2(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Log2")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
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
    inline def MoveTowards(current: Double, target: Double, maxDelta: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveTowards")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    inline def MoveTowardsAngle(current: Double, target: Double, maxDelta: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("MoveTowardsAngle")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], maxDelta.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Normalize the value between 0.0 and 1.0 using min and max values
      * @param value value to normalize
      * @param min max to normalize between
      * @param max min to normalize between
      * @returns the normalized value
      */
    inline def Normalize(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the angle converted to equivalent value between -Math.PI and Math.PI radians.
      * @param angle The angle to normalize in radian.
      * @returns The converted angle.
      */
    inline def NormalizeRadians(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("NormalizeRadians")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * This function returns number that corresponds to the percentage in a given range.
      *
      * PercentToRange(0.34,0,100) will return 34.
      * @param percent to convert to number
      * @param min min range
      * @param max max range
      * @returns the number
      */
    inline def PercentToRange(percent: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("PercentToRange")(percent.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * PingPongs the value t, so that it is never larger than length and never smaller than 0.
      * @param tx value
      * @param length length
      * @returns The returned value will move back and forth between 0 and length
      */
    inline def PingPong(tx: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("PingPong")(tx.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a random float number between and min and max values
      * @param min min value of random
      * @param max max value of random
      * @returns random value
      */
    inline def RandomRange(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomRange")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    inline def RangeToPercent(number: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("RangeToPercent")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    inline def Repeat(value: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Repeat")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns -1 if value is negative and +1 is value is positive.
      * @param value the value
      * @returns the value itself if it's equal to zero.
      */
    inline def Sign(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("Sign")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
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
    inline def SmoothStep(from: Double, to: Double, tx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SmoothStep")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a string : the upper case translation of the number i to hexadecimal.
      * @param i number
      * @returns the upper case translation of the number i to hexadecimal.
      */
    inline def ToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Two pi constants convenient for computation.
      */
    @JSImport("babylonjs/Maths/math.scalar", "Scalar.TwoPi")
    @js.native
    def TwoPi: Double = js.native
    inline def TwoPi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoPi")(x.asInstanceOf[js.Any])
    
    /**
      * Boolean : true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
      * @param a number
      * @param b number
      * @param epsilon (default = 1.401298E-45)
      * @returns true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
      */
    inline def WithinEpsilon(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("WithinEpsilon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def WithinEpsilon(a: Double, b: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("WithinEpsilon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
