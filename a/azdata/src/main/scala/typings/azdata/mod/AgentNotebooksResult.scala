package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNotebooksResult extends ResultStatus {
  var notebooks: js.Array[AgentNotebookInfo]
}

object AgentNotebooksResult {
  @scala.inline
  def apply(errorMessage: String, notebooks: js.Array[AgentNotebookInfo], success: Boolean): AgentNotebooksResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebooks = notebooks.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebooksResult]
  }
}

