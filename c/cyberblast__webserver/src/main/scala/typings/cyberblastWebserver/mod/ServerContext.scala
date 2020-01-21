package typings.cyberblastWebserver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cyberblastLogger.mod.Logger
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerContext extends js.Object {
  var client: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String | Buffer] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var request: IncomingMessage
  var response: ServerResponse
  var route: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var server: WebServer
}

object ServerContext {
  @scala.inline
  def apply(
    request: IncomingMessage,
    response: ServerResponse,
    server: WebServer,
    client: String = null,
    data: String | Buffer = null,
    logger: Logger = null,
    route: StringDictionary[js.Any] = null
  ): ServerContext = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerContext]
  }
}

