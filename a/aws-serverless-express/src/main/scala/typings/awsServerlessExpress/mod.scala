package typings.awsServerlessExpress

import org.scalablytyped.runtime.Instantiable1
import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.handlerMod.Context
import typings.awsServerlessExpress.awsServerlessExpressStrings.CALLBACK
import typings.awsServerlessExpress.awsServerlessExpressStrings.CONTEXT_SUCCEED
import typings.awsServerlessExpress.awsServerlessExpressStrings.PROMISE
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-serverless-express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit]
  ): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any]).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  inline def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit],
    serverListenCallback: js.Function0[Any]
  ): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any])).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  inline def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit],
    serverListenCallback: js.Function0[Any],
    binaryMimeTypes: js.Array[String]
  ): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any], binaryMimeTypes.asInstanceOf[js.Any])).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  inline def createServer(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse[IncomingMessage], Unit],
    serverListenCallback: Unit,
    binaryMimeTypes: js.Array[String]
  ): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(requestListener.asInstanceOf[js.Any], serverListenCallback.asInstanceOf[js.Any], binaryMimeTypes.asInstanceOf[js.Any])).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  
  inline def proxy(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    event: APIGatewayProxyEvent,
    context: Context
  ): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]]
  inline def proxy(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CONTEXT_SUCCEED | PROMISE
  ): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  
  inline def proxy_CALLBACK(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CALLBACK
  ): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  inline def proxy_CALLBACK(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    event: APIGatewayProxyEvent,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ Any, /* response */ Response, Unit]
  ): ProxyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(server.asInstanceOf[js.Any], event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ProxyResult]
  
  trait ProxyResult extends StObject {
    
    var promise: js.Promise[Response]
  }
  object ProxyResult {
    
    inline def apply(promise: js.Promise[Response]): ProxyResult = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyResult]
    }
    
    extension [Self <: ProxyResult](x: Self) {
      
      inline def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var body: String
    
    var statusCode: Double
  }
  object Response {
    
    inline def apply(body: String, statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
