package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeSwitchItem extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var value: scala.Double
}

object ModeSwitchItem {
  @scala.inline
  def apply(name: java.lang.String, value: scala.Double, default: js.UndefOr[scala.Boolean] = js.undefined): ModeSwitchItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[ModeSwitchItem]
  }
}

