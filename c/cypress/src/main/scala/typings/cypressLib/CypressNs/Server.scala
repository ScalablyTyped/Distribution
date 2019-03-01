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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("force404")(force404)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("onAbort")(onAbort)
    __obj.updateDynamic("onRequest")(onRequest)
    __obj.updateDynamic("onResponse")(onResponse)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.updateDynamic("whitelist")(whitelist)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Server]
  }
}

