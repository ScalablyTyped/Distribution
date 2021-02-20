package typings.awsSdkFetchHttpHandler

import typings.awsSdkFetchHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchHttpHandlerMod {
  
  @JSImport("@aws-sdk/fetch-http-handler/dist/cjs/fetch-http-handler", "FetchHttpHandler")
  @js.native
  class FetchHttpHandler () extends RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(httpOptions: BrowserHttpOptions) = this()
    
    @JSName("destroy")
    def destroy_MFetchHttpHandler(): Unit = js.native
    
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, options: HttpHandlerOptions): js.Promise[Response] = js.native
    
    val httpOptions: js.Any = js.native
  }
  
  @js.native
  trait BrowserHttpOptions extends StObject {
    
    /**
      * The number of milliseconds a request can take before being automatically
      * terminated.
      */
    var requestTimeout: js.UndefOr[Double] = js.native
  }
  object BrowserHttpOptions {
    
    @scala.inline
    def apply(): BrowserHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHttpOptions]
    }
    
    @scala.inline
    implicit class BrowserHttpOptionsMutableBuilder[Self <: BrowserHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
}
