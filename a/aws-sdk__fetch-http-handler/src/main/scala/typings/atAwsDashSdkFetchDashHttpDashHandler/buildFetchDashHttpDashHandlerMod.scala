package typings.atAwsDashSdkFetchDashHttpDashHandler

import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.atAwsDashSdkTypes.buildHttpMod.HttpHandler
import typings.atAwsDashSdkTypes.buildHttpMod.HttpHandlerOptions
import typings.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typings.atAwsDashSdkTypes.buildHttpMod.HttpResponse
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/fetch-http-handler/build/fetch-http-handler", JSImport.Namespace)
@js.native
object buildFetchDashHttpDashHandlerMod extends js.Object {
  @js.native
  class FetchHttpHandler () extends HttpHandler[Blob, BrowserHttpOptions] {
    def this(httpOptions: BrowserHttpOptions) = this()
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
    override def handle(request: HttpRequest[Blob], options: HttpHandlerOptions): js.Promise[HttpResponse[Blob]] = js.native
  }
  
}

