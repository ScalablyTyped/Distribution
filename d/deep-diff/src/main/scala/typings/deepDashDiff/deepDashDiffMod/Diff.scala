package typings.deepDashDiff.deepDashDiffMod

import typings.deepDashDiff.deepDashDiffStrings.A
import typings.deepDashDiff.deepDashDiffStrings.D
import typings.deepDashDiff.deepDashDiffStrings.E
import typings.deepDashDiff.deepDashDiffStrings.N
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

object Diff {
  @scala.inline
  def DiffNew[LHS, RHS](kind: N, rhs: RHS, path: js.Array[_] = null): Diff[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff[LHS, RHS]]
  }
  @scala.inline
  def DiffDeleted[LHS, RHS](kind: D, lhs: LHS, path: js.Array[_] = null): Diff[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff[LHS, RHS]]
  }
  @scala.inline
  def DiffEdit[LHS, RHS](kind: E, lhs: LHS, rhs: RHS, path: js.Array[_] = null): Diff[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff[LHS, RHS]]
  }
  @scala.inline
  def DiffArray[LHS, RHS](index: Double, item: Diff[LHS, RHS], kind: A, path: js.Array[_] = null): Diff[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff[LHS, RHS]]
  }
}

@JSImport("deep-diff", "diff")
@js.native
object diff extends js.Object {
  def apply[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
}

