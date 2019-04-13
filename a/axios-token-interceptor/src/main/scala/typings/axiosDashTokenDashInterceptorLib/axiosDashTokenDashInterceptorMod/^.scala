package typings
package axiosDashTokenDashInterceptorLib.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axios-token-interceptor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Module
  def apply(Options: InterceptorOptions): TokenProvider = js.native
  def tokenCache(getToken: js.Promise[java.lang.String], options: TokenCacheOptions): TokenCache = js.native
}

