package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandCall extends js.Object {
  /**
    * Name of the command that needs to
    * execute
    */
  var command: String = js.native
  /**
    * Data that needs to be passed to the command
    */
  var data: js.UndefOr[js.Any] = js.native
}

object ICommandCall {
  @scala.inline
  def apply(command: String): ICommandCall = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandCall]
  }
  @scala.inline
  implicit class ICommandCallOps[Self <: ICommandCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

