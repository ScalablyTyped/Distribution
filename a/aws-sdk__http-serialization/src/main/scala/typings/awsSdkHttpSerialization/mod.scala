package typings.awsSdkHttpSerialization

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import typings.awsSdkTypes.distTypesHttpMod.HttpRequest
import typings.awsSdkTypes.distTypesHttpMod.HttpResponse
import typings.awsSdkTypes.distTypesHttpMod.QueryParameterBag
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
    
    var headers: js.UndefOr[HeaderBag] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object DerivedHttpRequest {
    
    inline def apply(): DerivedHttpRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DerivedHttpRequest]
    }
    
    extension [Self <: DerivedHttpRequest](x: Self) {
      
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
