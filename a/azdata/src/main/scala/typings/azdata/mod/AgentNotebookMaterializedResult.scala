package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebookMaterializedResult extends ResultStatus {
  var notebookMaterialized: String = js.native
}

object AgentNotebookMaterializedResult {
  @scala.inline
  def apply(errorMessage: String, notebookMaterialized: String, success: Boolean): AgentNotebookMaterializedResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookMaterialized = notebookMaterialized.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedResult]
  }
  @scala.inline
  implicit class AgentNotebookMaterializedResultOps[Self <: AgentNotebookMaterializedResult] (val x: Self) extends AnyVal {
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
    def setNotebookMaterialized(value: String): Self = this.set("notebookMaterialized", value.asInstanceOf[js.Any])
  }
  
}

