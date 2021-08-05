package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentNotebookResult
  extends StObject
     with ResultStatus {
  
  var notebook: AgentNotebookInfo
}
object UpdateAgentNotebookResult {
  
  inline def apply(errorMessage: String, notebook: AgentNotebookInfo, success: Boolean): UpdateAgentNotebookResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentNotebookResult]
  }
  
  extension [Self <: UpdateAgentNotebookResult](x: Self) {
    
    inline def setNotebook(value: AgentNotebookInfo): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
  }
}
