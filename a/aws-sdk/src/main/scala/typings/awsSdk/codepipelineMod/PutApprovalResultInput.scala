package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApprovalResultInput extends js.Object {
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
}

