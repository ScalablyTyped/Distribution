package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineStateOutput extends js.Object {
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the pipeline for which you want to get the state.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * The version number of the pipeline.  A newly created pipeline is always assigned a version number of 1. 
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  /**
    * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
    */
  var stageStates: js.UndefOr[StageStateList] = js.native
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.native
}

object GetPipelineStateOutput {
  @scala.inline
  def apply(
    created: Timestamp = null,
    pipelineName: PipelineName = null,
    pipelineVersion: Int | Double = null,
    stageStates: StageStateList = null,
    updated: Timestamp = null
  ): GetPipelineStateOutput = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName.asInstanceOf[js.Any])
    if (pipelineVersion != null) __obj.updateDynamic("pipelineVersion")(pipelineVersion.asInstanceOf[js.Any])
    if (stageStates != null) __obj.updateDynamic("stageStates")(stageStates.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineStateOutput]
  }
}

