package typings.deku

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dekuMod {
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  type Render = js.Function2[/* vnode */ VirtualElement, /* context */ js.UndefOr[js.Any], Unit]
  /**
    * Thunk object passed to `element`
    */
  type Thunk = Component | (js.Function1[/* model */ Model, VirtualElement])
}
