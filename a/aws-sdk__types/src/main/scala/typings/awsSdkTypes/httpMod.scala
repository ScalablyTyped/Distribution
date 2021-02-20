package typings.awsSdkTypes

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @js.native
  trait Endpoint extends StObject {
    
    var hostname: String = js.native
    
    var path: String = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: String = js.native
    
    var query: js.UndefOr[QueryParameterBag] = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply(hostname: String, path: String, protocol: String): Endpoint = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type HeaderBag = StringDictionary[String]
  
  @js.native
  trait Headers extends Map[String, String] {
    
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
  
  @js.native
  trait HttpHandlerOptions extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignal] = js.native
  }
  object HttpHandlerOptions {
    
    @scala.inline
    def apply(): HttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpHandlerOptions]
    }
    
    @scala.inline
    implicit class HttpHandlerOptionsMutableBuilder[Self <: HttpHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    }
  }
  
  @js.native
  trait HttpMessage extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: HeaderBag = js.native
  }
  object HttpMessage {
    
    @scala.inline
    def apply(headers: HeaderBag): HttpMessage = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpMessage]
    }
    
    @scala.inline
    implicit class HttpMessageMutableBuilder[Self <: HttpMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpRequest
    extends HttpMessage
       with Endpoint {
    
    var method: String = js.native
  }
  object HttpRequest {
    
    @scala.inline
    def apply(headers: HeaderBag, hostname: String, method: String, path: String, protocol: String): HttpRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequest]
    }
    
    @scala.inline
    implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpResponse extends HttpMessage {
    
    var statusCode: Double = js.native
  }
  object HttpResponse {
    
    @scala.inline
    def apply(headers: HeaderBag, statusCode: Double): HttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryParameterBag = StringDictionary[String | js.Array[String] | Null]
  
  @js.native
  trait ResolvedHttpResponse extends HttpResponse {
    
    @JSName("body")
    var body_ResolvedHttpResponse: String = js.native
  }
  object ResolvedHttpResponse {
    
    @scala.inline
    def apply(body: String, headers: HeaderBag, statusCode: Double): ResolvedHttpResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedHttpResponse]
    }
    
    @scala.inline
    implicit class ResolvedHttpResponseMutableBuilder[Self <: ResolvedHttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
}
