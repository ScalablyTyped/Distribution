package typings.babyparse.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
       // A generalization of the error
  var code: String
       // Standardized error code
  var message: String
    // Human-readable details
  var row: Double
  var `type`: String
}

object ParseError {
  @scala.inline
  def apply(code: String, message: String, row: Double, `type`: String): ParseError = {
    val __obj = js.Dynamic.literal(code = code, message = message, row = row)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParseError]
  }
}

