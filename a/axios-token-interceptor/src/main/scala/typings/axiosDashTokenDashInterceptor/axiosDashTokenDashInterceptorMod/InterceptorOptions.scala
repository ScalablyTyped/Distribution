package typings.axiosDashTokenDashInterceptor.axiosDashTokenDashInterceptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait InterceptorOptions extends js.Object {
  var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object InterceptorOptions {
  @scala.inline
  def apply(
    getToken: () => String | js.Promise[String] = null,
    header: String = null,
    headerFormatter: /* token */ String => String = null,
    token: String = null
  ): InterceptorOptions = {
    val __obj = js.Dynamic.literal()
    if (getToken != null) __obj.updateDynamic("getToken")(js.Any.fromFunction0(getToken))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerFormatter != null) __obj.updateDynamic("headerFormatter")(js.Any.fromFunction1(headerFormatter))
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorOptions]
  }
}

