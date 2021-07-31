package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentNotebookTemplateResult
  extends StObject
     with ResultStatus {
  
  var notebookTemplate: String
}
object AgentNotebookTemplateResult {
  
  @scala.inline
  def apply(errorMessage: String, notebookTemplate: String, success: Boolean): AgentNotebookTemplateResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebookTemplate = notebookTemplate.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookTemplateResult]
  }
  
  @scala.inline
  implicit class AgentNotebookTemplateResultMutableBuilder[Self <: AgentNotebookTemplateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookTemplate(value: String): Self = StObject.set(x, "notebookTemplate", value.asInstanceOf[js.Any])
  }
}
