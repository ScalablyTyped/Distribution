package typings.awsSdkHttpSerialization

import typings.awsSdkTypes.httpMod.HeaderBag
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.httpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/http-serialization", "parseRequest")
  @js.native
  def parseRequest(serialized: String): DerivedHttpRequest = js.native
  
  @JSImport("@aws-sdk/http-serialization", "parseResponse")
  @js.native
  def parseResponse(serialized: String): HttpResponse = js.native
  
  @JSImport("@aws-sdk/http-serialization", "serializeRequest")
  @js.native
  def serializeRequest(request: HttpRequest): String = js.native
  
  @JSImport("@aws-sdk/http-serialization", "serializeResponse")
  @js.native
  def serializeResponse(response: HttpResponse): String = js.native
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpRequest> & @aws-sdk/types.@aws-sdk/types.HttpMessage & {  method :string} */
  @js.native
  trait DerivedHttpRequest extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[HeaderBag] with HeaderBag = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] with String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[QueryParameterBag] = js.native
  }
  object DerivedHttpRequest {
    
    @scala.inline
    def apply(headers: js.UndefOr[HeaderBag] with HeaderBag, method: js.UndefOr[String] with String): DerivedHttpRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedHttpRequest]
    }
    
    @scala.inline
    implicit class DerivedHttpRequestMutableBuilder[Self <: DerivedHttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.UndefOr[HeaderBag] with HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: js.UndefOr[String] with String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
