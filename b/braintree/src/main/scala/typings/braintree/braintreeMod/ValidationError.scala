package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var attribute: String
  var code: String
  var message: String
}

object ValidationError {
  @scala.inline
  def apply(attribute: String, code: String, message: String): ValidationError = {
    val __obj = js.Dynamic.literal(attribute = attribute, code = code, message = message)
  
    __obj.asInstanceOf[ValidationError]
  }
}

