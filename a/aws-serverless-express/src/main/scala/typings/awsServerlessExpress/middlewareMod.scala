package typings.awsServerlessExpress

import typings.awsLambda.handlerMod.Context
import typings.awsServerlessExpress.anon.OmitAPIGatewayProxyEventb
import typings.express.mod.RequestHandler
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("aws-serverless-express/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventContext(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventContext")().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def eventContext(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventContext")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  trait APIGateway extends StObject {
    
    var context: NonFunctionProperties[Context]
    
    var event: OmitAPIGatewayProxyEventb
  }
  object APIGateway {
    
    inline def apply(context: NonFunctionProperties[Context], event: OmitAPIGatewayProxyEventb): APIGateway = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIGateway]
    }
    
    extension [Self <: APIGateway](x: Self) {
      
      inline def setContext(value: NonFunctionProperties[Context]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: OmitAPIGatewayProxyEventb): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  type NonFunctionProperties[T] = Pick[T, NonFunctionPropertyNames[T]]
  
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  trait Options extends StObject {
    
    var deleteHeaders: js.UndefOr[Boolean] = js.undefined
    
    var reqPropKey: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeleteHeaders(value: Boolean): Self = StObject.set(x, "deleteHeaders", value.asInstanceOf[js.Any])
      
      inline def setDeleteHeadersUndefined: Self = StObject.set(x, "deleteHeaders", js.undefined)
      
      inline def setReqPropKey(value: String): Self = StObject.set(x, "reqPropKey", value.asInstanceOf[js.Any])
      
      inline def setReqPropKeyUndefined: Self = StObject.set(x, "reqPropKey", js.undefined)
    }
  }
  
  /* augmented module */
  object httpAugmentingMod {
    
    trait IncomingMessage extends StObject {
      
      var apiGateway: js.UndefOr[APIGateway] = js.undefined
    }
    object IncomingMessage {
      
      inline def apply(): IncomingMessage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IncomingMessage]
      }
      
      extension [Self <: IncomingMessage](x: Self) {
        
        inline def setApiGateway(value: APIGateway): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
        
        inline def setApiGatewayUndefined: Self = StObject.set(x, "apiGateway", js.undefined)
      }
    }
  }
}
