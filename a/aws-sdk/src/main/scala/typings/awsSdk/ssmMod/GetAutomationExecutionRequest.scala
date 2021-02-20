package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAutomationExecutionRequest extends StObject {
  
  /**
    * The unique identifier for an existing automation execution to examine. The execution ID is returned by StartAutomationExecution when the execution of an Automation document is initiated.
    */
  var AutomationExecutionId: typings.awsSdk.ssmMod.AutomationExecutionId = js.native
}
object GetAutomationExecutionRequest {
  
  @scala.inline
  def apply(AutomationExecutionId: AutomationExecutionId): GetAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutomationExecutionRequest]
  }
  
  @scala.inline
  implicit class GetAutomationExecutionRequestMutableBuilder[Self <: GetAutomationExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
  }
}
