package typings.awsSdkFetchHttpHandler.fetchHttpHandlerMod

import typings.awsSdkFetchHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/fetch-http-handler/dist/cjs/fetch-http-handler", "FetchHttpHandler")
@js.native
class FetchHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
  def this(httpOptions: BrowserHttpOptions) = this()
  
  @JSName("destroy")
  def destroy_MFetchHttpHandler(): Unit = js.native
  
  def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, options: HttpHandlerOptions): js.Promise[Response] = js.native
  
  val httpOptions: js.Any = js.native
}
