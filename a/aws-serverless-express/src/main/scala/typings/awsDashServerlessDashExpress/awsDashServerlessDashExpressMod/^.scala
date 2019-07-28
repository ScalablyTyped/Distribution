package typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressMod

import typings.awsDashLambda.awsDashLambdaMod.Context
import typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressStrings.CALLBACK
import typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressStrings.CONTEXT_SUCCEED
import typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressStrings.PROMISE
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = js.native
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_]
  ): Server = js.native
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_],
    binaryMimeTypes: js.Array[String]
  ): Server = js.native
  def proxy(server: Server, event: js.Any, context: Context): Server = js.native
  @JSName("proxy")
  def proxy_CALLBACK(server: Server, event: js.Any, context: Context, resolutionMode: CALLBACK): ProxyResult = js.native
  @JSName("proxy")
  def proxy_CALLBACK(
    server: Server,
    event: js.Any,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, Unit]
  ): ProxyResult = js.native
  @JSName("proxy")
  def proxy_CONTEXTSUCCEED(server: Server, event: js.Any, context: Context, resolutionMode: CONTEXT_SUCCEED): ProxyResult = js.native
  @JSName("proxy")
  def proxy_PROMISE(server: Server, event: js.Any, context: Context, resolutionMode: PROMISE): ProxyResult = js.native
}

