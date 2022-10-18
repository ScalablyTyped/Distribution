package typings.awsSdkProtocolHttp

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import typings.awsSdkTypes.distTypesHttpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHttpRequestMod {
  
  @JSImport("@aws-sdk/protocol-http/dist-types/httpRequest", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends StObject
       with typings.awsSdkTypes.distTypesHttpMod.HttpRequest {
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
    
    @JSImport("@aws-sdk/protocol-http/dist-types/httpRequest", "HttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(request: Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(request.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean]
  }
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpMessage> & std.Partial<@aws-sdk/types.@aws-sdk/types.Endpoint> & {  method :string | undefined} */
  trait HttpRequestOptions extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object HttpRequestOptions {
    
    inline def apply(): HttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    extension [Self <: HttpRequestOptions](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
