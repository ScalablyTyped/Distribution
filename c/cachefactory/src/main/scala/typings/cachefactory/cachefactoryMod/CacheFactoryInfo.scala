package typings.cachefactory.cachefactoryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheFactoryInfo extends CacheOptions {
  var caches: StringDictionary[CacheInfo]
  var size: Double
}

object CacheFactoryInfo {
  @scala.inline
  def apply(
    caches: StringDictionary[CacheInfo],
    size: Double,
    cacheFlushInterval: Int | Double = null,
    capacity: Int | Double = null,
    deleteOnExpire: DeleteOnExpire = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    onExpire: OnExpireCallback = null,
    recycleFreq: Int | Double = null,
    storageImpl: StorageImpl = null,
    storageMode: StorageMode = null,
    storagePrefix: String = null,
    storeOnReject: js.UndefOr[Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[Boolean] = js.undefined
  ): CacheFactoryInfo = {
    val __obj = js.Dynamic.literal(caches = caches, size = size)
    if (cacheFlushInterval != null) __obj.updateDynamic("cacheFlushInterval")(cacheFlushInterval.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (deleteOnExpire != null) __obj.updateDynamic("deleteOnExpire")(deleteOnExpire)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (onExpire != null) __obj.updateDynamic("onExpire")(onExpire)
    if (recycleFreq != null) __obj.updateDynamic("recycleFreq")(recycleFreq.asInstanceOf[js.Any])
    if (storageImpl != null) __obj.updateDynamic("storageImpl")(storageImpl)
    if (storageMode != null) __obj.updateDynamic("storageMode")(storageMode)
    if (storagePrefix != null) __obj.updateDynamic("storagePrefix")(storagePrefix)
    if (!js.isUndefined(storeOnReject)) __obj.updateDynamic("storeOnReject")(storeOnReject)
    if (!js.isUndefined(storeOnResolve)) __obj.updateDynamic("storeOnResolve")(storeOnResolve)
    __obj.asInstanceOf[CacheFactoryInfo]
  }
}

