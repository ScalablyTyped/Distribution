package typings.cypress.CypressNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var delay: Double
  var force404: Boolean
  var headers: js.Object | Null
  var method: HttpMethod
  var response: js.Any
  var status: Double
  var url: String | RegExp
  def onAbort(args: js.Any*): Unit
  def onRequest(args: js.Any*): Unit
  def onResponse(args: js.Any*): Unit
}

object RouteOptions {
  @scala.inline
  def apply(
    delay: Double,
    force404: Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Unit,
    onRequest: /* repeated */ js.Any => Unit,
    onResponse: /* repeated */ js.Any => Unit,
    response: js.Any,
    status: Double,
    url: String | RegExp,
    headers: js.Object = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal(delay = delay, force404 = force404, method = method, onAbort = js.Any.fromFunction1(onAbort), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response, status = status, url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RouteOptions]
  }
}

