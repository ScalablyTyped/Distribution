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
    port: js.UndefOr[Double] = js.undefined,
    query: QueryParameterBag = null
  ): HttpEndpoint = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpoint]
  }
}

