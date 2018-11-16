package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


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
  def whitelist(args: js.Any*): scala.Unit
}

