package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPipelineExecutionOutput extends js.Object {
  /**
    * The unique system-generated ID of the pipeline execution that was stopped.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object StopPipelineExecutionOutput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): StopPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionOutput]
  }
}

