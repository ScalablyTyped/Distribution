package typings.awsSdkFetchHttpHandler

import typings.awsSdkFetchHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import typings.awsSdkTypes.transferMod.RequestHandlerOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchHttpHandlerMod {
  
  @JSImport("@aws-sdk/fetch-http-handler/dist/cjs/fetch-http-handler", "FetchHttpHandler")
  @js.native
  class FetchHttpHandler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(httpOptions: BrowserHttpOptions) = this()
    
    @JSName("destroy")
    def destroy_MFetchHttpHandler(): Unit = js.native
    
    /* CompleteClass */
    override def handle(request: HttpRequest, handlerOptions: HttpHandlerOptions): js.Promise[RequestHandlerOutput[HttpResponse]] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, options: HttpHandlerOptions): js.Promise[Response] = js.native
    
    /* private */ val httpOptions: js.Any = js.native
  }
  
  trait BrowserHttpOptions extends StObject {
    
    /**
      * The number of milliseconds a request can take before being automatically
      * terminated.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object BrowserHttpOptions {
    
    inline def apply(): BrowserHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserHttpOptions]
    }
    
    extension [Self <: BrowserHttpOptions](x: Self) {
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
}
