package typings.cachefactory.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var cacheFlushInterval: js.UndefOr[Double] = js.undefined
  var capacity: js.UndefOr[Double] = js.undefined
  var deleteOnExpire: js.UndefOr[DeleteOnExpire] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var onExpire: js.UndefOr[OnExpireCallback] = js.undefined
  var recycleFreq: js.UndefOr[Double] = js.undefined
  var storageImpl: js.UndefOr[StorageImpl] = js.undefined
  var storageMode: js.UndefOr[StorageMode] = js.undefined
  var storagePrefix: js.UndefOr[String] = js.undefined
  var storeOnReject: js.UndefOr[Boolean] = js.undefined
  var storeOnResolve: js.UndefOr[Boolean] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    cacheFlushInterval: Int | Double = null,
    capacity: Int | Double = null,
    deleteOnExpire: DeleteOnExpire = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    onExpire: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit = null,
    recycleFreq: Int | Double = null,
    storageImpl: StorageImpl = null,
    storageMode: StorageMode = null,
    storagePrefix: String = null,
    storeOnReject: js.UndefOr[Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[Boolean] = js.undefined
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheFlushInterval != null) __obj.updateDynamic("cacheFlushInterval")(cacheFlushInterval.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (deleteOnExpire != null) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(js.Any.fromFunction3(onExpire))
    if (recycleFreq != null) __obj.updateDynamic("recycleFreq")(recycleFreq.asInstanceOf[js.Any])
    if (storageImpl != null) __obj.updateDynamic("storageImpl")(storageImpl)
    if (storageMode != null) __obj.updateDynamic("storageMode")(storageMode)
    if (storagePrefix != null) __obj.updateDynamic("storagePrefix")(storagePrefix)
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject)
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve)
    __obj.asInstanceOf[CacheOptions]
  }
}

