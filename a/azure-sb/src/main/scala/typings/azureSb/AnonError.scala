package typings.azureSb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var Error: AnonCode
}

object AnonError {
  @scala.inline
  def apply(Error: AnonCode): AnonError = {
    val __obj = js.Dynamic.literal(Error = Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

