package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequestOptions
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-http", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def isValidHostname(hostname: String): Boolean = js.native
  
  @js.native
  class HttpRequest protected ()
    extends typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
  }
  /* static members */
  @js.native
  object HttpRequest extends js.Object {
    
    def isInstance(request: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpRequest.HttpRequest */ Boolean = js.native
  }
  
  @js.native
  class HttpResponse protected ()
    extends typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  @js.native
  object HttpResponse extends js.Object {
    
    def isInstance(response: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpResponse.HttpResponse */ Boolean = js.native
  }
}
