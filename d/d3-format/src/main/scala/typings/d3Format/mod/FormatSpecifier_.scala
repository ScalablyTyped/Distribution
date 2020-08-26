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
import scala.scalajs.js.annotation._

@js.native
trait FormatSpecifier_ extends js.Object {
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

object FormatSpecifier_ {
  @scala.inline
  def apply(
    align: Greaterthansign | Lessthansign | ^  | Equalssign,
    comma: Boolean,
    fill: String,
    sign: `-_` | Plussign | Leftparenthesis | Space,
    symbol: $ | Numbersign | _empty,
    trim: Boolean,
    `type`: e | f | g | r | s | Percentsign | p | b | o | d | x_ | X | c | _empty | n,
    zero: Boolean
  ): FormatSpecifier_ = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], comma = comma.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSpecifier_]
  }
  @scala.inline
  implicit class FormatSpecifier_Ops[Self <: FormatSpecifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: Greaterthansign | Lessthansign | ^  | Equalssign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setComma(value: Boolean): Self = this.set("comma", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setSign(value: `-_` | Plussign | Leftparenthesis | Space): Self = this.set("sign", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: $ | Numbersign | _empty): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: e | f | g | r | s | Percentsign | p | b | o | d | x_ | X | c | _empty | n): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setZero(value: Boolean): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

