package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, reactLib.reactMod.ReactNode]] = js.undefined
  var initialState: js.UndefOr[ContainerState] = js.undefined
  var onChange: js.UndefOr[onChange] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply[T](
    children: /* args */ T => reactLib.reactMod.ReactNode = null,
    initialState: ContainerState = null,
    onChange: onChange = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    stateReducer: StateReducer = null
  ): StatefulContainerProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulContainerProps[T]]
  }
}

