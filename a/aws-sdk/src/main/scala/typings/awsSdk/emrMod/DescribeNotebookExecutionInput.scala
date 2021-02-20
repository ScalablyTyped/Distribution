package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: XmlStringMaxLen256 = js.native
}
object DescribeNotebookExecutionInput {
  
  @scala.inline
  def apply(NotebookExecutionId: XmlStringMaxLen256): DescribeNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(NotebookExecutionId = NotebookExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookExecutionInput]
  }
  
  @scala.inline
  implicit class DescribeNotebookExecutionInputMutableBuilder[Self <: DescribeNotebookExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
  }
}
