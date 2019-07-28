package typings.axiosDashTokenDashInterceptor.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCacheOptions extends js.Object {
  var getMaxAge: js.UndefOr[js.Function0[Double]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
}

object TokenCacheOptions {
  @scala.inline
  def apply(getMaxAge: () => Double = null, maxAge: Int | Double = null): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (getMaxAge != null) __obj.updateDynamic("getMaxAge")(js.Any.fromFunction0(getMaxAge))
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCacheOptions]
  }
}

