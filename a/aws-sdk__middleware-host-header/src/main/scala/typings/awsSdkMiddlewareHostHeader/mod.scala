package typings.awsSdkMiddlewareHostHeader

import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-host-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getHostHeaderPlugin(options: HostHeaderResolvedConfig): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostHeaderPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def hostHeaderMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: HostHeaderResolvedConfig): BuildMiddleware[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("hostHeaderMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[BuildMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-host-header", "hostHeaderMiddlewareOptions")
  @js.native
  val hostHeaderMiddlewareOptions: BuildHandlerOptions & AbsoluteLocation = js.native
  
  @scala.inline
  def resolveHostHeaderConfig[T](input: T & PreviouslyResolved & HostHeaderInputConfig): T & HostHeaderResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveHostHeaderConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & HostHeaderResolvedConfig]
  
  trait HostHeaderInputConfig extends StObject
  
  trait HostHeaderResolvedConfig extends StObject {
    
    var requestHandler: RequestHandler[js.Any, js.Any, js.Object]
  }
  object HostHeaderResolvedConfig {
    
    @scala.inline
    def apply(requestHandler: RequestHandler[js.Any, js.Any, js.Object]): HostHeaderResolvedConfig = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostHeaderResolvedConfig]
    }
    
    @scala.inline
    implicit class HostHeaderResolvedConfigMutableBuilder[Self <: HostHeaderResolvedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[js.Any, js.Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviouslyResolved extends StObject {
    
    var requestHandler: RequestHandler[js.Any, js.Any, js.Object]
  }
  object PreviouslyResolved {
    
    @scala.inline
    def apply(requestHandler: RequestHandler[js.Any, js.Any, js.Object]): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit class PreviouslyResolvedMutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[js.Any, js.Any, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
}
