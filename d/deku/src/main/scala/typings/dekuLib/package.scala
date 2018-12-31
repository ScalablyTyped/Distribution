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
  type Thunk = (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Component */ js.Any) | (js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Model */ /* model */ js.Any, 
    dekuLib.dekuMod.dekuNs.VirtualElement
  ])
}
