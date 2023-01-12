package typings.awsSdkProtocolHttp

import typings.awsSdkTypes.distTypesHttpMod.HeaderBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHttpResponseMod {
  
  @JSImport("@aws-sdk/protocol-http/dist-types/httpResponse", "HttpResponse")
  @js.native
  open class HttpResponse protected ()
    extends StObject
       with typings.awsSdkTypes.distTypesHttpMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
    
    /* CompleteClass */
    var headers: HeaderBag = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  /* static members */
  object HttpResponse {
    
    @JSImport("@aws-sdk/protocol-http/dist-types/httpResponse", "HttpResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(response: Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean]
  }
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpMessage> & {  statusCode :number} */
  trait HttpResponseOptions extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] = js.undefined
    
    var statusCode: Double
  }
  object HttpResponseOptions {
    
    inline def apply(statusCode: Double): HttpResponseOptions = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponseOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
