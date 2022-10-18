package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.distTypesConfigurationsMod.RetryResolvedConfig
import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRetryMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/retryMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRetryPlugin(options: RetryResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def retryMiddleware(options: RetryResolvedConfig): js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/retryMiddleware", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions & AbsoluteLocation = js.native
}
