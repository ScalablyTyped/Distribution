package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunResponse extends StObject {
  
  /**
    * The requested workflow run metadata.
    */
  var Run: js.UndefOr[WorkflowRun] = js.native
}
object GetWorkflowRunResponse {
  
  @scala.inline
  def apply(): GetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunResponse]
  }
  
  @scala.inline
  implicit class GetWorkflowRunResponseMutableBuilder[Self <: GetWorkflowRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: WorkflowRun): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "Run", js.undefined)
  }
}
