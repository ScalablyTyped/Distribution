package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import typings.azureLogger.mod.AzureLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryStrategy extends StObject {
  
  /**
    * Logger. If it's not provided, a default logger for all retry strategies is used.
    */
  var logger: js.UndefOr[AzureLogger] = js.undefined
  
  /**
    * Name of the retry strategy. Used for logging.
    */
  var name: String
  
  /**
    * Function that determines how to proceed with the subsequent requests.
    * @param state - Retry state
    */
  def retry(state: RetryInformation): RetryModifiers
}
object RetryStrategy {
  
  inline def apply(name: String, retry: RetryInformation => RetryModifiers): RetryStrategy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], retry = js.Any.fromFunction1(retry))
    __obj.asInstanceOf[RetryStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryStrategy] (val x: Self) extends AnyVal {
    
    inline def setLogger(value: AzureLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: RetryInformation => RetryModifiers): Self = StObject.set(x, "retry", js.Any.fromFunction1(value))
  }
}
