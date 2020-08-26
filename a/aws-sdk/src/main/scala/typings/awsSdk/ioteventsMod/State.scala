package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  /**
    * When entering this state, perform these actions if the condition is TRUE.
    */
  var onEnter: js.UndefOr[OnEnterLifecycle] = js.native
  /**
    * When exiting this state, perform these actions if the specified condition is TRUE.
    */
  var onExit: js.UndefOr[OnExitLifecycle] = js.native
  /**
    * When an input is received and the condition is TRUE, perform the specified actions.
    */
  var onInput: js.UndefOr[OnInputLifecycle] = js.native
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
}

object State {
  @scala.inline
  def apply(stateName: StateName): State = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStateName(value: StateName): Self = this.set("stateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEnter(value: OnEnterLifecycle): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExit(value: OnExitLifecycle): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnInput(value: OnInputLifecycle): Self = this.set("onInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
  }
  
}

