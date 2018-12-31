package typings
package axiosDashTokenDashInterceptorLib.axiosDashTokenDashInterceptorMod.AxiosTokenProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait InterceptorOptions extends js.Object {
  var getToken: js.UndefOr[js.Function0[java.lang.String | js.Promise[java.lang.String]]] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var headerFormatter: js.UndefOr[js.Function1[/* token */ java.lang.String, java.lang.String]] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

