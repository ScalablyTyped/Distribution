package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentManager extends StObject {
  
  /* Reads contents from a Uri representing a local or remote notebook and returns a
    * JSON object containing the cells and metadata about the notebook
    */
  def deserializeNotebook(contents: String): Thenable[INotebookContents]
  
  /**
    * Save a file.
    *
    * @param notebookUri - The desired file path.
    *
    * @param notebook - notebook to be saved.
    *
    * @returns A thenable which resolves with the file content model when the
    *   file is saved.
    */
  def serializeNotebook(notebook: INotebookContents): Thenable[String]
}
object ContentManager {
  
  inline def apply(
    deserializeNotebook: String => Thenable[INotebookContents],
    serializeNotebook: INotebookContents => Thenable[String]
  ): ContentManager = {
    val __obj = js.Dynamic.literal(deserializeNotebook = js.Any.fromFunction1(deserializeNotebook), serializeNotebook = js.Any.fromFunction1(serializeNotebook))
    __obj.asInstanceOf[ContentManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentManager] (val x: Self) extends AnyVal {
    
    inline def setDeserializeNotebook(value: String => Thenable[INotebookContents]): Self = StObject.set(x, "deserializeNotebook", js.Any.fromFunction1(value))
    
    inline def setSerializeNotebook(value: INotebookContents => Thenable[String]): Self = StObject.set(x, "serializeNotebook", js.Any.fromFunction1(value))
  }
}
