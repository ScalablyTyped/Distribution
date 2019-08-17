package typings.atAwsDashSdkTypes.buildHttpMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest[StreamType]
  extends HttpMessage[StreamType]
     with HttpEndpoint {
  var method: String
}

object HttpRequest {
  @scala.inline
  def apply[StreamType](
    headers: HeaderBag,
    hostname: String,
    method: String,
    path: String,
    protocol: String,
    body: ArrayBuffer | ArrayBufferView | String | StreamType = null,
    port: Int | Double = null,
    query: QueryParameterBag = null
  ): HttpRequest[StreamType] = {
    val __obj = js.Dynamic.literal(headers = headers, hostname = hostname, method = method, path = path, protocol = protocol)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[HttpRequest[StreamType]]
  }
}

