package typings.axiosTokenInterceptor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheOptions extends js.Object {
  var getMaxAge: js.UndefOr[js.Function0[Double]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
}

object TokenCacheOptions {
  @scala.inline
  def apply(getMaxAge: () => Double = null, maxAge: js.UndefOr[Double] = js.undefined): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (getMaxAge != null) __obj.updateDynamic("getMaxAge")(js.Any.fromFunction0(getMaxAge))
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCacheOptions]
  }
}

