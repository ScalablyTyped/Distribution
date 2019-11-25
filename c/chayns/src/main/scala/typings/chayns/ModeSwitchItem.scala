package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeSwitchItem extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: Double
}

object ModeSwitchItem {
  @scala.inline
  def apply(name: String, value: Double, default: js.UndefOr[Boolean] = js.undefined): ModeSwitchItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchItem]
  }
}

