package typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod

import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineResponse extends StObject {
  
  /**
    * BROWSER ONLY
    *
    * The response body as a browser Blob.
    * Always undefined in node.js.
    */
  var blobBody: js.UndefOr[js.Promise[Blob]] = js.undefined
  
  /**
    * The response body as text (string format)
    */
  var bodyAsText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * BROWSER ONLY
    *
    * The response body as a browser ReadableStream.
    * Always undefined in node.js.
    */
  var browserStreamBody: js.UndefOr[ReadableStream[js.typedarray.Uint8Array]] = js.undefined
  
  /**
    * The HTTP response headers.
    */
  var headers: HttpHeaders
  
  /**
    * NODEJS ONLY
    *
    * The response body as a node.js Readable stream.
    * Always undefined in the browser.
    */
  var readableStreamBody: js.UndefOr[typings.node.NodeJS.ReadableStream] = js.undefined
  
  /**
    * The request that generated this response.
    */
  var request: PipelineRequest
  
  /**
    * The HTTP status code of the response.
    */
  var status: Double
}
object PipelineResponse {
  
  inline def apply(headers: HttpHeaders, request: PipelineRequest, status: Double): PipelineResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setBlobBody(value: js.Promise[Blob]): Self = StObject.set(x, "blobBody", value.asInstanceOf[js.Any])
    
    inline def setBlobBodyUndefined: Self = StObject.set(x, "blobBody", js.undefined)
    
    inline def setBodyAsText(value: String): Self = StObject.set(x, "bodyAsText", value.asInstanceOf[js.Any])
    
    inline def setBodyAsTextNull: Self = StObject.set(x, "bodyAsText", null)
    
    inline def setBodyAsTextUndefined: Self = StObject.set(x, "bodyAsText", js.undefined)
    
    inline def setBrowserStreamBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "browserStreamBody", value.asInstanceOf[js.Any])
    
    inline def setBrowserStreamBodyUndefined: Self = StObject.set(x, "browserStreamBody", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setReadableStreamBody(value: typings.node.NodeJS.ReadableStream): Self = StObject.set(x, "readableStreamBody", value.asInstanceOf[js.Any])
    
    inline def setReadableStreamBodyUndefined: Self = StObject.set(x, "readableStreamBody", js.undefined)
    
    inline def setRequest(value: PipelineRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
