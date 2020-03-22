package typings.cypress

import typings.cypress.cypressMod.Cypress.HttpMethod
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.RouteOptions> */
trait PartialRouteOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var force404: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onRequest: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onResponse: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String | RegExp] = js.undefined
}

object PartialRouteOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    force404: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    method: HttpMethod = null,
    onAbort: /* repeated */ js.Any => Unit = null,
    onRequest: /* repeated */ js.Any => Unit = null,
    onResponse: /* repeated */ js.Any => Unit = null,
    response: js.Any = null,
    status: Int | Double = null,
    url: String | RegExp = null
  ): PartialRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(force404)) __obj.updateDynamic("force404")(force404.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onRequest != null) __obj.updateDynamic("onRequest")(js.Any.fromFunction1(onRequest))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1(onResponse))
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRouteOptions]
  }
}

