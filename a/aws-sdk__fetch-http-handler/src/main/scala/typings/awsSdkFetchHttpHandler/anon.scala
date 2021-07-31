package typings.awsSdkFetchHttpHandler

import typings.awsSdkProtocolHttp.mod.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Response extends StObject {
    
    var response: HttpResponse
  }
  object Response {
    
    @scala.inline
    def apply(response: HttpResponse): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: HttpResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
