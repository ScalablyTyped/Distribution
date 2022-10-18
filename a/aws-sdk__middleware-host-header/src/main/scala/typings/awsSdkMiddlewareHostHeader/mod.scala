package typings.awsSdkMiddlewareHostHeader

import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesTransferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-host-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHostHeaderPlugin(options: HostHeaderResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostHeaderPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def hostHeaderMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: HostHeaderResolvedConfig): BuildMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("hostHeaderMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-host-header", "hostHeaderMiddlewareOptions")
  @js.native
  val hostHeaderMiddlewareOptions: BuildHandlerOptions & AbsoluteLocation = js.native
  
  inline def resolveHostHeaderConfig[T](input: T & PreviouslyResolved & HostHeaderInputConfig): T & HostHeaderResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostHeaderConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & HostHeaderResolvedConfig]
  
  trait HostHeaderInputConfig extends StObject
  
  trait HostHeaderResolvedConfig extends StObject {
    
    /**
      * The HTTP handler to use. Fetch in browser and Https in Nodejs.
      */
    var requestHandler: RequestHandler[Any, Any, js.Object]
  }
  object HostHeaderResolvedConfig {
    
    inline def apply(requestHandler: RequestHandler[Any, Any, js.Object]): HostHeaderResolvedConfig = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostHeaderResolvedConfig]
    }
    
    extension [Self <: HostHeaderResolvedConfig](x: Self) {
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    var requestHandler: RequestHandler[Any, Any, js.Object]
  }
  object PreviouslyResolved {
    
    inline def apply(requestHandler: RequestHandler[Any, Any, js.Object]): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setRequestHandler(value: RequestHandler[Any, Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
}
