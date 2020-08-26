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
  def apply(): StopPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPipelineExecutionOutput]
  }
  @scala.inline
  implicit class StopPipelineExecutionOutputOps[Self <: StopPipelineExecutionOutput] (val x: Self) extends AnyVal {
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
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
  }
  
}

