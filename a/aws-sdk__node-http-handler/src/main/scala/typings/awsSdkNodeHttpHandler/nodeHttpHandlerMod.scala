package typings.awsSdkNodeHttpHandler

import typings.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typings.awsSdkNodeHttpHandler.anon.Response
import typings.awsSdkProtocolHttp.httpRequestMod.HttpRequest
import typings.awsSdkProtocolHttp.httpResponseMod.HttpResponse
import typings.awsSdkTypes.httpMod.HttpHandlerOptions
import typings.awsSdkTypes.transferMod.RequestHandler
import typings.awsSdkTypes.transferMod.RequestHandlerOutput
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpHandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/node-http-handler", "NodeHttpHandler")
  @js.native
  class NodeHttpHandler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(hasConnectionTimeoutSocketTimeoutHttpAgentHttpsAgent: NodeHttpOptions) = this()
    
    val connectionTimeout: js.Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttpHandler(): Unit = js.native
    
    /* CompleteClass */
    override def handle(request: HttpRequest, handlerOptions: HttpHandlerOptions): js.Promise[RequestHandlerOutput[HttpResponse]] = js.native
    def handle(request: typings.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
    
    val httpAgent: js.Any = js.native
    
    val httpsAgent: js.Any = js.native
    
    @JSName("metadata")
    val metadata_NodeHttpHandler: HandlerProtocol = js.native
    
    val socketTimeout: js.Any = js.native
  }
  
  trait NodeHttpOptions extends StObject {
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      */
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    var httpsAgent: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
    
    /**
      * The maximum time in milliseconds that a socket may remain idle before it
      * is closed.
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object NodeHttpOptions {
    
    @scala.inline
    def apply(): NodeHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttpOptions]
    }
    
    @scala.inline
    implicit class NodeHttpOptionsMutableBuilder[Self <: NodeHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
