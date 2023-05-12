package typings.awsSdkUtilRetry

import typings.awsSdkTypes.distTypesRetryMod.RetryErrorInfo
import typings.awsSdkTypes.distTypesRetryMod.RetryStrategyV2
import typings.awsSdkTypes.distTypesRetryMod.RetryToken
import typings.awsSdkTypes.distTypesRetryMod.StandardRetryToken
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.awsSdkUtilRetry.distTypesTypesMod.RateLimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptiveRetryStrategyMod {
  
  @JSImport("@aws-sdk/util-retry/dist-types/AdaptiveRetryStrategy", "AdaptiveRetryStrategy")
  @js.native
  open class AdaptiveRetryStrategy protected ()
    extends StObject
       with RetryStrategyV2 {
    def this(maxAttemptsProvider: Provider[Double]) = this()
    def this(maxAttemptsProvider: Provider[Double], options: AdaptiveRetryStrategyOptions) = this()
    
    /**
      * Called before any retries (for the first call to the operation). It either
      * returns a retry token or an error upon the failure to acquire a token prior.
      *
      * tokenScope is arbitrary and out of scope for this component. However,
      * adding it here offers us a lot of future flexibility for outage detection.
      * For example, it could be "us-east-1" on a shared retry strategy, or
      * "us-west-2-c:dynamodb".
      */
    /* CompleteClass */
    override def acquireInitialRetryToken(retryTokenScope: String): js.Promise[RetryToken] = js.native
    
    /* private */ val maxAttemptsProvider: Any = js.native
    
    val mode: String = js.native
    
    /* private */ var rateLimiter: Any = js.native
    
    /**
      * Upon successful completion of the operation, this function is called
      * to record that the operation was successful.
      */
    /* CompleteClass */
    override def recordSuccess(token: RetryToken): Unit = js.native
    def recordSuccess(token: StandardRetryToken): Unit = js.native
    
    /**
      * After a failed operation call, this function is invoked to refresh the
      * retryToken returned by acquireInitialRetryToken(). This function can
      * either choose to allow another retry and send a new or updated token,
      * or reject the retry attempt and report the error either in an exception
      * or returning an error.
      */
    /* CompleteClass */
    override def refreshRetryTokenForRetry(tokenToRenew: RetryToken, errorInfo: RetryErrorInfo): js.Promise[RetryToken] = js.native
    def refreshRetryTokenForRetry(tokenToRenew: StandardRetryToken, errorInfo: RetryErrorInfo): js.Promise[RetryToken] = js.native
    
    /* private */ var standardRetryStrategy: Any = js.native
  }
  
  trait AdaptiveRetryStrategyOptions extends StObject {
    
    var rateLimiter: js.UndefOr[RateLimiter] = js.undefined
  }
  object AdaptiveRetryStrategyOptions {
    
    inline def apply(): AdaptiveRetryStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdaptiveRetryStrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdaptiveRetryStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setRateLimiter(value: RateLimiter): Self = StObject.set(x, "rateLimiter", value.asInstanceOf[js.Any])
      
      inline def setRateLimiterUndefined: Self = StObject.set(x, "rateLimiter", js.undefined)
    }
  }
}
