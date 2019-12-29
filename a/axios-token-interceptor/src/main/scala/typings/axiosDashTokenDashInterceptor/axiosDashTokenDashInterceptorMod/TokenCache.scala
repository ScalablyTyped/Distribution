package typings.axiosDashTokenDashInterceptor.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenCache extends js.Object {
  def apply(): js.Promise[String] = js.native
  def reset(): Unit = js.native
}

@JSImport("axios-token-interceptor", "tokenCache")
@js.native
object tokenCache extends js.Object {
  def apply(getToken: js.Function0[js.Promise[String]], options: TokenCacheOptions): TokenCache = js.native
}

