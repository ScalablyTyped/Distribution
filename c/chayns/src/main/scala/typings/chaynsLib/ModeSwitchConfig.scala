package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
trait ModeSwitchConfig extends js.Object {
  var headline: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[ModeSwitchItem]
  var preventclose: js.UndefOr[scala.Boolean] = js.undefined
  def callback(result: ModeSwitchItem): scala.Unit
}

object ModeSwitchConfig {
  @scala.inline
  def apply(
    callback: js.Function1[ModeSwitchItem, scala.Unit],
    items: js.Array[ModeSwitchItem],
    headline: java.lang.String = null,
    preventclose: js.UndefOr[scala.Boolean] = js.undefined
  ): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = callback, items = items)
    if (headline != null) __obj.updateDynamic("headline")(headline)
    if (!js.isUndefined(preventclose)) __obj.updateDynamic("preventclose")(preventclose)
    __obj.asInstanceOf[ModeSwitchConfig]
  }
}

