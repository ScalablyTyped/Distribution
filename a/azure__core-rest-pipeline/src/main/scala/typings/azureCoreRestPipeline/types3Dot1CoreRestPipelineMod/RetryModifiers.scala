package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryModifiers extends StObject {
  
  /**
    * Indicates to throw this error instead of retrying.
    */
  var errorToThrow: js.UndefOr[RestError] = js.undefined
  
  /**
    * Indicates to retry against this URL.
    */
  var redirectTo: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether to retry in a given number of milliseconds.
    * If provided, a new retry will be attempted.
    */
  var retryAfterInMs: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, allows skipping the current strategy from running on the retry policy.
    */
  var skipStrategy: js.UndefOr[Boolean] = js.undefined
}
object RetryModifiers {
  
  inline def apply(): RetryModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryModifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryModifiers] (val x: Self) extends AnyVal {
    
    inline def setErrorToThrow(value: RestError): Self = StObject.set(x, "errorToThrow", value.asInstanceOf[js.Any])
    
    inline def setErrorToThrowUndefined: Self = StObject.set(x, "errorToThrow", js.undefined)
    
    inline def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    inline def setRetryAfterInMs(value: Double): Self = StObject.set(x, "retryAfterInMs", value.asInstanceOf[js.Any])
    
    inline def setRetryAfterInMsUndefined: Self = StObject.set(x, "retryAfterInMs", js.undefined)
    
    inline def setSkipStrategy(value: Boolean): Self = StObject.set(x, "skipStrategy", value.asInstanceOf[js.Any])
    
    inline def setSkipStrategyUndefined: Self = StObject.set(x, "skipStrategy", js.undefined)
  }
}
