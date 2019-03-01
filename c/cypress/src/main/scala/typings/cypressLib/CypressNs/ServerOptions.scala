package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
trait ServerOptions extends js.Object {
  var delay: scala.Double
  var enable: scala.Boolean
  var force404: scala.Boolean
  var headers: js.Object
  var method: HttpMethod
  var response: js.Any
  var status: scala.Double
  var urlMatchingOptions: js.Object
  def onAbort(args: js.Any*): scala.Unit
  def onRequest(args: js.Any*): scala.Unit
  def onResponse(args: js.Any*): scala.Unit
  def whitelist(xhr: stdLib.Request): scala.Unit
}

object ServerOptions {
  @scala.inline
  def apply(
    delay: scala.Double,
    enable: scala.Boolean,
    force404: scala.Boolean,
    headers: js.Object,
    method: HttpMethod,
    onAbort: js.Function1[/* repeated */ js.Any, scala.Unit],
    onRequest: js.Function1[/* repeated */ js.Any, scala.Unit],
    onResponse: js.Function1[/* repeated */ js.Any, scala.Unit],
    response: js.Any,
    status: scala.Double,
    urlMatchingOptions: js.Object,
    whitelist: js.Function1[stdLib.Request, scala.Unit]
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("force404")(force404)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("onAbort")(onAbort)
    __obj.updateDynamic("onRequest")(onRequest)
    __obj.updateDynamic("onResponse")(onResponse)
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("urlMatchingOptions")(urlMatchingOptions)
    __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[ServerOptions]
  }
}

