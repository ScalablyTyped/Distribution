package typings.chromeDashApps.chromeNs.appNs

import typings.chromeDashApps.chromeNs.integer
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
    height: js.UndefOr[integer] = js.undefined,
    left: js.UndefOr[integer] = js.undefined,
    top: js.UndefOr[integer] = js.undefined,
    width: js.UndefOr[integer] = js.undefined
  ): ContentBounds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ContentBounds]
  }
}

