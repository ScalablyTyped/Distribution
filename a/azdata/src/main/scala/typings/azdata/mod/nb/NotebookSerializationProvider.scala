package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookSerializationProvider extends StObject {
  
  def getSerializationManager(notebookUri: Uri): Thenable[SerializationManager]
  
  val providerId: String
}
object NotebookSerializationProvider {
  
  inline def apply(getSerializationManager: Uri => Thenable[SerializationManager], providerId: String): NotebookSerializationProvider = {
    val __obj = js.Dynamic.literal(getSerializationManager = js.Any.fromFunction1(getSerializationManager), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookSerializationProvider]
  }
  
  extension [Self <: NotebookSerializationProvider](x: Self) {
    
    inline def setGetSerializationManager(value: Uri => Thenable[SerializationManager]): Self = StObject.set(x, "getSerializationManager", js.Any.fromFunction1(value))
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
