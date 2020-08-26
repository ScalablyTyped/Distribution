package typings.awsSdkFetchHttpHandler

import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.awsSdkTypes.httpMod.HttpHandler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/fetch-http-handler/build/fetch-http-handler", JSImport.Namespace)
@js.native
object fetchHttpHandlerMod extends js.Object {
  @js.native
  class FetchHttpHandler () extends HttpHandler[Blob, BrowserHttpOptions] {
    def this(httpOptions: BrowserHttpOptions) = this()
    val httpOptions: js.Any = js.native
  }
  
}

