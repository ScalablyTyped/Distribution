package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPipelineExecutionInput extends js.Object {
  /**
    * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.  This option can lead to failed or out-of-sequence tasks. 
    */
  var abandon: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the pipeline execution to be stopped in the current stage. Use the GetPipelineState action to retrieve the current pipelineExecutionId.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  /**
    * The name of the pipeline to stop.
    */
  var pipelineName: PipelineName = js.native
  /**
    * Use this option to enter comments, such as the reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}

object StopPipelineExecutionInput {
  @scala.inline
  def apply(
    pipelineExecutionId: PipelineExecutionId,
    pipelineName: PipelineName,
    abandon: js.UndefOr[scala.Boolean] = js.undefined,
    reason: StopPipelineExecutionReason = null
  ): StopPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    if (!js.isUndefined(abandon)) __obj.updateDynamic("abandon")(abandon.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionInput]
  }
}

