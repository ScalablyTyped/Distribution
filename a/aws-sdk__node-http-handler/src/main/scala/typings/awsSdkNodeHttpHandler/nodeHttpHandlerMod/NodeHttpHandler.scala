package typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod

import typings.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typings.awsSdkNodeHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler/dist/cjs/node-http-handler", "NodeHttpHandler")
@js.native
class NodeHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
  def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
  
  val connectionTimeout: js.Any = js.native
  
  @JSName("destroy")
  def destroy_MNodeHttpHandler(): Unit = js.native
  
  def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
  
  val httpAgent: js.Any = js.native
  
  val httpsAgent: js.Any = js.native
  
  @JSName("metadata")
  val metadata_NodeHttpHandler: HandlerProtocol = js.native
  
  val socketTimeout: js.Any = js.native
}
