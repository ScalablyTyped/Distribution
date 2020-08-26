package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineOutput extends js.Object {
  /**
    * The ID that AWS Data Pipeline assigns the newly created pipeline. For example, df-06372391ZG65EXAMPLE.
    */
  var pipelineId: id = js.native
}

object CreatePipelineOutput {
  @scala.inline
  def apply(pipelineId: id): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineOutput]
  }
  @scala.inline
  implicit class CreatePipelineOutputOps[Self <: CreatePipelineOutput] (val x: Self) extends AnyVal {
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

