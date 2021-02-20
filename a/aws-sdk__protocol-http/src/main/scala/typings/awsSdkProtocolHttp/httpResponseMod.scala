package typings.awsSdkProtocolHttp

import typings.awsSdkTypes.httpMod.HeaderBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpResponseMod {
  
  @JSImport("@aws-sdk/protocol-http/dist/cjs/httpResponse", "HttpResponse")
  @js.native
  class HttpResponse protected ()
    extends typings.awsSdkTypes.httpMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  object HttpResponse {
    
    @JSImport("@aws-sdk/protocol-http/dist/cjs/httpResponse", "HttpResponse.isInstance")
    @js.native
    def isInstance(response: js.Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist/cjs/httpResponse.HttpResponse */ Boolean = js.native
  }
  
  /* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpMessage> & {  statusCode :number} */
  @js.native
  trait HttpResponseOptions extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[HeaderBag] = js.native
    
    var statusCode: Double = js.native
  }
  object HttpResponseOptions {
    
    @scala.inline
    def apply(statusCode: Double): HttpResponseOptions = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponseOptions]
    }
    
    @scala.inline
    implicit class HttpResponseOptionsMutableBuilder[Self <: HttpResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
