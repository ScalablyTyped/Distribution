package typings.backlogJs

import typings.backlogJs.mod.Error.BacklogErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[BacklogErrorMessage]
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[BacklogErrorMessage]): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

