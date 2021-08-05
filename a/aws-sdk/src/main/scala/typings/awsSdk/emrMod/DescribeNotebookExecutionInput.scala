package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotebookExecutionInput extends StObject {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: XmlStringMaxLen256
}
object DescribeNotebookExecutionInput {
  
  inline def apply(NotebookExecutionId: XmlStringMaxLen256): DescribeNotebookExecutionInput = {
    val __obj = js.Dynamic.literal(NotebookExecutionId = NotebookExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookExecutionInput]
  }
  
  extension [Self <: DescribeNotebookExecutionInput](x: Self) {
    
    inline def setNotebookExecutionId(value: XmlStringMaxLen256): Self = StObject.set(x, "NotebookExecutionId", value.asInstanceOf[js.Any])
  }
}
