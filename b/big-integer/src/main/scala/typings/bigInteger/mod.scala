package typings.bigInteger

import org.scalablytyped.runtime.Shortcut
import typings.bigInteger.anon.Quotient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("big-integer", JSImport.Namespace)
  @js.native
  val ^ : BigIntegerStatic = js.native
  
  @js.native
  trait BaseArray extends StObject {
    
    var isNegative: Boolean = js.native
    
    var value: js.Array[Double] = js.native
  }
  object BaseArray {
    
    @scala.inline
    def apply(isNegative: Boolean, value: js.Array[Double]): BaseArray = {
      val __obj = js.Dynamic.literal(isNegative = isNegative.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseArray]
    }
    
    @scala.inline
    implicit class BaseArrayMutableBuilder[Self <: BaseArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsNegative(value: Boolean): Self = StObject.set(x, "isNegative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BigInteger extends StObject {
    
    /**
      * Returns the absolute value of a bigInt.
      */
    def abs(): BigInteger = js.native
    
    /**
      * Performs addition.
      */
    def add(number: BigNumber): BigInteger = js.native
    
    /**
      * Performs the bitwise AND operation.
      */
    def and(number: BigNumber): BigInteger = js.native
    
    /**
      * Returns the number of digits required to represent a bigInt in binary.
      */
    def bitLength(): BigInteger = js.native
    
    /**
      * Performs a comparison between two numbers. If the numbers are equal, it returns 0.
      * If the first number is greater, it returns 1. If the first number is lesser, it returns -1.
      */
    def compare(number: BigNumber): Double = js.native
    
    /**
      * Performs a comparison between the absolute value of two numbers.
      */
    def compareAbs(number: BigNumber): Double = js.native
    
    /**
      * Alias for the compare method.
      */
    def compareTo(number: BigNumber): Double = js.native
    
    /**
      * Performs integer division, disregarding the remainder.
      */
    def divide(number: BigNumber): BigInteger = js.native
    
    /**
      * Performs division and returns an object with two properties: quotient and remainder.
      * The sign of the remainder will match the sign of the dividend.
      */
    def divmod(number: BigNumber): Quotient = js.native
    
    /**
      * Alias for the equals method.
      */
    def eq(number: BigNumber): Boolean = js.native
    
    /**
      * Checks if two numbers are equal.
      */
    def equals(number: BigNumber): Boolean = js.native
    
    /**
      * Alias for the greaterOrEquals method.
      */
    def geq(number: BigNumber): Boolean = js.native
    
    /**
      * Checks if the first number is greater than the second.
      */
    def greater(number: BigNumber): Boolean = js.native
    
    /**
      * Checks if the first number is greater than or equal to the second.
      */
    def greaterOrEquals(number: BigNumber): Boolean = js.native
    
    /**
      * Alias for the greater method.
      */
    def gt(number: BigNumber): Boolean = js.native
    
    /**
      * Returns true if the first number is divisible by the second number, false otherwise.
      */
    def isDivisibleBy(number: BigNumber): Boolean = js.native
    
    /**
      * Returns true if the number is even, false otherwise.
      */
    def isEven(): Boolean = js.native
    
    /**
      * Returns true if the number is negative, false otherwise.
      * Returns false for 0 and true for -0.
      */
    def isNegative(): Boolean = js.native
    
    /**
      * Returns true if the number is odd, false otherwise.
      */
    def isOdd(): Boolean = js.native
    
    /**
      * Return true if the number is positive, false otherwise.
      * Returns true for 0 and false for -0.
      */
    def isPositive(): Boolean = js.native
    
    /**
      * Returns true if the number is prime, false otherwise.
      */
    def isPrime(): Boolean = js.native
    
    /**
      * Returns true if the number is very likely to be prime, false otherwise.
      */
    def isProbablePrime(): Boolean = js.native
    def isProbablePrime(iterations: js.UndefOr[scala.Nothing], rng: js.Function0[Double]): Boolean = js.native
    def isProbablePrime(iterations: Double): Boolean = js.native
    def isProbablePrime(iterations: Double, rng: js.Function0[Double]): Boolean = js.native
    
    /**
      * Returns true if the number is 1 or -1, false otherwise.
      */
    def isUnit(): Boolean = js.native
    
    /**
      * Return true if the number is 0 or -0, false otherwise.
      */
    def isZero(): Boolean = js.native
    
    /**
      * Alias for the lesserOrEquals method.
      */
    def leq(number: BigNumber): Boolean = js.native
    
    /**
      * Checks if the first number is lesser than the second.
      */
    def lesser(number: BigNumber): Boolean = js.native
    
    /**
      * Checks if the first number is less than or equal to the second.
      */
    def lesserOrEquals(number: BigNumber): Boolean = js.native
    
    /**
      * Alias for the lesser method.
      */
    def lt(number: BigNumber): Boolean = js.native
    
    /**
      * Alias for the subtract method.
      */
    def minus(number: BigNumber): BigInteger = js.native
    
    /**
      * Performs division and returns the remainder, disregarding the quotient.
      * The sign of the remainder will match the sign of the dividend.
      */
    def mod(number: BigNumber): BigInteger = js.native
    
    /**
      * Finds the multiplicative inverse of the number modulo mod.
      */
    def modInv(number: BigNumber): BigInteger = js.native
    
    /**
      * Takes the number to the power exp modulo mod.
      */
    def modPow(exp: BigNumber, mod: BigNumber): BigInteger = js.native
    
    /**
      * Performs multiplication.
      */
    def multiply(number: BigNumber): BigInteger = js.native
    
    /**
      * Reverses the sign of the number.
      */
    def negate(): BigInteger = js.native
    
    /**
      * Alias for the notEquals method.
      */
    def neq(number: BigNumber): Boolean = js.native
    
    /**
      * Adds one to the number.
      */
    def next(): BigInteger = js.native
    
    /**
      * Performs the bitwise NOT operation.
      */
    def not(): BigInteger = js.native
    
    /**
      * Checks if two numbers are not equal.
      */
    def notEquals(number: BigNumber): Boolean = js.native
    
    /**
      * Performs the bitwise OR operation.
      */
    def or(number: BigNumber): BigInteger = js.native
    
    /**
      * Alias for the divide method.
      */
    def over(number: BigNumber): BigInteger = js.native
    
    /**
      * Alias for the add method.
      */
    def plus(number: BigNumber): BigInteger = js.native
    
    /**
      * Performs exponentiation. If the exponent is less than 0, pow returns 0.
      * bigInt.zero.pow(0) returns 1.
      */
    def pow(number: BigNumber): BigInteger = js.native
    
    /**
      * Subtracts one from the number.
      */
    def prev(): BigInteger = js.native
    
    /**
      * Alias for the mod method.
      */
    def remainder(number: BigNumber): BigInteger = js.native
    
    /**
      * Shifts the number left by n places in its binary representation.
      * If a negative number is provided, it will shift right.
      *
      * Throws an error if number is outside of the range [-9007199254740992, 9007199254740992].
      */
    def shiftLeft(number: BigNumber): BigInteger = js.native
    
    /**
      * Shifts the number right by n places in its binary representation.
      * If a negative number is provided, it will shift left.
      *
      * Throws an error if number is outside of the range [-9007199254740992, 9007199254740992].
      */
    def shiftRight(number: BigNumber): BigInteger = js.native
    
    /**
      * Squares the number.
      */
    def square(): BigInteger = js.native
    
    /**
      * Performs subtraction.
      */
    def subtract(number: BigNumber): BigInteger = js.native
    
    /**
      * Alias for the multiply method.
      */
    def times(number: BigNumber): BigInteger = js.native
    
    /**
      *
      * Converts a bigInt to an object representing it as an array of integers module the given radix.
      */
    def toArray(radix: Double): BaseArray = js.native
    
    /**
      * Converts a bigInt into a native Javascript number. Loses precision for numbers outside the range.
      */
    def toJSNumber(): Double = js.native
    
    /**
      * Converts a bigInt to a string. This method is called behind the scenes in JSON.stringify.
      */
    def toJSON(): String = js.native
    
    def toString(radix: js.UndefOr[scala.Nothing], alphabet: String): String = js.native
    def toString(radix: Double): String = js.native
    def toString(radix: Double, alphabet: String): String = js.native
    
    /**
      * Performs the bitwise XOR operation.
      */
    def xor(number: BigNumber): BigInteger = js.native
  }
  
  // Array constant accessors
  @js.native
  trait BigIntegerStatic extends StObject {
    
    /**
      * Equivalent to bigInt(0).
      */
    def apply(): BigInteger = js.native
    /**
      * no-op.
      */
    def apply(bigInt: BigInteger): BigInteger = js.native
    /**
      * Parse a Javascript native bigint into a bigInt.
      */
    def apply(number: js.BigInt): BigInteger = js.native
    /**
      * Parse a Javascript number into a bigInt.
      */
    def apply(number: Double): BigInteger = js.native
    /**
      * Parse a string into a bigInt.
      * Default base is 10.
      * Default alphabet is "0123456789abcdefghijklmnopqrstuvwxyz".
      * caseSensitive defaults to false.
      */
    def apply(string: String): BigInteger = js.native
    def apply(
      string: String,
      base: js.UndefOr[BigNumber],
      alphabet: js.UndefOr[scala.Nothing],
      caseSensitive: Boolean
    ): BigInteger = js.native
    def apply(string: String, base: js.UndefOr[BigNumber], alphabet: String): BigInteger = js.native
    def apply(string: String, base: js.UndefOr[BigNumber], alphabet: String, caseSensitive: Boolean): BigInteger = js.native
    def apply(string: String, base: BigNumber): BigInteger = js.native
    
    var `-1`: BigInteger = js.native
    
    var `-10`: BigInteger = js.native
    
    var `-100`: BigInteger = js.native
    
    var `-101`: BigInteger = js.native
    
    var `-102`: BigInteger = js.native
    
    var `-103`: BigInteger = js.native
    
    var `-104`: BigInteger = js.native
    
    var `-105`: BigInteger = js.native
    
    var `-106`: BigInteger = js.native
    
    var `-107`: BigInteger = js.native
    
    var `-108`: BigInteger = js.native
    
    var `-109`: BigInteger = js.native
    
    var `-11`: BigInteger = js.native
    
    var `-110`: BigInteger = js.native
    
    var `-111`: BigInteger = js.native
    
    var `-112`: BigInteger = js.native
    
    var `-113`: BigInteger = js.native
    
    var `-114`: BigInteger = js.native
    
    var `-115`: BigInteger = js.native
    
    var `-116`: BigInteger = js.native
    
    var `-117`: BigInteger = js.native
    
    var `-118`: BigInteger = js.native
    
    var `-119`: BigInteger = js.native
    
    var `-12`: BigInteger = js.native
    
    var `-120`: BigInteger = js.native
    
    var `-121`: BigInteger = js.native
    
    var `-122`: BigInteger = js.native
    
    var `-123`: BigInteger = js.native
    
    var `-124`: BigInteger = js.native
    
    var `-125`: BigInteger = js.native
    
    var `-126`: BigInteger = js.native
    
    var `-127`: BigInteger = js.native
    
    var `-128`: BigInteger = js.native
    
    var `-129`: BigInteger = js.native
    
    var `-13`: BigInteger = js.native
    
    var `-130`: BigInteger = js.native
    
    var `-131`: BigInteger = js.native
    
    var `-132`: BigInteger = js.native
    
    var `-133`: BigInteger = js.native
    
    var `-134`: BigInteger = js.native
    
    var `-135`: BigInteger = js.native
    
    var `-136`: BigInteger = js.native
    
    var `-137`: BigInteger = js.native
    
    var `-138`: BigInteger = js.native
    
    var `-139`: BigInteger = js.native
    
    var `-14`: BigInteger = js.native
    
    var `-140`: BigInteger = js.native
    
    var `-141`: BigInteger = js.native
    
    var `-142`: BigInteger = js.native
    
    var `-143`: BigInteger = js.native
    
    var `-144`: BigInteger = js.native
    
    var `-145`: BigInteger = js.native
    
    var `-146`: BigInteger = js.native
    
    var `-147`: BigInteger = js.native
    
    var `-148`: BigInteger = js.native
    
    var `-149`: BigInteger = js.native
    
    var `-15`: BigInteger = js.native
    
    var `-150`: BigInteger = js.native
    
    var `-151`: BigInteger = js.native
    
    var `-152`: BigInteger = js.native
    
    var `-153`: BigInteger = js.native
    
    var `-154`: BigInteger = js.native
    
    var `-155`: BigInteger = js.native
    
    var `-156`: BigInteger = js.native
    
    var `-157`: BigInteger = js.native
    
    var `-158`: BigInteger = js.native
    
    var `-159`: BigInteger = js.native
    
    var `-16`: BigInteger = js.native
    
    var `-160`: BigInteger = js.native
    
    var `-161`: BigInteger = js.native
    
    var `-162`: BigInteger = js.native
    
    var `-163`: BigInteger = js.native
    
    var `-164`: BigInteger = js.native
    
    var `-165`: BigInteger = js.native
    
    var `-166`: BigInteger = js.native
    
    var `-167`: BigInteger = js.native
    
    var `-168`: BigInteger = js.native
    
    var `-169`: BigInteger = js.native
    
    var `-17`: BigInteger = js.native
    
    var `-170`: BigInteger = js.native
    
    var `-171`: BigInteger = js.native
    
    var `-172`: BigInteger = js.native
    
    var `-173`: BigInteger = js.native
    
    var `-174`: BigInteger = js.native
    
    var `-175`: BigInteger = js.native
    
    var `-176`: BigInteger = js.native
    
    var `-177`: BigInteger = js.native
    
    var `-178`: BigInteger = js.native
    
    var `-179`: BigInteger = js.native
    
    var `-18`: BigInteger = js.native
    
    var `-180`: BigInteger = js.native
    
    var `-181`: BigInteger = js.native
    
    var `-182`: BigInteger = js.native
    
    var `-183`: BigInteger = js.native
    
    var `-184`: BigInteger = js.native
    
    var `-185`: BigInteger = js.native
    
    var `-186`: BigInteger = js.native
    
    var `-187`: BigInteger = js.native
    
    var `-188`: BigInteger = js.native
    
    var `-189`: BigInteger = js.native
    
    var `-19`: BigInteger = js.native
    
    var `-190`: BigInteger = js.native
    
    var `-191`: BigInteger = js.native
    
    var `-192`: BigInteger = js.native
    
    var `-193`: BigInteger = js.native
    
    var `-194`: BigInteger = js.native
    
    var `-195`: BigInteger = js.native
    
    var `-196`: BigInteger = js.native
    
    var `-197`: BigInteger = js.native
    
    var `-198`: BigInteger = js.native
    
    var `-199`: BigInteger = js.native
    
    var `-2`: BigInteger = js.native
    
    var `-20`: BigInteger = js.native
    
    var `-200`: BigInteger = js.native
    
    var `-201`: BigInteger = js.native
    
    var `-202`: BigInteger = js.native
    
    var `-203`: BigInteger = js.native
    
    var `-204`: BigInteger = js.native
    
    var `-205`: BigInteger = js.native
    
    var `-206`: BigInteger = js.native
    
    var `-207`: BigInteger = js.native
    
    var `-208`: BigInteger = js.native
    
    var `-209`: BigInteger = js.native
    
    var `-21`: BigInteger = js.native
    
    var `-210`: BigInteger = js.native
    
    var `-211`: BigInteger = js.native
    
    var `-212`: BigInteger = js.native
    
    var `-213`: BigInteger = js.native
    
    var `-214`: BigInteger = js.native
    
    var `-215`: BigInteger = js.native
    
    var `-216`: BigInteger = js.native
    
    var `-217`: BigInteger = js.native
    
    var `-218`: BigInteger = js.native
    
    var `-219`: BigInteger = js.native
    
    var `-22`: BigInteger = js.native
    
    var `-220`: BigInteger = js.native
    
    var `-221`: BigInteger = js.native
    
    var `-222`: BigInteger = js.native
    
    var `-223`: BigInteger = js.native
    
    var `-224`: BigInteger = js.native
    
    var `-225`: BigInteger = js.native
    
    var `-226`: BigInteger = js.native
    
    var `-227`: BigInteger = js.native
    
    var `-228`: BigInteger = js.native
    
    var `-229`: BigInteger = js.native
    
    var `-23`: BigInteger = js.native
    
    var `-230`: BigInteger = js.native
    
    var `-231`: BigInteger = js.native
    
    var `-232`: BigInteger = js.native
    
    var `-233`: BigInteger = js.native
    
    var `-234`: BigInteger = js.native
    
    var `-235`: BigInteger = js.native
    
    var `-236`: BigInteger = js.native
    
    var `-237`: BigInteger = js.native
    
    var `-238`: BigInteger = js.native
    
    var `-239`: BigInteger = js.native
    
    var `-24`: BigInteger = js.native
    
    var `-240`: BigInteger = js.native
    
    var `-241`: BigInteger = js.native
    
    var `-242`: BigInteger = js.native
    
    var `-243`: BigInteger = js.native
    
    var `-244`: BigInteger = js.native
    
    var `-245`: BigInteger = js.native
    
    var `-246`: BigInteger = js.native
    
    var `-247`: BigInteger = js.native
    
    var `-248`: BigInteger = js.native
    
    var `-249`: BigInteger = js.native
    
    var `-25`: BigInteger = js.native
    
    var `-250`: BigInteger = js.native
    
    var `-251`: BigInteger = js.native
    
    var `-252`: BigInteger = js.native
    
    var `-253`: BigInteger = js.native
    
    var `-254`: BigInteger = js.native
    
    var `-255`: BigInteger = js.native
    
    var `-256`: BigInteger = js.native
    
    var `-257`: BigInteger = js.native
    
    var `-258`: BigInteger = js.native
    
    var `-259`: BigInteger = js.native
    
    var `-26`: BigInteger = js.native
    
    var `-260`: BigInteger = js.native
    
    var `-261`: BigInteger = js.native
    
    var `-262`: BigInteger = js.native
    
    var `-263`: BigInteger = js.native
    
    var `-264`: BigInteger = js.native
    
    var `-265`: BigInteger = js.native
    
    var `-266`: BigInteger = js.native
    
    var `-267`: BigInteger = js.native
    
    var `-268`: BigInteger = js.native
    
    var `-269`: BigInteger = js.native
    
    var `-27`: BigInteger = js.native
    
    var `-270`: BigInteger = js.native
    
    var `-271`: BigInteger = js.native
    
    var `-272`: BigInteger = js.native
    
    var `-273`: BigInteger = js.native
    
    var `-274`: BigInteger = js.native
    
    var `-275`: BigInteger = js.native
    
    var `-276`: BigInteger = js.native
    
    var `-277`: BigInteger = js.native
    
    var `-278`: BigInteger = js.native
    
    var `-279`: BigInteger = js.native
    
    var `-28`: BigInteger = js.native
    
    var `-280`: BigInteger = js.native
    
    var `-281`: BigInteger = js.native
    
    var `-282`: BigInteger = js.native
    
    var `-283`: BigInteger = js.native
    
    var `-284`: BigInteger = js.native
    
    var `-285`: BigInteger = js.native
    
    var `-286`: BigInteger = js.native
    
    var `-287`: BigInteger = js.native
    
    var `-288`: BigInteger = js.native
    
    var `-289`: BigInteger = js.native
    
    var `-29`: BigInteger = js.native
    
    var `-290`: BigInteger = js.native
    
    var `-291`: BigInteger = js.native
    
    var `-292`: BigInteger = js.native
    
    var `-293`: BigInteger = js.native
    
    var `-294`: BigInteger = js.native
    
    var `-295`: BigInteger = js.native
    
    var `-296`: BigInteger = js.native
    
    var `-297`: BigInteger = js.native
    
    var `-298`: BigInteger = js.native
    
    var `-299`: BigInteger = js.native
    
    var `-3`: BigInteger = js.native
    
    var `-30`: BigInteger = js.native
    
    var `-300`: BigInteger = js.native
    
    var `-301`: BigInteger = js.native
    
    var `-302`: BigInteger = js.native
    
    var `-303`: BigInteger = js.native
    
    var `-304`: BigInteger = js.native
    
    var `-305`: BigInteger = js.native
    
    var `-306`: BigInteger = js.native
    
    var `-307`: BigInteger = js.native
    
    var `-308`: BigInteger = js.native
    
    var `-309`: BigInteger = js.native
    
    var `-31`: BigInteger = js.native
    
    var `-310`: BigInteger = js.native
    
    var `-311`: BigInteger = js.native
    
    var `-312`: BigInteger = js.native
    
    var `-313`: BigInteger = js.native
    
    var `-314`: BigInteger = js.native
    
    var `-315`: BigInteger = js.native
    
    var `-316`: BigInteger = js.native
    
    var `-317`: BigInteger = js.native
    
    var `-318`: BigInteger = js.native
    
    var `-319`: BigInteger = js.native
    
    var `-32`: BigInteger = js.native
    
    var `-320`: BigInteger = js.native
    
    var `-321`: BigInteger = js.native
    
    var `-322`: BigInteger = js.native
    
    var `-323`: BigInteger = js.native
    
    var `-324`: BigInteger = js.native
    
    var `-325`: BigInteger = js.native
    
    var `-326`: BigInteger = js.native
    
    var `-327`: BigInteger = js.native
    
    var `-328`: BigInteger = js.native
    
    var `-329`: BigInteger = js.native
    
    var `-33`: BigInteger = js.native
    
    var `-330`: BigInteger = js.native
    
    var `-331`: BigInteger = js.native
    
    var `-332`: BigInteger = js.native
    
    var `-333`: BigInteger = js.native
    
    var `-334`: BigInteger = js.native
    
    var `-335`: BigInteger = js.native
    
    var `-336`: BigInteger = js.native
    
    var `-337`: BigInteger = js.native
    
    var `-338`: BigInteger = js.native
    
    var `-339`: BigInteger = js.native
    
    var `-34`: BigInteger = js.native
    
    var `-340`: BigInteger = js.native
    
    var `-341`: BigInteger = js.native
    
    var `-342`: BigInteger = js.native
    
    var `-343`: BigInteger = js.native
    
    var `-344`: BigInteger = js.native
    
    var `-345`: BigInteger = js.native
    
    var `-346`: BigInteger = js.native
    
    var `-347`: BigInteger = js.native
    
    var `-348`: BigInteger = js.native
    
    var `-349`: BigInteger = js.native
    
    var `-35`: BigInteger = js.native
    
    var `-350`: BigInteger = js.native
    
    var `-351`: BigInteger = js.native
    
    var `-352`: BigInteger = js.native
    
    var `-353`: BigInteger = js.native
    
    var `-354`: BigInteger = js.native
    
    var `-355`: BigInteger = js.native
    
    var `-356`: BigInteger = js.native
    
    var `-357`: BigInteger = js.native
    
    var `-358`: BigInteger = js.native
    
    var `-359`: BigInteger = js.native
    
    var `-36`: BigInteger = js.native
    
    var `-360`: BigInteger = js.native
    
    var `-361`: BigInteger = js.native
    
    var `-362`: BigInteger = js.native
    
    var `-363`: BigInteger = js.native
    
    var `-364`: BigInteger = js.native
    
    var `-365`: BigInteger = js.native
    
    var `-366`: BigInteger = js.native
    
    var `-367`: BigInteger = js.native
    
    var `-368`: BigInteger = js.native
    
    var `-369`: BigInteger = js.native
    
    var `-37`: BigInteger = js.native
    
    var `-370`: BigInteger = js.native
    
    var `-371`: BigInteger = js.native
    
    var `-372`: BigInteger = js.native
    
    var `-373`: BigInteger = js.native
    
    var `-374`: BigInteger = js.native
    
    var `-375`: BigInteger = js.native
    
    var `-376`: BigInteger = js.native
    
    var `-377`: BigInteger = js.native
    
    var `-378`: BigInteger = js.native
    
    var `-379`: BigInteger = js.native
    
    var `-38`: BigInteger = js.native
    
    var `-380`: BigInteger = js.native
    
    var `-381`: BigInteger = js.native
    
    var `-382`: BigInteger = js.native
    
    var `-383`: BigInteger = js.native
    
    var `-384`: BigInteger = js.native
    
    var `-385`: BigInteger = js.native
    
    var `-386`: BigInteger = js.native
    
    var `-387`: BigInteger = js.native
    
    var `-388`: BigInteger = js.native
    
    var `-389`: BigInteger = js.native
    
    var `-39`: BigInteger = js.native
    
    var `-390`: BigInteger = js.native
    
    var `-391`: BigInteger = js.native
    
    var `-392`: BigInteger = js.native
    
    var `-393`: BigInteger = js.native
    
    var `-394`: BigInteger = js.native
    
    var `-395`: BigInteger = js.native
    
    var `-396`: BigInteger = js.native
    
    var `-397`: BigInteger = js.native
    
    var `-398`: BigInteger = js.native
    
    var `-399`: BigInteger = js.native
    
    var `-4`: BigInteger = js.native
    
    var `-40`: BigInteger = js.native
    
    var `-400`: BigInteger = js.native
    
    var `-401`: BigInteger = js.native
    
    var `-402`: BigInteger = js.native
    
    var `-403`: BigInteger = js.native
    
    var `-404`: BigInteger = js.native
    
    var `-405`: BigInteger = js.native
    
    var `-406`: BigInteger = js.native
    
    var `-407`: BigInteger = js.native
    
    var `-408`: BigInteger = js.native
    
    var `-409`: BigInteger = js.native
    
    var `-41`: BigInteger = js.native
    
    var `-410`: BigInteger = js.native
    
    var `-411`: BigInteger = js.native
    
    var `-412`: BigInteger = js.native
    
    var `-413`: BigInteger = js.native
    
    var `-414`: BigInteger = js.native
    
    var `-415`: BigInteger = js.native
    
    var `-416`: BigInteger = js.native
    
    var `-417`: BigInteger = js.native
    
    var `-418`: BigInteger = js.native
    
    var `-419`: BigInteger = js.native
    
    var `-42`: BigInteger = js.native
    
    var `-420`: BigInteger = js.native
    
    var `-421`: BigInteger = js.native
    
    var `-422`: BigInteger = js.native
    
    var `-423`: BigInteger = js.native
    
    var `-424`: BigInteger = js.native
    
    var `-425`: BigInteger = js.native
    
    var `-426`: BigInteger = js.native
    
    var `-427`: BigInteger = js.native
    
    var `-428`: BigInteger = js.native
    
    var `-429`: BigInteger = js.native
    
    var `-43`: BigInteger = js.native
    
    var `-430`: BigInteger = js.native
    
    var `-431`: BigInteger = js.native
    
    var `-432`: BigInteger = js.native
    
    var `-433`: BigInteger = js.native
    
    var `-434`: BigInteger = js.native
    
    var `-435`: BigInteger = js.native
    
    var `-436`: BigInteger = js.native
    
    var `-437`: BigInteger = js.native
    
    var `-438`: BigInteger = js.native
    
    var `-439`: BigInteger = js.native
    
    var `-44`: BigInteger = js.native
    
    var `-440`: BigInteger = js.native
    
    var `-441`: BigInteger = js.native
    
    var `-442`: BigInteger = js.native
    
    var `-443`: BigInteger = js.native
    
    var `-444`: BigInteger = js.native
    
    var `-445`: BigInteger = js.native
    
    var `-446`: BigInteger = js.native
    
    var `-447`: BigInteger = js.native
    
    var `-448`: BigInteger = js.native
    
    var `-449`: BigInteger = js.native
    
    var `-45`: BigInteger = js.native
    
    var `-450`: BigInteger = js.native
    
    var `-451`: BigInteger = js.native
    
    var `-452`: BigInteger = js.native
    
    var `-453`: BigInteger = js.native
    
    var `-454`: BigInteger = js.native
    
    var `-455`: BigInteger = js.native
    
    var `-456`: BigInteger = js.native
    
    var `-457`: BigInteger = js.native
    
    var `-458`: BigInteger = js.native
    
    var `-459`: BigInteger = js.native
    
    var `-46`: BigInteger = js.native
    
    var `-460`: BigInteger = js.native
    
    var `-461`: BigInteger = js.native
    
    var `-462`: BigInteger = js.native
    
    var `-463`: BigInteger = js.native
    
    var `-464`: BigInteger = js.native
    
    var `-465`: BigInteger = js.native
    
    var `-466`: BigInteger = js.native
    
    var `-467`: BigInteger = js.native
    
    var `-468`: BigInteger = js.native
    
    var `-469`: BigInteger = js.native
    
    var `-47`: BigInteger = js.native
    
    var `-470`: BigInteger = js.native
    
    var `-471`: BigInteger = js.native
    
    var `-472`: BigInteger = js.native
    
    var `-473`: BigInteger = js.native
    
    var `-474`: BigInteger = js.native
    
    var `-475`: BigInteger = js.native
    
    var `-476`: BigInteger = js.native
    
    var `-477`: BigInteger = js.native
    
    var `-478`: BigInteger = js.native
    
    var `-479`: BigInteger = js.native
    
    var `-48`: BigInteger = js.native
    
    var `-480`: BigInteger = js.native
    
    var `-481`: BigInteger = js.native
    
    var `-482`: BigInteger = js.native
    
    var `-483`: BigInteger = js.native
    
    var `-484`: BigInteger = js.native
    
    var `-485`: BigInteger = js.native
    
    var `-486`: BigInteger = js.native
    
    var `-487`: BigInteger = js.native
    
    var `-488`: BigInteger = js.native
    
    var `-489`: BigInteger = js.native
    
    var `-49`: BigInteger = js.native
    
    var `-490`: BigInteger = js.native
    
    var `-491`: BigInteger = js.native
    
    var `-492`: BigInteger = js.native
    
    var `-493`: BigInteger = js.native
    
    var `-494`: BigInteger = js.native
    
    var `-495`: BigInteger = js.native
    
    var `-496`: BigInteger = js.native
    
    var `-497`: BigInteger = js.native
    
    var `-498`: BigInteger = js.native
    
    var `-499`: BigInteger = js.native
    
    var `-5`: BigInteger = js.native
    
    var `-50`: BigInteger = js.native
    
    var `-500`: BigInteger = js.native
    
    var `-501`: BigInteger = js.native
    
    var `-502`: BigInteger = js.native
    
    var `-503`: BigInteger = js.native
    
    var `-504`: BigInteger = js.native
    
    var `-505`: BigInteger = js.native
    
    var `-506`: BigInteger = js.native
    
    var `-507`: BigInteger = js.native
    
    var `-508`: BigInteger = js.native
    
    var `-509`: BigInteger = js.native
    
    var `-51`: BigInteger = js.native
    
    var `-510`: BigInteger = js.native
    
    var `-511`: BigInteger = js.native
    
    var `-512`: BigInteger = js.native
    
    var `-513`: BigInteger = js.native
    
    var `-514`: BigInteger = js.native
    
    var `-515`: BigInteger = js.native
    
    var `-516`: BigInteger = js.native
    
    var `-517`: BigInteger = js.native
    
    var `-518`: BigInteger = js.native
    
    var `-519`: BigInteger = js.native
    
    var `-52`: BigInteger = js.native
    
    var `-520`: BigInteger = js.native
    
    var `-521`: BigInteger = js.native
    
    var `-522`: BigInteger = js.native
    
    var `-523`: BigInteger = js.native
    
    var `-524`: BigInteger = js.native
    
    var `-525`: BigInteger = js.native
    
    var `-526`: BigInteger = js.native
    
    var `-527`: BigInteger = js.native
    
    var `-528`: BigInteger = js.native
    
    var `-529`: BigInteger = js.native
    
    var `-53`: BigInteger = js.native
    
    var `-530`: BigInteger = js.native
    
    var `-531`: BigInteger = js.native
    
    var `-532`: BigInteger = js.native
    
    var `-533`: BigInteger = js.native
    
    var `-534`: BigInteger = js.native
    
    var `-535`: BigInteger = js.native
    
    var `-536`: BigInteger = js.native
    
    var `-537`: BigInteger = js.native
    
    var `-538`: BigInteger = js.native
    
    var `-539`: BigInteger = js.native
    
    var `-54`: BigInteger = js.native
    
    var `-540`: BigInteger = js.native
    
    var `-541`: BigInteger = js.native
    
    var `-542`: BigInteger = js.native
    
    var `-543`: BigInteger = js.native
    
    var `-544`: BigInteger = js.native
    
    var `-545`: BigInteger = js.native
    
    var `-546`: BigInteger = js.native
    
    var `-547`: BigInteger = js.native
    
    var `-548`: BigInteger = js.native
    
    var `-549`: BigInteger = js.native
    
    var `-55`: BigInteger = js.native
    
    var `-550`: BigInteger = js.native
    
    var `-551`: BigInteger = js.native
    
    var `-552`: BigInteger = js.native
    
    var `-553`: BigInteger = js.native
    
    var `-554`: BigInteger = js.native
    
    var `-555`: BigInteger = js.native
    
    var `-556`: BigInteger = js.native
    
    var `-557`: BigInteger = js.native
    
    var `-558`: BigInteger = js.native
    
    var `-559`: BigInteger = js.native
    
    var `-56`: BigInteger = js.native
    
    var `-560`: BigInteger = js.native
    
    var `-561`: BigInteger = js.native
    
    var `-562`: BigInteger = js.native
    
    var `-563`: BigInteger = js.native
    
    var `-564`: BigInteger = js.native
    
    var `-565`: BigInteger = js.native
    
    var `-566`: BigInteger = js.native
    
    var `-567`: BigInteger = js.native
    
    var `-568`: BigInteger = js.native
    
    var `-569`: BigInteger = js.native
    
    var `-57`: BigInteger = js.native
    
    var `-570`: BigInteger = js.native
    
    var `-571`: BigInteger = js.native
    
    var `-572`: BigInteger = js.native
    
    var `-573`: BigInteger = js.native
    
    var `-574`: BigInteger = js.native
    
    var `-575`: BigInteger = js.native
    
    var `-576`: BigInteger = js.native
    
    var `-577`: BigInteger = js.native
    
    var `-578`: BigInteger = js.native
    
    var `-579`: BigInteger = js.native
    
    var `-58`: BigInteger = js.native
    
    var `-580`: BigInteger = js.native
    
    var `-581`: BigInteger = js.native
    
    var `-582`: BigInteger = js.native
    
    var `-583`: BigInteger = js.native
    
    var `-584`: BigInteger = js.native
    
    var `-585`: BigInteger = js.native
    
    var `-586`: BigInteger = js.native
    
    var `-587`: BigInteger = js.native
    
    var `-588`: BigInteger = js.native
    
    var `-589`: BigInteger = js.native
    
    var `-59`: BigInteger = js.native
    
    var `-590`: BigInteger = js.native
    
    var `-591`: BigInteger = js.native
    
    var `-592`: BigInteger = js.native
    
    var `-593`: BigInteger = js.native
    
    var `-594`: BigInteger = js.native
    
    var `-595`: BigInteger = js.native
    
    var `-596`: BigInteger = js.native
    
    var `-597`: BigInteger = js.native
    
    var `-598`: BigInteger = js.native
    
    var `-599`: BigInteger = js.native
    
    var `-6`: BigInteger = js.native
    
    var `-60`: BigInteger = js.native
    
    var `-600`: BigInteger = js.native
    
    var `-601`: BigInteger = js.native
    
    var `-602`: BigInteger = js.native
    
    var `-603`: BigInteger = js.native
    
    var `-604`: BigInteger = js.native
    
    var `-605`: BigInteger = js.native
    
    var `-606`: BigInteger = js.native
    
    var `-607`: BigInteger = js.native
    
    var `-608`: BigInteger = js.native
    
    var `-609`: BigInteger = js.native
    
    var `-61`: BigInteger = js.native
    
    var `-610`: BigInteger = js.native
    
    var `-611`: BigInteger = js.native
    
    var `-612`: BigInteger = js.native
    
    var `-613`: BigInteger = js.native
    
    var `-614`: BigInteger = js.native
    
    var `-615`: BigInteger = js.native
    
    var `-616`: BigInteger = js.native
    
    var `-617`: BigInteger = js.native
    
    var `-618`: BigInteger = js.native
    
    var `-619`: BigInteger = js.native
    
    var `-62`: BigInteger = js.native
    
    var `-620`: BigInteger = js.native
    
    var `-621`: BigInteger = js.native
    
    var `-622`: BigInteger = js.native
    
    var `-623`: BigInteger = js.native
    
    var `-624`: BigInteger = js.native
    
    var `-625`: BigInteger = js.native
    
    var `-626`: BigInteger = js.native
    
    var `-627`: BigInteger = js.native
    
    var `-628`: BigInteger = js.native
    
    var `-629`: BigInteger = js.native
    
    var `-63`: BigInteger = js.native
    
    var `-630`: BigInteger = js.native
    
    var `-631`: BigInteger = js.native
    
    var `-632`: BigInteger = js.native
    
    var `-633`: BigInteger = js.native
    
    var `-634`: BigInteger = js.native
    
    var `-635`: BigInteger = js.native
    
    var `-636`: BigInteger = js.native
    
    var `-637`: BigInteger = js.native
    
    var `-638`: BigInteger = js.native
    
    var `-639`: BigInteger = js.native
    
    var `-64`: BigInteger = js.native
    
    var `-640`: BigInteger = js.native
    
    var `-641`: BigInteger = js.native
    
    var `-642`: BigInteger = js.native
    
    var `-643`: BigInteger = js.native
    
    var `-644`: BigInteger = js.native
    
    var `-645`: BigInteger = js.native
    
    var `-646`: BigInteger = js.native
    
    var `-647`: BigInteger = js.native
    
    var `-648`: BigInteger = js.native
    
    var `-649`: BigInteger = js.native
    
    var `-65`: BigInteger = js.native
    
    var `-650`: BigInteger = js.native
    
    var `-651`: BigInteger = js.native
    
    var `-652`: BigInteger = js.native
    
    var `-653`: BigInteger = js.native
    
    var `-654`: BigInteger = js.native
    
    var `-655`: BigInteger = js.native
    
    var `-656`: BigInteger = js.native
    
    var `-657`: BigInteger = js.native
    
    var `-658`: BigInteger = js.native
    
    var `-659`: BigInteger = js.native
    
    var `-66`: BigInteger = js.native
    
    var `-660`: BigInteger = js.native
    
    var `-661`: BigInteger = js.native
    
    var `-662`: BigInteger = js.native
    
    var `-663`: BigInteger = js.native
    
    var `-664`: BigInteger = js.native
    
    var `-665`: BigInteger = js.native
    
    var `-666`: BigInteger = js.native
    
    var `-667`: BigInteger = js.native
    
    var `-668`: BigInteger = js.native
    
    var `-669`: BigInteger = js.native
    
    var `-67`: BigInteger = js.native
    
    var `-670`: BigInteger = js.native
    
    var `-671`: BigInteger = js.native
    
    var `-672`: BigInteger = js.native
    
    var `-673`: BigInteger = js.native
    
    var `-674`: BigInteger = js.native
    
    var `-675`: BigInteger = js.native
    
    var `-676`: BigInteger = js.native
    
    var `-677`: BigInteger = js.native
    
    var `-678`: BigInteger = js.native
    
    var `-679`: BigInteger = js.native
    
    var `-68`: BigInteger = js.native
    
    var `-680`: BigInteger = js.native
    
    var `-681`: BigInteger = js.native
    
    var `-682`: BigInteger = js.native
    
    var `-683`: BigInteger = js.native
    
    var `-684`: BigInteger = js.native
    
    var `-685`: BigInteger = js.native
    
    var `-686`: BigInteger = js.native
    
    var `-687`: BigInteger = js.native
    
    var `-688`: BigInteger = js.native
    
    var `-689`: BigInteger = js.native
    
    var `-69`: BigInteger = js.native
    
    var `-690`: BigInteger = js.native
    
    var `-691`: BigInteger = js.native
    
    var `-692`: BigInteger = js.native
    
    var `-693`: BigInteger = js.native
    
    var `-694`: BigInteger = js.native
    
    var `-695`: BigInteger = js.native
    
    var `-696`: BigInteger = js.native
    
    var `-697`: BigInteger = js.native
    
    var `-698`: BigInteger = js.native
    
    var `-699`: BigInteger = js.native
    
    var `-7`: BigInteger = js.native
    
    var `-70`: BigInteger = js.native
    
    var `-700`: BigInteger = js.native
    
    var `-701`: BigInteger = js.native
    
    var `-702`: BigInteger = js.native
    
    var `-703`: BigInteger = js.native
    
    var `-704`: BigInteger = js.native
    
    var `-705`: BigInteger = js.native
    
    var `-706`: BigInteger = js.native
    
    var `-707`: BigInteger = js.native
    
    var `-708`: BigInteger = js.native
    
    var `-709`: BigInteger = js.native
    
    var `-71`: BigInteger = js.native
    
    var `-710`: BigInteger = js.native
    
    var `-711`: BigInteger = js.native
    
    var `-712`: BigInteger = js.native
    
    var `-713`: BigInteger = js.native
    
    var `-714`: BigInteger = js.native
    
    var `-715`: BigInteger = js.native
    
    var `-716`: BigInteger = js.native
    
    var `-717`: BigInteger = js.native
    
    var `-718`: BigInteger = js.native
    
    var `-719`: BigInteger = js.native
    
    var `-72`: BigInteger = js.native
    
    var `-720`: BigInteger = js.native
    
    var `-721`: BigInteger = js.native
    
    var `-722`: BigInteger = js.native
    
    var `-723`: BigInteger = js.native
    
    var `-724`: BigInteger = js.native
    
    var `-725`: BigInteger = js.native
    
    var `-726`: BigInteger = js.native
    
    var `-727`: BigInteger = js.native
    
    var `-728`: BigInteger = js.native
    
    var `-729`: BigInteger = js.native
    
    var `-73`: BigInteger = js.native
    
    var `-730`: BigInteger = js.native
    
    var `-731`: BigInteger = js.native
    
    var `-732`: BigInteger = js.native
    
    var `-733`: BigInteger = js.native
    
    var `-734`: BigInteger = js.native
    
    var `-735`: BigInteger = js.native
    
    var `-736`: BigInteger = js.native
    
    var `-737`: BigInteger = js.native
    
    var `-738`: BigInteger = js.native
    
    var `-739`: BigInteger = js.native
    
    var `-74`: BigInteger = js.native
    
    var `-740`: BigInteger = js.native
    
    var `-741`: BigInteger = js.native
    
    var `-742`: BigInteger = js.native
    
    var `-743`: BigInteger = js.native
    
    var `-744`: BigInteger = js.native
    
    var `-745`: BigInteger = js.native
    
    var `-746`: BigInteger = js.native
    
    var `-747`: BigInteger = js.native
    
    var `-748`: BigInteger = js.native
    
    var `-749`: BigInteger = js.native
    
    var `-75`: BigInteger = js.native
    
    var `-750`: BigInteger = js.native
    
    var `-751`: BigInteger = js.native
    
    var `-752`: BigInteger = js.native
    
    var `-753`: BigInteger = js.native
    
    var `-754`: BigInteger = js.native
    
    var `-755`: BigInteger = js.native
    
    var `-756`: BigInteger = js.native
    
    var `-757`: BigInteger = js.native
    
    var `-758`: BigInteger = js.native
    
    var `-759`: BigInteger = js.native
    
    var `-76`: BigInteger = js.native
    
    var `-760`: BigInteger = js.native
    
    var `-761`: BigInteger = js.native
    
    var `-762`: BigInteger = js.native
    
    var `-763`: BigInteger = js.native
    
    var `-764`: BigInteger = js.native
    
    var `-765`: BigInteger = js.native
    
    var `-766`: BigInteger = js.native
    
    var `-767`: BigInteger = js.native
    
    var `-768`: BigInteger = js.native
    
    var `-769`: BigInteger = js.native
    
    var `-77`: BigInteger = js.native
    
    var `-770`: BigInteger = js.native
    
    var `-771`: BigInteger = js.native
    
    var `-772`: BigInteger = js.native
    
    var `-773`: BigInteger = js.native
    
    var `-774`: BigInteger = js.native
    
    var `-775`: BigInteger = js.native
    
    var `-776`: BigInteger = js.native
    
    var `-777`: BigInteger = js.native
    
    var `-778`: BigInteger = js.native
    
    var `-779`: BigInteger = js.native
    
    var `-78`: BigInteger = js.native
    
    var `-780`: BigInteger = js.native
    
    var `-781`: BigInteger = js.native
    
    var `-782`: BigInteger = js.native
    
    var `-783`: BigInteger = js.native
    
    var `-784`: BigInteger = js.native
    
    var `-785`: BigInteger = js.native
    
    var `-786`: BigInteger = js.native
    
    var `-787`: BigInteger = js.native
    
    var `-788`: BigInteger = js.native
    
    var `-789`: BigInteger = js.native
    
    var `-79`: BigInteger = js.native
    
    var `-790`: BigInteger = js.native
    
    var `-791`: BigInteger = js.native
    
    var `-792`: BigInteger = js.native
    
    var `-793`: BigInteger = js.native
    
    var `-794`: BigInteger = js.native
    
    var `-795`: BigInteger = js.native
    
    var `-796`: BigInteger = js.native
    
    var `-797`: BigInteger = js.native
    
    var `-798`: BigInteger = js.native
    
    var `-799`: BigInteger = js.native
    
    var `-8`: BigInteger = js.native
    
    var `-80`: BigInteger = js.native
    
    var `-800`: BigInteger = js.native
    
    var `-801`: BigInteger = js.native
    
    var `-802`: BigInteger = js.native
    
    var `-803`: BigInteger = js.native
    
    var `-804`: BigInteger = js.native
    
    var `-805`: BigInteger = js.native
    
    var `-806`: BigInteger = js.native
    
    var `-807`: BigInteger = js.native
    
    var `-808`: BigInteger = js.native
    
    var `-809`: BigInteger = js.native
    
    var `-81`: BigInteger = js.native
    
    var `-810`: BigInteger = js.native
    
    var `-811`: BigInteger = js.native
    
    var `-812`: BigInteger = js.native
    
    var `-813`: BigInteger = js.native
    
    var `-814`: BigInteger = js.native
    
    var `-815`: BigInteger = js.native
    
    var `-816`: BigInteger = js.native
    
    var `-817`: BigInteger = js.native
    
    var `-818`: BigInteger = js.native
    
    var `-819`: BigInteger = js.native
    
    var `-82`: BigInteger = js.native
    
    var `-820`: BigInteger = js.native
    
    var `-821`: BigInteger = js.native
    
    var `-822`: BigInteger = js.native
    
    var `-823`: BigInteger = js.native
    
    var `-824`: BigInteger = js.native
    
    var `-825`: BigInteger = js.native
    
    var `-826`: BigInteger = js.native
    
    var `-827`: BigInteger = js.native
    
    var `-828`: BigInteger = js.native
    
    var `-829`: BigInteger = js.native
    
    var `-83`: BigInteger = js.native
    
    var `-830`: BigInteger = js.native
    
    var `-831`: BigInteger = js.native
    
    var `-832`: BigInteger = js.native
    
    var `-833`: BigInteger = js.native
    
    var `-834`: BigInteger = js.native
    
    var `-835`: BigInteger = js.native
    
    var `-836`: BigInteger = js.native
    
    var `-837`: BigInteger = js.native
    
    var `-838`: BigInteger = js.native
    
    var `-839`: BigInteger = js.native
    
    var `-84`: BigInteger = js.native
    
    var `-840`: BigInteger = js.native
    
    var `-841`: BigInteger = js.native
    
    var `-842`: BigInteger = js.native
    
    var `-843`: BigInteger = js.native
    
    var `-844`: BigInteger = js.native
    
    var `-845`: BigInteger = js.native
    
    var `-846`: BigInteger = js.native
    
    var `-847`: BigInteger = js.native
    
    var `-848`: BigInteger = js.native
    
    var `-849`: BigInteger = js.native
    
    var `-85`: BigInteger = js.native
    
    var `-850`: BigInteger = js.native
    
    var `-851`: BigInteger = js.native
    
    var `-852`: BigInteger = js.native
    
    var `-853`: BigInteger = js.native
    
    var `-854`: BigInteger = js.native
    
    var `-855`: BigInteger = js.native
    
    var `-856`: BigInteger = js.native
    
    var `-857`: BigInteger = js.native
    
    var `-858`: BigInteger = js.native
    
    var `-859`: BigInteger = js.native
    
    var `-86`: BigInteger = js.native
    
    var `-860`: BigInteger = js.native
    
    var `-861`: BigInteger = js.native
    
    var `-862`: BigInteger = js.native
    
    var `-863`: BigInteger = js.native
    
    var `-864`: BigInteger = js.native
    
    var `-865`: BigInteger = js.native
    
    var `-866`: BigInteger = js.native
    
    var `-867`: BigInteger = js.native
    
    var `-868`: BigInteger = js.native
    
    var `-869`: BigInteger = js.native
    
    var `-87`: BigInteger = js.native
    
    var `-870`: BigInteger = js.native
    
    var `-871`: BigInteger = js.native
    
    var `-872`: BigInteger = js.native
    
    var `-873`: BigInteger = js.native
    
    var `-874`: BigInteger = js.native
    
    var `-875`: BigInteger = js.native
    
    var `-876`: BigInteger = js.native
    
    var `-877`: BigInteger = js.native
    
    var `-878`: BigInteger = js.native
    
    var `-879`: BigInteger = js.native
    
    var `-88`: BigInteger = js.native
    
    var `-880`: BigInteger = js.native
    
    var `-881`: BigInteger = js.native
    
    var `-882`: BigInteger = js.native
    
    var `-883`: BigInteger = js.native
    
    var `-884`: BigInteger = js.native
    
    var `-885`: BigInteger = js.native
    
    var `-886`: BigInteger = js.native
    
    var `-887`: BigInteger = js.native
    
    var `-888`: BigInteger = js.native
    
    var `-889`: BigInteger = js.native
    
    var `-89`: BigInteger = js.native
    
    var `-890`: BigInteger = js.native
    
    var `-891`: BigInteger = js.native
    
    var `-892`: BigInteger = js.native
    
    var `-893`: BigInteger = js.native
    
    var `-894`: BigInteger = js.native
    
    var `-895`: BigInteger = js.native
    
    var `-896`: BigInteger = js.native
    
    var `-897`: BigInteger = js.native
    
    var `-898`: BigInteger = js.native
    
    var `-899`: BigInteger = js.native
    
    var `-9`: BigInteger = js.native
    
    var `-90`: BigInteger = js.native
    
    var `-900`: BigInteger = js.native
    
    var `-901`: BigInteger = js.native
    
    var `-902`: BigInteger = js.native
    
    var `-903`: BigInteger = js.native
    
    var `-904`: BigInteger = js.native
    
    var `-905`: BigInteger = js.native
    
    var `-906`: BigInteger = js.native
    
    var `-907`: BigInteger = js.native
    
    var `-908`: BigInteger = js.native
    
    var `-909`: BigInteger = js.native
    
    var `-91`: BigInteger = js.native
    
    var `-910`: BigInteger = js.native
    
    var `-911`: BigInteger = js.native
    
    var `-912`: BigInteger = js.native
    
    var `-913`: BigInteger = js.native
    
    var `-914`: BigInteger = js.native
    
    var `-915`: BigInteger = js.native
    
    var `-916`: BigInteger = js.native
    
    var `-917`: BigInteger = js.native
    
    var `-918`: BigInteger = js.native
    
    var `-919`: BigInteger = js.native
    
    var `-92`: BigInteger = js.native
    
    var `-920`: BigInteger = js.native
    
    var `-921`: BigInteger = js.native
    
    var `-922`: BigInteger = js.native
    
    var `-923`: BigInteger = js.native
    
    var `-924`: BigInteger = js.native
    
    var `-925`: BigInteger = js.native
    
    var `-926`: BigInteger = js.native
    
    var `-927`: BigInteger = js.native
    
    var `-928`: BigInteger = js.native
    
    var `-929`: BigInteger = js.native
    
    var `-93`: BigInteger = js.native
    
    var `-930`: BigInteger = js.native
    
    var `-931`: BigInteger = js.native
    
    var `-932`: BigInteger = js.native
    
    var `-933`: BigInteger = js.native
    
    var `-934`: BigInteger = js.native
    
    var `-935`: BigInteger = js.native
    
    var `-936`: BigInteger = js.native
    
    var `-937`: BigInteger = js.native
    
    var `-938`: BigInteger = js.native
    
    var `-939`: BigInteger = js.native
    
    var `-94`: BigInteger = js.native
    
    var `-940`: BigInteger = js.native
    
    var `-941`: BigInteger = js.native
    
    var `-942`: BigInteger = js.native
    
    var `-943`: BigInteger = js.native
    
    var `-944`: BigInteger = js.native
    
    var `-945`: BigInteger = js.native
    
    var `-946`: BigInteger = js.native
    
    var `-947`: BigInteger = js.native
    
    var `-948`: BigInteger = js.native
    
    var `-949`: BigInteger = js.native
    
    var `-95`: BigInteger = js.native
    
    var `-950`: BigInteger = js.native
    
    var `-951`: BigInteger = js.native
    
    var `-952`: BigInteger = js.native
    
    var `-953`: BigInteger = js.native
    
    var `-954`: BigInteger = js.native
    
    var `-955`: BigInteger = js.native
    
    var `-956`: BigInteger = js.native
    
    var `-957`: BigInteger = js.native
    
    var `-958`: BigInteger = js.native
    
    var `-959`: BigInteger = js.native
    
    var `-96`: BigInteger = js.native
    
    var `-960`: BigInteger = js.native
    
    var `-961`: BigInteger = js.native
    
    var `-962`: BigInteger = js.native
    
    var `-963`: BigInteger = js.native
    
    var `-964`: BigInteger = js.native
    
    var `-965`: BigInteger = js.native
    
    var `-966`: BigInteger = js.native
    
    var `-967`: BigInteger = js.native
    
    var `-968`: BigInteger = js.native
    
    var `-969`: BigInteger = js.native
    
    var `-97`: BigInteger = js.native
    
    var `-970`: BigInteger = js.native
    
    var `-971`: BigInteger = js.native
    
    var `-972`: BigInteger = js.native
    
    var `-973`: BigInteger = js.native
    
    var `-974`: BigInteger = js.native
    
    var `-975`: BigInteger = js.native
    
    var `-976`: BigInteger = js.native
    
    var `-977`: BigInteger = js.native
    
    var `-978`: BigInteger = js.native
    
    var `-979`: BigInteger = js.native
    
    var `-98`: BigInteger = js.native
    
    var `-980`: BigInteger = js.native
    
    var `-981`: BigInteger = js.native
    
    var `-982`: BigInteger = js.native
    
    var `-983`: BigInteger = js.native
    
    var `-984`: BigInteger = js.native
    
    var `-985`: BigInteger = js.native
    
    var `-986`: BigInteger = js.native
    
    var `-987`: BigInteger = js.native
    
    var `-988`: BigInteger = js.native
    
    var `-989`: BigInteger = js.native
    
    var `-99`: BigInteger = js.native
    
    var `-990`: BigInteger = js.native
    
    var `-991`: BigInteger = js.native
    
    var `-992`: BigInteger = js.native
    
    var `-993`: BigInteger = js.native
    
    var `-994`: BigInteger = js.native
    
    var `-995`: BigInteger = js.native
    
    var `-996`: BigInteger = js.native
    
    var `-997`: BigInteger = js.native
    
    var `-998`: BigInteger = js.native
    
    var `-999`: BigInteger = js.native
    
    var `0`: BigInteger = js.native
    
    var `1`: BigInteger = js.native
    
    var `10`: BigInteger = js.native
    
    var `100`: BigInteger = js.native
    
    var `101`: BigInteger = js.native
    
    var `102`: BigInteger = js.native
    
    var `103`: BigInteger = js.native
    
    var `104`: BigInteger = js.native
    
    var `105`: BigInteger = js.native
    
    var `106`: BigInteger = js.native
    
    var `107`: BigInteger = js.native
    
    var `108`: BigInteger = js.native
    
    var `109`: BigInteger = js.native
    
    var `11`: BigInteger = js.native
    
    var `110`: BigInteger = js.native
    
    var `111`: BigInteger = js.native
    
    var `112`: BigInteger = js.native
    
    var `113`: BigInteger = js.native
    
    var `114`: BigInteger = js.native
    
    var `115`: BigInteger = js.native
    
    var `116`: BigInteger = js.native
    
    var `117`: BigInteger = js.native
    
    var `118`: BigInteger = js.native
    
    var `119`: BigInteger = js.native
    
    var `12`: BigInteger = js.native
    
    var `120`: BigInteger = js.native
    
    var `121`: BigInteger = js.native
    
    var `122`: BigInteger = js.native
    
    var `123`: BigInteger = js.native
    
    var `124`: BigInteger = js.native
    
    var `125`: BigInteger = js.native
    
    var `126`: BigInteger = js.native
    
    var `127`: BigInteger = js.native
    
    var `128`: BigInteger = js.native
    
    var `129`: BigInteger = js.native
    
    var `13`: BigInteger = js.native
    
    var `130`: BigInteger = js.native
    
    var `131`: BigInteger = js.native
    
    var `132`: BigInteger = js.native
    
    var `133`: BigInteger = js.native
    
    var `134`: BigInteger = js.native
    
    var `135`: BigInteger = js.native
    
    var `136`: BigInteger = js.native
    
    var `137`: BigInteger = js.native
    
    var `138`: BigInteger = js.native
    
    var `139`: BigInteger = js.native
    
    var `14`: BigInteger = js.native
    
    var `140`: BigInteger = js.native
    
    var `141`: BigInteger = js.native
    
    var `142`: BigInteger = js.native
    
    var `143`: BigInteger = js.native
    
    var `144`: BigInteger = js.native
    
    var `145`: BigInteger = js.native
    
    var `146`: BigInteger = js.native
    
    var `147`: BigInteger = js.native
    
    var `148`: BigInteger = js.native
    
    var `149`: BigInteger = js.native
    
    var `15`: BigInteger = js.native
    
    var `150`: BigInteger = js.native
    
    var `151`: BigInteger = js.native
    
    var `152`: BigInteger = js.native
    
    var `153`: BigInteger = js.native
    
    var `154`: BigInteger = js.native
    
    var `155`: BigInteger = js.native
    
    var `156`: BigInteger = js.native
    
    var `157`: BigInteger = js.native
    
    var `158`: BigInteger = js.native
    
    var `159`: BigInteger = js.native
    
    var `16`: BigInteger = js.native
    
    var `160`: BigInteger = js.native
    
    var `161`: BigInteger = js.native
    
    var `162`: BigInteger = js.native
    
    var `163`: BigInteger = js.native
    
    var `164`: BigInteger = js.native
    
    var `165`: BigInteger = js.native
    
    var `166`: BigInteger = js.native
    
    var `167`: BigInteger = js.native
    
    var `168`: BigInteger = js.native
    
    var `169`: BigInteger = js.native
    
    var `17`: BigInteger = js.native
    
    var `170`: BigInteger = js.native
    
    var `171`: BigInteger = js.native
    
    var `172`: BigInteger = js.native
    
    var `173`: BigInteger = js.native
    
    var `174`: BigInteger = js.native
    
    var `175`: BigInteger = js.native
    
    var `176`: BigInteger = js.native
    
    var `177`: BigInteger = js.native
    
    var `178`: BigInteger = js.native
    
    var `179`: BigInteger = js.native
    
    var `18`: BigInteger = js.native
    
    var `180`: BigInteger = js.native
    
    var `181`: BigInteger = js.native
    
    var `182`: BigInteger = js.native
    
    var `183`: BigInteger = js.native
    
    var `184`: BigInteger = js.native
    
    var `185`: BigInteger = js.native
    
    var `186`: BigInteger = js.native
    
    var `187`: BigInteger = js.native
    
    var `188`: BigInteger = js.native
    
    var `189`: BigInteger = js.native
    
    var `19`: BigInteger = js.native
    
    var `190`: BigInteger = js.native
    
    var `191`: BigInteger = js.native
    
    var `192`: BigInteger = js.native
    
    var `193`: BigInteger = js.native
    
    var `194`: BigInteger = js.native
    
    var `195`: BigInteger = js.native
    
    var `196`: BigInteger = js.native
    
    var `197`: BigInteger = js.native
    
    var `198`: BigInteger = js.native
    
    var `199`: BigInteger = js.native
    
    var `2`: BigInteger = js.native
    
    var `20`: BigInteger = js.native
    
    var `200`: BigInteger = js.native
    
    var `201`: BigInteger = js.native
    
    var `202`: BigInteger = js.native
    
    var `203`: BigInteger = js.native
    
    var `204`: BigInteger = js.native
    
    var `205`: BigInteger = js.native
    
    var `206`: BigInteger = js.native
    
    var `207`: BigInteger = js.native
    
    var `208`: BigInteger = js.native
    
    var `209`: BigInteger = js.native
    
    var `21`: BigInteger = js.native
    
    var `210`: BigInteger = js.native
    
    var `211`: BigInteger = js.native
    
    var `212`: BigInteger = js.native
    
    var `213`: BigInteger = js.native
    
    var `214`: BigInteger = js.native
    
    var `215`: BigInteger = js.native
    
    var `216`: BigInteger = js.native
    
    var `217`: BigInteger = js.native
    
    var `218`: BigInteger = js.native
    
    var `219`: BigInteger = js.native
    
    var `22`: BigInteger = js.native
    
    var `220`: BigInteger = js.native
    
    var `221`: BigInteger = js.native
    
    var `222`: BigInteger = js.native
    
    var `223`: BigInteger = js.native
    
    var `224`: BigInteger = js.native
    
    var `225`: BigInteger = js.native
    
    var `226`: BigInteger = js.native
    
    var `227`: BigInteger = js.native
    
    var `228`: BigInteger = js.native
    
    var `229`: BigInteger = js.native
    
    var `23`: BigInteger = js.native
    
    var `230`: BigInteger = js.native
    
    var `231`: BigInteger = js.native
    
    var `232`: BigInteger = js.native
    
    var `233`: BigInteger = js.native
    
    var `234`: BigInteger = js.native
    
    var `235`: BigInteger = js.native
    
    var `236`: BigInteger = js.native
    
    var `237`: BigInteger = js.native
    
    var `238`: BigInteger = js.native
    
    var `239`: BigInteger = js.native
    
    var `24`: BigInteger = js.native
    
    var `240`: BigInteger = js.native
    
    var `241`: BigInteger = js.native
    
    var `242`: BigInteger = js.native
    
    var `243`: BigInteger = js.native
    
    var `244`: BigInteger = js.native
    
    var `245`: BigInteger = js.native
    
    var `246`: BigInteger = js.native
    
    var `247`: BigInteger = js.native
    
    var `248`: BigInteger = js.native
    
    var `249`: BigInteger = js.native
    
    var `25`: BigInteger = js.native
    
    var `250`: BigInteger = js.native
    
    var `251`: BigInteger = js.native
    
    var `252`: BigInteger = js.native
    
    var `253`: BigInteger = js.native
    
    var `254`: BigInteger = js.native
    
    var `255`: BigInteger = js.native
    
    var `256`: BigInteger = js.native
    
    var `257`: BigInteger = js.native
    
    var `258`: BigInteger = js.native
    
    var `259`: BigInteger = js.native
    
    var `26`: BigInteger = js.native
    
    var `260`: BigInteger = js.native
    
    var `261`: BigInteger = js.native
    
    var `262`: BigInteger = js.native
    
    var `263`: BigInteger = js.native
    
    var `264`: BigInteger = js.native
    
    var `265`: BigInteger = js.native
    
    var `266`: BigInteger = js.native
    
    var `267`: BigInteger = js.native
    
    var `268`: BigInteger = js.native
    
    var `269`: BigInteger = js.native
    
    var `27`: BigInteger = js.native
    
    var `270`: BigInteger = js.native
    
    var `271`: BigInteger = js.native
    
    var `272`: BigInteger = js.native
    
    var `273`: BigInteger = js.native
    
    var `274`: BigInteger = js.native
    
    var `275`: BigInteger = js.native
    
    var `276`: BigInteger = js.native
    
    var `277`: BigInteger = js.native
    
    var `278`: BigInteger = js.native
    
    var `279`: BigInteger = js.native
    
    var `28`: BigInteger = js.native
    
    var `280`: BigInteger = js.native
    
    var `281`: BigInteger = js.native
    
    var `282`: BigInteger = js.native
    
    var `283`: BigInteger = js.native
    
    var `284`: BigInteger = js.native
    
    var `285`: BigInteger = js.native
    
    var `286`: BigInteger = js.native
    
    var `287`: BigInteger = js.native
    
    var `288`: BigInteger = js.native
    
    var `289`: BigInteger = js.native
    
    var `29`: BigInteger = js.native
    
    var `290`: BigInteger = js.native
    
    var `291`: BigInteger = js.native
    
    var `292`: BigInteger = js.native
    
    var `293`: BigInteger = js.native
    
    var `294`: BigInteger = js.native
    
    var `295`: BigInteger = js.native
    
    var `296`: BigInteger = js.native
    
    var `297`: BigInteger = js.native
    
    var `298`: BigInteger = js.native
    
    var `299`: BigInteger = js.native
    
    var `3`: BigInteger = js.native
    
    var `30`: BigInteger = js.native
    
    var `300`: BigInteger = js.native
    
    var `301`: BigInteger = js.native
    
    var `302`: BigInteger = js.native
    
    var `303`: BigInteger = js.native
    
    var `304`: BigInteger = js.native
    
    var `305`: BigInteger = js.native
    
    var `306`: BigInteger = js.native
    
    var `307`: BigInteger = js.native
    
    var `308`: BigInteger = js.native
    
    var `309`: BigInteger = js.native
    
    var `31`: BigInteger = js.native
    
    var `310`: BigInteger = js.native
    
    var `311`: BigInteger = js.native
    
    var `312`: BigInteger = js.native
    
    var `313`: BigInteger = js.native
    
    var `314`: BigInteger = js.native
    
    var `315`: BigInteger = js.native
    
    var `316`: BigInteger = js.native
    
    var `317`: BigInteger = js.native
    
    var `318`: BigInteger = js.native
    
    var `319`: BigInteger = js.native
    
    var `32`: BigInteger = js.native
    
    var `320`: BigInteger = js.native
    
    var `321`: BigInteger = js.native
    
    var `322`: BigInteger = js.native
    
    var `323`: BigInteger = js.native
    
    var `324`: BigInteger = js.native
    
    var `325`: BigInteger = js.native
    
    var `326`: BigInteger = js.native
    
    var `327`: BigInteger = js.native
    
    var `328`: BigInteger = js.native
    
    var `329`: BigInteger = js.native
    
    var `33`: BigInteger = js.native
    
    var `330`: BigInteger = js.native
    
    var `331`: BigInteger = js.native
    
    var `332`: BigInteger = js.native
    
    var `333`: BigInteger = js.native
    
    var `334`: BigInteger = js.native
    
    var `335`: BigInteger = js.native
    
    var `336`: BigInteger = js.native
    
    var `337`: BigInteger = js.native
    
    var `338`: BigInteger = js.native
    
    var `339`: BigInteger = js.native
    
    var `34`: BigInteger = js.native
    
    var `340`: BigInteger = js.native
    
    var `341`: BigInteger = js.native
    
    var `342`: BigInteger = js.native
    
    var `343`: BigInteger = js.native
    
    var `344`: BigInteger = js.native
    
    var `345`: BigInteger = js.native
    
    var `346`: BigInteger = js.native
    
    var `347`: BigInteger = js.native
    
    var `348`: BigInteger = js.native
    
    var `349`: BigInteger = js.native
    
    var `35`: BigInteger = js.native
    
    var `350`: BigInteger = js.native
    
    var `351`: BigInteger = js.native
    
    var `352`: BigInteger = js.native
    
    var `353`: BigInteger = js.native
    
    var `354`: BigInteger = js.native
    
    var `355`: BigInteger = js.native
    
    var `356`: BigInteger = js.native
    
    var `357`: BigInteger = js.native
    
    var `358`: BigInteger = js.native
    
    var `359`: BigInteger = js.native
    
    var `36`: BigInteger = js.native
    
    var `360`: BigInteger = js.native
    
    var `361`: BigInteger = js.native
    
    var `362`: BigInteger = js.native
    
    var `363`: BigInteger = js.native
    
    var `364`: BigInteger = js.native
    
    var `365`: BigInteger = js.native
    
    var `366`: BigInteger = js.native
    
    var `367`: BigInteger = js.native
    
    var `368`: BigInteger = js.native
    
    var `369`: BigInteger = js.native
    
    var `37`: BigInteger = js.native
    
    var `370`: BigInteger = js.native
    
    var `371`: BigInteger = js.native
    
    var `372`: BigInteger = js.native
    
    var `373`: BigInteger = js.native
    
    var `374`: BigInteger = js.native
    
    var `375`: BigInteger = js.native
    
    var `376`: BigInteger = js.native
    
    var `377`: BigInteger = js.native
    
    var `378`: BigInteger = js.native
    
    var `379`: BigInteger = js.native
    
    var `38`: BigInteger = js.native
    
    var `380`: BigInteger = js.native
    
    var `381`: BigInteger = js.native
    
    var `382`: BigInteger = js.native
    
    var `383`: BigInteger = js.native
    
    var `384`: BigInteger = js.native
    
    var `385`: BigInteger = js.native
    
    var `386`: BigInteger = js.native
    
    var `387`: BigInteger = js.native
    
    var `388`: BigInteger = js.native
    
    var `389`: BigInteger = js.native
    
    var `39`: BigInteger = js.native
    
    var `390`: BigInteger = js.native
    
    var `391`: BigInteger = js.native
    
    var `392`: BigInteger = js.native
    
    var `393`: BigInteger = js.native
    
    var `394`: BigInteger = js.native
    
    var `395`: BigInteger = js.native
    
    var `396`: BigInteger = js.native
    
    var `397`: BigInteger = js.native
    
    var `398`: BigInteger = js.native
    
    var `399`: BigInteger = js.native
    
    var `4`: BigInteger = js.native
    
    var `40`: BigInteger = js.native
    
    var `400`: BigInteger = js.native
    
    var `401`: BigInteger = js.native
    
    var `402`: BigInteger = js.native
    
    var `403`: BigInteger = js.native
    
    var `404`: BigInteger = js.native
    
    var `405`: BigInteger = js.native
    
    var `406`: BigInteger = js.native
    
    var `407`: BigInteger = js.native
    
    var `408`: BigInteger = js.native
    
    var `409`: BigInteger = js.native
    
    var `41`: BigInteger = js.native
    
    var `410`: BigInteger = js.native
    
    var `411`: BigInteger = js.native
    
    var `412`: BigInteger = js.native
    
    var `413`: BigInteger = js.native
    
    var `414`: BigInteger = js.native
    
    var `415`: BigInteger = js.native
    
    var `416`: BigInteger = js.native
    
    var `417`: BigInteger = js.native
    
    var `418`: BigInteger = js.native
    
    var `419`: BigInteger = js.native
    
    var `42`: BigInteger = js.native
    
    var `420`: BigInteger = js.native
    
    var `421`: BigInteger = js.native
    
    var `422`: BigInteger = js.native
    
    var `423`: BigInteger = js.native
    
    var `424`: BigInteger = js.native
    
    var `425`: BigInteger = js.native
    
    var `426`: BigInteger = js.native
    
    var `427`: BigInteger = js.native
    
    var `428`: BigInteger = js.native
    
    var `429`: BigInteger = js.native
    
    var `43`: BigInteger = js.native
    
    var `430`: BigInteger = js.native
    
    var `431`: BigInteger = js.native
    
    var `432`: BigInteger = js.native
    
    var `433`: BigInteger = js.native
    
    var `434`: BigInteger = js.native
    
    var `435`: BigInteger = js.native
    
    var `436`: BigInteger = js.native
    
    var `437`: BigInteger = js.native
    
    var `438`: BigInteger = js.native
    
    var `439`: BigInteger = js.native
    
    var `44`: BigInteger = js.native
    
    var `440`: BigInteger = js.native
    
    var `441`: BigInteger = js.native
    
    var `442`: BigInteger = js.native
    
    var `443`: BigInteger = js.native
    
    var `444`: BigInteger = js.native
    
    var `445`: BigInteger = js.native
    
    var `446`: BigInteger = js.native
    
    var `447`: BigInteger = js.native
    
    var `448`: BigInteger = js.native
    
    var `449`: BigInteger = js.native
    
    var `45`: BigInteger = js.native
    
    var `450`: BigInteger = js.native
    
    var `451`: BigInteger = js.native
    
    var `452`: BigInteger = js.native
    
    var `453`: BigInteger = js.native
    
    var `454`: BigInteger = js.native
    
    var `455`: BigInteger = js.native
    
    var `456`: BigInteger = js.native
    
    var `457`: BigInteger = js.native
    
    var `458`: BigInteger = js.native
    
    var `459`: BigInteger = js.native
    
    var `46`: BigInteger = js.native
    
    var `460`: BigInteger = js.native
    
    var `461`: BigInteger = js.native
    
    var `462`: BigInteger = js.native
    
    var `463`: BigInteger = js.native
    
    var `464`: BigInteger = js.native
    
    var `465`: BigInteger = js.native
    
    var `466`: BigInteger = js.native
    
    var `467`: BigInteger = js.native
    
    var `468`: BigInteger = js.native
    
    var `469`: BigInteger = js.native
    
    var `47`: BigInteger = js.native
    
    var `470`: BigInteger = js.native
    
    var `471`: BigInteger = js.native
    
    var `472`: BigInteger = js.native
    
    var `473`: BigInteger = js.native
    
    var `474`: BigInteger = js.native
    
    var `475`: BigInteger = js.native
    
    var `476`: BigInteger = js.native
    
    var `477`: BigInteger = js.native
    
    var `478`: BigInteger = js.native
    
    var `479`: BigInteger = js.native
    
    var `48`: BigInteger = js.native
    
    var `480`: BigInteger = js.native
    
    var `481`: BigInteger = js.native
    
    var `482`: BigInteger = js.native
    
    var `483`: BigInteger = js.native
    
    var `484`: BigInteger = js.native
    
    var `485`: BigInteger = js.native
    
    var `486`: BigInteger = js.native
    
    var `487`: BigInteger = js.native
    
    var `488`: BigInteger = js.native
    
    var `489`: BigInteger = js.native
    
    var `49`: BigInteger = js.native
    
    var `490`: BigInteger = js.native
    
    var `491`: BigInteger = js.native
    
    var `492`: BigInteger = js.native
    
    var `493`: BigInteger = js.native
    
    var `494`: BigInteger = js.native
    
    var `495`: BigInteger = js.native
    
    var `496`: BigInteger = js.native
    
    var `497`: BigInteger = js.native
    
    var `498`: BigInteger = js.native
    
    var `499`: BigInteger = js.native
    
    var `5`: BigInteger = js.native
    
    var `50`: BigInteger = js.native
    
    var `500`: BigInteger = js.native
    
    var `501`: BigInteger = js.native
    
    var `502`: BigInteger = js.native
    
    var `503`: BigInteger = js.native
    
    var `504`: BigInteger = js.native
    
    var `505`: BigInteger = js.native
    
    var `506`: BigInteger = js.native
    
    var `507`: BigInteger = js.native
    
    var `508`: BigInteger = js.native
    
    var `509`: BigInteger = js.native
    
    var `51`: BigInteger = js.native
    
    var `510`: BigInteger = js.native
    
    var `511`: BigInteger = js.native
    
    var `512`: BigInteger = js.native
    
    var `513`: BigInteger = js.native
    
    var `514`: BigInteger = js.native
    
    var `515`: BigInteger = js.native
    
    var `516`: BigInteger = js.native
    
    var `517`: BigInteger = js.native
    
    var `518`: BigInteger = js.native
    
    var `519`: BigInteger = js.native
    
    var `52`: BigInteger = js.native
    
    var `520`: BigInteger = js.native
    
    var `521`: BigInteger = js.native
    
    var `522`: BigInteger = js.native
    
    var `523`: BigInteger = js.native
    
    var `524`: BigInteger = js.native
    
    var `525`: BigInteger = js.native
    
    var `526`: BigInteger = js.native
    
    var `527`: BigInteger = js.native
    
    var `528`: BigInteger = js.native
    
    var `529`: BigInteger = js.native
    
    var `53`: BigInteger = js.native
    
    var `530`: BigInteger = js.native
    
    var `531`: BigInteger = js.native
    
    var `532`: BigInteger = js.native
    
    var `533`: BigInteger = js.native
    
    var `534`: BigInteger = js.native
    
    var `535`: BigInteger = js.native
    
    var `536`: BigInteger = js.native
    
    var `537`: BigInteger = js.native
    
    var `538`: BigInteger = js.native
    
    var `539`: BigInteger = js.native
    
    var `54`: BigInteger = js.native
    
    var `540`: BigInteger = js.native
    
    var `541`: BigInteger = js.native
    
    var `542`: BigInteger = js.native
    
    var `543`: BigInteger = js.native
    
    var `544`: BigInteger = js.native
    
    var `545`: BigInteger = js.native
    
    var `546`: BigInteger = js.native
    
    var `547`: BigInteger = js.native
    
    var `548`: BigInteger = js.native
    
    var `549`: BigInteger = js.native
    
    var `55`: BigInteger = js.native
    
    var `550`: BigInteger = js.native
    
    var `551`: BigInteger = js.native
    
    var `552`: BigInteger = js.native
    
    var `553`: BigInteger = js.native
    
    var `554`: BigInteger = js.native
    
    var `555`: BigInteger = js.native
    
    var `556`: BigInteger = js.native
    
    var `557`: BigInteger = js.native
    
    var `558`: BigInteger = js.native
    
    var `559`: BigInteger = js.native
    
    var `56`: BigInteger = js.native
    
    var `560`: BigInteger = js.native
    
    var `561`: BigInteger = js.native
    
    var `562`: BigInteger = js.native
    
    var `563`: BigInteger = js.native
    
    var `564`: BigInteger = js.native
    
    var `565`: BigInteger = js.native
    
    var `566`: BigInteger = js.native
    
    var `567`: BigInteger = js.native
    
    var `568`: BigInteger = js.native
    
    var `569`: BigInteger = js.native
    
    var `57`: BigInteger = js.native
    
    var `570`: BigInteger = js.native
    
    var `571`: BigInteger = js.native
    
    var `572`: BigInteger = js.native
    
    var `573`: BigInteger = js.native
    
    var `574`: BigInteger = js.native
    
    var `575`: BigInteger = js.native
    
    var `576`: BigInteger = js.native
    
    var `577`: BigInteger = js.native
    
    var `578`: BigInteger = js.native
    
    var `579`: BigInteger = js.native
    
    var `58`: BigInteger = js.native
    
    var `580`: BigInteger = js.native
    
    var `581`: BigInteger = js.native
    
    var `582`: BigInteger = js.native
    
    var `583`: BigInteger = js.native
    
    var `584`: BigInteger = js.native
    
    var `585`: BigInteger = js.native
    
    var `586`: BigInteger = js.native
    
    var `587`: BigInteger = js.native
    
    var `588`: BigInteger = js.native
    
    var `589`: BigInteger = js.native
    
    var `59`: BigInteger = js.native
    
    var `590`: BigInteger = js.native
    
    var `591`: BigInteger = js.native
    
    var `592`: BigInteger = js.native
    
    var `593`: BigInteger = js.native
    
    var `594`: BigInteger = js.native
    
    var `595`: BigInteger = js.native
    
    var `596`: BigInteger = js.native
    
    var `597`: BigInteger = js.native
    
    var `598`: BigInteger = js.native
    
    var `599`: BigInteger = js.native
    
    var `6`: BigInteger = js.native
    
    var `60`: BigInteger = js.native
    
    var `600`: BigInteger = js.native
    
    var `601`: BigInteger = js.native
    
    var `602`: BigInteger = js.native
    
    var `603`: BigInteger = js.native
    
    var `604`: BigInteger = js.native
    
    var `605`: BigInteger = js.native
    
    var `606`: BigInteger = js.native
    
    var `607`: BigInteger = js.native
    
    var `608`: BigInteger = js.native
    
    var `609`: BigInteger = js.native
    
    var `61`: BigInteger = js.native
    
    var `610`: BigInteger = js.native
    
    var `611`: BigInteger = js.native
    
    var `612`: BigInteger = js.native
    
    var `613`: BigInteger = js.native
    
    var `614`: BigInteger = js.native
    
    var `615`: BigInteger = js.native
    
    var `616`: BigInteger = js.native
    
    var `617`: BigInteger = js.native
    
    var `618`: BigInteger = js.native
    
    var `619`: BigInteger = js.native
    
    var `62`: BigInteger = js.native
    
    var `620`: BigInteger = js.native
    
    var `621`: BigInteger = js.native
    
    var `622`: BigInteger = js.native
    
    var `623`: BigInteger = js.native
    
    var `624`: BigInteger = js.native
    
    var `625`: BigInteger = js.native
    
    var `626`: BigInteger = js.native
    
    var `627`: BigInteger = js.native
    
    var `628`: BigInteger = js.native
    
    var `629`: BigInteger = js.native
    
    var `63`: BigInteger = js.native
    
    var `630`: BigInteger = js.native
    
    var `631`: BigInteger = js.native
    
    var `632`: BigInteger = js.native
    
    var `633`: BigInteger = js.native
    
    var `634`: BigInteger = js.native
    
    var `635`: BigInteger = js.native
    
    var `636`: BigInteger = js.native
    
    var `637`: BigInteger = js.native
    
    var `638`: BigInteger = js.native
    
    var `639`: BigInteger = js.native
    
    var `64`: BigInteger = js.native
    
    var `640`: BigInteger = js.native
    
    var `641`: BigInteger = js.native
    
    var `642`: BigInteger = js.native
    
    var `643`: BigInteger = js.native
    
    var `644`: BigInteger = js.native
    
    var `645`: BigInteger = js.native
    
    var `646`: BigInteger = js.native
    
    var `647`: BigInteger = js.native
    
    var `648`: BigInteger = js.native
    
    var `649`: BigInteger = js.native
    
    var `65`: BigInteger = js.native
    
    var `650`: BigInteger = js.native
    
    var `651`: BigInteger = js.native
    
    var `652`: BigInteger = js.native
    
    var `653`: BigInteger = js.native
    
    var `654`: BigInteger = js.native
    
    var `655`: BigInteger = js.native
    
    var `656`: BigInteger = js.native
    
    var `657`: BigInteger = js.native
    
    var `658`: BigInteger = js.native
    
    var `659`: BigInteger = js.native
    
    var `66`: BigInteger = js.native
    
    var `660`: BigInteger = js.native
    
    var `661`: BigInteger = js.native
    
    var `662`: BigInteger = js.native
    
    var `663`: BigInteger = js.native
    
    var `664`: BigInteger = js.native
    
    var `665`: BigInteger = js.native
    
    var `666`: BigInteger = js.native
    
    var `667`: BigInteger = js.native
    
    var `668`: BigInteger = js.native
    
    var `669`: BigInteger = js.native
    
    var `67`: BigInteger = js.native
    
    var `670`: BigInteger = js.native
    
    var `671`: BigInteger = js.native
    
    var `672`: BigInteger = js.native
    
    var `673`: BigInteger = js.native
    
    var `674`: BigInteger = js.native
    
    var `675`: BigInteger = js.native
    
    var `676`: BigInteger = js.native
    
    var `677`: BigInteger = js.native
    
    var `678`: BigInteger = js.native
    
    var `679`: BigInteger = js.native
    
    var `68`: BigInteger = js.native
    
    var `680`: BigInteger = js.native
    
    var `681`: BigInteger = js.native
    
    var `682`: BigInteger = js.native
    
    var `683`: BigInteger = js.native
    
    var `684`: BigInteger = js.native
    
    var `685`: BigInteger = js.native
    
    var `686`: BigInteger = js.native
    
    var `687`: BigInteger = js.native
    
    var `688`: BigInteger = js.native
    
    var `689`: BigInteger = js.native
    
    var `69`: BigInteger = js.native
    
    var `690`: BigInteger = js.native
    
    var `691`: BigInteger = js.native
    
    var `692`: BigInteger = js.native
    
    var `693`: BigInteger = js.native
    
    var `694`: BigInteger = js.native
    
    var `695`: BigInteger = js.native
    
    var `696`: BigInteger = js.native
    
    var `697`: BigInteger = js.native
    
    var `698`: BigInteger = js.native
    
    var `699`: BigInteger = js.native
    
    var `7`: BigInteger = js.native
    
    var `70`: BigInteger = js.native
    
    var `700`: BigInteger = js.native
    
    var `701`: BigInteger = js.native
    
    var `702`: BigInteger = js.native
    
    var `703`: BigInteger = js.native
    
    var `704`: BigInteger = js.native
    
    var `705`: BigInteger = js.native
    
    var `706`: BigInteger = js.native
    
    var `707`: BigInteger = js.native
    
    var `708`: BigInteger = js.native
    
    var `709`: BigInteger = js.native
    
    var `71`: BigInteger = js.native
    
    var `710`: BigInteger = js.native
    
    var `711`: BigInteger = js.native
    
    var `712`: BigInteger = js.native
    
    var `713`: BigInteger = js.native
    
    var `714`: BigInteger = js.native
    
    var `715`: BigInteger = js.native
    
    var `716`: BigInteger = js.native
    
    var `717`: BigInteger = js.native
    
    var `718`: BigInteger = js.native
    
    var `719`: BigInteger = js.native
    
    var `72`: BigInteger = js.native
    
    var `720`: BigInteger = js.native
    
    var `721`: BigInteger = js.native
    
    var `722`: BigInteger = js.native
    
    var `723`: BigInteger = js.native
    
    var `724`: BigInteger = js.native
    
    var `725`: BigInteger = js.native
    
    var `726`: BigInteger = js.native
    
    var `727`: BigInteger = js.native
    
    var `728`: BigInteger = js.native
    
    var `729`: BigInteger = js.native
    
    var `73`: BigInteger = js.native
    
    var `730`: BigInteger = js.native
    
    var `731`: BigInteger = js.native
    
    var `732`: BigInteger = js.native
    
    var `733`: BigInteger = js.native
    
    var `734`: BigInteger = js.native
    
    var `735`: BigInteger = js.native
    
    var `736`: BigInteger = js.native
    
    var `737`: BigInteger = js.native
    
    var `738`: BigInteger = js.native
    
    var `739`: BigInteger = js.native
    
    var `74`: BigInteger = js.native
    
    var `740`: BigInteger = js.native
    
    var `741`: BigInteger = js.native
    
    var `742`: BigInteger = js.native
    
    var `743`: BigInteger = js.native
    
    var `744`: BigInteger = js.native
    
    var `745`: BigInteger = js.native
    
    var `746`: BigInteger = js.native
    
    var `747`: BigInteger = js.native
    
    var `748`: BigInteger = js.native
    
    var `749`: BigInteger = js.native
    
    var `75`: BigInteger = js.native
    
    var `750`: BigInteger = js.native
    
    var `751`: BigInteger = js.native
    
    var `752`: BigInteger = js.native
    
    var `753`: BigInteger = js.native
    
    var `754`: BigInteger = js.native
    
    var `755`: BigInteger = js.native
    
    var `756`: BigInteger = js.native
    
    var `757`: BigInteger = js.native
    
    var `758`: BigInteger = js.native
    
    var `759`: BigInteger = js.native
    
    var `76`: BigInteger = js.native
    
    var `760`: BigInteger = js.native
    
    var `761`: BigInteger = js.native
    
    var `762`: BigInteger = js.native
    
    var `763`: BigInteger = js.native
    
    var `764`: BigInteger = js.native
    
    var `765`: BigInteger = js.native
    
    var `766`: BigInteger = js.native
    
    var `767`: BigInteger = js.native
    
    var `768`: BigInteger = js.native
    
    var `769`: BigInteger = js.native
    
    var `77`: BigInteger = js.native
    
    var `770`: BigInteger = js.native
    
    var `771`: BigInteger = js.native
    
    var `772`: BigInteger = js.native
    
    var `773`: BigInteger = js.native
    
    var `774`: BigInteger = js.native
    
    var `775`: BigInteger = js.native
    
    var `776`: BigInteger = js.native
    
    var `777`: BigInteger = js.native
    
    var `778`: BigInteger = js.native
    
    var `779`: BigInteger = js.native
    
    var `78`: BigInteger = js.native
    
    var `780`: BigInteger = js.native
    
    var `781`: BigInteger = js.native
    
    var `782`: BigInteger = js.native
    
    var `783`: BigInteger = js.native
    
    var `784`: BigInteger = js.native
    
    var `785`: BigInteger = js.native
    
    var `786`: BigInteger = js.native
    
    var `787`: BigInteger = js.native
    
    var `788`: BigInteger = js.native
    
    var `789`: BigInteger = js.native
    
    var `79`: BigInteger = js.native
    
    var `790`: BigInteger = js.native
    
    var `791`: BigInteger = js.native
    
    var `792`: BigInteger = js.native
    
    var `793`: BigInteger = js.native
    
    var `794`: BigInteger = js.native
    
    var `795`: BigInteger = js.native
    
    var `796`: BigInteger = js.native
    
    var `797`: BigInteger = js.native
    
    var `798`: BigInteger = js.native
    
    var `799`: BigInteger = js.native
    
    var `8`: BigInteger = js.native
    
    var `80`: BigInteger = js.native
    
    var `800`: BigInteger = js.native
    
    var `801`: BigInteger = js.native
    
    var `802`: BigInteger = js.native
    
    var `803`: BigInteger = js.native
    
    var `804`: BigInteger = js.native
    
    var `805`: BigInteger = js.native
    
    var `806`: BigInteger = js.native
    
    var `807`: BigInteger = js.native
    
    var `808`: BigInteger = js.native
    
    var `809`: BigInteger = js.native
    
    var `81`: BigInteger = js.native
    
    var `810`: BigInteger = js.native
    
    var `811`: BigInteger = js.native
    
    var `812`: BigInteger = js.native
    
    var `813`: BigInteger = js.native
    
    var `814`: BigInteger = js.native
    
    var `815`: BigInteger = js.native
    
    var `816`: BigInteger = js.native
    
    var `817`: BigInteger = js.native
    
    var `818`: BigInteger = js.native
    
    var `819`: BigInteger = js.native
    
    var `82`: BigInteger = js.native
    
    var `820`: BigInteger = js.native
    
    var `821`: BigInteger = js.native
    
    var `822`: BigInteger = js.native
    
    var `823`: BigInteger = js.native
    
    var `824`: BigInteger = js.native
    
    var `825`: BigInteger = js.native
    
    var `826`: BigInteger = js.native
    
    var `827`: BigInteger = js.native
    
    var `828`: BigInteger = js.native
    
    var `829`: BigInteger = js.native
    
    var `83`: BigInteger = js.native
    
    var `830`: BigInteger = js.native
    
    var `831`: BigInteger = js.native
    
    var `832`: BigInteger = js.native
    
    var `833`: BigInteger = js.native
    
    var `834`: BigInteger = js.native
    
    var `835`: BigInteger = js.native
    
    var `836`: BigInteger = js.native
    
    var `837`: BigInteger = js.native
    
    var `838`: BigInteger = js.native
    
    var `839`: BigInteger = js.native
    
    var `84`: BigInteger = js.native
    
    var `840`: BigInteger = js.native
    
    var `841`: BigInteger = js.native
    
    var `842`: BigInteger = js.native
    
    var `843`: BigInteger = js.native
    
    var `844`: BigInteger = js.native
    
    var `845`: BigInteger = js.native
    
    var `846`: BigInteger = js.native
    
    var `847`: BigInteger = js.native
    
    var `848`: BigInteger = js.native
    
    var `849`: BigInteger = js.native
    
    var `85`: BigInteger = js.native
    
    var `850`: BigInteger = js.native
    
    var `851`: BigInteger = js.native
    
    var `852`: BigInteger = js.native
    
    var `853`: BigInteger = js.native
    
    var `854`: BigInteger = js.native
    
    var `855`: BigInteger = js.native
    
    var `856`: BigInteger = js.native
    
    var `857`: BigInteger = js.native
    
    var `858`: BigInteger = js.native
    
    var `859`: BigInteger = js.native
    
    var `86`: BigInteger = js.native
    
    var `860`: BigInteger = js.native
    
    var `861`: BigInteger = js.native
    
    var `862`: BigInteger = js.native
    
    var `863`: BigInteger = js.native
    
    var `864`: BigInteger = js.native
    
    var `865`: BigInteger = js.native
    
    var `866`: BigInteger = js.native
    
    var `867`: BigInteger = js.native
    
    var `868`: BigInteger = js.native
    
    var `869`: BigInteger = js.native
    
    var `87`: BigInteger = js.native
    
    var `870`: BigInteger = js.native
    
    var `871`: BigInteger = js.native
    
    var `872`: BigInteger = js.native
    
    var `873`: BigInteger = js.native
    
    var `874`: BigInteger = js.native
    
    var `875`: BigInteger = js.native
    
    var `876`: BigInteger = js.native
    
    var `877`: BigInteger = js.native
    
    var `878`: BigInteger = js.native
    
    var `879`: BigInteger = js.native
    
    var `88`: BigInteger = js.native
    
    var `880`: BigInteger = js.native
    
    var `881`: BigInteger = js.native
    
    var `882`: BigInteger = js.native
    
    var `883`: BigInteger = js.native
    
    var `884`: BigInteger = js.native
    
    var `885`: BigInteger = js.native
    
    var `886`: BigInteger = js.native
    
    var `887`: BigInteger = js.native
    
    var `888`: BigInteger = js.native
    
    var `889`: BigInteger = js.native
    
    var `89`: BigInteger = js.native
    
    var `890`: BigInteger = js.native
    
    var `891`: BigInteger = js.native
    
    var `892`: BigInteger = js.native
    
    var `893`: BigInteger = js.native
    
    var `894`: BigInteger = js.native
    
    var `895`: BigInteger = js.native
    
    var `896`: BigInteger = js.native
    
    var `897`: BigInteger = js.native
    
    var `898`: BigInteger = js.native
    
    var `899`: BigInteger = js.native
    
    var `9`: BigInteger = js.native
    
    var `90`: BigInteger = js.native
    
    var `900`: BigInteger = js.native
    
    var `901`: BigInteger = js.native
    
    var `902`: BigInteger = js.native
    
    var `903`: BigInteger = js.native
    
    var `904`: BigInteger = js.native
    
    var `905`: BigInteger = js.native
    
    var `906`: BigInteger = js.native
    
    var `907`: BigInteger = js.native
    
    var `908`: BigInteger = js.native
    
    var `909`: BigInteger = js.native
    
    var `91`: BigInteger = js.native
    
    var `910`: BigInteger = js.native
    
    var `911`: BigInteger = js.native
    
    var `912`: BigInteger = js.native
    
    var `913`: BigInteger = js.native
    
    var `914`: BigInteger = js.native
    
    var `915`: BigInteger = js.native
    
    var `916`: BigInteger = js.native
    
    var `917`: BigInteger = js.native
    
    var `918`: BigInteger = js.native
    
    var `919`: BigInteger = js.native
    
    var `92`: BigInteger = js.native
    
    var `920`: BigInteger = js.native
    
    var `921`: BigInteger = js.native
    
    var `922`: BigInteger = js.native
    
    var `923`: BigInteger = js.native
    
    var `924`: BigInteger = js.native
    
    var `925`: BigInteger = js.native
    
    var `926`: BigInteger = js.native
    
    var `927`: BigInteger = js.native
    
    var `928`: BigInteger = js.native
    
    var `929`: BigInteger = js.native
    
    var `93`: BigInteger = js.native
    
    var `930`: BigInteger = js.native
    
    var `931`: BigInteger = js.native
    
    var `932`: BigInteger = js.native
    
    var `933`: BigInteger = js.native
    
    var `934`: BigInteger = js.native
    
    var `935`: BigInteger = js.native
    
    var `936`: BigInteger = js.native
    
    var `937`: BigInteger = js.native
    
    var `938`: BigInteger = js.native
    
    var `939`: BigInteger = js.native
    
    var `94`: BigInteger = js.native
    
    var `940`: BigInteger = js.native
    
    var `941`: BigInteger = js.native
    
    var `942`: BigInteger = js.native
    
    var `943`: BigInteger = js.native
    
    var `944`: BigInteger = js.native
    
    var `945`: BigInteger = js.native
    
    var `946`: BigInteger = js.native
    
    var `947`: BigInteger = js.native
    
    var `948`: BigInteger = js.native
    
    var `949`: BigInteger = js.native
    
    var `95`: BigInteger = js.native
    
    var `950`: BigInteger = js.native
    
    var `951`: BigInteger = js.native
    
    var `952`: BigInteger = js.native
    
    var `953`: BigInteger = js.native
    
    var `954`: BigInteger = js.native
    
    var `955`: BigInteger = js.native
    
    var `956`: BigInteger = js.native
    
    var `957`: BigInteger = js.native
    
    var `958`: BigInteger = js.native
    
    var `959`: BigInteger = js.native
    
    var `96`: BigInteger = js.native
    
    var `960`: BigInteger = js.native
    
    var `961`: BigInteger = js.native
    
    var `962`: BigInteger = js.native
    
    var `963`: BigInteger = js.native
    
    var `964`: BigInteger = js.native
    
    var `965`: BigInteger = js.native
    
    var `966`: BigInteger = js.native
    
    var `967`: BigInteger = js.native
    
    var `968`: BigInteger = js.native
    
    var `969`: BigInteger = js.native
    
    var `97`: BigInteger = js.native
    
    var `970`: BigInteger = js.native
    
    var `971`: BigInteger = js.native
    
    var `972`: BigInteger = js.native
    
    var `973`: BigInteger = js.native
    
    var `974`: BigInteger = js.native
    
    var `975`: BigInteger = js.native
    
    var `976`: BigInteger = js.native
    
    var `977`: BigInteger = js.native
    
    var `978`: BigInteger = js.native
    
    var `979`: BigInteger = js.native
    
    var `98`: BigInteger = js.native
    
    var `980`: BigInteger = js.native
    
    var `981`: BigInteger = js.native
    
    var `982`: BigInteger = js.native
    
    var `983`: BigInteger = js.native
    
    var `984`: BigInteger = js.native
    
    var `985`: BigInteger = js.native
    
    var `986`: BigInteger = js.native
    
    var `987`: BigInteger = js.native
    
    var `988`: BigInteger = js.native
    
    var `989`: BigInteger = js.native
    
    var `99`: BigInteger = js.native
    
    var `990`: BigInteger = js.native
    
    var `991`: BigInteger = js.native
    
    var `992`: BigInteger = js.native
    
    var `993`: BigInteger = js.native
    
    var `994`: BigInteger = js.native
    
    var `995`: BigInteger = js.native
    
    var `996`: BigInteger = js.native
    
    var `997`: BigInteger = js.native
    
    var `998`: BigInteger = js.native
    
    var `999`: BigInteger = js.native
    
    /**
      * Constructs a bigInt from an array of digits in specified base.
      * The optional isNegative flag will make the number negative.
      */
    def fromArray(digits: js.Array[BigNumber]): BigInteger = js.native
    def fromArray(digits: js.Array[BigNumber], base: js.UndefOr[BigNumber], isNegative: Boolean): BigInteger = js.native
    def fromArray(digits: js.Array[BigNumber], base: BigNumber): BigInteger = js.native
    
    /**
      * Finds the greatest common denominator of a and b.
      */
    def gcd(a: BigNumber, b: BigNumber): BigInteger = js.native
    
    /**
      * Returns true if x is a BigInteger, false otherwise.
      */
    def isInstance(x: js.Any): /* is big-integer.big-integer.BigInteger */ Boolean = js.native
    
    /**
      * Finds the least common multiple of a and b.
      */
    def lcm(a: BigNumber, b: BigNumber): BigInteger = js.native
    
    /**
      * Returns the largest of a and b.
      */
    def max(a: BigNumber, b: BigNumber): BigInteger = js.native
    
    /**
      * Returns the smallest of a and b.
      */
    def min(a: BigNumber, b: BigNumber): BigInteger = js.native
    
    /**
      * Equivalent to bigInt(-1).
      */
    var minusOne: BigInteger = js.native
    
    /**
      * Equivalent to bigInt(1).
      */
    var one: BigInteger = js.native
    
    /**
      * Returns a random number between min and max.
      */
    def randBetween(min: BigNumber, max: BigNumber): BigInteger = js.native
    def randBetween(min: BigNumber, max: BigNumber, rng: js.Function0[Double]): BigInteger = js.native
    
    /**
      * Equivalent to bigInt(0).
      */
    var zero: BigInteger = js.native
  }
  
  type BigNumber = Double | js.BigInt | String | BigInteger
  
  type _To = BigIntegerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BigIntegerStatic = ^
}
