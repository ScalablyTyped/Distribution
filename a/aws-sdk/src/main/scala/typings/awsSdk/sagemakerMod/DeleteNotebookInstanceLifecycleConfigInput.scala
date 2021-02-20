package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNotebookInstanceLifecycleConfigInput extends StObject {
  
  /**
    * The name of the lifecycle configuration to delete.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
}
object DeleteNotebookInstanceLifecycleConfigInput {
  
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DeleteNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotebookInstanceLifecycleConfigInput]
  }
  
  @scala.inline
  implicit class DeleteNotebookInstanceLifecycleConfigInputMutableBuilder[Self <: DeleteNotebookInstanceLifecycleConfigInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
  }
}
