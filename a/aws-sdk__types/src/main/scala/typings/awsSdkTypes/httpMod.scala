package typings.awsSdkTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  trait Endpoint extends StObject {
    
    var hostname: String
    
    var path: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object Endpoint {
    
    inline def apply(hostname: String, path: String, protocol: String): Endpoint = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type HeaderBag = StringDictionary[String]
  
  @js.native
  trait Headers
    extends StObject
       with Map[String, String] {
    
    /**
      * Returns a new instance of Headers with the specified header set to the
      * provided value. Does not modify the original Headers instance.
      *
      * @param headerName    The name of the header to add or overwrite
      * @param headerValue   The value to which the header should be set
      */
    def withHeader(headerName: String, headerValue: String): Headers = js.native
    
    /**
      * Returns a new instance of Headers without the specified header. Does not
      * modify the original Headers instance.
      *
      * @param headerName    The name of the header to remove
      */
    def withoutHeader(headerName: String): Headers = js.native
  }
  
  trait HttpHandlerOptions extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  }
  object HttpHandlerOptions {
    
    inline def apply(): HttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpHandlerOptions]
    }
    
    extension [Self <: HttpHandlerOptions](x: Self) {
      
      inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    }
  }
  
  trait HttpMessage extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: HeaderBag
  }
  object HttpMessage {
    
    inline def apply(headers: HeaderBag): HttpMessage = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpMessage]
    }
    
    extension [Self <: HttpMessage](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpRequest
    extends StObject
       with HttpMessage
       with Endpoint {
    
    var method: String
  }
  object HttpRequest {
    
    inline def apply(headers: HeaderBag, hostname: String, method: String, path: String, protocol: String): HttpRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequest]
    }
    
    extension [Self <: HttpRequest](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpResponse
    extends StObject
       with HttpMessage {
    
    var statusCode: Double
  }
  object HttpResponse {
    
    inline def apply(headers: HeaderBag, statusCode: Double): HttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponse]
    }
    
    extension [Self <: HttpResponse](x: Self) {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryParameterBag = StringDictionary[String | js.Array[String] | Null]
  
  trait ResolvedHttpResponse
    extends StObject
       with HttpResponse {
    
    @JSName("body")
    var body_ResolvedHttpResponse: String
  }
  object ResolvedHttpResponse {
    
    inline def apply(body: String, headers: HeaderBag, statusCode: Double): ResolvedHttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedHttpResponse]
    }
    
    extension [Self <: ResolvedHttpResponse](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
}
