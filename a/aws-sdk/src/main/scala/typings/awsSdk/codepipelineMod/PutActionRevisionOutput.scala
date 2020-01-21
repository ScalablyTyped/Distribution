package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutActionRevisionOutput extends js.Object {
  /**
    * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the current workflow state of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object PutActionRevisionOutput {
  @scala.inline
  def apply(
    newRevision: js.UndefOr[scala.Boolean] = js.undefined,
    pipelineExecutionId: PipelineExecutionId = null
  ): PutActionRevisionOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newRevision)) __obj.updateDynamic("newRevision")(newRevision.asInstanceOf[js.Any])
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutActionRevisionOutput]
  }
}

