package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheInfo extends CacheOptions {
  var id: String
  var size: Double
}

object CacheInfo {
  @scala.inline
  def apply(
    id: String,
    size: Double,
    cacheFlushInterval: js.UndefOr[Double] = js.undefined,
    capacity: js.UndefOr[Double] = js.undefined,
    deleteOnExpire: DeleteOnExpire = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    onExpire: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit = null,
    recycleFreq: js.UndefOr[Double] = js.undefined,
    storageImpl: StorageImpl = null,
    storageMode: StorageMode = null,
    storagePrefix: String = null,
    storeOnReject: js.UndefOr[Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[Boolean] = js.undefined
  ): CacheInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheFlushInterval)) __obj.updateDynamic("cacheFlushInterval")(cacheFlushInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capacity)) __obj.updateDynamic("capacity")(capacity.get.asInstanceOf[js.Any])
    if (deleteOnExpire != null) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction3(onExpire))
    if (!js.isUndefined(recycleFreq)) __obj.updateDynamic("recycleFreq")(recycleFreq.get.asInstanceOf[js.Any])
    if (storageImpl != null) __obj.updateDynamic("storageImpl")(storageImpl.asInstanceOf[js.Any])
    if (storageMode != null) __obj.updateDynamic("storageMode")(storageMode.asInstanceOf[js.Any])
    if (storagePrefix != null) __obj.updateDynamic("storagePrefix")(storagePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheInfo]
  }
}

