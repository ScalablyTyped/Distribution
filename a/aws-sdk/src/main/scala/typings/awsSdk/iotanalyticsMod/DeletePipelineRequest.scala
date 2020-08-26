package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineRequest extends js.Object {
  /**
    * The name of the pipeline to delete.
    */
  var pipelineName: PipelineName = js.native
}

object DeletePipelineRequest {
  @scala.inline
  def apply(pipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  @scala.inline
  implicit class DeletePipelineRequestOps[Self <: DeletePipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
  }
  
}

