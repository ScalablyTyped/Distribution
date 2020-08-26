package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutActionRevisionOutput extends js.Object {
  /**
    * Indicates whether the artifact revision was previously used in an execution of the specified pipeline.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the current workflow state of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object PutActionRevisionOutput {
  @scala.inline
  def apply(): PutActionRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutActionRevisionOutput]
  }
  @scala.inline
  implicit class PutActionRevisionOutputOps[Self <: PutActionRevisionOutput] (val x: Self) extends AnyVal {
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
    def setNewRevision(value: Boolean): Self = this.set("newRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewRevision: Self = this.set("newRevision", js.undefined)
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
  }
  
}

