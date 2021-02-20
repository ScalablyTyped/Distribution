package typings.clearbladejsServer

import typings.clearbladejsServer.CbServer.BasicReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Request extends StObject {
    
    var request: BasicReq = js.native
  }
  object Request {
    
    @scala.inline
    def apply(request: BasicReq): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: BasicReq): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
