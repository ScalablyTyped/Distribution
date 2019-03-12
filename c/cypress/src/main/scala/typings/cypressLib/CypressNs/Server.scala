package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends RouteOptions {
  var enable: scala.Boolean
  def whitelist(xhr: js.Any): scala.Boolean
}

object Server {
  @scala.inline
  def apply(
    delay: scala.Double,
    enable: scala.Boolean,
    force404: scala.Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => scala.Unit,
    onRequest: /* repeated */ js.Any => scala.Unit,
    onResponse: /* repeated */ js.Any => scala.Unit,
    response: js.Any,
    status: scala.Double,
    url: java.lang.String | stdLib.RegExp,
    whitelist: js.Any => scala.Boolean,
    headers: js.Object = null
  ): Server = {
    val __obj = js.Dynamic.literal(delay = delay, enable = enable, force404 = force404, method = method, onAbort = js.Any.fromFunction1(onAbort), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response, status = status, url = url.asInstanceOf[js.Any], whitelist = js.Any.fromFunction1(whitelist))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Server]
  }
}

