package typings.computeDashScrollDashIntoDashView.computeDashScrollDashIntoDashViewMod

import typings.computeDashScrollDashIntoDashView.SkipOverflowHiddenElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var block: js.UndefOr[ScrollLogicalPosition] = js.undefined
  var boundary: js.UndefOr[CustomScrollBoundary] = js.undefined
  var `inline`: js.UndefOr[ScrollLogicalPosition] = js.undefined
  var scrollMode: js.UndefOr[ScrollMode] = js.undefined
  var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    block: ScrollLogicalPosition = null,
    boundary: CustomScrollBoundary = null,
    `inline`: ScrollLogicalPosition = null,
    scrollMode: ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (block != null) __obj.updateDynamic("block")(block)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode)
    if (!js.isUndefined(skipOverflowHiddenElements)) __obj.updateDynamic("skipOverflowHiddenElements")(skipOverflowHiddenElements)
    __obj.asInstanceOf[Options]
  }
}

