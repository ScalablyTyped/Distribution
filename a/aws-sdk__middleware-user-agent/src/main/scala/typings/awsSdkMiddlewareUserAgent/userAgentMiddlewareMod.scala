package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentMiddlewareMod {
  
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
