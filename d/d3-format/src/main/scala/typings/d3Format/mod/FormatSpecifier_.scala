package typings.d3Format.mod

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
import typings.d3Format.d3FormatStrings.^
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-format", "FormatSpecifier")
@js.native
class FormatSpecifier_ protected () extends js.Object {
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
  var align: Greaterthansign | Lessthansign | ^  | Equalssign = js.native
  
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
