package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageState extends js.Object {
  /**
    * The state of the stage.
    */
  var actionStates: js.UndefOr[ActionStateList] = js.native
  /**
    * The state of the inbound transition, which is either enabled or disabled.
    */
  var inboundTransitionState: js.UndefOr[TransitionState] = js.native
  /**
    * Information about the latest execution in the stage, including its ID and status.
    */
  var latestExecution: js.UndefOr[StageExecution] = js.native
  /**
    * The name of the stage.
    */
  var stageName: js.UndefOr[StageName] = js.native
}

object StageState {
  @scala.inline
  def apply(
    actionStates: ActionStateList = null,
    inboundTransitionState: TransitionState = null,
    latestExecution: StageExecution = null,
    stageName: StageName = null
  ): StageState = {
    val __obj = js.Dynamic.literal()
    if (actionStates != null) __obj.updateDynamic("actionStates")(actionStates.asInstanceOf[js.Any])
    if (inboundTransitionState != null) __obj.updateDynamic("inboundTransitionState")(inboundTransitionState.asInstanceOf[js.Any])
    if (latestExecution != null) __obj.updateDynamic("latestExecution")(latestExecution.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageState]
  }
}

