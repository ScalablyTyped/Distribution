package typings
package d3DashFormatLib.d3DashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSpecifier extends js.Object {
  /**
    * Alignment used for format, as set by choosing one of the following:
    *
    * '>' - Forces the field to be right-aligned within the available space. (Default behavior).
    * '<' - Forces the field to be left-aligned within the available space.
    * '^' - Forces the field to be centered within the available space.
    * '=' - Like '>', but with any sign and symbol to the left of any padding.
    */
  var align: d3DashFormatLib.d3DashFormatLibStrings.`>` | d3DashFormatLib.d3DashFormatLibStrings.`<` | d3DashFormatLib.d3DashFormatLibStrings.`_backtick^_backtick` | d3DashFormatLib.d3DashFormatLibStrings.`=`
  /**
    * The comma (,) option enables the use of a group separator, such as a comma for thousands.
    */
  var comma: scala.Boolean
  /**
    * fill can be any character. The presence of a fill character is signaled by the align character following it.
    */
  var fill: java.lang.String
  /**
    * Depending on the type, the precision either indicates the number of digits that follow the decimal point (types 'f' and '%'),
    * or the number of significant digits (types '' (none), 'e', 'g', 'r', 's' and 'p'). If the precision is not specified,
    * it defaults to 6 for all types except '' (none), which defaults to 12.
    * Precision is ignored for integer formats (types 'b', 'o', 'd', 'x', 'X' and 'c').
    *
    * See precisionFixed and precisionRound for help picking an appropriate precision.
    */
  var precision: js.UndefOr[scala.Double]
  /**
    * The sign can be:
    *
    * '-' - nothing for positive and a minus sign for negative. (Default behavior.)
    * '+' - a plus sign for positive and a minus sign for negative.
    * '(' - nothing for positive and parentheses for negative.
    * ' ' (space) - a space for positive and a minus sign for negative.
    *
    */
  var sign: d3DashFormatLib.d3DashFormatLibStrings.`-` | d3DashFormatLib.d3DashFormatLibStrings.`+` | d3DashFormatLib.d3DashFormatLibStrings.`(` | (d3DashFormatLib.d3DashFormatLibStrings.` `)
  /**
    * The symbol can be:
    *
    * '$' - apply currency symbols per the locale definition.
    * '#' - for binary, octal, or hexadecimal notation, prefix by 0b, 0o, or 0x, respectively.
    * '' (none) - no symbol. (Default behavior.)
    */
  var symbol: d3DashFormatLib.d3DashFormatLibStrings.DOLLAR | d3DashFormatLib.d3DashFormatLibStrings.`#` | d3DashFormatLib.d3DashFormatLibStrings.Empty
  /**
    * The '~' option trims insignificant trailing zeros across all format types.
    * This is most commonly used in conjunction with types 'r', 'e', 's' and '%'.
    */
  var trim: scala.Boolean
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
  var `type`: d3DashFormatLib.d3DashFormatLibStrings.e | d3DashFormatLib.d3DashFormatLibStrings.f | d3DashFormatLib.d3DashFormatLibStrings.g | d3DashFormatLib.d3DashFormatLibStrings.r | d3DashFormatLib.d3DashFormatLibStrings.s | d3DashFormatLib.d3DashFormatLibStrings.`%` | d3DashFormatLib.d3DashFormatLibStrings.p | d3DashFormatLib.d3DashFormatLibStrings.b | d3DashFormatLib.d3DashFormatLibStrings.o | d3DashFormatLib.d3DashFormatLibStrings.d | d3DashFormatLib.d3DashFormatLibStrings.x | d3DashFormatLib.d3DashFormatLibStrings.X | d3DashFormatLib.d3DashFormatLibStrings.c | d3DashFormatLib.d3DashFormatLibStrings.Empty | d3DashFormatLib.d3DashFormatLibStrings.n
  /**
    * The width defines the minimum field width;
    * if not specified, then the width will be determined by the content.
    */
  var width: js.UndefOr[scala.Double]
  /**
    * The zero (0) option enables zero-padding; this implicitly sets fill to 0 and align to =.
    */
  var zero: scala.Boolean
}

object FormatSpecifier {
  @scala.inline
  def apply(
    align: d3DashFormatLib.d3DashFormatLibStrings.`>` | d3DashFormatLib.d3DashFormatLibStrings.`<` | d3DashFormatLib.d3DashFormatLibStrings.`_backtick^_backtick` | d3DashFormatLib.d3DashFormatLibStrings.`=`,
    comma: scala.Boolean,
    fill: java.lang.String,
    sign: d3DashFormatLib.d3DashFormatLibStrings.`-` | d3DashFormatLib.d3DashFormatLibStrings.`+` | d3DashFormatLib.d3DashFormatLibStrings.`(` | (d3DashFormatLib.d3DashFormatLibStrings.` `),
    symbol: d3DashFormatLib.d3DashFormatLibStrings.DOLLAR | d3DashFormatLib.d3DashFormatLibStrings.`#` | d3DashFormatLib.d3DashFormatLibStrings.Empty,
    toString: js.Function0[java.lang.String],
    trim: scala.Boolean,
    `type`: d3DashFormatLib.d3DashFormatLibStrings.e | d3DashFormatLib.d3DashFormatLibStrings.f | d3DashFormatLib.d3DashFormatLibStrings.g | d3DashFormatLib.d3DashFormatLibStrings.r | d3DashFormatLib.d3DashFormatLibStrings.s | d3DashFormatLib.d3DashFormatLibStrings.`%` | d3DashFormatLib.d3DashFormatLibStrings.p | d3DashFormatLib.d3DashFormatLibStrings.b | d3DashFormatLib.d3DashFormatLibStrings.o | d3DashFormatLib.d3DashFormatLibStrings.d | d3DashFormatLib.d3DashFormatLibStrings.x | d3DashFormatLib.d3DashFormatLibStrings.X | d3DashFormatLib.d3DashFormatLibStrings.c | d3DashFormatLib.d3DashFormatLibStrings.Empty | d3DashFormatLib.d3DashFormatLibStrings.n,
    zero: scala.Boolean,
    precision: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): FormatSpecifier = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], comma = comma, fill = fill, sign = sign.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], toString = toString, trim = trim, zero = zero)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSpecifier]
  }
}

