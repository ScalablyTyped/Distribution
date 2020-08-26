package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPipelineExecutionInput extends js.Object {
  /**
    * Use this option to stop the pipeline execution by abandoning, rather than finishing, in-progress actions.  This option can lead to failed or out-of-sequence tasks. 
    */
  var abandon: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the pipeline execution to be stopped in the current stage. Use the GetPipelineState action to retrieve the current pipelineExecutionId.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  /**
    * The name of the pipeline to stop.
    */
  var pipelineName: PipelineName = js.native
  /**
    * Use this option to enter comments, such as the reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}

object StopPipelineExecutionInput {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, pipelineName: PipelineName): StopPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineExecutionInput]
  }
  @scala.inline
  implicit class StopPipelineExecutionInputOps[Self <: StopPipelineExecutionInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setAbandon(value: Boolean): Self = this.set("abandon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbandon: Self = this.set("abandon", js.undefined)
    @scala.inline
    def setReason(value: StopPipelineExecutionReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

