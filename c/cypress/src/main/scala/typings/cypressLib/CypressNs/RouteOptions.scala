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

