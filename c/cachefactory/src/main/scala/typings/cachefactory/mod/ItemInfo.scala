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
    accessed: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Double] = js.undefined,
    expires: js.UndefOr[Double] = js.undefined,
    isExpired: js.UndefOr[Boolean] = js.undefined
  ): ItemInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessed)) __obj.updateDynamic("accessed")(accessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemInfo]
  }
}

