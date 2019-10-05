package typings.chromeDashApps.chrome.app

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentBounds extends js.Object {
  var height: js.UndefOr[integer] = js.undefined
  var left: js.UndefOr[integer] = js.undefined
  var top: js.UndefOr[integer] = js.undefined
  var width: js.UndefOr[integer] = js.undefined
}

object ContentBounds {
  @scala.inline
  def apply(
    height: Int | Double = null,
    left: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): ContentBounds = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentBounds]
  }
}

