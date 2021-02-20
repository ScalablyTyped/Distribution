package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotebookExecutionOutput extends StObject {
  
  /**
    * Properties of the notebook execution.
    */
  var NotebookExecution: js.UndefOr[typings.awsSdk.emrMod.NotebookExecution] = js.native
}
object DescribeNotebookExecutionOutput {
  
  @scala.inline
  def apply(): DescribeNotebookExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookExecutionOutput]
  }
  
  @scala.inline
  implicit class DescribeNotebookExecutionOutputMutableBuilder[Self <: DescribeNotebookExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookExecution(value: NotebookExecution): Self = StObject.set(x, "NotebookExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookExecutionUndefined: Self = StObject.set(x, "NotebookExecution", js.undefined)
  }
}
