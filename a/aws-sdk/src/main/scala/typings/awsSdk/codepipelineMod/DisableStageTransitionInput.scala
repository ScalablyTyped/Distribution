package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableStageTransitionInput extends js.Object {
  /**
    * The name of the pipeline in which you want to disable the flow of artifacts from one stage to another.
    */
  var pipelineName: PipelineName = js.native
  /**
    * The reason given to the user that a stage is disabled, such as waiting for manual approval or manual tests. This message is displayed in the pipeline console UI.
    */
  var reason: DisabledReason = js.native
  /**
    * The name of the stage where you want to disable the inbound or outbound transition of artifacts.
    */
  var stageName: StageName = js.native
  /**
    * Specifies whether artifacts are prevented from transitioning into the stage and being processed by the actions in that stage (inbound), or prevented from transitioning from the stage after they have been processed by the actions in that stage (outbound).
    */
  var transitionType: StageTransitionType = js.native
}

object DisableStageTransitionInput {
  @scala.inline
  def apply(
    pipelineName: PipelineName,
    reason: DisabledReason,
    stageName: StageName,
    transitionType: StageTransitionType
  ): DisableStageTransitionInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableStageTransitionInput]
  }
  @scala.inline
  implicit class DisableStageTransitionInputOps[Self <: DisableStageTransitionInput] (val x: Self) extends AnyVal {
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
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: DisabledReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageName(value: StageName): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionType(value: StageTransitionType): Self = this.set("transitionType", value.asInstanceOf[js.Any])
  }
  
}

