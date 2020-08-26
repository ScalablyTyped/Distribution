package typings.baseui.paginationMod

import typings.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulPaginationProps extends Callbacks {
  var initialState: js.UndefOr[State] = js.native
  var labels: js.UndefOr[Labels] = js.native
  var numPages: Double = js.native
  var overrides: js.UndefOr[PaginationOverrides] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulPaginationProps {
  @scala.inline
  def apply(numPages: Double): StatefulPaginationProps = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulPaginationProps]
  }
  @scala.inline
  implicit class StatefulPaginationPropsOps[Self <: StatefulPaginationProps] (val x: Self) extends AnyVal {
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
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setLabels(value: Labels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setOverrides(value: PaginationOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

