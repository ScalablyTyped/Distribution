package typings
package babelDashTraverseLib.babelDashTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraverseOptions[S] extends Visitor[S] {
  var noScope: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

object TraverseOptions {
  @scala.inline
  def apply[S](Visitor: Visitor[S] = null, noScope: js.UndefOr[scala.Boolean] = js.undefined, scope: Scope = null): TraverseOptions[S] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Visitor)
    if (!js.isUndefined(noScope)) __obj.updateDynamic("noScope")(noScope)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[TraverseOptions[S]]
  }
}

