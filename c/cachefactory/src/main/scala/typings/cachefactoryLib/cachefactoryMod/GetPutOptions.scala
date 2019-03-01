package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPutOptions extends ItemInfo {
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
  var storeOnReject: js.UndefOr[scala.Boolean] = js.undefined
  var storeOnResolve: js.UndefOr[scala.Boolean] = js.undefined
}

object GetPutOptions {
  @scala.inline
  def apply(
    accessed: scala.Int | scala.Double = null,
    created: scala.Int | scala.Double = null,
    expires: scala.Int | scala.Double = null,
    isExpired: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    onExpire: OnExpireCallback = null,
    storeOnReject: js.UndefOr[scala.Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[scala.Boolean] = js.undefined
  ): GetPutOptions = {
    val __obj = js.Dynamic.literal()
    if (accessed != null) __obj.updateDynamic("accessed")(accessed.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(onExpire)
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject)
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve)
    __obj.asInstanceOf[GetPutOptions]
  }
}

