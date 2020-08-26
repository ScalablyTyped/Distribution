package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/node-http-handler/build/node-http-handler", JSImport.Namespace)
@js.native
object nodeHttpHandlerMod extends js.Object {
  @js.native
  class NodeHttpHandler () extends HttpHandler[Readable, NodeHttpOptions] {
    def this(httpOptions: NodeHttpOptions) = this()
    val httpOptions: js.Any = js.native
  }
  
}

