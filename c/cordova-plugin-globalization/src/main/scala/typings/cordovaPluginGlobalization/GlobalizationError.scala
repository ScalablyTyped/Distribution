package typings.cordovaPluginGlobalization

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
  var code: Double
  /** A text message that includes the error's explanation and/or details */
  var message: String
}

object GlobalizationError {
  @scala.inline
  def apply(code: Double, message: String): GlobalizationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationError]
  }
}

