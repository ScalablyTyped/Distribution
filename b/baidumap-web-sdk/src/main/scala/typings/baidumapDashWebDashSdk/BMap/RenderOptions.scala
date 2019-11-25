package typings.baidumapDashWebDashSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var autoViewport: js.UndefOr[Boolean] = js.undefined
  var highlightMode: js.UndefOr[HighlightModes] = js.undefined
  var map: Map
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    map: Map,
    autoViewport: js.UndefOr[Boolean] = js.undefined,
    highlightMode: Int | Double = null,
    panel: String | HTMLElement = null,
    selectFirstResult: js.UndefOr[Boolean] = js.undefined
  ): RenderOptions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    if (!js.isUndefined(autoViewport)) __obj.updateDynamic("autoViewport")(autoViewport.asInstanceOf[js.Any])
    if (highlightMode != null) __obj.updateDynamic("highlightMode")(highlightMode.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

