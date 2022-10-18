package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typings.awsSdkNodeHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponse
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeHttp2HandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http2-handler", "NodeHttp2Handler")
  @js.native
  open class NodeHttp2Handler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(options: NodeHttp2HandlerOptions) = this()
    def this(options: Provider[NodeHttp2HandlerOptions | Unit]) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ val configProvider: Any = js.native
    
    /**
      * Delete a session from the connection pool.
      * @param authority The authority of the session to delete.
      * @param session The session to delete.
      */
    /* private */ var deleteSessionFromCache: Any = js.native
    
    /**
      * Destroys a session.
      * @param session The session to destroy.
      */
    /* private */ var destroySession: Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttp2Handler(): Unit = js.native
    
    /**
      * Returns a session for the given URL.
      *
      * @param authority The URL to create a session for.
      * @param disableConcurrentStreams If true, a new session will be created for each request.
      * @returns A session for the given URL.
      */
    /* private */ var getSession: Any = js.native
    
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest): js.Promise[Response] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
    
    @JSName("metadata")
    val metadata_NodeHttp2Handler: HandlerProtocol = js.native
    
    /* private */ var sessionCache: Any = js.native
  }
  
  trait NodeHttp2HandlerOptions extends StObject {
    
    /**
      * Disables processing concurrent streams on a ClientHttp2Session instance. When set
      * to true, the handler will create a new session instance for each request to a URL.
      * **Default:** false.
      * https://nodejs.org/api/http2.html#http2_class_clienthttp2session
      */
    var disableConcurrentStreams: js.UndefOr[Boolean] = js.undefined
    
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
  object NodeHttp2HandlerOptions {
    
    inline def apply(): NodeHttp2HandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttp2HandlerOptions]
    }
    
    extension [Self <: NodeHttp2HandlerOptions](x: Self) {
      
      inline def setDisableConcurrentStreams(value: Boolean): Self = StObject.set(x, "disableConcurrentStreams", value.asInstanceOf[js.Any])
      
      inline def setDisableConcurrentStreamsUndefined: Self = StObject.set(x, "disableConcurrentStreams", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
}
