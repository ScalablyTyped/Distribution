package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorEvent extends js.Object {
  var response: js.Any
  var responseHeaders: js.Any
  var statusCode: scala.Double
}

object RequestErrorEvent {
  @scala.inline
  def apply(
    response: js.Any,
    responseHeaders: js.Any,
    statusCode: scala.Double,
    toString: () => java.lang.String
  ): RequestErrorEvent = {
    val __obj = js.Dynamic.literal(response = response, responseHeaders = responseHeaders, statusCode = statusCode, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[RequestErrorEvent]
  }
}

