package typings
package axiosDashTokenDashInterceptorLib.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenCache extends js.Object {
  def reset(): scala.Unit
}

object TokenCache {
  @scala.inline
  def apply(reset: () => scala.Unit): TokenCache = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[TokenCache]
  }
}

