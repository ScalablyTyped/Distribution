package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/node-http-handler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NodeHttpHandler ()
    extends typings.awsSdkNodeHttpHandler.nodeHttpHandlerMod.NodeHttpHandler {
    def this(httpOptions: NodeHttpOptions) = this()
  }
  
}

