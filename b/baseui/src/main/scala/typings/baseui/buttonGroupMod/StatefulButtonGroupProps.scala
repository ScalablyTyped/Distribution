package typings.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulButtonGroupProps extends ButtonGroupProps {
  var initialState: js.UndefOr[InitialState] = js.native
  var stateReducer: js.UndefOr[
    js.Function3[
      /* stateType */ STATE_CHANGE_TYPE, 
      /* nextState */ State, 
      /* currentState */ State, 
      State
    ]
  ] = js.native
}

object StatefulButtonGroupProps {
  @scala.inline
  def apply(): StatefulButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulButtonGroupProps]
  }
  @scala.inline
  implicit class StatefulButtonGroupPropsOps[Self <: StatefulButtonGroupProps] (val x: Self) extends AnyVal {
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
    def setInitialState(value: InitialState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setStateReducer(
      value: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => State
    ): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

