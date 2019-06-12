package typings
package awsDashServerlessDashExpressLib.awsDashServerlessDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ],
    serverListenCallback: js.Function0[_]
  ): nodeLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ],
    serverListenCallback: js.Function0[_],
    binaryMimeTypes: js.Array[java.lang.String]
  ): nodeLib.httpMod.Server = js.native
  def proxy(server: nodeLib.httpMod.Server, event: js.Any, context: awsDashLambdaLib.awsDashLambdaMod.Context): nodeLib.httpMod.Server = js.native
  @JSName("proxy")
  def proxy_CALLBACK(
    server: nodeLib.httpMod.Server,
    event: js.Any,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    resolutionMode: awsDashServerlessDashExpressLib.awsDashServerlessDashExpressLibStrings.CALLBACK
  ): ProxyResult = js.native
  @JSName("proxy")
  def proxy_CALLBACK(
    server: nodeLib.httpMod.Server,
    event: js.Any,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    resolutionMode: awsDashServerlessDashExpressLib.awsDashServerlessDashExpressLibStrings.CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, scala.Unit]
  ): ProxyResult = js.native
  @JSName("proxy")
  def proxy_CONTEXTSUCCEED(
    server: nodeLib.httpMod.Server,
    event: js.Any,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    resolutionMode: awsDashServerlessDashExpressLib.awsDashServerlessDashExpressLibStrings.CONTEXT_SUCCEED
  ): ProxyResult = js.native
  @JSName("proxy")
  def proxy_PROMISE(
    server: nodeLib.httpMod.Server,
    event: js.Any,
    context: awsDashLambdaLib.awsDashLambdaMod.Context,
    resolutionMode: awsDashServerlessDashExpressLib.awsDashServerlessDashExpressLibStrings.PROMISE
  ): ProxyResult = js.native
}

