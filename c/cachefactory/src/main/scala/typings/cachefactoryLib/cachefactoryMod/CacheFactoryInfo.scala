package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheFactoryInfo extends CacheOptions {
  var caches: org.scalablytyped.runtime.StringDictionary[CacheInfo]
  var size: scala.Double
}

object CacheFactoryInfo {
  @scala.inline
  def apply(
    caches: org.scalablytyped.runtime.StringDictionary[CacheInfo],
    size: scala.Double,
    cacheFlushInterval: scala.Int | scala.Double = null,
    capacity: scala.Int | scala.Double = null,
    deleteOnExpire: DeleteOnExpire = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    onExpire: OnExpireCallback = null,
    recycleFreq: scala.Int | scala.Double = null,
    storageImpl: StorageImpl = null,
    storageMode: StorageMode = null,
    storagePrefix: java.lang.String = null,
    storeOnReject: js.UndefOr[scala.Boolean] = js.undefined,
    storeOnResolve: js.UndefOr[scala.Boolean] = js.undefined
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

