package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveKeyInitialState extends js.Object {
  var activeKey: js.UndefOr[scala.Nothing] = js.undefined
  var initialState: js.UndefOr[baseuiLib.tabsMod.State] = js.undefined
  var stateReducer: js.UndefOr[baseuiLib.tabsMod.StateReducer] = js.undefined
}

object Anon_ActiveKeyInitialState {
  @scala.inline
  def apply(
    activeKey: js.UndefOr[scala.Nothing] = js.undefined,
    initialState: baseuiLib.tabsMod.State = null,
    stateReducer: baseuiLib.tabsMod.StateReducer = null
  ): Anon_ActiveKeyInitialState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeKey)) __obj.updateDynamic("activeKey")(activeKey)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[Anon_ActiveKeyInitialState]
  }
}

