package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentBounds extends js.Object {
  var height: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var left: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var top: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  var width: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object ContentBounds {
  @scala.inline
  def apply(
    height: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    left: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    top: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    width: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): ContentBounds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ContentBounds]
  }
}

