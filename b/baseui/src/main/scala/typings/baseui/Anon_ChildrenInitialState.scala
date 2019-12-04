package typings.baseui

import typings.baseui.dndDashListMod.State
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitialState extends js.Object {
  var children: ReactNode
  var initialState: js.UndefOr[State] = js.undefined
}

object Anon_ChildrenInitialState {
  @scala.inline
  def apply(children: ReactNode = null, initialState: State = null): Anon_ChildrenInitialState = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInitialState]
  }
}

