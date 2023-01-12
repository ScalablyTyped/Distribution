package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExponentialRetryPolicyOptions extends StObject {
  
  /**
    * The maximum number of retry attempts. Defaults to 3.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum delay in milliseconds allowed before retrying an operation. Defaults
    * to 64000 (64 seconds).
    */
  var maxRetryDelayInMs: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of delay in milliseconds between retry attempts. Defaults to 1000
    * (1 second.) The delay increases exponentially with each retry up to a maximum
    * specified by maxRetryDelayInMs.
    */
  var retryDelayInMs: js.UndefOr[Double] = js.undefined
}
object ExponentialRetryPolicyOptions {
  
  inline def apply(): ExponentialRetryPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExponentialRetryPolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExponentialRetryPolicyOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setMaxRetryDelayInMs(value: Double): Self = StObject.set(x, "maxRetryDelayInMs", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryDelayInMsUndefined: Self = StObject.set(x, "maxRetryDelayInMs", js.undefined)
    
    inline def setRetryDelayInMs(value: Double): Self = StObject.set(x, "retryDelayInMs", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayInMsUndefined: Self = StObject.set(x, "retryDelayInMs", js.undefined)
  }
}
