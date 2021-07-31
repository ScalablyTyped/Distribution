package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentNotebookResult
  extends StObject
     with ResultStatus {
  
  var notebook: AgentNotebookInfo
}
object CreateAgentNotebookResult {
  
  @scala.inline
  def apply(errorMessage: String, notebook: AgentNotebookInfo, success: Boolean): CreateAgentNotebookResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentNotebookResult]
  }
  
  @scala.inline
  implicit class CreateAgentNotebookResultMutableBuilder[Self <: CreateAgentNotebookResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebook(value: AgentNotebookInfo): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
