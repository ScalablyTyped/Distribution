package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@azure/core-client.@azure/core-client.FullOperationResponse, 'request' | 'headers'> */
trait CompatResponse extends StObject {
  
  var blobBody: js.UndefOr[js.Promise[Blob]] = js.undefined
  
  var bodyAsText: js.UndefOr[String | Null] = js.undefined
  
  var browserStreamBody: js.UndefOr[ReadableStream[js.typedarray.Uint8Array]] = js.undefined
  
  /**
    * A collection of HTTP header key/value pairs.
    */
  var headers: HttpHeadersLike
  
  var parsedBody: js.UndefOr[Any] = js.undefined
  
  var parsedHeaders: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var readableStreamBody: js.UndefOr[typings.node.NodeJS.ReadableStream] = js.undefined
  
  /**
    * A description of a HTTP request to be made to a remote server.
    */
  var request: WebResourceLike
  
  var status: Double
}
object CompatResponse {
  
  inline def apply(headers: HttpHeadersLike, request: WebResourceLike, status: Double): CompatResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatResponse] (val x: Self) extends AnyVal {
    
    inline def setBlobBody(value: js.Promise[Blob]): Self = StObject.set(x, "blobBody", value.asInstanceOf[js.Any])
    
    inline def setBlobBodyUndefined: Self = StObject.set(x, "blobBody", js.undefined)
    
    inline def setBodyAsText(value: String): Self = StObject.set(x, "bodyAsText", value.asInstanceOf[js.Any])
    
    inline def setBodyAsTextNull: Self = StObject.set(x, "bodyAsText", null)
    
    inline def setBodyAsTextUndefined: Self = StObject.set(x, "bodyAsText", js.undefined)
    
    inline def setBrowserStreamBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "browserStreamBody", value.asInstanceOf[js.Any])
    
    inline def setBrowserStreamBodyUndefined: Self = StObject.set(x, "browserStreamBody", js.undefined)
    
    inline def setHeaders(value: HttpHeadersLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setParsedBody(value: Any): Self = StObject.set(x, "parsedBody", value.asInstanceOf[js.Any])
    
    inline def setParsedBodyUndefined: Self = StObject.set(x, "parsedBody", js.undefined)
    
    inline def setParsedHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "parsedHeaders", value.asInstanceOf[js.Any])
    
    inline def setParsedHeadersUndefined: Self = StObject.set(x, "parsedHeaders", js.undefined)
    
    inline def setReadableStreamBody(value: typings.node.NodeJS.ReadableStream): Self = StObject.set(x, "readableStreamBody", value.asInstanceOf[js.Any])
    
    inline def setReadableStreamBodyUndefined: Self = StObject.set(x, "readableStreamBody", js.undefined)
    
    inline def setRequest(value: WebResourceLike): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
