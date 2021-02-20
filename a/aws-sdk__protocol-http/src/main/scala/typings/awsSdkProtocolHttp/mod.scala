package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequestOptions
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-http", "HttpRequest")
  @js.native
  class HttpRequest protected ()
    extends typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
  }
  /* static members */
  object HttpRequest {
    
    @JSImport("@aws-sdk/protocol-http", "HttpRequest.isInstance")
    @js.native
    def isInstance(request: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpRequest.HttpRequest */ Boolean = js.native
  }
  
  @JSImport("@aws-sdk/protocol-http", "HttpResponse")
  @js.native
  class HttpResponse protected ()
    extends typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  object HttpResponse {
    
    @JSImport("@aws-sdk/protocol-http", "HttpResponse.isInstance")
    @js.native
    def isInstance(response: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpResponse.HttpResponse */ Boolean = js.native
  }
  
  @JSImport("@aws-sdk/protocol-http", "isValidHostname")
  @js.native
  def isValidHostname(hostname: String): Boolean = js.native
}
