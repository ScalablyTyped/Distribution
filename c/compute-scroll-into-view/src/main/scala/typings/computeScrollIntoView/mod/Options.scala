package typings.computeScrollIntoView.mod

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
    boundary: js.UndefOr[Null | CustomScrollBoundary] = js.undefined,
    `inline`: ScrollLogicalPosition = null,
    scrollMode: ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(boundary)) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOverflowHiddenElements)) __obj.updateDynamic("skipOverflowHiddenElements")(skipOverflowHiddenElements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

