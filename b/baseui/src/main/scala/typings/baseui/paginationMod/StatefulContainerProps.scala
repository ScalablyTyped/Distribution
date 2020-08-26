package typings.baseui.paginationMod

import typings.baseui.anon.NextPage
import typings.baseui.baseuiStrings.change_
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulContainerProps extends js.Object {
  var children: ReactNode = js.native
  var initialState: js.UndefOr[State] = js.native
  var numPages: Double = js.native
  var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulContainerProps {
  @scala.inline
  def apply(numPages: Double): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
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
    def setNumPages(value: Double): Self = this.set("numPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnPageChange(value: /* args */ NextPage => _): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    @scala.inline
    def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

