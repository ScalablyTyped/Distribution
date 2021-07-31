package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.configurationsMod.RetryResolvedConfig
import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRetryPlugin(options: RetryResolvedConfig): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  @scala.inline
  def retryMiddleware(options: RetryResolvedConfig): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/retryMiddleware", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions & AbsoluteLocation = js.native
}
