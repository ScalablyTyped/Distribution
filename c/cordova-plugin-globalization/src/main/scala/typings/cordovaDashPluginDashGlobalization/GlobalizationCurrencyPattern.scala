package typings.cordovaDashPluginDashGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pattern to format and parse currency values according
  * to the client's user preferences and ISO 4217 currency code.
  */
trait GlobalizationCurrencyPattern extends js.Object {
  /** The ISO 4217 currency code for the pattern. */
  var code: String
  /** The decimal symbol to use for parsing and formatting. */
  var decimal: String
  /** The number of fractional digits to use when parsing and formatting currency. */
  var fraction: Double
  /** The grouping symbol to use for parsing and formatting. */
  var grouping: String
  /** The currency pattern to format and parse currency values. The patterns follow Unicode Technical Standard #35. */
  var pattern: String
  /** The rounding increment to use when parsing and formatting. */
  var rounding: Double
}

object GlobalizationCurrencyPattern {
  @scala.inline
  def apply(
    code: String,
    decimal: String,
    fraction: Double,
    grouping: String,
    pattern: String,
    rounding: Double
  ): GlobalizationCurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code, decimal = decimal, fraction = fraction, grouping = grouping, pattern = pattern, rounding = rounding)
  
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
}

