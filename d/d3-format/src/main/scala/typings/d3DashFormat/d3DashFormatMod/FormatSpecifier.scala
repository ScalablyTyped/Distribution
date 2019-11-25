package typings.d3DashFormat.d3DashFormatMod

import typings.d3DashFormat.d3DashFormatStrings.DOLLAR
import typings.d3DashFormat.d3DashFormatStrings.Empty
import typings.d3DashFormat.d3DashFormatStrings.X
import typings.d3DashFormat.d3DashFormatStrings.` `
import typings.d3DashFormat.d3DashFormatStrings.`#`
import typings.d3DashFormat.d3DashFormatStrings.`%`
import typings.d3DashFormat.d3DashFormatStrings.`(`
import typings.d3DashFormat.d3DashFormatStrings.`+`
import typings.d3DashFormat.d3DashFormatStrings.`-`
import typings.d3DashFormat.d3DashFormatStrings.`<`
import typings.d3DashFormat.d3DashFormatStrings.`=`
import typings.d3DashFormat.d3DashFormatStrings.`>`
import typings.d3DashFormat.d3DashFormatStrings.`_backtick^_backtick`
import typings.d3DashFormat.d3DashFormatStrings.b
import typings.d3DashFormat.d3DashFormatStrings.c
import typings.d3DashFormat.d3DashFormatStrings.d
import typings.d3DashFormat.d3DashFormatStrings.e
import typings.d3DashFormat.d3DashFormatStrings.f
import typings.d3DashFormat.d3DashFormatStrings.g
import typings.d3DashFormat.d3DashFormatStrings.n
import typings.d3DashFormat.d3DashFormatStrings.o
import typings.d3DashFormat.d3DashFormatStrings.p
import typings.d3DashFormat.d3DashFormatStrings.r
import typings.d3DashFormat.d3DashFormatStrings.s
import typings.d3DashFormat.d3DashFormatStrings.x_
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
  var align: `>` | `<` | `_backtick^_backtick` | `=`
  /**
    * The comma (,) option enables the use of a group separator, such as a comma for thousands.
    */
  var comma: Boolean
  /**
    * fill can be any character. The presence of a fill character is signaled by the align character following it.
    */
  var fill: String
  /**
    * Depending on the type, the precision either indicates the number of digits that follow the decimal point (types 'f' and '%'),
    * or the number of significant digits (types '' (none), 'e', 'g', 'r', 's' and 'p'). If the precision is not specified,
    * it defaults to 6 for all types except '' (none), which defaults to 12.
    * Precision is ignored for integer formats (types 'b', 'o', 'd', 'x', 'X' and 'c').
    *
    * See precisionFixed and precisionRound for help picking an appropriate precision.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * The sign can be:
    *
    * '-' - nothing for positive and a minus sign for negative. (Default behavior.)
    * '+' - a plus sign for positive and a minus sign for negative.
    * '(' - nothing for positive and parentheses for negative.
    * ' ' (space) - a space for positive and a minus sign for negative.
    *
    */
  var sign: `-` | `+` | `(` | (` `)
  /**
    * The symbol can be:
    *
    * '$' - apply currency symbols per the locale definition.
    * '#' - for binary, octal, or hexadecimal notation, prefix by 0b, 0o, or 0x, respectively.
    * '' (none) - no symbol. (Default behavior.)
    */
  var symbol: DOLLAR | `#` | Empty
  /**
    * The '~' option trims insignificant trailing zeros across all format types.
    * This is most commonly used in conjunction with types 'r', 'e', 's' and '%'.
    */
  var trim: Boolean
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
  var `type`: e | f | g | r | s | `%` | p | b | o | d | x_ | X | c | Empty | n
  /**
    * The width defines the minimum field width;
    * if not specified, then the width will be determined by the content.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The zero (0) option enables zero-padding; this implicitly sets fill to 0 and align to =.
    */
  var zero: Boolean
}

object FormatSpecifier {
  @scala.inline
  def apply(
    align: `>` | `<` | `_backtick^_backtick` | `=`,
    comma: Boolean,
    fill: String,
    sign: `-` | `+` | `(` | (` `),
    symbol: DOLLAR | `#` | Empty,
    trim: Boolean,
    `type`: e | f | g | r | s | `%` | p | b | o | d | x_ | X | c | Empty | n,
    zero: Boolean,
    precision: Int | Double = null,
    width: Int | Double = null
  ): FormatSpecifier = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], comma = comma.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSpecifier]
  }
}

@JSImport("d3-format", "formatSpecifier")
@js.native
object formatSpecifier extends js.Object {
  def apply(specifier: String): FormatSpecifier = js.native
}

