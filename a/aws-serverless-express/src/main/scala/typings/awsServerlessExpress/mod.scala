package typings.awsServerlessExpress

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.handlerMod.Context
import typings.awsServerlessExpress.awsServerlessExpressStrings.CALLBACK
import typings.awsServerlessExpress.awsServerlessExpressStrings.CONTEXT_SUCCEED
import typings.awsServerlessExpress.awsServerlessExpressStrings.PROMISE
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-serverless-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any]).asInstanceOf[Server]
  @scala.inline
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[js.Any]
  ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[js.Any],
    binaryMimeTypes: js.Array[String]
  ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any], binaryMimeTypes.asInstanceOf[js.Any])).asInstanceOf[Server]
  @scala.inline
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: Unit,
    binaryMimeTypes: js.Array[String]
  ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any], binaryMimeTypes.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @scala.inline
  def proxy(server: Server, event: APIGatewayProxyEvent, context: Context): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @scala.inline
  def proxy_CALLBACK(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CALLBACK): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  @scala.inline
  def proxy_CALLBACK(
    server: Server,
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, Unit]
  ): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  
  @scala.inline
  def proxy_CONTEXTSUCCEED(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CONTEXT_SUCCEED): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  
  @scala.inline
  def proxy_PROMISE(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: PROMISE): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  
  trait ProxyResult extends StObject {
    
    var promise: js.Promise[Response]
  }
  object ProxyResult {
    
    @scala.inline
    def apply(promise: js.Promise[Response]): ProxyResult = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyResult]
    }
    
    @scala.inline
    implicit class ProxyResultMutableBuilder[Self <: ProxyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var body: String
    
    var statusCode: Double
  }
  object Response {
    
    @scala.inline
    def apply(body: String, statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
