package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typings.awsSdkNodeHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import typings.awsSdkTypes.transferMod.RequestHandlerOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttp2HandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/node-http2-handler", "NodeHttp2Handler")
  @js.native
  class NodeHttp2Handler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(http2Options: NodeHttp2Options) = this()
    
    /* private */ val connectionPool: js.Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttp2Handler(): Unit = js.native
    
    /* private */ var getSession: js.Any = js.native
    
    /* CompleteClass */
    override def handle(request: HttpRequest, handlerOptions: HttpHandlerOptions): js.Promise[RequestHandlerOutput[HttpResponse]] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
    
    /* private */ val http2Options: js.Any = js.native
    
    @JSName("metadata")
    val metadata_NodeHttp2Handler: HandlerProtocol = js.native
  }
  
  trait NodeHttp2Options extends StObject {
    
    /**
      * The maximum time in milliseconds that a stream may remain idle before it
      * is closed.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum time in milliseconds that a session or socket may remain idle
      * before it is closed.
      * https://nodejs.org/docs/latest-v12.x/api/http2.html#http2_http2session_and_sockets
      */
    var sessionTimeout: js.UndefOr[Double] = js.undefined
  }
  object NodeHttp2Options {
    
    inline def apply(): NodeHttp2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttp2Options]
    }
    
    extension [Self <: NodeHttp2Options](x: Self) {
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
}
