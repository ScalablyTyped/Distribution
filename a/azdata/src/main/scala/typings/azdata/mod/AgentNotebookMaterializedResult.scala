package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNotebookMaterializedResult extends ResultStatus {
  var notebookMaterialized: String
}

object AgentNotebookMaterializedResult {
  @scala.inline
  def apply(errorMessage: String, notebookMaterialized: String, success: Boolean): AgentNotebookMaterializedResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookMaterialized = notebookMaterialized.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedResult]
  }
}

