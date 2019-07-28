package typings.chromeDashApps.chromeNs.appNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundsSpecification extends js.Object {
  /** The height of the content or window. */
  var height: js.UndefOr[integer] = js.undefined
  /** The X coordinate of the content or window. */
  var left: js.UndefOr[integer] = js.undefined
  /** The maximum height of the content or window. */
  var maxHeight: js.UndefOr[integer] = js.undefined
  /** The maximum width of the content or window. */
  var maxWidth: js.UndefOr[integer] = js.undefined
  /** The minimum height of the content or window. */
  var minHeight: js.UndefOr[integer] = js.undefined
  /** The minimum width of the content or window. */
  var minWidth: js.UndefOr[integer] = js.undefined
  /** The Y coordinate of the content or window. */
  var top: js.UndefOr[integer] = js.undefined
  /** The width of the content or window. */
  var width: js.UndefOr[integer] = js.undefined
}

object BoundsSpecification {
  @scala.inline
  def apply(
    height: js.UndefOr[integer] = js.undefined,
    left: js.UndefOr[integer] = js.undefined,
    maxHeight: js.UndefOr[integer] = js.undefined,
    maxWidth: js.UndefOr[integer] = js.undefined,
    minHeight: js.UndefOr[integer] = js.undefined,
    minWidth: js.UndefOr[integer] = js.undefined,
    top: js.UndefOr[integer] = js.undefined,
    width: js.UndefOr[integer] = js.undefined
  ): BoundsSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight)
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth)
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight)
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BoundsSpecification]
  }
}

