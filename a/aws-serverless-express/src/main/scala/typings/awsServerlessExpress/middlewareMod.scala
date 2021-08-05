package typings.awsServerlessExpress

import typings.awsServerlessExpress.anon.Context
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("aws-serverless-express/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventContext(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventContext")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def eventContext(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventContext")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  // tslint:disable-line:ban-types
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
      
      var apiGateway: js.UndefOr[Context] = js.undefined
    }
    object IncomingMessage {
      
      inline def apply(): IncomingMessage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IncomingMessage]
      }
      
      extension [Self <: IncomingMessage](x: Self) {
        
        inline def setApiGateway(value: Context): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
        
        inline def setApiGatewayUndefined: Self = StObject.set(x, "apiGateway", js.undefined)
      }
    }
  }
}
