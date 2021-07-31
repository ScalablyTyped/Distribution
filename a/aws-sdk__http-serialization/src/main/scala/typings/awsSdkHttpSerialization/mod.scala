package typings.awsSdkHttpSerialization

import typings.awsSdkTypes.httpMod.HeaderBag
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.httpMod.HttpResponse
import typings.awsSdkTypes.httpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/http-serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseRequest(serialized: String): DerivedHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(serialized.asInstanceOf[js.Any]).asInstanceOf[DerivedHttpRequest]
  
  @scala.inline
  def parseResponse(serialized: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("parseResponse")(serialized.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
  
  @scala.inline
  def serializeRequest(request: HttpRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRequest")(request.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def serializeResponse(response: HttpResponse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeResponse")(response.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpRequest> & @aws-sdk/types.@aws-sdk/types.HttpMessage & {  method :string} */
  trait DerivedHttpRequest extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] & HeaderBag
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] & String
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object DerivedHttpRequest {
    
    @scala.inline
    def apply(headers: js.UndefOr[HeaderBag] & HeaderBag, method: js.UndefOr[String] & String): DerivedHttpRequest = {
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
      def setHeaders(value: js.UndefOr[HeaderBag] & HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: js.UndefOr[String] & String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
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
