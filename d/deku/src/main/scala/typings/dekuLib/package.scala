package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dekuLib {
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  type Render = js.Function2[
    /* vnode */ dekuLib.dekuMod.dekuNs.VirtualElement, 
    /* context */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
   * Thunk object passed to `element`
   */
  type Thunk = js.Any | (js.Function1[/* model */ js.Any, dekuLib.dekuMod.dekuNs.VirtualElement])
}
