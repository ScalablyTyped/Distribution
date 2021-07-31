package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopNotebookInstanceInput extends StObject {
  
  /**
    * The name of the notebook instance to terminate.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName
}
object StopNotebookInstanceInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): StopNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopNotebookInstanceInput]
  }
  
  @scala.inline
  implicit class StopNotebookInstanceInputMutableBuilder[Self <: StopNotebookInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
