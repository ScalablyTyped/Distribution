package typings.bigJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.bigJs.bigJsNumbers.`-1`
import typings.bigJs.bigJsNumbers.`0`
import typings.bigJs.bigJsNumbers.`1`
import typings.bigJs.bigJsNumbers.`2`
import typings.bigJs.bigJsNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("big.js", JSImport.Default)
  @js.native
  val default: BigConstructor = js.native
  
  @js.native
  trait Big extends StObject {
    
    /** Returns a Big number whose value is the absolute value, i.e. the magnitude, of this Big number. */
    def abs(): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number plus n - alias for .plus().
      *
      * @throws `NaN` if n is invalid.
      */
    def add(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns an array of single digits
      */
    var c: js.Array[Double] = js.native
    
    /**
      * Compare the values.
      *
      * @throws `NaN` if n is invalid.
      */
    def cmp(n: BigSource): Comparison = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number divided by n.
      *
      * If the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
      *
      * @throws `NaN` if n is invalid.
      * @throws `±Infinity` on division by zero.
      * @throws `NaN` on division of zero by zero.
      */
    def div(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns the exponent, Integer, -1e+6 to 1e+6 inclusive
      */
    var e: Double = js.native
    
    /**
      * Returns true if the value of this Big is greater than the value of n, otherwise returns false.
      *
      * @throws `NaN` if n is invalid.
      */
    def gt(n: BigSource): Boolean = js.native
    
    /**
      * Returns true if the value of this Big is greater than or equal to the value of n, otherwise returns false.
      *
      * @throws `NaN` if n is invalid.
      */
    def gte(n: BigSource): Boolean = js.native
    
    /**
      * Returns true if the value of this Big is less than the value of n, otherwise returns false.
      *
      * @throws `NaN` if n is invalid.
      */
    def lt(n: BigSource): Boolean = js.native
    
    /**
      * Returns true if the value of this Big is less than or equal to the value of n, otherwise returns false.
      *
      * @throws `NaN` if n is invalid.
      */
    def lte(n: BigSource): Boolean = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number minus n.
      *
      * @throws `NaN` if n is invalid.
      */
    def minus(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number modulo n, i.e. the integer remainder of dividing this Big number by n.
      *
      * The result will have the same sign as this Big number, and it will match that of Javascript's % operator (within the limits of its precision) and BigDecimal's remainder method.
      *
      * @throws `NaN` if n is negative or otherwise invalid.
      */
    def mod(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number times n - alias for .times().
      *
      * @throws `NaN` if n is invalid.
      */
    def mul(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number plus n.
      *
      * @throws `NaN` if n is invalid.
      */
    def plus(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number raised to the power exp.
      *
      * If exp is negative and the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
      *
      * @param exp The power to raise the number to, -1e+6 to 1e+6 inclusive
      * @throws `!pow!` if exp is invalid.
      *
      * Note: High value exponents may cause this method to be slow to return.
      */
    def pow(exp: Double): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number rounded using rounding mode rm to a maximum of dp decimal places.
      *
      * @param dp Decimal places, 0 to 1e+6 inclusive
      * @param rm The rounding mode, one of the RoundingMode enumeration values
      * @throws `!round!` if dp is invalid.
      * @throws `!Big.RM!` if rm is invalid.
      */
    def round(): typings.bigJs.mod.Big = js.native
    def round(dp: Double): typings.bigJs.mod.Big = js.native
    def round(dp: Double, rm: RoundingMode): typings.bigJs.mod.Big = js.native
    def round(dp: Unit, rm: RoundingMode): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns the sign, -1 or 1
      */
    var s: Double = js.native
    
    /**
      * Returns a Big number whose value is the square root of this Big number.
      *
      * If the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
      *
      * @throws `NaN` if this Big number is negative.
      */
    def sqrt(): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number minus n - alias for .minus().
      *
      * @throws `NaN` if n is invalid.
      */
    def sub(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a Big number whose value is the value of this Big number times n.
      *
      * @throws `NaN` if n is invalid.
      */
    def times(n: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * Returns a string representing the value of this Big number in exponential notation to a fixed number of decimal places dp.
      *
      * If the value of this Big number in exponential notation has more digits to the right of the decimal point than is specified by dp,
      * the return value will be rounded to dp decimal places using rounding mode Big.RM.
      *
      * If the value of this Big number in exponential notation has fewer digits to the right of the decimal point than is specified by dp, the return value will be appended with zeros accordingly.
      *
      * If dp is omitted, or is null or undefined, the number of digits after the decimal point defaults to the minimum number of digits necessary to represent the value exactly.
      *
      * @param dp Decimal places, 0 to 1e+6 inclusive
      * @throws `!toFix!` if dp is invalid.
      */
    def toExponential(): String = js.native
    def toExponential(dp: Double): String = js.native
    
    /**
      * Returns a string representing the value of this Big number in normal notation to a fixed number of decimal places dp.
      *
      * If the value of this Big number in normal notation has more digits to the right of the decimal point than is specified by dp,
      * the return value will be rounded to dp decimal places using rounding mode Big.RM.
      *
      * If the value of this Big number in normal notation has fewer fraction digits then is specified by dp, the return value will be appended with zeros accordingly.
      *
      * Unlike Number.prototype.toFixed, which returns exponential notation if a number is greater or equal to 1021, this method will always return normal notation.
      *
      * If dp is omitted, or is null or undefined, then the return value is simply the value in normal notation.
      * This is also unlike Number.prototype.toFixed, which returns the value to zero decimal places.
      *
      * @param dp Decimal places, 0 to 1e+6 inclusive
      * @throws `!toFix!` if dp is invalid.
      */
    def toFixed(): String = js.native
    def toFixed(dp: Double): String = js.native
    
    /**
      * Returns a string representing the value of this Big number.
      *
      * If this Big number has a positive exponent that is equal to or greater than 21, or a negative exponent equal to or less than -7, then exponential notation is returned.
      *
      * The point at which toString returns exponential rather than normal notation can be adjusted by changing
      * the value of Big.E_POS and Big.E_NEG. By default, Big numbers correspond to Javascript's number type in this regard.
      */
    def toJSON(): String = js.native
    
    /**
      * Returns a primitive number representing the value of this Big number.
      *
      * If Big.strict is true an error will be thrown if toNumber is called on a Big number which cannot be converted to a primitive number without a loss of precision.
      *
      * @since 6.0
      */
    def toNumber(): Double = js.native
    
    /**
      * Returns a string representing the value of this Big number to the specified number of significant digits sd.
      *
      * If the value of this Big number has more digits than is specified by sd, the return value will be rounded to sd significant digits using rounding mode Big.RM.
      *
      * If the value of this Big number has fewer digits than is specified by sd, the return value will be appended with zeros accordingly.
      *
      * If sd is less than the number of digits necessary to represent the integer part of the value in normal notation, then exponential notation is used.
      *
      * If sd is omitted, or is null or undefined, then the return value is the same as .toString().
      *
      * @param sd Significant digits, 1 to 1e+6 inclusive
      * @throws `!toPre!` if sd is invalid.
      */
    def toPrecision(): String = js.native
    def toPrecision(sd: Double): String = js.native
  }
  @JSImport("big.js", "Big")
  @js.native
  val Big: BigConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("big.js", "Big")
  @js.native
  class BigCls protected ()
    extends StObject
       with typings.bigJs.mod.Big {
    /**
      * Returns a new instance of a Big number object
      *
      * String values may be in exponential, as well as normal (non-exponential) notation.
      * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
      * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
      * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
      *
      * @throws `NaN` on an invalid value.
      */
    def this(value: BigSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("big.js", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends StObject
       with typings.bigJs.mod.Big {
    /**
      * Returns a new instance of a Big number object
      *
      * String values may be in exponential, as well as normal (non-exponential) notation.
      * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
      * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
      * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
      *
      * @throws `NaN` on an invalid value.
      */
    def this(value: BigSource) = this()
  }
  
  object global {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Big")
    @js.native
    class Big protected ()
      extends StObject
         with typings.bigJs.mod.Big {
      /**
        * Returns a new instance of a Big number object
        *
        * String values may be in exponential, as well as normal (non-exponential) notation.
        * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
        * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
        * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
        *
        * @throws `NaN` on an invalid value.
        */
      def this(value: BigSource) = this()
    }
    @JSGlobal("Big")
    @js.native
    val Big: typings.bigJs.mod.global.BigJs.BigConstructor = js.native
    
    object BigJs {
      
      type Big = Big_
      
      type BigConstructor = BigConstructor_
      
      type BigSource = BigSource_
      
      /* Rewritten from type alias, can be one of: 
        - typings.bigJs.bigJsNumbers.`1`
        - typings.bigJs.bigJsNumbers.`0`
        - typings.bigJs.bigJsNumbers.`-1`
      */
      trait Comparison extends StObject
      object Comparison {
        
        inline def EQ: `0` = 0.asInstanceOf[`0`]
        
        inline def GT: `1` = 1.asInstanceOf[`1`]
        
        inline def LT: `-1` = -1.asInstanceOf[`-1`]
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.bigJs.bigJsNumbers.`0`
        - typings.bigJs.bigJsNumbers.`1`
        - typings.bigJs.bigJsNumbers.`2`
        - typings.bigJs.bigJsNumbers.`3`
      */
      trait RoundingMode extends StObject
      object RoundingMode {
        
        /**
          * Rounds towards zero.
          * I.e. truncate, no rounding.
          */
        inline def RoundDown: `0` = 0.asInstanceOf[`0`]
        
        /**
          * Rounds towards nearest neighbour.
          * If equidistant, rounds towards even neighbour.
          */
        inline def RoundHalfEven: `2` = 2.asInstanceOf[`2`]
        
        /**
          * Rounds towards nearest neighbour.
          * If equidistant, rounds away from zero.
          */
        inline def RoundHalfUp: `1` = 1.asInstanceOf[`1`]
        
        /**
          * Rounds away from zero.
          */
        inline def RoundUp: `3` = 3.asInstanceOf[`3`]
      }
    }
  }
  
  @js.native
  trait BigConstructor
    extends StObject
       with /**
    * Returns a new instance of a Big number object
    *
    * String values may be in exponential, as well as normal (non-exponential) notation.
    * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
    * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
    * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
    *
    * @throws `NaN` on an invalid value.
    */
  Instantiable1[/* value */ BigSource, typings.bigJs.mod.Big] {
    
    /**
      * Create an additional Big number constructor
      *
      * Values created with the returned constructor will have a separate set of configuration values.
      * This can be used to create Big objects with different DP and RM values.
      * Big numbers created by different constructors can be used together in operations, and it is the DP and RM setting of the Big number that an operation is called upon that will apply.
      * In the interest of memory efficiency, all Big number constructors share the same prototype object,
      * so while the DP and RM (and any other own properties) of a constructor are isolated and untouchable by another, its prototype methods are not.
      */
    def apply(): BigConstructor = js.native
    /**
      * Returns a new instance of a Big number object
      *
      * String values may be in exponential, as well as normal (non-exponential) notation.
      * There is no limit to the number of digits of a string value (other than that of Javascript's maximum array size), but the largest recommended exponent magnitude is 1e+6.
      * Infinity, NaN and hexadecimal literal strings, e.g. '0xff', are not valid.
      * String values in octal literal form will be interpreted as decimals, e.g. '011' is 11, not 9.
      *
      * @throws `NaN` on an invalid value.
      */
    def apply(value: BigSource): typings.bigJs.mod.Big = js.native
    
    /**
      * The maximum number of decimal places of the results of operations involving division.
      * It is relevant only to the div and sqrt methods, and the pow method when the exponent is negative.
      *
      * 0 to 1e+6 inclusive
      * Default value: 20
      */
    var DP: Double = js.native
    
    /**
      * The negative exponent value at and below which toString returns exponential notation.
      *
      * -1e+6 to 0 inclusive
      * Default value: -7
      */
    var NE: Double = js.native
    
    /**
      * The positive exponent value at and above which toString returns exponential notation.
      *
      * 0 to 1e+6 inclusive
      * Default value: 21
      */
    var PE: Double = js.native
    
    /**
      * The rounding mode used in the above operations and by round, toExponential, toFixed and toPrecision.
      * Default value: 1
      */
    var RM: Double = js.native
  }
  
  type BigConstructor_ = BigConstructor
  
  type BigSource = Double | String | typings.bigJs.mod.Big
  
  type BigSource_ = BigSource
  
  type Big_ = typings.bigJs.mod.Big
  
  /* Rewritten from type alias, can be one of: 
    - typings.bigJs.bigJsNumbers.`1`
    - typings.bigJs.bigJsNumbers.`0`
    - typings.bigJs.bigJsNumbers.`-1`
  */
  trait Comparison extends StObject
  object Comparison {
    
    inline def EQ: `0` = 0.asInstanceOf[`0`]
    
    inline def GT: `1` = 1.asInstanceOf[`1`]
    
    inline def LT: `-1` = -1.asInstanceOf[`-1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bigJs.bigJsNumbers.`0`
    - typings.bigJs.bigJsNumbers.`1`
    - typings.bigJs.bigJsNumbers.`2`
    - typings.bigJs.bigJsNumbers.`3`
  */
  trait RoundingMode extends StObject
  object RoundingMode {
    
    /**
      * Rounds towards zero.
      * I.e. truncate, no rounding.
      */
    inline def RoundDown: `0` = 0.asInstanceOf[`0`]
    
    /**
      * Rounds towards nearest neighbour.
      * If equidistant, rounds towards even neighbour.
      */
    inline def RoundHalfEven: `2` = 2.asInstanceOf[`2`]
    
    /**
      * Rounds towards nearest neighbour.
      * If equidistant, rounds away from zero.
      */
    inline def RoundHalfUp: `1` = 1.asInstanceOf[`1`]
    
    /**
      * Rounds away from zero.
      */
    inline def RoundUp: `3` = 3.asInstanceOf[`3`]
  }
  
  type _To = BigConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: BigConstructor = default
}
