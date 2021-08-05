package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBody extends StObject {
  
  /**
    * The message that's returned from the API.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the request or response.
    */
  var RequestID: js.UndefOr[string] = js.undefined
}
object MessageBody {
  
  inline def apply(): MessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBody]
  }
  
  extension [Self <: MessageBody](x: Self) {
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setRequestID(value: string): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
    
    inline def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
  }
}
