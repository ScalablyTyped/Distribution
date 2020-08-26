package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", "observableDiff")
@js.native
object observableDiff extends js.Object {
  def apply[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[Diff_[LHS, RHS]] = js.native
  def apply[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: js.UndefOr[scala.Nothing],
    prefilter: js.UndefOr[PreFilter[LHS, RHS]],
    orderIndependent: Boolean
  ): js.Array[Diff_[LHS, RHS]] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, observer: js.UndefOr[scala.Nothing], prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
  def apply[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: Observer[LHS, RHS],
    prefilter: js.UndefOr[PreFilter[LHS, RHS]],
    orderIndependent: Boolean
  ): js.Array[Diff_[LHS, RHS]] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS], prefilter: PreFilter[LHS, RHS]): js.Array[Diff_[LHS, RHS]] = js.native
}

