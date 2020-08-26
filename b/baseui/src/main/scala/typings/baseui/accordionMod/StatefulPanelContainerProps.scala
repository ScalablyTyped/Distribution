package typings.baseui.accordionMod

import typings.baseui.anon.ExpandedBoolean
import typings.baseui.baseuiStrings.expand
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/accordion.SharedStatefulPanelContainerProps & {  children :react.react.ReactNode} */
@js.native
trait StatefulPanelContainerProps extends js.Object {
  var children: ReactNode = js.native
  var initialState: js.UndefOr[PanelState] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.native
}

object StatefulPanelContainerProps {
  @scala.inline
  def apply(): StatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPanelContainerProps]
  }
  @scala.inline
  implicit class StatefulPanelContainerPropsOps[Self <: StatefulPanelContainerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInitialState(value: PanelState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ ExpandedBoolean => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

