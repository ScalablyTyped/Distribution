package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object representing a error from the Globalization API. */

trait GlobalizationError extends js.Object {
  /** One of the following codes representing the error type:
        * GlobalizationError.UNKNOWN_ERROR: 0
        * GlobalizationError.FORMATTING_ERROR: 1
        * GlobalizationError.PARSING_ERROR: 2
        * GlobalizationError.PATTERN_ERROR: 3
        */
  var code: scala.Double
  /** A text message that includes the error's explanation and/or details */
  var message: java.lang.String
}

/** An object representing a error from the Globalization API. */
@JSGlobal("GlobalizationError")
@js.native
object GlobalizationError extends js.Object {
  var FORMATTING_ERROR: scala.Double = js.native
  var PARSING_ERROR: scala.Double = js.native
  var PATTERN_ERROR: scala.Double = js.native
  var UNKNOWN_ERROR: scala.Double = js.native
}

