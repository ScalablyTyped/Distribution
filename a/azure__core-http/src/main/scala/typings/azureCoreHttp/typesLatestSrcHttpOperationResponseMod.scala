package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.typesLatestSrcHttpHeadersMod.HttpHeadersLike
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcHttpOperationResponseMod {
  
  trait HttpOperationResponse
    extends StObject
       with HttpResponse {
    
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
      * The response body as parsed JSON or XML
      */
    var parsedBody: js.UndefOr[Any] = js.undefined
    
    /**
      * The parsed HTTP response headers.
      */
    var parsedHeaders: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * NODEJS ONLY
      *
      * The response body as a node.js Readable stream.
      * Always undefined in the browser.
      */
    var readableStreamBody: js.UndefOr[ReadableStream] = js.undefined
  }
  object HttpOperationResponse {
    
    inline def apply(headers: HttpHeadersLike, request: WebResourceLike, status: Double): HttpOperationResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpOperationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpOperationResponse] (val x: Self) extends AnyVal {
      
      inline def setBlobBody(value: js.Promise[Blob]): Self = StObject.set(x, "blobBody", value.asInstanceOf[js.Any])
      
      inline def setBlobBodyUndefined: Self = StObject.set(x, "blobBody", js.undefined)
      
      inline def setBodyAsText(value: String): Self = StObject.set(x, "bodyAsText", value.asInstanceOf[js.Any])
      
      inline def setBodyAsTextNull: Self = StObject.set(x, "bodyAsText", null)
      
      inline def setBodyAsTextUndefined: Self = StObject.set(x, "bodyAsText", js.undefined)
      
      inline def setParsedBody(value: Any): Self = StObject.set(x, "parsedBody", value.asInstanceOf[js.Any])
      
      inline def setParsedBodyUndefined: Self = StObject.set(x, "parsedBody", js.undefined)
      
      inline def setParsedHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "parsedHeaders", value.asInstanceOf[js.Any])
      
      inline def setParsedHeadersUndefined: Self = StObject.set(x, "parsedHeaders", js.undefined)
      
      inline def setReadableStreamBody(value: ReadableStream): Self = StObject.set(x, "readableStreamBody", value.asInstanceOf[js.Any])
      
      inline def setReadableStreamBodyUndefined: Self = StObject.set(x, "readableStreamBody", js.undefined)
    }
  }
  
  trait HttpResponse extends StObject {
    
    /**
      * The HTTP response headers.
      */
    var headers: HttpHeadersLike
    
    /**
      * The raw request
      */
    var request: WebResourceLike
    
    /**
      * The HTTP response status (e.g. 200)
      */
    var status: Double
  }
  object HttpResponse {
    
    inline def apply(headers: HttpHeadersLike, request: WebResourceLike, status: Double): HttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: HttpHeadersLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: WebResourceLike): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestResponse
    extends StObject
       with /**
    * May contain other properties.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * The underlying HTTP response containing both raw and deserialized response data.
      */
    var _response: HttpOperationResponse
  }
  object RestResponse {
    
    inline def apply(_response: HttpOperationResponse): RestResponse = {
      val __obj = js.Dynamic.literal(_response = _response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestResponse] (val x: Self) extends AnyVal {
      
      inline def set_response(value: HttpOperationResponse): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
    }
  }
}
