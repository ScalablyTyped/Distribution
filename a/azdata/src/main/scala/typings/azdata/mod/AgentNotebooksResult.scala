package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebooksResult extends ResultStatus {
  var notebooks: js.Array[AgentNotebookInfo] = js.native
}

object AgentNotebooksResult {
  @scala.inline
  def apply(errorMessage: String, notebooks: js.Array[AgentNotebookInfo], success: Boolean): AgentNotebooksResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebooks = notebooks.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebooksResult]
  }
  @scala.inline
  implicit class AgentNotebooksResultOps[Self <: AgentNotebooksResult] (val x: Self) extends AnyVal {
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
    def setNotebooksVarargs(value: AgentNotebookInfo*): Self = this.set("notebooks", js.Array(value :_*))
    @scala.inline
    def setNotebooks(value: js.Array[AgentNotebookInfo]): Self = this.set("notebooks", value.asInstanceOf[js.Any])
  }
  
}

