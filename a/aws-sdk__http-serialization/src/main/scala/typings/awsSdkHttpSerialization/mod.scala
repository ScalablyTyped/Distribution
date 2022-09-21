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
  
  inline def parseRequest(serialized: String): DerivedHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(serialized.asInstanceOf[js.Any]).asInstanceOf[DerivedHttpRequest]
  
  inline def parseResponse(serialized: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("parseResponse")(serialized.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
  
  inline def serializeRequest(request: HttpRequest): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRequest")(request.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeResponse(response: HttpResponse): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeResponse")(response.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpRequest> & @aws-sdk/types.@aws-sdk/types.HttpMessage & {  method :string} */
  trait DerivedHttpRequest extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] & HeaderBag
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] & String
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object DerivedHttpRequest {
    
    inline def apply(headers: js.UndefOr[HeaderBag] & HeaderBag, method: js.UndefOr[String] & String): DerivedHttpRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedHttpRequest]
    }
    
    extension [Self <: DerivedHttpRequest](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.UndefOr[HeaderBag] & HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: js.UndefOr[String] & String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
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
