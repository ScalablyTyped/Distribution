package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.configurationsMod.RetryResolvedConfig
import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", "getRetryPlugin")
  @js.native
  def getRetryPlugin(options: RetryResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", "retryMiddleware")
  @js.native
  def retryMiddleware(options: RetryResolvedConfig): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions with AbsoluteLocation = js.native
}
