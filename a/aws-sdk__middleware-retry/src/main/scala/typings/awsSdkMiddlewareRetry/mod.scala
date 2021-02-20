package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.configurationsMod.PreviouslyResolved
import typings.awsSdkMiddlewareRetry.configurationsMod.RetryInputConfig
import typings.awsSdkMiddlewareRetry.configurationsMod.RetryResolvedConfig
import typings.awsSdkMiddlewareRetry.defaultStrategyMod.StandardRetryStrategyOptions
import typings.awsSdkNodeConfigProvider.configLoaderMod.LoadedConfigSelectors
import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_MAX_ATTEMPTS")
  @js.native
  val CONFIG_MAX_ATTEMPTS: /* "max_attempts" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "CONFIG_RETRY_MODE")
  @js.native
  val CONFIG_RETRY_MODE: /* "retry_mode" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: /* "standard" */ String = js.native
  
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
  class StandardRetryStrategy protected ()
    extends typings.awsSdkMiddlewareRetry.defaultStrategyMod.StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: StandardRetryStrategyOptions) = this()
  }
  
  @JSImport("@aws-sdk/middleware-retry", "defaultDelayDecider")
  @js.native
  def defaultDelayDecider(delayBase: Double, attempts: Double): Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "defaultRetryDecider")
  @js.native
  def defaultRetryDecider(error: SdkError): Boolean = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "getRetryPlugin")
  @js.native
  def getRetryPlugin(options: RetryResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "resolveRetryConfig")
  @js.native
  def resolveRetryConfig[T](input: T with PreviouslyResolved with RetryInputConfig): T with RetryResolvedConfig = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddleware")
  @js.native
  def retryMiddleware(options: RetryResolvedConfig): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  
  @JSImport("@aws-sdk/middleware-retry", "retryMiddlewareOptions")
  @js.native
  val retryMiddlewareOptions: FinalizeRequestHandlerOptions with AbsoluteLocation = js.native
}
