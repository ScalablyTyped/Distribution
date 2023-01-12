package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookExecuteProvider extends StObject {
  
  def getExecuteManager(notebookUri: Uri): Thenable[ExecuteManager]
  
  def handleNotebookClosed(notebookUri: Uri): Unit
  
  val providerId: String
}
object NotebookExecuteProvider {
  
  inline def apply(
    getExecuteManager: Uri => Thenable[ExecuteManager],
    handleNotebookClosed: Uri => Unit,
    providerId: String
  ): NotebookExecuteProvider = {
    val __obj = js.Dynamic.literal(getExecuteManager = js.Any.fromFunction1(getExecuteManager), handleNotebookClosed = js.Any.fromFunction1(handleNotebookClosed), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookExecuteProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookExecuteProvider] (val x: Self) extends AnyVal {
    
    inline def setGetExecuteManager(value: Uri => Thenable[ExecuteManager]): Self = StObject.set(x, "getExecuteManager", js.Any.fromFunction1(value))
    
    inline def setHandleNotebookClosed(value: Uri => Unit): Self = StObject.set(x, "handleNotebookClosed", js.Any.fromFunction1(value))
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
