package typings.awsSdkProtocolHttp

import typings.awsSdkTypes.httpMod.HeaderBag
import typings.awsSdkTypes.httpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestMod {
  
  @JSImport("@aws-sdk/protocol-http/dist/cjs/httpRequest", "HttpRequest")
  @js.native
  class HttpRequest protected ()
    extends StObject
       with typings.awsSdkTypes.httpMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
    
    /* CompleteClass */
    var headers: HeaderBag = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
  }
  /* static members */
  object HttpRequest {
    
    @JSImport("@aws-sdk/protocol-http/dist/cjs/httpRequest", "HttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isInstance(request: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpRequest.HttpRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(request.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpRequest.HttpRequest */ Boolean]
  }
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpMessage> & std.Partial<@aws-sdk/types.@aws-sdk/types.Endpoint> & {  method :string | undefined} */
  trait HttpRequestOptions extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object HttpRequestOptions {
    
    @scala.inline
    def apply(): HttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsMutableBuilder[Self <: HttpRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
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
