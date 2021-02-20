package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Options
import typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpOptions
import typings.awsSdkTypes.serdeMod.StreamCollector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/node-http-handler", "NodeHttp2Handler")
  @js.native
  class NodeHttp2Handler ()
    extends typings.awsSdkNodeHttpHandler.nodeHttp2HandlerMod.NodeHttp2Handler {
    def this(http2Options: NodeHttp2Options) = this()
  }
  
  @JSImport("@aws-sdk/node-http-handler", "NodeHttpHandler")
  @js.native
  class NodeHttpHandler ()
    extends typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpHandler {
    def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
  }
  
  @JSImport("@aws-sdk/node-http-handler", "streamCollector")
  @js.native
  val streamCollector: StreamCollector = js.native
}
