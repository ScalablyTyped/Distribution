package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNotebookInstanceInput extends StObject {
  
  /**
    * The name of the notebook instance to start.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName
}
object StartNotebookInstanceInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StartNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartNotebookInstanceInput]
  }
  
  @scala.inline
  implicit class StartNotebookInstanceInputMutableBuilder[Self <: StartNotebookInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
