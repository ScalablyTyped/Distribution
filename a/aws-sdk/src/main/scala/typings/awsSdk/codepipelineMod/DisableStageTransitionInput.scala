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
}

