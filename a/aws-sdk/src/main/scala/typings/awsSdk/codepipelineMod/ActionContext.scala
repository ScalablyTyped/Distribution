package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionContext extends js.Object {
  /**
    * The system-generated unique ID that corresponds to an action's execution.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  /**
    * The name of the action in the context of a job.
    */
  var name: js.UndefOr[ActionName] = js.native
}

object ActionContext {
  @scala.inline
  def apply(): ActionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionContext]
  }
  @scala.inline
  implicit class ActionContextOps[Self <: ActionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionExecutionId(value: ActionExecutionId): Self = this.set("actionExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionExecutionId: Self = this.set("actionExecutionId", js.undefined)
    @scala.inline
    def setName(value: ActionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

