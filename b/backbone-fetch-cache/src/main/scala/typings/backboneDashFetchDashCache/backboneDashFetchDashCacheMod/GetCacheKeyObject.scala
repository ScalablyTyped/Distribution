package typings.backboneDashFetchDashCache.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCacheKeyObject extends _GetCacheKeyOptions {
  var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], String]] = js.undefined
  var url: js.UndefOr[js.Function0[String]] = js.undefined
}

object GetCacheKeyObject {
  @scala.inline
  def apply(getCacheKey: /* opts */ js.UndefOr[GetCacheOptions] => String = null, url: () => String = null): GetCacheKeyObject = {
    val __obj = js.Dynamic.literal()
    if (getCacheKey != null) __obj.updateDynamic("getCacheKey")(js.Any.fromFunction1(getCacheKey))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction0(url))
    __obj.asInstanceOf[GetCacheKeyObject]
  }
}

