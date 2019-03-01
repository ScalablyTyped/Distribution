package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCacheOptions extends GetCacheOptions {
  var cache: scala.Boolean
  var expires: scala.Boolean | scala.Double
  var prefill: scala.Boolean
  var prefillExpires: scala.Boolean | scala.Double
}

object SetCacheOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    expires: scala.Boolean | scala.Double,
    prefill: scala.Boolean,
    prefillExpires: scala.Boolean | scala.Double,
    data: js.Any = null,
    url: java.lang.String = null
  ): SetCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.updateDynamic("prefill")(prefill)
    __obj.updateDynamic("prefillExpires")(prefillExpires.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SetCacheOptions]
  }
}

