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

object InterceptorOptions {
  @scala.inline
  def apply(
    getToken: () => java.lang.String | js.Promise[java.lang.String] = null,
    header: java.lang.String = null,
    headerFormatter: /* token */ java.lang.String => java.lang.String = null,
    token: java.lang.String = null
  ): InterceptorOptions = {
    val __obj = js.Dynamic.literal()
    if (getToken != null) __obj.updateDynamic("getToken")(js.Any.fromFunction0(getToken))
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerFormatter != null) __obj.updateDynamic("headerFormatter")(js.Any.fromFunction1(headerFormatter))
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[InterceptorOptions]
  }
}

