package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotebookInstanceLifecycleConfigOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
}
object CreateNotebookInstanceLifecycleConfigOutput {
  
  @scala.inline
  def apply(): CreateNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigOutput]
  }
  
  @scala.inline
  implicit class CreateNotebookInstanceLifecycleConfigOutputMutableBuilder[Self <: CreateNotebookInstanceLifecycleConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigArnUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", js.undefined)
  }
}
