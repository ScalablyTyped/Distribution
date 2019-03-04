package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
       // A generalization of the error
  var code: java.lang.String
       // Standardized error code
  var message: java.lang.String
    // Human-readable details
  var row: scala.Double
  var `type`: java.lang.String
}

object ParseError {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String, row: scala.Double, `type`: java.lang.String): ParseError = {
    val __obj = js.Dynamic.literal(code = code, message = message, row = row)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ParseError]
  }
}

