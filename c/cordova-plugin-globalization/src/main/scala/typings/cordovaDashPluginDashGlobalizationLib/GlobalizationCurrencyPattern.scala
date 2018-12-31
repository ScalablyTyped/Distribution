package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pattern to format and parse currency values according
  * to the client's user preferences and ISO 4217 currency code.
  */
trait GlobalizationCurrencyPattern extends js.Object {
  /** The ISO 4217 currency code for the pattern. */
  var code: java.lang.String
  /** The decimal symbol to use for parsing and formatting. */
  var decimal: java.lang.String
  /** The number of fractional digits to use when parsing and formatting currency. */
  var fraction: scala.Double
  /** The grouping symbol to use for parsing and formatting. */
  var grouping: java.lang.String
  /** The currency pattern to format and parse currency values. The patterns follow Unicode Technical Standard #35. */
  var pattern: java.lang.String
  /** The rounding increment to use when parsing and formatting. */
  var rounding: scala.Double
}

