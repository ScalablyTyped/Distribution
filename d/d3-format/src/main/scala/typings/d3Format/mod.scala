package typings.d3Format

import typings.d3Format.anon.ValueOf
import typings.d3Format.d3FormatStrings.$
import typings.d3Format.d3FormatStrings.Equalssign
import typings.d3Format.d3FormatStrings.Greaterthansign
import typings.d3Format.d3FormatStrings.Leftparenthesis
import typings.d3Format.d3FormatStrings.Lessthansign
import typings.d3Format.d3FormatStrings.Numbersign
import typings.d3Format.d3FormatStrings.Percentsign
import typings.d3Format.d3FormatStrings.Plussign
import typings.d3Format.d3FormatStrings.Space
import typings.d3Format.d3FormatStrings.X
import typings.d3Format.d3FormatStrings._empty
import typings.d3Format.d3FormatStrings.`-_`
import typings.d3Format.d3FormatStrings.b
import typings.d3Format.d3FormatStrings.c
import typings.d3Format.d3FormatStrings.d
import typings.d3Format.d3FormatStrings.e
import typings.d3Format.d3FormatStrings.f
import typings.d3Format.d3FormatStrings.g
import typings.d3Format.d3FormatStrings.n
import typings.d3Format.d3FormatStrings.o
import typings.d3Format.d3FormatStrings.p
import typings.d3Format.d3FormatStrings.r
import typings.d3Format.d3FormatStrings.s
import typings.d3Format.d3FormatStrings.x_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("d3-format", "FormatSpecifier")
  @js.native
  class FormatSpecifier_ protected () extends StObject {
    /**
      * Given the specified specifier object, returning an object with exposed fields that correspond to the format specification mini-language and a toString method that reconstructs the specifier.
      * @param specifier A specifier object.
      */
    def this(specifier: FormatSpecifierObject) = this()
    
    /**
      * Alignment used for format, as set by choosing one of the following:
      *
      * '>' - Forces the field to be right-aligned within the available space. (Default behavior).
      * '<' - Forces the field to be left-aligned within the available space.
      * '^' - Forces the field to be centered within the available space.
      * '=' - Like '>', but with any sign and symbol to the left of any padding.
      */
    var align: Greaterthansign | Lessthansign | typings.d3Format.d3FormatStrings.^ | Equalssign = js.native
    
    /**
      * The comma (,) option enables the use of a group separator, such as a comma for thousands.
      */
    var comma: Boolean = js.native
    
    /**
      * fill can be any character. The presence of a fill character is signaled by the align character following it.
      */
    var fill: String = js.native
    
    /**
      * Depending on the type, the precision either indicates the number of digits that follow the decimal point (types 'f' and '%'),
      * or the number of significant digits (types '' (none), 'e', 'g', 'r', 's' and 'p'). If the precision is not specified,
      * it defaults to 6 for all types except '' (none), which defaults to 12.
      * Precision is ignored for integer formats (types 'b', 'o', 'd', 'x', 'X' and 'c').
      *
      * See precisionFixed and precisionRound for help picking an appropriate precision.
      */
    var precision: js.UndefOr[Double] = js.native
    
    /**
      * The sign can be:
      *
      * '-' - nothing for positive and a minus sign for negative. (Default behavior.)
      * '+' - a plus sign for positive and a minus sign for negative.
      * '(' - nothing for positive and parentheses for negative.
      * ' ' (space) - a space for positive and a minus sign for negative.
      *
      */
    var sign: `-_` | Plussign | Leftparenthesis | Space = js.native
    
    /**
      * The symbol can be:
      *
      * '$' - apply currency symbols per the locale definition.
      * '#' - for binary, octal, or hexadecimal notation, prefix by 0b, 0o, or 0x, respectively.
      * '' (none) - no symbol. (Default behavior.)
      */
    var symbol: $ | Numbersign | _empty = js.native
    
    /**
      * The '~' option trims insignificant trailing zeros across all format types.
      * This is most commonly used in conjunction with types 'r', 'e', 's' and '%'.
      */
    var trim: Boolean = js.native
    
    /**
      * The available type values are:
      *
      * 'e' - exponent notation.
      * 'f' - fixed point notation.
      * 'g' - either decimal or exponent notation, rounded to significant digits.
      * 'r' - decimal notation, rounded to significant digits.
      * 's' - decimal notation with an SI prefix, rounded to significant digits.
      * '%' - multiply by 100, and then decimal notation with a percent sign.
      * 'p' - multiply by 100, round to significant digits, and then decimal notation with a percent sign.
      * 'b' - binary notation, rounded to integer.
      * 'o' - octal notation, rounded to integer.
      * 'd' - decimal notation, rounded to integer.
      * 'x' - hexadecimal notation, using lower-case letters, rounded to integer.
      * 'X' - hexadecimal notation, using upper-case letters, rounded to integer.
      * 'c' - converts the integer to the corresponding unicode character before printing.
      *
      * The type '' (none) is also supported as shorthand for '~g' (with a default precision of 12 instead of 6), and
      * the type 'n' is shorthand for ',g'. For the 'g', 'n' and '' (none) types,
      * decimal notation is used if the resulting string would have precision or fewer digits; otherwise, exponent notation is used.
      */
    var `type`: e | f | g | r | s | Percentsign | p | b | o | d | x_ | X | c | _empty | n = js.native
    
    /**
      * The width defines the minimum field width;
      * if not specified, then the width will be determined by the content.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The zero (0) option enables zero-padding; this implicitly sets fill to 0 and align to =.
      */
    var zero: Boolean = js.native
  }
  
  inline def format(specifier: String): js.Function1[/* n */ Double | ValueOf, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* n */ Double | ValueOf, String]]
  
  inline def formatDefaultLocale(defaultLocale: FormatLocaleDefinition): FormatLocaleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDefaultLocale")(defaultLocale.asInstanceOf[js.Any]).asInstanceOf[FormatLocaleObject]
  
  inline def formatLocale(locale: FormatLocaleDefinition): FormatLocaleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[FormatLocaleObject]
  
  inline def formatPrefix(specifier: String, value: Double): js.Function1[/* n */ Double | ValueOf, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPrefix")(specifier.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* n */ Double | ValueOf, String]]
  
  inline def formatSpecifier(specifier: String): FormatSpecifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSpecifier")(specifier.asInstanceOf[js.Any]).asInstanceOf[FormatSpecifier_]
  
  inline def precisionFixed(step: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("precisionFixed")(step.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def precisionPrefix(step: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precisionPrefix")(step.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def precisionRound(step: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("precisionRound")(step.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait FormatLocaleDefinition extends StObject {
    
    /**
      * The currency prefix and suffix (e.g., ["$", ""]).
      */
    var currency: js.Tuple2[String, String]
    
    /**
      * The decimal point (e.g., ".")
      */
    var decimal: String
    
    /**
      * The array of group sizes (e.g., [3]), cycled as needed.
      */
    var grouping: js.Array[Double]
    
    /**
      * Optional; the minus sign (defaults to "−").
      */
    var minus: js.UndefOr[String] = js.undefined
    
    /**
      * Optional; the not-a-number value (defaults "NaN").
      */
    var nan: js.UndefOr[String] = js.undefined
    
    /**
      * An optional array of ten strings to replace the numerals 0-9.
      */
    var numerals: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An optional symbol to replace the `percent` suffix; the percent suffix (defaults to "%").
      */
    var percent: js.UndefOr[String] = js.undefined
    
    /**
      * The group separator (e.g., ","). Note that the thousands property is a misnomer, as
      * the grouping definition allows groups other than thousands.
      */
    var thousands: String
  }
  object FormatLocaleDefinition {
    
    inline def apply(
      currency: js.Tuple2[String, String],
      decimal: String,
      grouping: js.Array[Double],
      thousands: String
    ): FormatLocaleDefinition = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatLocaleDefinition]
    }
    
    extension [Self <: FormatLocaleDefinition](x: Self) {
      
      inline def setCurrency(value: js.Tuple2[String, String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      inline def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
      
      inline def setMinus(value: String): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
      
      inline def setMinusUndefined: Self = StObject.set(x, "minus", js.undefined)
      
      inline def setNan(value: String): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      inline def setNanUndefined: Self = StObject.set(x, "nan", js.undefined)
      
      inline def setNumerals(value: js.Array[String]): Self = StObject.set(x, "numerals", value.asInstanceOf[js.Any])
      
      inline def setNumeralsUndefined: Self = StObject.set(x, "numerals", js.undefined)
      
      inline def setNumeralsVarargs(value: String*): Self = StObject.set(x, "numerals", js.Array(value :_*))
      
      inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatLocaleObject extends StObject {
    
    /**
      * Returns a new format function for the given string specifier. The returned function
      * takes a number as the only argument, and returns a string representing the formatted number.
      *
      * @param specifier A Specifier string.
      * @throws Error on invalid format specifier.
      */
    def format(specifier: String): js.Function1[/* n */ Double | ValueOf, String]
    
    /**
      * Returns a new format function for the given string specifier. The returned function
      * takes a number as the only argument, and returns a string representing the formatted number.
      * The returned function will convert values to the units of the appropriate SI prefix for the
      * specified numeric reference value before formatting in fixed point notation.
      *
      * @param specifier A Specifier string.
      * @param value The reference value to determine the appropriate SI prefix.
      * @throws Error on invalid format specifier.
      */
    def formatPrefix(specifier: String, value: Double): js.Function1[/* n */ Double | ValueOf, String]
  }
  object FormatLocaleObject {
    
    inline def apply(
      format: String => js.Function1[/* n */ Double | ValueOf, String],
      formatPrefix: (String, Double) => js.Function1[/* n */ Double | ValueOf, String]
    ): FormatLocaleObject = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatPrefix = js.Any.fromFunction2(formatPrefix))
      __obj.asInstanceOf[FormatLocaleObject]
    }
    
    extension [Self <: FormatLocaleObject](x: Self) {
      
      inline def setFormat(value: String => js.Function1[/* n */ Double | ValueOf, String]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatPrefix(value: (String, Double) => js.Function1[/* n */ Double | ValueOf, String]): Self = StObject.set(x, "formatPrefix", js.Any.fromFunction2(value))
    }
  }
  
  trait FormatSpecifierObject extends StObject {
    
    /**
      * Alignment used for format, as set by choosing one of the following:
      *
      * '>' - Forces the field to be right-aligned within the available space. (Default behavior).
      * '<' - Forces the field to be left-aligned within the available space.
      * '^' - Forces the field to be centered within the available space.
      * '=' - Like '>', but with any sign and symbol to the left of any padding.
      */
    var align: js.UndefOr[String] = js.undefined
    
    /**
      * The comma (,) option enables the use of a group separator, such as a comma for thousands.
      */
    var comma: js.UndefOr[String] = js.undefined
    
    /**
      * fill can be any character. The presence of a fill character is signaled by the align character following it.
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * Depending on the type, the precision either indicates the number of digits that follow the decimal point (types 'f' and '%'),
      * or the number of significant digits (types '' (none), 'e', 'g', 'r', 's' and 'p'). If the precision is not specified,
      * it defaults to 6 for all types except '' (none), which defaults to 12.
      * Precision is ignored for integer formats (types 'b', 'o', 'd', 'x', 'X' and 'c').
      *
      * See precisionFixed and precisionRound for help picking an appropriate precision.
      */
    var precision: js.UndefOr[String] = js.undefined
    
    /**
      * The sign can be:
      *
      * '-' - nothing for positive and a minus sign for negative. (Default behavior.)
      * '+' - a plus sign for positive and a minus sign for negative.
      * '(' - nothing for positive and parentheses for negative.
      * ' ' (space) - a space for positive and a minus sign for negative.
      *
      */
    var sign: js.UndefOr[String] = js.undefined
    
    /**
      * The symbol can be:
      *
      * '$' - apply currency symbols per the locale definition.
      * '#' - for binary, octal, or hexadecimal notation, prefix by 0b, 0o, or 0x, respectively.
      * '' (none) - no symbol. (Default behavior.)
      */
    var symbol: js.UndefOr[String] = js.undefined
    
    /**
      * The '~' option trims insignificant trailing zeros across all format types.
      * This is most commonly used in conjunction with types 'r', 'e', 's' and '%'.
      */
    var trim: js.UndefOr[String] = js.undefined
    
    /**
      * The available type values are:
      *
      * 'e' - exponent notation.
      * 'f' - fixed point notation.
      * 'g' - either decimal or exponent notation, rounded to significant digits.
      * 'r' - decimal notation, rounded to significant digits.
      * 's' - decimal notation with an SI prefix, rounded to significant digits.
      * '%' - multiply by 100, and then decimal notation with a percent sign.
      * 'p' - multiply by 100, round to significant digits, and then decimal notation with a percent sign.
      * 'b' - binary notation, rounded to integer.
      * 'o' - octal notation, rounded to integer.
      * 'd' - decimal notation, rounded to integer.
      * 'x' - hexadecimal notation, using lower-case letters, rounded to integer.
      * 'X' - hexadecimal notation, using upper-case letters, rounded to integer.
      * 'c' - converts the integer to the corresponding unicode character before printing.
      *
      * The type '' (none) is also supported as shorthand for '~g' (with a default precision of 12 instead of 6), and
      * the type 'n' is shorthand for ',g'. For the 'g', 'n' and '' (none) types,
      * decimal notation is used if the resulting string would have precision or fewer digits; otherwise, exponent notation is used.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * The width defines the minimum field width;
      * if not specified, then the width will be determined by the content.
      */
    var width: js.UndefOr[String] = js.undefined
    
    /**
      * The zero (0) option enables zero-padding; this implicitly sets fill to 0 and align to =.
      */
    var zero: js.UndefOr[String] = js.undefined
  }
  object FormatSpecifierObject {
    
    inline def apply(): FormatSpecifierObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatSpecifierObject]
    }
    
    extension [Self <: FormatSpecifierObject](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setComma(value: String): Self = StObject.set(x, "comma", value.asInstanceOf[js.Any])
      
      inline def setCommaUndefined: Self = StObject.set(x, "comma", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setSign(value: String): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setTrim(value: String): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
}
