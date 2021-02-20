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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-serverless-express", "createServer")
  @js.native
  def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = js.native
  @JSImport("aws-serverless-express", "createServer")
  @js.native
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.UndefOr[scala.Nothing],
    binaryMimeTypes: js.Array[String]
  ): Server = js.native
  @JSImport("aws-serverless-express", "createServer")
  @js.native
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_]
  ): Server = js.native
  @JSImport("aws-serverless-express", "createServer")
  @js.native
  def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_],
    binaryMimeTypes: js.Array[String]
  ): Server = js.native
  
  @JSImport("aws-serverless-express", "proxy")
  @js.native
  def proxy(server: Server, event: APIGatewayProxyEvent, context: Context): Server = js.native
  @JSImport("aws-serverless-express", "proxy")
  @js.native
  def proxy_CALLBACK(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CALLBACK): ProxyResult = js.native
  @JSImport("aws-serverless-express", "proxy")
  @js.native
  def proxy_CALLBACK(
    server: Server,
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, Unit]
  ): ProxyResult = js.native
  @JSImport("aws-serverless-express", "proxy")
  @js.native
  def proxy_CONTEXTSUCCEED(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CONTEXT_SUCCEED): ProxyResult = js.native
  @JSImport("aws-serverless-express", "proxy")
  @js.native
  def proxy_PROMISE(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: PROMISE): ProxyResult = js.native
  
  @js.native
  trait ProxyResult extends StObject {
    
    var promise: js.Promise[Response] = js.native
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
  
  @js.native
  trait Response extends StObject {
    
    var body: String = js.native
    
    var statusCode: Double = js.native
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
