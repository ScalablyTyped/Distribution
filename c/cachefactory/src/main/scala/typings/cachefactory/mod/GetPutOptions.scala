package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPutOptions extends ItemInfo {
  var maxAge: js.UndefOr[Double] = js.undefined
  var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
  var storeOnReject: js.UndefOr[Boolean] = js.undefined
  var storeOnResolve: js.UndefOr[Boolean] = js.undefined
}

object GetPutOptions {
  @scala.inline
  def apply(
    accessed: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Double] = js.undefined,
    expires: js.UndefOr[Double] = js.undefined,
    isExpired: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    onExpire: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit = null,
    storeOnReject: js.UndefOr[Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[Boolean] = js.undefined
  ): GetPutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessed)) __obj.updateDynamic("accessed")(accessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpired)) __obj.updateDynamic("isExpired")(isExpired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction3(onExpire))
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPutOptions]
  }
}

