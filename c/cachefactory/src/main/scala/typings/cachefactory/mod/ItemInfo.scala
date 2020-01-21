package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemInfo extends js.Object {
  var accessed: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var isExpired: js.UndefOr[Boolean] = js.undefined
}

object ItemInfo {
  @scala.inline
  def apply(
    accessed: Int | Double = null,
    created: Int | Double = null,
    expires: Int | Double = null,
    isExpired: js.UndefOr[Boolean] = js.undefined
  ): ItemInfo = {
    val __obj = js.Dynamic.literal()
    if (accessed != null) __obj.updateDynamic("accessed")(accessed.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemInfo]
  }
}

