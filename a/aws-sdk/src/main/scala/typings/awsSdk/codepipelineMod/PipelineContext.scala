package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineContext extends js.Object {
  /**
    * The context of an action to a job worker in the stage of a pipeline.
    */
  var action: js.UndefOr[ActionContext] = js.native
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  /**
    * The execution ID of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  /**
    * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names under an Amazon Web Services account.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The stage of the pipeline.
    */
  var stage: js.UndefOr[StageContext] = js.native
}

object PipelineContext {
  @scala.inline
  def apply(): PipelineContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContext]
  }
  @scala.inline
  implicit class PipelineContextOps[Self <: PipelineContext] (val x: Self) extends AnyVal {
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
    def setAction(value: ActionContext): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setPipelineArn(value: PipelineArn): Self = this.set("pipelineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineArn: Self = this.set("pipelineArn", js.undefined)
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineName: Self = this.set("pipelineName", js.undefined)
    @scala.inline
    def setStage(value: StageContext): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
  
}

