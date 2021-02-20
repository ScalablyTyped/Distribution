package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutApprovalResultInput extends StObject {
  
  /**
    * The name of the action for which approval is requested.
    */
  var actionName: ActionName = js.native
  
  /**
    * The name of the pipeline that contains the action. 
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * Represents information about the result of the approval request.
    */
  var result: ApprovalResult = js.native
  
  /**
    * The name of the stage that contains the action.
    */
  var stageName: StageName = js.native
  
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState action. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: ApprovalToken = js.native
}
object PutApprovalResultInput {
  
  @scala.inline
  def apply(
    actionName: ActionName,
    pipelineName: PipelineName,
    result: ApprovalResult,
    stageName: StageName,
    token: ApprovalToken
  ): PutApprovalResultInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApprovalResultInput]
  }
  
  @scala.inline
  implicit class PutApprovalResultInputMutableBuilder[Self <: PutApprovalResultInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: ApprovalResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: ApprovalToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
