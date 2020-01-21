package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineExecutionOutput extends js.Object {
  /**
    * Represents information about the execution of a pipeline.
    */
  var pipelineExecution: js.UndefOr[PipelineExecution] = js.native
}

object GetPipelineExecutionOutput {
  @scala.inline
  def apply(pipelineExecution: PipelineExecution = null): GetPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecution != null) __obj.updateDynamic("pipelineExecution")(pipelineExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineExecutionOutput]
  }
}

