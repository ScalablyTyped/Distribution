package typings.deepDashDiff.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", "orderIndependentDeepDiff")
@js.native
object orderIndependentDeepDiff extends js.Object {
  def apply[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[Diff[LHS, RHS]],
    prefilter: PreFilter[LHS, RHS],
    path: js.Array[_],
    key: js.Any,
    stack: js.Array[_]
  ): Unit = js.native
}

