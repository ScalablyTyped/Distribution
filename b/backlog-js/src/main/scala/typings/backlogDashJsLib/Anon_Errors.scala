package typings
package backlogDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[backlogDashJsLib.backlogDashJsMod.ErrorNs.BacklogErrorMessage]
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[backlogDashJsLib.backlogDashJsMod.ErrorNs.BacklogErrorMessage]): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Errors]
  }
}

