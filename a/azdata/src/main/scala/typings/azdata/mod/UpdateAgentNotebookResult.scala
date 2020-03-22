package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAgentNotebookResult extends ResultStatus {
  var notebook: AgentNotebookInfo
}

object UpdateAgentNotebookResult {
  @scala.inline
  def apply(errorMessage: String, notebook: AgentNotebookInfo, success: Boolean): UpdateAgentNotebookResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateAgentNotebookResult]
  }
}

