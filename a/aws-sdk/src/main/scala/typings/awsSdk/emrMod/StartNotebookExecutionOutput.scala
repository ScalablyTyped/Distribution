package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartNotebookExecutionOutput extends StObject {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: js.UndefOr[XmlStringMaxLen256] = js.native
}
object StartNotebookExecutionOutput {
  
  @scala.inline
  def apply(): StartNotebookExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNotebookExecutionOutput]
  }
  
  @scala.inline
  implicit class StartNotebookExecutionOutputMutableBuilder[Self <: StartNotebookExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookExecutionIdUndefined: Self = StObject.set(x, "NotebookExecutionId", js.undefined)
  }
}
