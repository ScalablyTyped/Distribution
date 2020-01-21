package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineExecutionOutput extends js.Object {
  /**
    * The unique system-generated ID of the pipeline execution that was started.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object StartPipelineExecutionOutput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): StartPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineExecutionOutput]
  }
}

