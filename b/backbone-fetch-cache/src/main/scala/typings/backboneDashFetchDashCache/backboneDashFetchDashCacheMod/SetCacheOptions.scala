package typings.backboneDashFetchDashCache.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCacheOptions extends GetCacheOptions {
  var cache: Boolean
  var expires: Boolean | Double
  var prefill: Boolean
  var prefillExpires: Boolean | Double
}

object SetCacheOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    expires: Boolean | Double,
    prefill: Boolean,
    prefillExpires: Boolean | Double,
    data: js.Any = null,
    url: String = null
  ): SetCacheOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheOptions]
  }
}

