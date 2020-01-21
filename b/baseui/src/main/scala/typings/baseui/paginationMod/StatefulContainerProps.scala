package typings.baseui.paginationMod

import typings.baseui.AnonNextPage
import typings.baseui.baseuiStrings.change_
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: ReactNode
  var initialState: js.UndefOr[State] = js.undefined
  var numPages: Double
  var onPageChange: js.UndefOr[js.Function1[/* args */ AnonNextPage, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    numPages: Double,
    children: ReactNode = null,
    initialState: State = null,
    onPageChange: /* args */ AnonNextPage => _ = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => State = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

