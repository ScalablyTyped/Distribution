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
    onAbort: js.Function1[/* repeated */ js.Any, scala.Unit],
    onRequest: js.Function1[/* repeated */ js.Any, scala.Unit],
    onResponse: js.Function1[/* repeated */ js.Any, scala.Unit],
    response: js.Any,
    status: scala.Double,
    url: java.lang.String | stdLib.RegExp,
    whitelist: js.Function1[js.Any, scala.Boolean],
    headers: js.Object = null
  ): Server = {
    val __obj = js.Dynamic.literal(delay = delay, enable = enable, force404 = force404, method = method, onAbort = onAbort, onRequest = onRequest, onResponse = onResponse, response = response, status = status, url = url.asInstanceOf[js.Any], whitelist = whitelist)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Server]
  }
}

