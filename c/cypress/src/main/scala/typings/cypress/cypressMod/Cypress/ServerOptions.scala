package typings.cypress.cypressMod.Cypress

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Setting default options for cy.server()
  * @see https://on.cypress.io/server
  */
trait ServerOptions extends js.Object {
  var delay: Double
  var enable: Boolean
  var force404: Boolean
  var headers: js.Object
  var method: HttpMethod
  var response: js.Any
  var status: Double
  var urlMatchingOptions: js.Object
  def onAbort(args: js.Any*): Unit
  def onAnyAbort(route: RouteOptions, proxy: js.Any): Unit
  def onAnyRequest(route: RouteOptions, proxy: js.Any): Unit
  def onAnyResponse(route: RouteOptions, proxy: js.Any): Unit
  def onRequest(args: js.Any*): Unit
  def onResponse(args: js.Any*): Unit
  def whitelist(xhr: Request): Unit
}

object ServerOptions {
  @scala.inline
  def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    headers: js.Object,
    method: HttpMethod,
    onAbort: /* repeated */ js.Any => Unit,
    onAnyAbort: (RouteOptions, js.Any) => Unit,
    onAnyRequest: (RouteOptions, js.Any) => Unit,
    onAnyResponse: (RouteOptions, js.Any) => Unit,
    onRequest: /* repeated */ js.Any => Unit,
    onResponse: /* repeated */ js.Any => Unit,
    response: js.Any,
    status: Double,
    urlMatchingOptions: js.Object,
    whitelist: Request => Unit
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onAnyAbort = js.Any.fromFunction2(onAnyAbort), onAnyRequest = js.Any.fromFunction2(onAnyRequest), onAnyResponse = js.Any.fromFunction2(onAnyResponse), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], urlMatchingOptions = urlMatchingOptions.asInstanceOf[js.Any], whitelist = js.Any.fromFunction1(whitelist))
  
    __obj.asInstanceOf[ServerOptions]
  }
}

