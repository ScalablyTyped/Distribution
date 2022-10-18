package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategy
import typings.awsSdkMiddlewareRetry.distTypesStandardRetryStrategyMod.StandardRetryStrategyOptions
import typings.awsSdkMiddlewareRetry.distTypesTypesMod.RateLimiter
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptiveRetryStrategyMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/AdaptiveRetryStrategy", "AdaptiveRetryStrategy")
  @js.native
  open class AdaptiveRetryStrategy protected () extends StandardRetryStrategy {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: AdaptiveRetryStrategyOptions) = this()
    
    /* private */ var rateLimiter: Any = js.native
  }
  
  trait AdaptiveRetryStrategyOptions
    extends StObject
       with StandardRetryStrategyOptions {
    
    var rateLimiter: js.UndefOr[RateLimiter] = js.undefined
  }
  object AdaptiveRetryStrategyOptions {
    
    inline def apply(): AdaptiveRetryStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdaptiveRetryStrategyOptions]
    }
    
    extension [Self <: AdaptiveRetryStrategyOptions](x: Self) {
      
      inline def setRateLimiter(value: RateLimiter): Self = StObject.set(x, "rateLimiter", value.asInstanceOf[js.Any])
      
      inline def setRateLimiterUndefined: Self = StObject.set(x, "rateLimiter", js.undefined)
    }
  }
}
