package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandCall extends js.Object {
  /**
    * Name of the command that needs to
    * execute
    */
  var command: String
  /**
    * Data that needs to be passed to the command
    */
  var data: js.UndefOr[js.Any] = js.undefined
}

object ICommandCall {
  @scala.inline
  def apply(command: String, data: js.Any = null): ICommandCall = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandCall]
  }
}

