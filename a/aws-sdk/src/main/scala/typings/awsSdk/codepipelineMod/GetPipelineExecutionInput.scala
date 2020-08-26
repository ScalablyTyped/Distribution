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
  @scala.inline
  implicit class GetPipelineExecutionInputOps[Self <: GetPipelineExecutionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
  }
  
}

