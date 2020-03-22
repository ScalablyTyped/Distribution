package typings.cypress

import typings.cypress.cypressMod.Cypress.HttpMethod
import typings.cypress.cypressMod.Cypress.RouteOptions
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ServerOptions> */
trait PartialServerOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var force404: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onAnyAbort: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.undefined
  var onAnyRequest: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.undefined
  var onAnyResponse: js.UndefOr[js.Function2[/* route */ RouteOptions, /* proxy */ js.Any, Unit]] = js.undefined
  var onRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onResponse: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var urlMatchingOptions: js.UndefOr[js.Object] = js.undefined
  var whitelist: js.UndefOr[js.Function1[/* xhr */ Request, Unit]] = js.undefined
}

object PartialServerOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    force404: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    method: HttpMethod = null,
    onAbort: /* repeated */ js.Any => Unit = null,
    onAnyAbort: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit = null,
    onAnyRequest: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit = null,
    onAnyResponse: (/* route */ RouteOptions, /* proxy */ js.Any) => Unit = null,
    onRequest: /* repeated */ js.Any => Unit = null,
    onResponse: /* repeated */ js.Any => Unit = null,
    response: js.Any = null,
    status: Int | Double = null,
    urlMatchingOptions: js.Object = null,
    whitelist: /* xhr */ Request => Unit = null
  ): PartialServerOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(force404)) __obj.updateDynamic("force404")(force404.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnyAbort != null) __obj.updateDynamic("onAnyAbort")(js.Any.fromFunction2(onAnyAbort))
    if (onAnyRequest != null) __obj.updateDynamic("onAnyRequest")(js.Any.fromFunction2(onAnyRequest))
    if (onAnyResponse != null) __obj.updateDynamic("onAnyResponse")(js.Any.fromFunction2(onAnyResponse))
    if (onRequest != null) __obj.updateDynamic("onRequest")(js.Any.fromFunction1(onRequest))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1(onResponse))
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (urlMatchingOptions != null) __obj.updateDynamic("urlMatchingOptions")(urlMatchingOptions.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(js.Any.fromFunction1(whitelist))
    __obj.asInstanceOf[PartialServerOptions]
  }
}

