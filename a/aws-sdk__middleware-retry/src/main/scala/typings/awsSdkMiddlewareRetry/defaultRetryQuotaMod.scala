package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.typesMod.RetryQuota
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultRetryQuotaMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/defaultRetryQuota", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultRetryQuota(initialRetryTokens: Double): RetryQuota = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryQuota")(initialRetryTokens.asInstanceOf[js.Any]).asInstanceOf[RetryQuota]
  inline def getDefaultRetryQuota(initialRetryTokens: Double, options: DefaultRetryQuotaOptions): RetryQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryQuota")(initialRetryTokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RetryQuota]
  
  trait DefaultRetryQuotaOptions extends StObject {
    
    /**
      * The total amount of retry token to be incremented from retry token balance
      * if an SDK operation invocation succeeds without requiring a retry request.
      */
    var noRetryIncrement: js.UndefOr[Double] = js.undefined
    
    /**
      * The total amount of retry tokens to be decremented from retry token balance.
      */
    var retryCost: js.UndefOr[Double] = js.undefined
    
    /**
      * The total amount of retry tokens to be decremented from retry token balance
      * when a throttling error is encountered.
      */
    var timeoutRetryCost: js.UndefOr[Double] = js.undefined
  }
  object DefaultRetryQuotaOptions {
    
    inline def apply(): DefaultRetryQuotaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRetryQuotaOptions]
    }
    
    extension [Self <: DefaultRetryQuotaOptions](x: Self) {
      
      inline def setNoRetryIncrement(value: Double): Self = StObject.set(x, "noRetryIncrement", value.asInstanceOf[js.Any])
      
      inline def setNoRetryIncrementUndefined: Self = StObject.set(x, "noRetryIncrement", js.undefined)
      
      inline def setRetryCost(value: Double): Self = StObject.set(x, "retryCost", value.asInstanceOf[js.Any])
      
      inline def setRetryCostUndefined: Self = StObject.set(x, "retryCost", js.undefined)
      
      inline def setTimeoutRetryCost(value: Double): Self = StObject.set(x, "timeoutRetryCost", value.asInstanceOf[js.Any])
      
      inline def setTimeoutRetryCostUndefined: Self = StObject.set(x, "timeoutRetryCost", js.undefined)
    }
  }
}
