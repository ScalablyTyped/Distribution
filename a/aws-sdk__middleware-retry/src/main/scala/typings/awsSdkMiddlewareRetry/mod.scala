package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategyOptions
import typings.awsSdkMiddlewareRetry.distTypesConfigurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareRetry.distTypesConfigurationsMod.RetryInputConfig
import typings.awsSdkMiddlewareRetry.distTypesConfigurationsMod.RetryResolvedConfig
import typings.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategyOptions
import typings.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesShapesMod.SdkError
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "AdaptiveRetryStrategy")
  @js.native
  open class AdaptiveRetryStrategy protected ()
    extends typings.awsSdkMiddlewareRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: AdaptiveRetryStrategyOptions) = this()
  }
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_MAX_ATTEMPTS")
  @js.native
  val ENV_MAX_ATTEMPTS: /* "AWS_MAX_ATTEMPTS" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "ENV_RETRY_MODE")
  @js.native
  val ENV_RETRY_MODE: /* "AWS_RETRY_MODE" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_MAX_ATTEMPT_CONFIG_OPTIONS")
  @js.native
  val NODE_MAX_ATTEMPT_CONFIG_OPTIONS: LoadedConfigSelectors[Double] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "NODE_RETRY_MODE_CONFIG_OPTIONS")
  @js.native
  val NODE_RETRY_MODE_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "StandardRetryStrategy")
  @js.native
  open class StandardRetryStrategy protected ()
    extends typings.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
  }
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def defaultRetryDecider(error: SdkError): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getOmitRetryHeadersPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOmitRetryHeadersPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def getRetryAfterHint(response: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryAfterHint")(response.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def getRetryPlugin(options: RetryResolvedConfig): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def omitRetryHeadersMiddleware(): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitRetryHeadersMiddleware")().asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry", "omitRetryHeadersMiddlewareOptions")
  @js.native
  val omitRetryHeadersMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  inline def resolveRetryConfig[T](input: T & PreviouslyResolved & RetryInputConfig): T & RetryResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRetryConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & RetryResolvedConfig]
  
  inline def retryMiddleware(options: RetryResolvedConfig): js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions & AbsoluteLocation = js.native
}
