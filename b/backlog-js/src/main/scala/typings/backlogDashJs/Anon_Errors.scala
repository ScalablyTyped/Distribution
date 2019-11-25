package typings.backlogDashJs

import typings.backlogDashJs.backlogDashJsMod.Error.BacklogErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[BacklogErrorMessage]
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[BacklogErrorMessage]): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Errors]
  }
}

