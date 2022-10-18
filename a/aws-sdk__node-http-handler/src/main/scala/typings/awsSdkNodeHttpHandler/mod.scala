package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.distTypesNodeHttp2HandlerMod.NodeHttp2HandlerOptions
import typings.awsSdkNodeHttpHandler.distTypesNodeHttpHandlerMod.NodeHttpHandlerOptions
import typings.awsSdkTypes.distTypesSerdeMod.StreamCollector
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/node-http-handler", "NodeHttp2Handler")
  @js.native
  open class NodeHttp2Handler ()
    extends typings.awsSdkNodeHttpHandler.distTypesNodeHttp2HandlerMod.NodeHttp2Handler {
    def this(options: NodeHttp2HandlerOptions) = this()
    def this(options: Provider[NodeHttp2HandlerOptions | Unit]) = this()
  }
  
  @JSImport("@aws-sdk/node-http-handler", "NodeHttpHandler")
  @js.native
  open class NodeHttpHandler ()
    extends typings.awsSdkNodeHttpHandler.distTypesNodeHttpHandlerMod.NodeHttpHandler {
    def this(options: NodeHttpHandlerOptions) = this()
    def this(options: Provider[NodeHttpHandlerOptions | Unit]) = this()
  }
  
  @JSImport("@aws-sdk/node-http-handler", "streamCollector")
  @js.native
  val streamCollector: StreamCollector = js.native
}
