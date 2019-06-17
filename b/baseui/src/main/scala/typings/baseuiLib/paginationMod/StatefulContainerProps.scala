package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var initialState: js.UndefOr[State] = js.undefined
  var numPages: scala.Double
  var onPageChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_NextPage, _]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    numPages: scala.Double,
    initialState: State = null,
    onPageChange: /* args */ baseuiLib.Anon_NextPage => _ = null,
    stateReducer: StateReducer = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numPages = numPages)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

