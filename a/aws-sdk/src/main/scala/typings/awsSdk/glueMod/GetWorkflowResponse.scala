package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowResponse extends StObject {
  
  /**
    * The resource metadata for the workflow.
    */
  var Workflow: js.UndefOr[typings.awsSdk.glueMod.Workflow] = js.native
}
object GetWorkflowResponse {
  
  @scala.inline
  def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  
  @scala.inline
  implicit class GetWorkflowResponseMutableBuilder[Self <: GetWorkflowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkflow(value: Workflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowUndefined: Self = StObject.set(x, "Workflow", js.undefined)
  }
}
