package typings.baseui

import typings.baseui.dndListMod.State
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenInitialState extends js.Object {
  var children: ReactNode
  var initialState: js.UndefOr[State] = js.undefined
}

object AnonChildrenInitialState {
  @scala.inline
  def apply(children: ReactNode = null, initialState: State = null): AnonChildrenInitialState = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenInitialState]
  }
}

