package typings.awsSdkUtilRetry

import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkUtilRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfiguredRetryStrategyMod {
  
  @JSImport("@aws-sdk/util-retry/dist-types/ConfiguredRetryStrategy", "ConfiguredRetryStrategy")
  @js.native
  open class ConfiguredRetryStrategy protected () extends StandardRetryStrategy {
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
    
    /* private */ val computeNextBackoffDelay: Any = js.native
  }
}
