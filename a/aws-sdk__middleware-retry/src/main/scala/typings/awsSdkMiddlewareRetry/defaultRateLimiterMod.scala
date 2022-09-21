package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.typesMod.RateLimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultRateLimiterMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/DefaultRateLimiter", "DefaultRateLimiter")
  @js.native
  open class DefaultRateLimiter ()
    extends StObject
       with RateLimiter {
    def this(options: DefaultRateLimiterOptions) = this()
    
    /* private */ var acquireTokenBucket: Any = js.native
    
    /* private */ var beta: Any = js.native
    
    /* private */ var calculateTimeWindow: Any = js.native
    
    /* private */ var cubicSuccess: Any = js.native
    
    /* private */ var cubicThrottle: Any = js.native
    
    /* private */ var currentCapacity: Any = js.native
    
    /* private */ var enableTokenBucket: Any = js.native
    
    /* private */ var enabled: Any = js.native
    
    /* private */ var fillRate: Any = js.native
    
    /* private */ var getCurrentTimeInSeconds: Any = js.native
    
    /* private */ var getPrecise: Any = js.native
    
    /**
      * If there is sufficient capacity (tokens) available, it immediately returns.
      * If there is not sufficient capacity, it will either sleep a certain amount
      * of time until the rate limiter can retrieve a token from its token bucket
      * or raise an exception indicating there is insufficient capacity.
      */
    /* CompleteClass */
    override def getSendToken(): js.Promise[Unit] = js.native
    
    /* private */ var lastMaxRate: Any = js.native
    
    /* private */ var lastThrottleTime: Any = js.native
    
    /* private */ var lastTimestamp: Any = js.native
    
    /* private */ var lastTxRateBucket: Any = js.native
    
    /* private */ var maxCapacity: Any = js.native
    
    /* private */ var measuredTxRate: Any = js.native
    
    /* private */ var minCapacity: Any = js.native
    
    /* private */ var minFillRate: Any = js.native
    
    /* private */ var refillTokenBucket: Any = js.native
    
    /* private */ var requestCount: Any = js.native
    
    /* private */ var scaleConstant: Any = js.native
    
    /* private */ var smooth: Any = js.native
    
    /* private */ var timeWindow: Any = js.native
    
    /**
      * Updates the client sending rate based on response.
      * If the response was successful, the capacity and fill rate are increased.
      * If the response was a throttling response, the capacity and fill rate are
      * decreased. Transient errors do not affect the rate limiter.
      */
    /* CompleteClass */
    override def updateClientSendingRate(response: Any): Unit = js.native
    
    /* private */ var updateMeasuredRate: Any = js.native
    
    /* private */ var updateTokenBucketRate: Any = js.native
  }
  
  trait DefaultRateLimiterOptions extends StObject {
    
    var beta: js.UndefOr[Double] = js.undefined
    
    var minCapacity: js.UndefOr[Double] = js.undefined
    
    var minFillRate: js.UndefOr[Double] = js.undefined
    
    var scaleConstant: js.UndefOr[Double] = js.undefined
    
    var smooth: js.UndefOr[Double] = js.undefined
  }
  object DefaultRateLimiterOptions {
    
    inline def apply(): DefaultRateLimiterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRateLimiterOptions]
    }
    
    extension [Self <: DefaultRateLimiterOptions](x: Self) {
      
      inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setMinCapacity(value: Double): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      inline def setMinCapacityUndefined: Self = StObject.set(x, "minCapacity", js.undefined)
      
      inline def setMinFillRate(value: Double): Self = StObject.set(x, "minFillRate", value.asInstanceOf[js.Any])
      
      inline def setMinFillRateUndefined: Self = StObject.set(x, "minFillRate", js.undefined)
      
      inline def setScaleConstant(value: Double): Self = StObject.set(x, "scaleConstant", value.asInstanceOf[js.Any])
      
      inline def setScaleConstantUndefined: Self = StObject.set(x, "scaleConstant", js.undefined)
      
      inline def setSmooth(value: Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
