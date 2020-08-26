package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}

object DeletePipelineInput {
  @scala.inline
  def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
  @scala.inline
  implicit class DeletePipelineInputOps[Self <: DeletePipelineInput] (val x: Self) extends AnyVal {
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
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
  }
  
}

