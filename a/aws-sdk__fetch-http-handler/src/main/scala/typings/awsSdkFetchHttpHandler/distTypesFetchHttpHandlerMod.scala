package typings.awsSdkFetchHttpHandler

import typings.awsSdkFetchHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponse
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFetchHttpHandlerMod {
  
  @JSImport("@aws-sdk/fetch-http-handler/dist-types/fetch-http-handler", "FetchHttpHandler")
  @js.native
  open class FetchHttpHandler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(options: FetchHttpHandlerOptions) = this()
    def this(options: Provider[js.UndefOr[FetchHttpHandlerOptions]]) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ val configProvider: Any = js.native
    
    @JSName("destroy")
    def destroy_MFetchHttpHandler(): Unit = js.native
    
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest): js.Promise[Response] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, param1: HttpHandlerOptions): js.Promise[Response] = js.native
  }
  
  trait FetchHttpHandlerOptions extends StObject {
    
    /**
      * The number of milliseconds a request can take before being automatically
      * terminated.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object FetchHttpHandlerOptions {
    
    inline def apply(): FetchHttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchHttpHandlerOptions]
    }
    
    extension [Self <: FetchHttpHandlerOptions](x: Self) {
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
}
