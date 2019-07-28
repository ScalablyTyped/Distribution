package typings.axiosDashTokenDashInterceptor.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCache extends js.Object {
  def reset(): Unit
}

object TokenCache {
  @scala.inline
  def apply(reset: () => Unit): TokenCache = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[TokenCache]
  }
}

