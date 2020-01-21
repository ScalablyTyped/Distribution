package typings.baseui.paginationMod

import typings.baseui.AnonEventAny
import typings.baseui.AnonNextPage
import typings.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPaginationProps extends Callbacks {
  var initialState: js.UndefOr[State] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPaginationProps {
  @scala.inline
  def apply(
    numPages: Double,
    initialState: State = null,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => _ = null,
    onPageChange: /* args */ AnonNextPage => _ = null,
    onPrevClick: /* args */ AnonEventAny => _ = null,
    overrides: PaginationOverrides = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => State = null
  ): StatefulPaginationProps = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulPaginationProps]
  }
}

