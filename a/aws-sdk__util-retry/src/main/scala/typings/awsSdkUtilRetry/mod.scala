package typings.awsSdkUtilRetry

import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkUtilRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategyOptions
import typings.awsSdkUtilRetry.distTypesDefaultRateLimiterMod.DefaultRateLimiterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-retry", "AdaptiveRetryStrategy")
  @js.native
  open class AdaptiveRetryStrategy protected ()
    extends typings.awsSdkUtilRetry.distTypesAdaptiveRetryStrategyMod.AdaptiveRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: AdaptiveRetryStrategyOptions) = this()
  }
  
  @JSImport("@aws-sdk/util-retry", "ConfiguredRetryStrategy")
  @js.native
  open class ConfiguredRetryStrategy protected ()
    extends typings.awsSdkUtilRetry.distTypesConfiguredRetryStrategyMod.ConfiguredRetryStrategy {
    /**
      * @param maxAttempts - the maximum number of retry attempts allowed.
      *                      e.g., if set to 3, then 4 total requests are possible.
      * @param computeNextBackoffDelay - a millisecond delay for each retry or a function that takes the retry attempt
      *                                  and returns the delay.
      *
      * @example exponential backoff.
      * ```js
      * new Client({
      *   retryStrategy: new ConfiguredRetryStrategy(3, (attempt) => attempt ** 2)
      * });
      * ```
      * @example constant delay.
      * ```js
      * new Client({
      *   retryStrategy: new ConfiguredRetryStrategy(3, 2000)
      * });
      * ```
      */
    def this(maxAttempts: Double) = this()
    def this(maxAttempts: Provider[Double]) = this()
    def this(maxAttempts: Double, computeNextBackoffDelay: js.Function1[/* retryAttempt */ Double, Double]) = this()
    def this(maxAttempts: Double, computeNextBackoffDelay: Double) = this()
    def this(
      maxAttempts: Provider[Double],
      computeNextBackoffDelay: js.Function1[/* retryAttempt */ Double, Double]
    ) = this()
    def this(maxAttempts: Provider[Double], computeNextBackoffDelay: Double) = this()
  }
  
  @JSImport("@aws-sdk/util-retry", "DEFAULT_MAX_ATTEMPTS")
  @js.native
  val DEFAULT_MAX_ATTEMPTS: /* 3 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "DEFAULT_RETRY_DELAY_BASE")
  @js.native
  val DEFAULT_RETRY_DELAY_BASE: /* 100 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "DEFAULT_RETRY_MODE")
  @js.native
  val DEFAULT_RETRY_MODE: String | Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "DefaultRateLimiter")
  @js.native
  open class DefaultRateLimiter ()
    extends typings.awsSdkUtilRetry.distTypesDefaultRateLimiterMod.DefaultRateLimiter {
    def this(options: DefaultRateLimiterOptions) = this()
  }
  
  @JSImport("@aws-sdk/util-retry", "INITIAL_RETRY_TOKENS")
  @js.native
  val INITIAL_RETRY_TOKENS: /* 500 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "INVOCATION_ID_HEADER")
  @js.native
  val INVOCATION_ID_HEADER: /* "amz-sdk-invocation-id" */ String = js.native
  
  @JSImport("@aws-sdk/util-retry", "MAXIMUM_RETRY_DELAY")
  @js.native
  val MAXIMUM_RETRY_DELAY: Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "NO_RETRY_INCREMENT")
  @js.native
  val NO_RETRY_INCREMENT: /* 1 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "REQUEST_HEADER")
  @js.native
  val REQUEST_HEADER: /* "amz-sdk-request" */ String = js.native
  
  @JSImport("@aws-sdk/util-retry", "RETRY_COST")
  @js.native
  val RETRY_COST: /* 5 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "RETRY_MODES")
  @js.native
  object RETRY_MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkUtilRetry.distTypesConfigMod.RETRY_MODES & String] = js.native
    
    /* "adaptive" */ val ADAPTIVE: typings.awsSdkUtilRetry.distTypesConfigMod.RETRY_MODES.ADAPTIVE & String = js.native
    
    /* "standard" */ val STANDARD: typings.awsSdkUtilRetry.distTypesConfigMod.RETRY_MODES.STANDARD & String = js.native
  }
  
  @JSImport("@aws-sdk/util-retry", "StandardRetryStrategy")
  @js.native
  open class StandardRetryStrategy protected ()
    extends typings.awsSdkUtilRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttempts: Double) = this()
  }
  
  @JSImport("@aws-sdk/util-retry", "THROTTLING_RETRY_DELAY_BASE")
  @js.native
  val THROTTLING_RETRY_DELAY_BASE: /* 500 */ Double = js.native
  
  @JSImport("@aws-sdk/util-retry", "TIMEOUT_RETRY_COST")
  @js.native
  val TIMEOUT_RETRY_COST: /* 10 */ Double = js.native
}
