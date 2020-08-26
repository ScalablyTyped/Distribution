package typings.cyberblastWebserver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cyberblastLogger.mod.Logger
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerContext extends js.Object {
  var client: js.UndefOr[String] = js.native
  var data: js.UndefOr[String | Buffer] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var request: IncomingMessage = js.native
  var response: ServerResponse = js.native
  var route: js.UndefOr[StringDictionary[js.Any]] = js.native
  var server: WebServer = js.native
}

object ServerContext {
  @scala.inline
  def apply(request: IncomingMessage, response: ServerResponse, server: WebServer): ServerContext = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerContext]
  }
  @scala.inline
  implicit class ServerContextOps[Self <: ServerContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequest(value: IncomingMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: ServerResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: WebServer): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setData(value: String | Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRoute(value: StringDictionary[js.Any]): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
  
}

