package typings.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pattern to format and parse numbers according to the client's user preferences. */
trait GlobalizationNumberPattern extends js.Object {
  /* The decimal symbol to use for parsing and formatting. */
  var decimal: String
  /* The number of fractional digits to use when parsing and formatting numbers. */
  var fraction: Double
  /* The grouping symbol to use for parsing and formatting. */
  var grouping: String
  /* The symbol to use for negative numbers when parsing and formatting. */
  var negative: String
  /* The number pattern to format and parse numbers. The patterns follow Unicode Technical Standard #35. */
  var pattern: String
  /* The symbol to use for positive numbers when parsing and formatting. */
  var positive: String
  /* The rounding increment to use when parsing and formatting. */
  var rounding: Double
  /* The symbol to use when formatting and parsing, such as a percent or currency symbol. */
  var symbol: String
}

object GlobalizationNumberPattern {
  @scala.inline
  def apply(
    decimal: String,
    fraction: Double,
    grouping: String,
    negative: String,
    pattern: String,
    positive: String,
    rounding: Double,
    symbol: String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
}

