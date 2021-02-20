package typings.complexJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("complex.js", JSImport.Default)
  @js.native
  class default protected () extends Complex {
    def this(x: Complex) = this()
    def this(x: Double, y: Double) = this()
  }
  object default {
    
    @JSImport("complex.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A complex euler number instance.
      */
    /* static member */
    @JSImport("complex.js", "default.E")
    @js.native
    def E: Complex = js.native
    
    /**
      * A small epsilon value used for equals() comparison in order to circumvent double inprecision.
      */
    /* static member */
    @JSImport("complex.js", "default.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def E_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
    
    /**
      * An imaginary number i instance.
      */
    /* static member */
    @JSImport("complex.js", "default.I")
    @js.native
    def I: Complex = js.native
    
    /**
      * A complex infinity value (north pole on the Riemann Sphere).
      */
    /* static member */
    @JSImport("complex.js", "default.INFINITY")
    @js.native
    def INFINITY: Complex = js.native
    @scala.inline
    def INFINITY_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFINITY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def I_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
    
    /**
      * A complex NaN value (not on the Riemann Sphere).
      */
    /* static member */
    @JSImport("complex.js", "default.NAN")
    @js.native
    def NAN: Complex = js.native
    @scala.inline
    def NAN_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAN")(x.asInstanceOf[js.Any])
    
    /**
      * A complex one instance.
      */
    /* static member */
    @JSImport("complex.js", "default.ONE")
    @js.native
    def ONE: Complex = js.native
    @scala.inline
    def ONE_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /**
      * A complex PI instance.
      */
    /* static member */
    @JSImport("complex.js", "default.PI")
    @js.native
    def PI: Complex = js.native
    @scala.inline
    def PI_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    /**
      * A complex zero value (south pole on the Riemann Sphere).
      */
    /* static member */
    @JSImport("complex.js", "default.ZERO")
    @js.native
    def ZERO: Complex = js.native
    @scala.inline
    def ZERO_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Complex extends StObject {
    
    /**
      * Calculates the magnitude of the complex number.
      */
    def abs(): Double = js.native
    
    /**
      * Calculate the complex arcus cosinus.
      */
    def acos(): Complex = js.native
    
    /**
      * Calculate the complex asinh.
      */
    def acosh(): Complex = js.native
    
    /**
      * Calculate the complex arcus cotangent.
      */
    def acot(): Complex = js.native
    
    /**
      * Calculate the complex acoth.
      */
    def acoth(): Complex = js.native
    
    /**
      * Calculate the complex arcus cosecans.
      */
    def acsc(): Complex = js.native
    
    /**
      * Calculate the complex acsch.
      */
    def acsch(): Complex = js.native
    
    /**
      * Adds another complex number.
      */
    def add(a: Double, b: Double): Complex = js.native
    def add(a: Complex): Complex = js.native
    
    /**
      * Calculate the angle of the complex number.
      */
    def arg(): Double = js.native
    
    /**
      * Calculate the complex arcus secant.
      */
    def asec(): Complex = js.native
    
    /**
      * Calculate the complex asech.
      */
    def asech(): Complex = js.native
    
    /**
      * Calculate the complex arcus sinus.
      */
    def asin(): Complex = js.native
    
    /**
      * Calculate the complex asinh.
      */
    def asinh(): Complex = js.native
    
    /**
      * Calculate the complex arcus tangent.
      */
    def atan(): Complex = js.native
    
    /**
      * Calculate the complex atanh.
      */
    def atanh(): Complex = js.native
    
    /**
      * Ceils the complex number parts off zero.
      */
    def ceil(places: Double): Complex = js.native
    
    /**
      * Calculates the conjugate of the complex number (multiplies the imaginary part with -1).
      */
    def conjugate(): Complex = js.native
    
    /**
      * Calculate the cosine.
      */
    def cos(): Complex = js.native
    
    /**
      * Calculate the complex cosh.
      */
    def cosh(): Complex = js.native
    
    /**
      * Calculate the cotangent.
      */
    def cot(): Complex = js.native
    
    /**
      * Calculate the complex coth.
      */
    def coth(): Complex = js.native
    
    /**
      * Calculate the cosecans.
      */
    def csc(): Complex = js.native
    
    /**
      * Calculate the complex csch.
      */
    def csch(): Complex = js.native
    
    /**
      * Divides the number by another complex number.
      */
    def div(a: Double, b: Double): Complex = js.native
    def div(a: Complex): Complex = js.native
    
    /**
      * Checks if both numbers are exactly the same,
      * if both numbers are infinite they are considered not equal.
      */
    def equals(a: Double, b: Double): Boolean = js.native
    def equals(a: Complex): Boolean = js.native
    
    /**
      * Returns e^n with complex exponent n
      */
    def exp(): Complex = js.native
    
    /**
      * Floors the complex number parts towards zero.
      */
    def floor(places: Double): Complex = js.native
    
    // the imaginary part of this complex number
    var im: Double = js.native
    
    /**
      * Calculates the multiplicative inverse of the complex number (1 / z).
      */
    def inverse(): Complex = js.native
    
    /**
      * Checks if the given number is finite.
      */
    def isFinite(): Boolean = js.native
    
    /**
      * Determines whether or not a complex number is at the infinity pole of the
      * Riemann sphere.
      */
    def isInfinite(): Boolean = js.native
    
    /**
      * Checks if the given number is not a number.
      */
    def isNaN(): Boolean = js.native
    
    /**
      * Determines whether or not a complex number is at the zero pole of the
      * Riemann sphere.
      */
    def isZero(): Boolean = js.native
    
    /**
      * Returns the natural logarithm (base E) of the actual complex number.
      */
    def log(): Complex = js.native
    
    /**
      * Multiplies the number with another complex number.
      */
    def mul(a: Double, b: Double): Complex = js.native
    def mul(a: Complex): Complex = js.native
    
    /**
      * Negates the number (multiplies both the real and imaginary part with -1) in order to get the additive inverse.
      */
    def neg(): Complex = js.native
    
    /**
      * Returns the number raised to the complex exponent.
      */
    def pow(a: Double, b: Double): Complex = js.native
    def pow(a: Complex): Complex = js.native
    
    // the real part of this complex number
    var re: Double = js.native
    
    /**
      * Rounds the complex number parts.
      */
    def round(places: Double): Complex = js.native
    
    /**
      * Calculate the secant.
      */
    def sec(): Complex = js.native
    
    /**
      * Calculate the complex sech.
      */
    def sech(): Complex = js.native
    
    /**
      * Returns the complex sign, defined as the complex number
      * normalized by it's absolute value.
      */
    def sign(): Complex = js.native
    
    /**
      * Calculate the sine of the complex number.
      */
    def sin(): Complex = js.native
    
    /**
      * Calculate the complex sinh.
      */
    def sinh(): Complex = js.native
    
    /**
      * Returns the complex square root of the number.
      */
    def sqrt(): Complex = js.native
    
    /**
      * Subtracts another complex number.
      */
    def sub(a: Double, b: Double): Complex = js.native
    def sub(a: Complex): Complex = js.native
    
    /**
      * Calculate the tangent.
      */
    def tan(): Complex = js.native
    
    /**
      * Calculate the complex tanh.
      */
    def tanh(): Complex = js.native
    
    /**
      * Returns a Vector of the actual complex number with two components.
      */
    def toVector(): js.Array[Double] = js.native
  }
}
