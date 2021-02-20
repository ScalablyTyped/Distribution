package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.configurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentInputConfig
import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-user-agent", "getUserAgentMiddlewareOptions")
  @js.native
  val getUserAgentMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent", "getUserAgentPlugin")
  @js.native
  def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent", "resolveUserAgentConfig")
  @js.native
  def resolveUserAgentConfig[T](input: T with PreviouslyResolved with UserAgentInputConfig): T with UserAgentResolvedConfig = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent", "userAgentMiddleware")
  @js.native
  def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function1[/* next */ BuildHandler[_, _], BuildHandler[_, _]] = js.native
}
