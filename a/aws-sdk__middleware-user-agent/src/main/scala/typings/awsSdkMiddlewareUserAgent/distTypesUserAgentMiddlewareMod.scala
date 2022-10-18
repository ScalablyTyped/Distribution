package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.distTypesConfigurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUserAgentMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist-types/user-agent-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent/dist-types/user-agent-middleware", "getUserAgentMiddlewareOptions")
  @js.native
  val getUserAgentMiddlewareOptions: BuildHandlerOptions & AbsoluteLocation = js.native
  
  inline def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function2[
    /* next */ BuildHandler[Any, Any], 
    /* context */ HandlerExecutionContext, 
    BuildHandler[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* next */ BuildHandler[Any, Any], 
    /* context */ HandlerExecutionContext, 
    BuildHandler[Any, Any]
  ]]
}
