package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAgentNotebookResult extends ResultStatus {
  var notebook: AgentNotebookInfo = js.native
}

object UpdateAgentNotebookResult {
  @scala.inline
  def apply(errorMessage: String, notebook: AgentNotebookInfo, success: Boolean): UpdateAgentNotebookResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentNotebookResult]
  }
  @scala.inline
  implicit class UpdateAgentNotebookResultOps[Self <: UpdateAgentNotebookResult] (val x: Self) extends AnyVal {
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
    def setNotebook(value: AgentNotebookInfo): Self = this.set("notebook", value.asInstanceOf[js.Any])
  }
  
}

