package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineExecutionInput extends js.Object {
  /**
    * The ID of the pipeline execution about which you want to get execution details.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  /**
    * The name of the pipeline about which you want to get execution details.
    */
  var pipelineName: PipelineName = js.native
}

object GetPipelineExecutionInput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): GetPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineExecutionInput]
  }
}

