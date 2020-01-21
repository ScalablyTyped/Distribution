package typings.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GetCacheKeyOptions extends js.Object

object _GetCacheKeyOptions {
  @scala.inline
  def AnonUrl(url: String): _GetCacheKeyOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GetCacheKeyOptions]
  }
  @scala.inline
  def GetCacheKeyObject(getCacheKey: /* opts */ js.UndefOr[GetCacheOptions] => String = null, url: () => String = null): _GetCacheKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (getCacheKey != null) __obj.updateDynamic("getCacheKey")(js.Any.fromFunction1(getCacheKey))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction0(url))
    __obj.asInstanceOf[_GetCacheKeyOptions]
  }
}

