package typings.baseui.radioMod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.native
  var stateReducer: StateReducer = js.native
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ SyntheticEvent[HTMLInputElement, Event]) => State
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
  @scala.inline
  implicit class StatefulContainerPropsOps[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
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
    def setStateReducer(
      value: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ SyntheticEvent[HTMLInputElement, Event]) => State
    ): Self = this.set("stateReducer", js.Any.fromFunction4(value))
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverrides(value: RadioOverrides with RadioGroupOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

