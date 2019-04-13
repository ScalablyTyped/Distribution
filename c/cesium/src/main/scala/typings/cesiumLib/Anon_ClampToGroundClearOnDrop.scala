package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampToGroundClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[scala.Boolean] = js.undefined
  var clearOnDrop: js.UndefOr[scala.Boolean] = js.undefined
  var dropTarget: js.UndefOr[stdLib.Element | java.lang.String] = js.undefined
  var flyToOnDrop: js.UndefOr[scala.Boolean] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.DefaultProxy] = js.undefined
}

object Anon_ClampToGroundClearOnDrop {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[scala.Boolean] = js.undefined,
    clearOnDrop: js.UndefOr[scala.Boolean] = js.undefined,
    dropTarget: stdLib.Element | java.lang.String = null,
    flyToOnDrop: js.UndefOr[scala.Boolean] = js.undefined,
    proxy: cesiumLib.cesiumMod.DefaultProxy = null
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

