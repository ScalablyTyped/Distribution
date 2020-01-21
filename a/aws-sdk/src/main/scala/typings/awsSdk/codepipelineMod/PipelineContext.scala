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
  def apply(
    action: ActionContext = null,
    pipelineArn: PipelineArn = null,
    pipelineExecutionId: PipelineExecutionId = null,
    pipelineName: PipelineName = null,
    stage: StageContext = null
  ): PipelineContext = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (pipelineArn != null) __obj.updateDynamic("pipelineArn")(pipelineArn.asInstanceOf[js.Any])
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineContext]
  }
}

