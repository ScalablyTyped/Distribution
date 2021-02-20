package typings.awsSdkMiddlewareHostHeader

import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.transferMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-host-header", "getHostHeaderPlugin")
  @js.native
  def getHostHeaderPlugin(options: HostHeaderResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-host-header", "hostHeaderMiddleware")
  @js.native
  def hostHeaderMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: HostHeaderResolvedConfig): BuildMiddleware[Input, Output] = js.native
  
  @JSImport("@aws-sdk/middleware-host-header", "hostHeaderMiddlewareOptions")
  @js.native
  val hostHeaderMiddlewareOptions: BuildHandlerOptions with AbsoluteLocation = js.native
  
  @JSImport("@aws-sdk/middleware-host-header", "resolveHostHeaderConfig")
  @js.native
  def resolveHostHeaderConfig[T](input: T with PreviouslyResolved with HostHeaderInputConfig): T with HostHeaderResolvedConfig = js.native
  
  @js.native
  trait HostHeaderInputConfig extends StObject
  
  @js.native
  trait HostHeaderResolvedConfig extends StObject {
    
    var requestHandler: RequestHandler[_, _, js.Object] = js.native
  }
  object HostHeaderResolvedConfig {
    
    @scala.inline
    def apply(requestHandler: RequestHandler[_, _, js.Object]): HostHeaderResolvedConfig = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostHeaderResolvedConfig]
    }
    
    @scala.inline
    implicit class HostHeaderResolvedConfigMutableBuilder[Self <: HostHeaderResolvedConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[_, _, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreviouslyResolved extends StObject {
    
    var requestHandler: RequestHandler[_, _, js.Object] = js.native
  }
  object PreviouslyResolved {
    
    @scala.inline
    def apply(requestHandler: RequestHandler[_, _, js.Object]): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit class PreviouslyResolvedMutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestHandler(value: RequestHandler[_, _, js.Object]): Self = StObject.set(x, "requestHandler", value.asInstanceOf[js.Any])
    }
  }
}
