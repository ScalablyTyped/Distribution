package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryInformation extends StObject {
  
  /**
    * A {@link PipelineResponse}, if the last retry attempt succeeded.
    */
  var response: js.UndefOr[PipelineResponse] = js.undefined
  
  /**
    * A {@link RestError}, if the last retry attempt failed.
    */
  var responseError: js.UndefOr[RestError] = js.undefined
  
  /**
    * Total number of retries so far.
    */
  var retryCount: Double
}
object RetryInformation {
  
  inline def apply(retryCount: Double): RetryInformation = {
    val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryInformation]
  }
  
  extension [Self <: RetryInformation](x: Self) {
    
    inline def setResponse(value: PipelineResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseError(value: RestError): Self = StObject.set(x, "responseError", value.asInstanceOf[js.Any])
    
    inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
  }
}
