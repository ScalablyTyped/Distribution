package typings.awsSdkUtilRetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait RateLimiter extends StObject {
    
    /**
      * If there is sufficient capacity (tokens) available, it immediately returns.
      * If there is not sufficient capacity, it will either sleep a certain amount
      * of time until the rate limiter can retrieve a token from its token bucket
      * or raise an exception indicating there is insufficient capacity.
      */
    def getSendToken(): js.Promise[Unit]
    
    /**
      * Updates the client sending rate based on response.
      * If the response was successful, the capacity and fill rate are increased.
      * If the response was a throttling response, the capacity and fill rate are
      * decreased. Transient errors do not affect the rate limiter.
      */
    def updateClientSendingRate(response: Any): Unit
  }
  object RateLimiter {
    
    inline def apply(getSendToken: () => js.Promise[Unit], updateClientSendingRate: Any => Unit): RateLimiter = {
      val __obj = js.Dynamic.literal(getSendToken = js.Any.fromFunction0(getSendToken), updateClientSendingRate = js.Any.fromFunction1(updateClientSendingRate))
      __obj.asInstanceOf[RateLimiter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RateLimiter] (val x: Self) extends AnyVal {
      
      inline def setGetSendToken(value: () => js.Promise[Unit]): Self = StObject.set(x, "getSendToken", js.Any.fromFunction0(value))
      
      inline def setUpdateClientSendingRate(value: Any => Unit): Self = StObject.set(x, "updateClientSendingRate", js.Any.fromFunction1(value))
    }
  }
}
