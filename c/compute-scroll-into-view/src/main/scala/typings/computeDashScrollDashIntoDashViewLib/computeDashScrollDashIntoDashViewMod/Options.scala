package typings
package computeDashScrollDashIntoDashViewLib.computeDashScrollDashIntoDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var block: js.UndefOr[computeDashScrollDashIntoDashViewLib.ScrollLogicalPosition] = js.undefined
  var boundary: js.UndefOr[computeDashScrollDashIntoDashViewLib.CustomScrollBoundary] = js.undefined
  var `inline`: js.UndefOr[computeDashScrollDashIntoDashViewLib.ScrollLogicalPosition] = js.undefined
  var scrollMode: js.UndefOr[computeDashScrollDashIntoDashViewLib.ScrollMode] = js.undefined
  var skipOverflowHiddenElements: js.UndefOr[computeDashScrollDashIntoDashViewLib.SkipOverflowHiddenElements] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    block: computeDashScrollDashIntoDashViewLib.ScrollLogicalPosition = null,
    boundary: computeDashScrollDashIntoDashViewLib.CustomScrollBoundary = null,
    `inline`: computeDashScrollDashIntoDashViewLib.ScrollLogicalPosition = null,
    scrollMode: computeDashScrollDashIntoDashViewLib.ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[computeDashScrollDashIntoDashViewLib.SkipOverflowHiddenElements] = js.undefined
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

