package typings.cathoQuantum

import typings.cathoQuantum.inputMod.Validate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: String
  var validate: Validate
}

object AnonError {
  @scala.inline
  def apply(error: String, validate: Validate): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

