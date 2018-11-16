package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", JSImport.Namespace)
@js.native
object deepDashDiffModMembers extends js.Object {
  def applyChange[LHS](target: LHS, source: js.Any, change: Diff[LHS, _]): scala.Unit = js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS): scala.Unit = js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS, filter: Filter[LHS, RHS]): scala.Unit = js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff[LHS, RHS]]] = js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff[LHS, RHS]]] = js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSName("diff")
  def diff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  @JSName("diff")
  def diff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS]): js.Array[Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: Observer[LHS, RHS], prefilter: PreFilter[LHS, RHS]): js.Array[Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: Observer[LHS, RHS],
    prefilter: PreFilter[LHS, RHS],
    orderIndependent: scala.Boolean
  ): js.Array[Diff[LHS, RHS]] = js.native
  def orderIndepHash(`object`: js.Any): scala.Double = js.native
  def orderIndependentDeepDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[Diff[LHS, RHS]],
    prefilter: PreFilter[LHS, RHS],
    path: js.Array[_],
    key: js.Any,
    stack: js.Array[_]
  ): scala.Unit = js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff[LHS, RHS]]] = js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff[LHS, RHS]]] = js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  @JSName("orderIndependentDiff")
  def orderIndependentDiff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS): Accumulator[LHS, RHS] = js.native
  @JSName("orderIndependentDiff")
  def orderIndependentDiff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): Accumulator[LHS, RHS] = js.native
  def revertChange[LHS](target: LHS, source: js.Any, change: Diff[LHS, _]): scala.Unit = js.native
}

