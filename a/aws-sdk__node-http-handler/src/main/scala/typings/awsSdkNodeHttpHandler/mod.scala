package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Options
import typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpOptions
import typings.awsSdkTypes.serdeMod.StreamCollector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/node-http-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val streamCollector: StreamCollector = js.native
  
  @js.native
  class NodeHttp2Handler ()
    extends typings.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Handler {
    def this(http2Options: NodeHttp2Options) = this()
  }
  
  @js.native
  class NodeHttpHandler ()
    extends typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpHandler {
    def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
  }
}
