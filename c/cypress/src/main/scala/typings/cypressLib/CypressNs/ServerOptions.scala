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

