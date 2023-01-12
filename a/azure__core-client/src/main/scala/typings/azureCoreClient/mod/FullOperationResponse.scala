package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpHeaders
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelineResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullOperationResponse
  extends StObject
     with PipelineResponse {
  
  /**
    * The response body as parsed JSON or XML.
    */
  var parsedBody: js.UndefOr[Any] = js.undefined
  
  /**
    * The parsed HTTP response headers.
    */
  var parsedHeaders: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * The request that generated the response.
    */
  @JSName("request")
  var request_FullOperationResponse: OperationRequest
}
object FullOperationResponse {
  
  inline def apply(headers: HttpHeaders, request: OperationRequest, status: Double): FullOperationResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullOperationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullOperationResponse] (val x: Self) extends AnyVal {
    
    inline def setParsedBody(value: Any): Self = StObject.set(x, "parsedBody", value.asInstanceOf[js.Any])
    
    inline def setParsedBodyUndefined: Self = StObject.set(x, "parsedBody", js.undefined)
    
    inline def setParsedHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "parsedHeaders", value.asInstanceOf[js.Any])
    
    inline def setParsedHeadersUndefined: Self = StObject.set(x, "parsedHeaders", js.undefined)
    
    inline def setRequest(value: OperationRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
