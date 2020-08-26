package typings.commangular.commangular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result object expected in the promise returned by the dispatch function
  * This must be extended to add custom result keys
  * see http://commangular.org/docs/#returning-result-from-commands
  */
@js.native
trait ICommandResult extends js.Object {
  /**
    * By defualt the result of the command will be found in this property
    */
  var lastResult: js.Any = js.native
}

object ICommandResult {
  @scala.inline
  def apply(lastResult: js.Any): ICommandResult = {
    val __obj = js.Dynamic.literal(lastResult = lastResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandResult]
  }
  @scala.inline
  implicit class ICommandResultOps[Self <: ICommandResult] (val x: Self) extends AnyVal {
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
    def setLastResult(value: js.Any): Self = this.set("lastResult", value.asInstanceOf[js.Any])
  }
  
}

