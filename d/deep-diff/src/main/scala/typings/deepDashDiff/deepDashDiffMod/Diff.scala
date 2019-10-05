package typings.deepDashDiff.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.deepDashDiff.deepDashDiffMod.DiffNew[RHS]
  - typings.deepDashDiff.deepDashDiffMod.DiffDeleted[LHS]
  - typings.deepDashDiff.deepDashDiffMod.DiffEdit[LHS, RHS]
  - typings.deepDashDiff.deepDashDiffMod.DiffArray[LHS, RHS]
*/
trait Diff[LHS, RHS] extends js.Object

@JSImport("deep-diff", "diff")
@js.native
object diff extends js.Object {
  def apply[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
}

