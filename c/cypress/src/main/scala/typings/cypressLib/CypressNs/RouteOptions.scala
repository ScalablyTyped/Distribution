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
    onAbort: js.Function1[/* repeated */ js.Any, scala.Unit],
    onRequest: js.Function1[/* repeated */ js.Any, scala.Unit],
    onResponse: js.Function1[/* repeated */ js.Any, scala.Unit],
    response: js.Any,
    status: scala.Double,
    url: java.lang.String | stdLib.RegExp,
    headers: js.Object = null
  ): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("force404")(force404)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("onAbort")(onAbort)
    __obj.updateDynamic("onRequest")(onRequest)
    __obj.updateDynamic("onResponse")(onResponse)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RouteOptions]
  }
}

