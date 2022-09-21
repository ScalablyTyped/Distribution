package typings.complexJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("complex.js", JSImport.Default)
  @js.native
  open class default protected () extends Complex {
    def this(a: AValue) = this()
    def this(a: AValue, b: BValue) = this()
  }
  /* static members */
  object default {
    
    inline def apply(a: AValue): Complex = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Complex]
    inline def apply(a: AValue, b: BValue): Complex = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Complex]
    
    @JSImport("complex.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("complex.js", "default.E")
    @js.native
    def E: Complex = js.native
    
    @JSImport("complex.js", "default.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    inline def E_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "default.I")
    @js.native
    def I: Complex = js.native
    
    @JSImport("complex.js", "default.INFINITY")
    @js.native
    def INFINITY: Complex = js.native
    inline def INFINITY_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFINITY")(x.asInstanceOf[js.Any])
    
    inline def I_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "default.NAN")
    @js.native
    def NAN: Complex = js.native
    inline def NAN_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAN")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "default.ONE")
    @js.native
    def ONE: Complex = js.native
    inline def ONE_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "default.PI")
    @js.native
    def PI: Complex = js.native
    inline def PI_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "default.ZERO")
    @js.native
    def ZERO: Complex = js.native
    inline def ZERO_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("complex.js", "Complex")
  @js.native
  open class Complex protected ()
    extends StObject
       with _AValue {
    def this(a: AValue) = this()
    def this(a: AValue, b: BValue) = this()
    
    /**
      * Calculate the magnitude of the complex number
      *
      */
    def abs(): Double = js.native
    
    /**
      * Calculate the complex arcus cosinus
      *
      */
    def acos(): Complex = js.native
    
    /**
      * Calculate the complex acosh
      *
      */
    def acosh(): Complex = js.native
    
    /**
      * Calculate the complex arcus cotangent
      *
      */
    def acot(): Complex = js.native
    
    /**
      * Calculate the complex acoth
      *
      */
    def acoth(): Complex = js.native
    
    /**
      * Calculate the complex arcus cosecans
      *
      */
    def acsc(): Complex = js.native
    
    /**
      * Calculate the complex acsch
      *
      */
    def acsch(): Complex = js.native
    
    /**
      * Adds two complex numbers
      *
      */
    def add(a: AValue): Complex = js.native
    def add(a: AValue, b: BValue): Complex = js.native
    
    /**
      * Calculate the angle of the complex number
      *
      */
    def arg(): Double = js.native
    
    /**
      * Calculate the complex arcus secant
      *
      */
    def asec(): Complex = js.native
    
    /**
      * Calculate the complex asech
      *
      */
    def asech(): Complex = js.native
    
    /**
      * Calculate the complex arcus sinus
      *
      */
    def asin(): Complex = js.native
    
    /**
      * Calculate the complex asinh
      *
      */
    def asinh(): Complex = js.native
    
    /**
      * Calculate the complex arcus tangent
      *
      */
    def atan(): Complex = js.native
    
    /**
      * Calculate the complex atanh
      *
      */
    def atanh(): Complex = js.native
    
    /**
      * Ceils the actual complex number
      *
      */
    def ceil(places: Double): Complex = js.native
    
    /**
      * Returns the complex conjugate
      *
      */
    def conjugate(): Complex = js.native
    
    /**
      * Calculate the cosine
      *
      */
    def cos(): Complex = js.native
    
    /**
      * Calculate the complex cosh
      *
      */
    def cosh(): Complex = js.native
    
    /**
      * Calculate the cotangent
      *
      */
    def cot(): Complex = js.native
    
    /**
      * Calculate the complex coth
      *
      */
    def coth(): Complex = js.native
    
    /**
      * Calculate the cosecans
      *
      */
    def csc(): Complex = js.native
    
    /**
      * Calculate the complex coth
      *
      */
    def csch(): Complex = js.native
    
    /**
      * Divides two complex numbers
      *
      */
    def div(a: AValue): Complex = js.native
    def div(a: AValue, b: BValue): Complex = js.native
    
    def equals(a: AValue, b: BValue): Boolean = js.native
    
    /**
      * Calculate the complex exponent
      *
      */
    def exp(): Complex = js.native
    
    /**
      * Calculate the complex exponent and subtracts one.
      *
      * This may be more accurate than `Complex(x).exp().sub(1)` if
      * `x` is small.
      *
      */
    def expm1(): Complex = js.native
    
    /**
      * Floors the actual complex number
      *
      */
    def floor(places: Double): Complex = js.native
    
    var im: Double = js.native
    
    /**
      * Calculate the complex inverse 1/z
      *
      */
    def inverse(): Complex = js.native
    
    /**
      * Determines whether a complex number is not at the infinity pole of the
      * Riemann sphere.
      *
      */
    def isFinite(): Boolean = js.native
    
    /**
      * Determines whether or not a complex number is at the infinity pole of the
      * Riemann sphere.
      *
      */
    def isInfinite(): Boolean = js.native
    
    /**
      * Determines whether a complex number is not on the Riemann sphere.
      *
      */
    def isNaN(): Boolean = js.native
    
    /**
      * Determines whether or not a complex number is at the zero pole of the
      * Riemann sphere.
      *
      */
    def isZero(): Boolean = js.native
    
    /**
      * Calculate the natural log
      *
      */
    def log(): Complex = js.native
    
    /**
      * Multiplies two complex numbers
      *
      */
    def mul(a: AValue): Complex = js.native
    def mul(a: AValue, b: BValue): Complex = js.native
    
    /**
      * Gets the negated complex number
      *
      */
    def neg(): Complex = js.native
    
    /**
      * Calculate the power of two complex numbers
      *
      */
    def pow(a: AValue): Complex = js.native
    def pow(a: AValue, b: BValue): Complex = js.native
    
    var re: Double = js.native
    
    /**
      * Ceils the actual complex number
      *
      */
    def round(places: Double): Complex = js.native
    
    /**
      * Calculate the secant
      *
      */
    def sec(): Complex = js.native
    
    /**
      * Calculate the complex sech
      *
      */
    def sech(): Complex = js.native
    
    /**
      * Calculates the sign of a complex number, which is a normalized complex
      *
      */
    def sign(): Complex = js.native
    
    /**
      * Calculate the sine of the complex number
      *
      */
    def sin(): Complex = js.native
    
    /**
      * Calculate the complex sinh
      *
      */
    def sinh(): Complex = js.native
    
    /**
      * Calculate the complex square root
      *
      */
    def sqrt(): Complex = js.native
    
    /**
      * Subtracts two complex numbers
      *
      */
    def sub(a: AValue): Complex = js.native
    def sub(a: AValue, b: BValue): Complex = js.native
    
    /**
      * Calculate the tangent
      *
      */
    def tan(): Complex = js.native
    
    /**
      * Calculate the complex tanh
      *
      */
    def tanh(): Complex = js.native
    
    /**
      * Returns the actual number as a vector
      *
      */
    def toVector(): js.Array[Double] = js.native
  }
  /* static members */
  object Complex {
    
    inline def apply(a: AValue): Complex = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Complex]
    inline def apply(a: AValue, b: BValue): Complex = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Complex]
    
    @JSImport("complex.js", "Complex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("complex.js", "Complex.E")
    @js.native
    def E: Complex = js.native
    
    @JSImport("complex.js", "Complex.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    inline def E_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("E")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "Complex.I")
    @js.native
    def I: Complex = js.native
    
    @JSImport("complex.js", "Complex.INFINITY")
    @js.native
    def INFINITY: Complex = js.native
    inline def INFINITY_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFINITY")(x.asInstanceOf[js.Any])
    
    inline def I_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "Complex.NAN")
    @js.native
    def NAN: Complex = js.native
    inline def NAN_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAN")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "Complex.ONE")
    @js.native
    def ONE: Complex = js.native
    inline def ONE_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "Complex.PI")
    @js.native
    def PI: Complex = js.native
    inline def PI_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSImport("complex.js", "Complex.ZERO")
    @js.native
    def ZERO: Complex = js.native
    inline def ZERO_=(x: Complex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.complexJs.mod.Complex
    - typings.complexJs.anon.Im
    - typings.complexJs.anon.Abs
    - typings.complexJs.anon.Phi
    - js.Tuple2[scala.Double, scala.Double]
    - java.lang.String
    - scala.Double
    - scala.Null
    - scala.Unit
  */
  type AValue = js.UndefOr[_AValue | (js.Tuple2[Double, Double]) | String | Double | Null]
  
  type BValue = js.UndefOr[Double]
  
  trait _AValue extends StObject
}
