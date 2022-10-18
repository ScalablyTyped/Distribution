package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareUserAgent.distTypesConfigurationsMod.UserAgentInputConfig
import typings.awsSdkMiddlewareUserAgent.distTypesConfigurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-user-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent", "getUserAgentMiddlewareOptions")
  @js.native
  val getUserAgentMiddlewareOptions: BuildHandlerOptions & AbsoluteLocation = js.native
  
  inline def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def resolveUserAgentConfig[T](input: T & PreviouslyResolved & UserAgentInputConfig): T & UserAgentResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgentConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & UserAgentResolvedConfig]
  
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
