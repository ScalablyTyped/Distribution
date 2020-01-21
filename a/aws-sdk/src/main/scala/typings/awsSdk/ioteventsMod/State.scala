package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * When entering this state, perform these "actions" if the "condition" is TRUE.
    */
  var onEnter: js.UndefOr[OnEnterLifecycle] = js.native
  /**
    * When exiting this state, perform these "actions" if the specified "condition" is TRUE.
    */
  var onExit: js.UndefOr[OnExitLifecycle] = js.native
  /**
    * When an input is received and the "condition" is TRUE, perform the specified "actions".
    */
  var onInput: js.UndefOr[OnInputLifecycle] = js.native
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
}

object State {
  @scala.inline
  def apply(
    stateName: StateName,
    onEnter: OnEnterLifecycle = null,
    onExit: OnExitLifecycle = null,
    onInput: OnInputLifecycle = null
  ): State = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onInput != null) __obj.updateDynamic("onInput")(onInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

