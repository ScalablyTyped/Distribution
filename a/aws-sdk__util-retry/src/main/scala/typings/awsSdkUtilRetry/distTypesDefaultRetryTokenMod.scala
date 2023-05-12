package typings.awsSdkUtilRetry

import typings.awsSdkTypes.distTypesRetryMod.StandardRetryBackoffStrategy
import typings.awsSdkTypes.distTypesRetryMod.StandardRetryToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultRetryTokenMod {
  
  @JSImport("@aws-sdk/util-retry/dist-types/defaultRetryToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultRetryToken(initialRetryTokens: Double, initialRetryDelay: Double): StandardRetryToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryToken")(initialRetryTokens.asInstanceOf[js.Any], initialRetryDelay.asInstanceOf[js.Any])).asInstanceOf[StandardRetryToken]
  inline def getDefaultRetryToken(initialRetryTokens: Double, initialRetryDelay: Double, initialRetryCount: Double): StandardRetryToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryToken")(initialRetryTokens.asInstanceOf[js.Any], initialRetryDelay.asInstanceOf[js.Any], initialRetryCount.asInstanceOf[js.Any])).asInstanceOf[StandardRetryToken]
  inline def getDefaultRetryToken(
    initialRetryTokens: Double,
    initialRetryDelay: Double,
    initialRetryCount: Double,
    options: DefaultRetryTokenOptions
  ): StandardRetryToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryToken")(initialRetryTokens.asInstanceOf[js.Any], initialRetryDelay.asInstanceOf[js.Any], initialRetryCount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StandardRetryToken]
  inline def getDefaultRetryToken(
    initialRetryTokens: Double,
    initialRetryDelay: Double,
    initialRetryCount: Unit,
    options: DefaultRetryTokenOptions
  ): StandardRetryToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryToken")(initialRetryTokens.asInstanceOf[js.Any], initialRetryDelay.asInstanceOf[js.Any], initialRetryCount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StandardRetryToken]
  
  trait DefaultRetryTokenOptions extends StObject {
    
    /**
      *
      */
    var retryBackoffStrategy: js.UndefOr[StandardRetryBackoffStrategy] = js.undefined
    
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
  object DefaultRetryTokenOptions {
    
    inline def apply(): DefaultRetryTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRetryTokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultRetryTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setRetryBackoffStrategy(value: StandardRetryBackoffStrategy): Self = StObject.set(x, "retryBackoffStrategy", value.asInstanceOf[js.Any])
      
      inline def setRetryBackoffStrategyUndefined: Self = StObject.set(x, "retryBackoffStrategy", js.undefined)
      
      inline def setRetryCost(value: Double): Self = StObject.set(x, "retryCost", value.asInstanceOf[js.Any])
      
      inline def setRetryCostUndefined: Self = StObject.set(x, "retryCost", js.undefined)
      
      inline def setTimeoutRetryCost(value: Double): Self = StObject.set(x, "timeoutRetryCost", value.asInstanceOf[js.Any])
      
      inline def setTimeoutRetryCostUndefined: Self = StObject.set(x, "timeoutRetryCost", js.undefined)
    }
  }
}
