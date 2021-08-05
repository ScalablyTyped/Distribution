package typings.awsSdkS3ErrorUnmarshaller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RequestId extends StObject {
    
    var requestId: String
  }
  object RequestId {
    
    inline def apply(requestId: String): RequestId = {
      val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestId]
    }
    
    extension [Self <: RequestId](x: Self) {
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
}
