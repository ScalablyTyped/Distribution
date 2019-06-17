package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPaginationProps extends Callbacks {
  var initialState: js.UndefOr[State] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: scala.Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPaginationProps {
  @scala.inline
  def apply(
    numPages: scala.Double,
    initialState: State = null,
    labels: Labels = null,
    onNextClick: /* args */ baseuiLib.Anon_EventAny => _ = null,
    onPageChange: /* args */ baseuiLib.Anon_NextPage => _ = null,
    onPrevClick: /* args */ baseuiLib.Anon_EventAny => _ = null,
    overrides: PaginationOverrides = null,
    stateReducer: StateReducer = null
  ): StatefulPaginationProps = {
    val __obj = js.Dynamic.literal(numPages = numPages)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulPaginationProps]
  }
}

