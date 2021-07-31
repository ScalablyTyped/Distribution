package typings.awsSdkMiddlewareUserAgent

import typings.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", "getUserAgentMiddlewareOptions")
  @js.native
  val getUserAgentMiddlewareOptions: BuildHandlerOptions = js.native
  
  @scala.inline
  def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgentPlugin")(config.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function1[/* next */ BuildHandler[js.Any, js.Any], BuildHandler[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* next */ BuildHandler[js.Any, js.Any], BuildHandler[js.Any, js.Any]]]
}
