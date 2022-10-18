package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryPolicyOptions extends StObject {
  
  /**
    * Logger. If it's not provided, a default logger is used.
    */
  var logger: js.UndefOr[AzureLogger] = js.undefined
  
  /**
    * Maximum number of retries. If not specified, it will limit to 3 retries.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object RetryPolicyOptions {
  
  inline def apply(): RetryPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryPolicyOptions]
  }
  
  extension [Self <: RetryPolicyOptions](x: Self) {
    
    inline def setLogger(value: AzureLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
