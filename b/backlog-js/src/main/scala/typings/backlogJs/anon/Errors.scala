package typings.backlogJs.anon

import typings.backlogJs.mod.Error.BacklogErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[BacklogErrorMessage]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[BacklogErrorMessage]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

