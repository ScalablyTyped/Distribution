package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentNotebookTemplateResult extends ResultStatus {
  var notebookTemplate: String
}

object AgentNotebookTemplateResult {
  @scala.inline
  def apply(errorMessage: String, notebookTemplate: String, success: Boolean): AgentNotebookTemplateResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookTemplate = notebookTemplate.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentNotebookTemplateResult]
  }
}

