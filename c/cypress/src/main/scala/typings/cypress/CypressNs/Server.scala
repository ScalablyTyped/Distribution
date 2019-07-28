package typings.cypress.CypressNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends RouteOptions {
  var enable: Boolean
  def whitelist(xhr: js.Any): Boolean
}

object Server {
  @scala.inline
  def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Unit,
    onRequest: /* repeated */ js.Any => Unit,
    onResponse: /* repeated */ js.Any => Unit,
    response: js.Any,
    status: Double,
    url: String | RegExp,
    whitelist: js.Any => Boolean,
    headers: js.Object = null
  ): Server = {
    val __obj = js.Dynamic.literal(delay = delay, enable = enable, force404 = force404, method = method, onAbort = js.Any.fromFunction1(onAbort), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response, status = status, url = url.asInstanceOf[js.Any], whitelist = js.Any.fromFunction1(whitelist))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Server]
  }
}

