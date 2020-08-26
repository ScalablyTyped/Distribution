package typings.baseui.dndListMod

import typings.baseui.anon.NewIndex
import typings.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulListProps extends js.Object {
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[js.Function1[/* params */ NewIndex, _]] = js.native
  var overrides: js.UndefOr[ListOverrides] = js.native
  var removable: js.UndefOr[Boolean] = js.native
  var removableByMove: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulListProps {
  @scala.inline
  def apply(): StatefulListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulListProps]
  }
  @scala.inline
  implicit class StatefulListPropsOps[Self <: StatefulListProps] (val x: Self) extends AnyVal {
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
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: /* params */ NewIndex => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverrides(value: ListOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRemovable(value: Boolean): Self = this.set("removable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovable: Self = this.set("removable", js.undefined)
    @scala.inline
    def setRemovableByMove(value: Boolean): Self = this.set("removableByMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovableByMove: Self = this.set("removableByMove", js.undefined)
    @scala.inline
    def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

