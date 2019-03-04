package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pattern to format and parse numbers according to the client's user preferences. */
trait GlobalizationNumberPattern extends js.Object {
  /* The decimal symbol to use for parsing and formatting. */
  var decimal: java.lang.String
  /* The number of fractional digits to use when parsing and formatting numbers. */
  var fraction: scala.Double
  /* The grouping symbol to use for parsing and formatting. */
  var grouping: java.lang.String
  /* The symbol to use for negative numbers when parsing and formatting. */
  var negative: java.lang.String
  /* The number pattern to format and parse numbers. The patterns follow Unicode Technical Standard #35. */
  var pattern: java.lang.String
  /* The symbol to use for positive numbers when parsing and formatting. */
  var positive: java.lang.String
  /* The rounding increment to use when parsing and formatting. */
  var rounding: scala.Double
  /* The symbol to use when formatting and parsing, such as a percent or currency symbol. */
  var symbol: java.lang.String
}

object GlobalizationNumberPattern {
  @scala.inline
  def apply(
    decimal: java.lang.String,
    fraction: scala.Double,
    grouping: java.lang.String,
    negative: java.lang.String,
    pattern: java.lang.String,
    positive: java.lang.String,
    rounding: scala.Double,
    symbol: java.lang.String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal, fraction = fraction, grouping = grouping, negative = negative, pattern = pattern, positive = positive, rounding = rounding, symbol = symbol)
  
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
}

