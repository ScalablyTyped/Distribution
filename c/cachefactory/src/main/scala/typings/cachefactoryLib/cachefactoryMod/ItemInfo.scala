package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemInfo extends js.Object {
  var accessed: js.UndefOr[scala.Double] = js.undefined
  var created: js.UndefOr[scala.Double] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var isExpired: js.UndefOr[scala.Boolean] = js.undefined
}

object ItemInfo {
  @scala.inline
  def apply(
    accessed: scala.Int | scala.Double = null,
    created: scala.Int | scala.Double = null,
    expires: scala.Int | scala.Double = null,
    isExpired: js.UndefOr[scala.Boolean] = js.undefined
  ): ItemInfo = {
    val __obj = js.Dynamic.literal()
    if (accessed != null) __obj.updateDynamic("accessed")(accessed.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired)
    __obj.asInstanceOf[ItemInfo]
  }
}

