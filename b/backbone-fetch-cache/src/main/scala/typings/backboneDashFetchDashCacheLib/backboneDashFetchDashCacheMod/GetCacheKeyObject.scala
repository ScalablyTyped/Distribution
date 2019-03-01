package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCacheKeyObject extends js.Object {
  var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], java.lang.String]] = js.undefined
  var url: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object GetCacheKeyObject {
  @scala.inline
  def apply(
    getCacheKey: js.Function1[/* opts */ js.UndefOr[GetCacheOptions], java.lang.String] = null,
    url: js.Function0[java.lang.String] = null
  ): GetCacheKeyObject = {
    val __obj = js.Dynamic.literal()
    if (getCacheKey != null) __obj.updateDynamic("getCacheKey")(getCacheKey)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetCacheKeyObject]
  }
}

