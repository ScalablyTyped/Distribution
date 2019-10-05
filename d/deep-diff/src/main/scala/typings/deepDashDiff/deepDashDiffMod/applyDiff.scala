package typings.deepDashDiff.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", "applyDiff")
@js.native
object applyDiff extends js.Object {
  def apply[LHS, RHS](target: LHS, source: RHS): Unit = js.native
  def apply[LHS, RHS](target: LHS, source: RHS, filter: Filter[LHS, RHS]): Unit = js.native
}

