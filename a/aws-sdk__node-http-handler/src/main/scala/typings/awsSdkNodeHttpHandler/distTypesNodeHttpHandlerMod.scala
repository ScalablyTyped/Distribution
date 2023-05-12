package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typings.awsSdkNodeHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponse
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeHttpHandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http-handler", "DEFAULT_REQUEST_TIMEOUT")
  @js.native
  val DEFAULT_REQUEST_TIMEOUT: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http-handler", "NodeHttpHandler")
  @js.native
  open class NodeHttpHandler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(options: NodeHttpHandlerOptions) = this()
    def this(options: Provider[NodeHttpHandlerOptions | Unit]) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ val configProvider: Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttpHandler(): Unit = js.native
    
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest): js.Promise[Response] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, param1: HttpHandlerOptions): js.Promise[Response] = js.native
    
    @JSName("metadata")
    val metadata_NodeHttpHandler: HandlerProtocol = js.native
    
    /* private */ var resolveDefaultConfig: Any = js.native
  }
  
  trait NodeHttpHandlerOptions extends StObject {
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      *
      * Defaults to 0, which disables the timeout.
      */
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      * Defaults to 0, which disables the timeout.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated Use {@link requestTimeout}
      *
      * The maximum time in milliseconds that a socket may remain idle before it
      * is closed.
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object NodeHttpHandlerOptions {
    
    inline def apply(): NodeHttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttpHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeHttpHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
