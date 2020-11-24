package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-http/dist/cjs/httpHandler", JSImport.Namespace)
@js.native
object httpHandlerMod extends js.Object {
  
  type HttpHandler = RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions]
}
