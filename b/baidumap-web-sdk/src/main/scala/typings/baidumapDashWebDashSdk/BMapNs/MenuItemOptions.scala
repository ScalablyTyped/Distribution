package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemOptions extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MenuItemOptions {
  @scala.inline
  def apply(iconUrl: String = null, id: String = null, width: Int | Double = null): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemOptions]
  }
}

