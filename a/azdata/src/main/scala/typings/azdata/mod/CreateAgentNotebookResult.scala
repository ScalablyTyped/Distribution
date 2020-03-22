package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentNotebookResult extends ResultStatus {
  var notebook: AgentNotebookInfo
}

object CreateAgentNotebookResult {
  @scala.inline
  def apply(errorMessage: String, notebook: AgentNotebookInfo, success: Boolean): CreateAgentNotebookResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentNotebookResult]
  }
}

