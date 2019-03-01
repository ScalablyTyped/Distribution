package typings
package axiosDashTokenDashInterceptorLib.axiosDashTokenDashInterceptorMod.AxiosTokenProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCache extends js.Object {
  def reset(): scala.Unit
}

object TokenCache {
  @scala.inline
  def apply(reset: js.Function0[scala.Unit]): TokenCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[TokenCache]
  }
}

