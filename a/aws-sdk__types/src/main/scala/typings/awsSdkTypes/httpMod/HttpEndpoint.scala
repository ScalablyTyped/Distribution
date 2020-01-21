package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpEndpoint extends js.Object {
  var hostname: String
  var path: String
  var port: js.UndefOr[Double] = js.undefined
  var protocol: String
  var query: js.UndefOr[QueryParameterBag] = js.undefined
}

object HttpEndpoint {
  @scala.inline
  def apply(
    hostname: String,
    path: String,
    protocol: String,
    port: Int | Double = null,
    query: QueryParameterBag = null
  ): HttpEndpoint = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpoint]
  }
}

