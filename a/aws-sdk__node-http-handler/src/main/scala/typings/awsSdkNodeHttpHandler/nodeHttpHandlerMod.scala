package typings.awsSdkNodeHttpHandler

import typings.awsSdkTypes.httpMod.HttpHandler
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.httpMod.HttpResponse
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
    /**
      * Perform any necessary cleanup actions, such as closing any open
      * connections. Calling `destroy` should allow the host application to
      * immediately proceed with graceful termination.
      *
      * HttpHandlers should be considered unusable after `destroy` has been
      * called.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /**
      * A function that takes an HTTP request and returns a promise for an HTTP
      * response.
      *
      * If a `StreamType` type parameter is supplied, both the request and the
      * response may have streaming bodies. In such implementations, the promise
      * returned should resolve as soon as headers are available, and the as-yet
      * uncollected stream should be set as the response's `body` property.
      */
    /* CompleteClass */
    override def handle(request: HttpRequest[Readable], options: HttpHandlerOptions): js.Promise[HttpResponse[Readable]] = js.native
  }
  
}

