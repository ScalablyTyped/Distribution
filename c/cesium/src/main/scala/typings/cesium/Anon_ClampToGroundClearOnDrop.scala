package typings.cesium

import typings.cesium.cesiumMod.DefaultProxy
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampToGroundClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var clearOnDrop: js.UndefOr[Boolean] = js.undefined
  var dropTarget: js.UndefOr[Element | String] = js.undefined
  var flyToOnDrop: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
}

object Anon_ClampToGroundClearOnDrop {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    clearOnDrop: js.UndefOr[Boolean] = js.undefined,
    dropTarget: Element | String = null,
    flyToOnDrop: js.UndefOr[Boolean] = js.undefined,
    proxy: DefaultProxy = null
  ): Anon_ClampToGroundClearOnDrop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround)
    if (!js.isUndefined(clearOnDrop)) __obj.updateDynamic("clearOnDrop")(clearOnDrop)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(flyToOnDrop)) __obj.updateDynamic("flyToOnDrop")(flyToOnDrop)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[Anon_ClampToGroundClearOnDrop]
  }
}

