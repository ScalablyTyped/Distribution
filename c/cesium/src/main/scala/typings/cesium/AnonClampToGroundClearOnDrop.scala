package typings.cesium

import typings.cesium.mod.DefaultProxy
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClampToGroundClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var clearOnDrop: js.UndefOr[Boolean] = js.undefined
  var dropTarget: js.UndefOr[Element | String] = js.undefined
  var flyToOnDrop: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
}

object AnonClampToGroundClearOnDrop {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    clearOnDrop: js.UndefOr[Boolean] = js.undefined,
    dropTarget: Element | String = null,
    flyToOnDrop: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null
  ): AnonClampToGroundClearOnDrop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnDrop)) __obj.updateDynamic("clearOnDrop")(clearOnDrop.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(flyToOnDrop)) __obj.updateDynamic("flyToOnDrop")(flyToOnDrop.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClampToGroundClearOnDrop]
  }
}

