package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.configurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentInputConfig
import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-user-agent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val getUserAgentMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[_, _] = js.native
  
  def resolveUserAgentConfig[T](input: T with PreviouslyResolved with UserAgentInputConfig): T with UserAgentResolvedConfig = js.native
  
  def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function1[/* next */ BuildHandler[_, _], BuildHandler[_, _]] = js.native
}
