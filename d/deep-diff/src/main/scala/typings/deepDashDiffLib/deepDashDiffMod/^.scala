package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyChange[LHS](target: LHS, source: js.Any, change: deepDashDiffLib.deepDashDiffMod.Diff[LHS, _]): scala.Unit = js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS): scala.Unit = js.native
  def applyDiff[LHS, RHS](target: LHS, source: RHS, filter: deepDashDiffLib.deepDashDiffMod.Filter[LHS, RHS]): scala.Unit = js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]]] = js.native
  def diff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS]): js.UndefOr[js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]]] = js.native
  def diff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS],
    acc: deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS]
  ): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  @JSName("diff")
  def diff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  @JSName("diff")
  def diff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS]): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](lhs: LHS, rhs: RHS, observer: deepDashDiffLib.deepDashDiffMod.Observer[LHS, RHS]): js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: deepDashDiffLib.deepDashDiffMod.Observer[LHS, RHS],
    prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS]
  ): js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]] = js.native
  def observableDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    observer: deepDashDiffLib.deepDashDiffMod.Observer[LHS, RHS],
    prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS],
    orderIndependent: scala.Boolean
  ): js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]] = js.native
  def orderIndepHash(`object`: js.Any): scala.Double = js.native
  def orderIndependentDeepDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    changes: js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]],
    prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS],
    path: js.Array[_],
    key: js.Any,
    stack: js.Array[_]
  ): scala.Unit = js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]]] = js.native
  def orderIndependentDiff[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS]): js.UndefOr[js.Array[deepDashDiffLib.deepDashDiffMod.Diff[LHS, RHS]]] = js.native
  def orderIndependentDiff[LHS, RHS](
    lhs: LHS,
    rhs: RHS,
    prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS],
    acc: deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS]
  ): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  @JSName("orderIndependentDiff")
  def orderIndependentDiff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  @JSName("orderIndependentDiff")
  def orderIndependentDiff_LHSRHSAccumulator[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: deepDashDiffLib.deepDashDiffMod.PreFilter[LHS, RHS]): deepDashDiffLib.deepDashDiffMod.Accumulator[LHS, RHS] = js.native
  def revertChange[LHS](target: LHS, source: js.Any, change: deepDashDiffLib.deepDashDiffMod.Diff[LHS, _]): scala.Unit = js.native
}

