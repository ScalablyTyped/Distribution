package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInitialState extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var initialState: js.UndefOr[baseuiLib.dndDashListMod.State] = js.undefined
}

object Anon_ChildrenInitialState {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, initialState: baseuiLib.dndDashListMod.State = null): Anon_ChildrenInitialState = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    __obj.asInstanceOf[Anon_ChildrenInitialState]
  }
}

