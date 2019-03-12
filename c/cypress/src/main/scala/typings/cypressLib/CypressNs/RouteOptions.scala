package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptions extends js.Object {
  var delay: scala.Double
  var force404: scala.Boolean
  var headers: js.Object | scala.Null
  var method: HttpMethod
  var response: js.Any
  var status: scala.Double
  var url: java.lang.String | stdLib.RegExp
  def onAbort(args: js.Any*): scala.Unit
  def onRequest(args: js.Any*): scala.Unit
  def onResponse(args: js.Any*): scala.Unit
}

object RouteOptions {
  @scala.inline
  def apply(
    delay: scala.Double,
    force404: scala.Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => scala.Unit,
    onRequest: /* repeated */ js.Any => scala.Unit,
    onResponse: /* repeated */ js.Any => scala.Unit,
    response: js.Any,
    status: scala.Double,
    url: java.lang.String | stdLib.RegExp,
    headers: js.Object = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal(delay = delay, force404 = force404, method = method, onAbort = js.Any.fromFunction1(onAbort), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response, status = status, url = url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RouteOptions]
  }
}

