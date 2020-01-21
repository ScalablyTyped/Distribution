package typings.deku

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Dispatch = js.Function1[/* action */ js.Any, js.Any]
  type Render = js.Function2[
    /* vnode */ typings.deku.mod.VirtualElement, 
    /* context */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * Thunk object passed to `element`
    */
  type Thunk = typings.deku.mod.Component | (js.Function1[/* model */ typings.deku.mod.Model, typings.deku.mod.VirtualElement])
}
