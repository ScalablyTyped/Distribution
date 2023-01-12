package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestErrorOptions extends StObject {
  
  /**
    * The code of the error itself (use statics on RestError if possible.)
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The request that was made.
    */
  var request: js.UndefOr[PipelineRequest] = js.undefined
  
  /**
    * The response received (if any.)
    */
  var response: js.UndefOr[PipelineResponse] = js.undefined
  
  /**
    * The HTTP status code of the request (if applicable.)
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object RestErrorOptions {
  
  inline def apply(): RestErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setRequest(value: PipelineRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: PipelineResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
