package typings.chromeDashApps.chrome.app

import typings.chromeDashApps.chrome.integer
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
    height: Int | Double = null,
    left: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): BoundsSpecification = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundsSpecification]
  }
}

